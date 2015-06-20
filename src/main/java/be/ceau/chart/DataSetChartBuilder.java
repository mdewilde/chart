/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import be.ceau.chart.data.BarData;
import be.ceau.chart.data.LineData;
import be.ceau.chart.data.RadarData;
import be.ceau.chart.model.Colors;
import be.ceau.chart.model.DataSet;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.Options;
import be.ceau.chart.options.RadarOptions;

/**
 * ChartBuilder implementation for Chart objects consisting of data sets.<br>
 * Supported types are BAR, LINE and RADAR.
 */
public final class DataSetChartBuilder implements ChartBuilder {

	private final Chart.Type targetType;
	
	private final List<String> labels;
	private final List<List<BigDecimal>> datasetValues;
	private final List<Colors> datasetColors;
	private final List<String> datasetNames;
	
	private Options options;
	
	DataSetChartBuilder(Chart.Type targetType) {
		this.targetType = targetType;
		this.labels = new ArrayList<String>();
		this.datasetValues = new ArrayList<List<BigDecimal>>();
		this.datasetColors = new ArrayList<Colors>();
		this.datasetNames = new ArrayList<String>();
	}
	
	DataSetChartBuilder(Chart.Type targetType, Options options) {
		this.targetType = targetType;
		this.options = options;
		this.labels = new ArrayList<String>();
		this.datasetValues = new ArrayList<List<BigDecimal>>();
		this.datasetColors = new ArrayList<Colors>();
		this.datasetNames = new ArrayList<String>();
	}

	@Override
	public ChartBuilder setOptions(Options options) {
		if (options == null) {
			throw new IllegalArgumentException("Options argument may not be null");
		}
		if (!targetType.isCorrectOptionsClass(options.getClass())) {
			throw new IllegalArgumentException("Options argument is not of a type compatible with target Chart.Type " + targetType);
		}
		this.options = options;
		return this;
	}
	
	@Override
	public ChartBuilder addData(String label, BigDecimal value) {
		if (value == null) {
			throw new IllegalArgumentException("value argument may not be null");
		}
		// input sanitation
		if (label == null) {
			label = "";
		}
		// what is the current valuelist?
		if (this.datasetValues.isEmpty()) {
			newSeries("", Colors.random());
		}
		List<BigDecimal> valuelist = this.datasetValues.get(this.datasetValues.size()-1);
		// the index in the dataset at which the arguments will be inserted
		int index = valuelist.size();
		// do we have more than one dataset?
		if (this.datasetValues.size() > 1) {
			// we cannot have more elements in this set than in a previous set
			if (valuelist.size() >= this.datasetValues.get(0).size()) {
				throw new IllegalArgumentException("It is not possible to add more values to a series than were added to a different series of the same chart");
			}
			// we must make sure labels match
			if (!labels.get(index).equalsIgnoreCase(label)) {
				throw new IllegalArgumentException("The label does not match the label already present for this insert position. The label for position " + index + " is " + this.labels.get(index));				
			}
		} else {
			// if this is the first series, we add the label to the label list
			this.labels.add(label);
		}
		valuelist.add(value);
		return this;
	}

	@Override
	public ChartBuilder newSeries(String name, Colors colors) {
		// default name is the creation count of the new dataset 
		if (name == null) {
			name = String.valueOf(this.datasetValues.size() + 1);
		}
		// default colors is a new random instance
		if (colors == null) {
			colors = Colors.random();
		}
		this.datasetValues.add(new ArrayList<BigDecimal>());
		this.datasetColors.add(colors);
		this.datasetNames.add(name);
		return this;
	}

	// TODO: what with the builder after the build...
	@Override
	public Chart build() {
		Data data = null;
		List<DataSet> datasets = new ArrayList<DataSet>();
		for (int i = 0; i < datasetValues.size(); i++) {
			datasets.add(new DataSet(datasetNames.get(i), datasetColors.get(i), datasetValues.get(i)));
		}
		switch (targetType) {
			case BAR: {
				data = new BarData(labels, datasets);
				if (options == null) {
					options = BarOptions.defaultInstance();
				}
				break;
			}
			case LINE: {
				data = new LineData(labels, datasets);
				if (options == null) {
					options = LineOptions.defaultInstance();
				}
				break;
			}
			case RADAR: {
				data = new RadarData(labels, datasets);
				if (options == null) {
					options = RadarOptions.defaultInstance();
				}
				break;
			}
			default:
				throw new IllegalStateException("incorrect Chart.Type " + targetType.toString());
		}
		BigDecimal tempMax = new BigDecimal(Long.MIN_VALUE);
		for (DataSet dataset : datasets) {
			if (dataset.getMax().compareTo(tempMax) > 0) {
				tempMax = dataset.getMax();
			}
		}
		int step = calculateScaleStepWidth(tempMax.longValue());
		options.setScaleStepWidth(step);
		return new Chart(targetType, data, options);
	}
	
	private int calculateScaleStepWidth(long max) {
		// steps should be a 'nice' number (eg. 10, 500, 10000)
		// we prefer a straight power of ten, 
		// but can accept a multiple of a power of ten
		long maximum = max;
		if (maximum < 10) {
			return 1;
		} else {
			int magnitude = 0;
			while (maximum > 0) {
				magnitude++;
				maximum = maximum / 10;
			}
			// if below half of power of 10, use 5, otherwise 10
			maximum = max;
			int powerTen = BigInteger.TEN.pow(magnitude).intValue();
			int increment = powerTen / 10;
			int test = increment;
			while (test < powerTen) {
				if (maximum < test) {
					return test / 10;
				} else {
					test += increment;
				}
			}
			// dividing by ten because we want ten steps (eg. if stepmax = 1000, we want ten steps of 100)
			return powerTen / 10;
		}
	}

}

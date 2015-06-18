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
import java.util.ArrayList;
import java.util.List;

import be.ceau.chart.data.DoughnutData;
import be.ceau.chart.data.PieData;
import be.ceau.chart.data.PolarData;
import be.ceau.chart.model.Color;
import be.ceau.chart.model.Colors;
import be.ceau.chart.model.DataPoint;
import be.ceau.chart.options.DoughnutOptions;
import be.ceau.chart.options.Options;
import be.ceau.chart.options.PieOptions;
import be.ceau.chart.options.PolarOptions;

/**
 * ChartBuilder implementation for Chart objects consisting of data points.<br>
 * Supported types are PIE, DOUGHNUT and POLAR.
 */
public final class DataPointChartBuilder implements ChartBuilder {
	
	private final Chart.Type targetType;
	
	private final List<String> labels;
	private final List<Color> colors;
	private final List<BigDecimal> values;
	
	private Options options;
	
	DataPointChartBuilder(Chart.Type targetType) {
		this.targetType = targetType;
		this.labels = new ArrayList<String>();
		this.colors = new ArrayList<Color>();
		this.values = new ArrayList<BigDecimal>();
	}
	
	DataPointChartBuilder(Chart.Type targetType, Options options) {
		this.targetType = targetType;
		this.options = options;
		this.labels = new ArrayList<String>();
		this.colors = new ArrayList<Color>();
		this.values = new ArrayList<BigDecimal>();
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
		if (label == null) {
			label = "";
		}
		this.labels.add(label);
		this.colors.add(Color.random());
		this.values.add(value);
		return this;
	}
	
	@Override
	public ChartBuilder newSeries(String name, Colors colors) {
		// as charts built by this chartbuilder do not use datasets, this method is a no-op
		return this;
	}

	@Override
	public Chart build() {
		List<DataPoint> datapoints = new ArrayList<DataPoint>();
		for (int i = 0; i < values.size(); i++) {
			datapoints.add(new DataPoint(labels.get(i), colors.get(i).rgba(), new Color(colors.get(i), 0.2f).rgba(), values.get(i)));
		}
		Data data = null;
		switch (targetType) {
			case PIE: {
				data = new PieData(datapoints);
				if (options == null) {
					options = PieOptions.defaultInstance();
				}
				break;
			}
			case DOUGHNUT: {
				data = new DoughnutData(datapoints);
				if (options == null) {
					options = DoughnutOptions.defaultInstance();
				}
				break;
			}
			case POLAR: {
				data = new PolarData(datapoints);
				if (options == null) {
					options = PolarOptions.defaultInstance();
				}
				break;
			}
			default:
				throw new IllegalStateException("incorrect Chart.Type " + targetType.toString());
		}
		return new Chart(targetType, data, options);
	}

}
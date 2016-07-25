/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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

import be.ceau.chart.color.Color;
import be.ceau.chart.color.Colors;
import be.ceau.chart.v1.data.Data;
import be.ceau.chart.v1.data.DataPoint;
import be.ceau.chart.v1.data.DataPointData;
import be.ceau.chart.v1.options.Options;

/**
 * {@link be.ceau.chart.ChartBuilder ChartBuilder} implementation for
 * {@link be.ceau.chart.Chart Chart} objects consisting of
 * {@link be.ceau.chart.v1.data.DataPoint DataPoint} instances.<br>
 * Supported types are {@link be.ceau.chart.Chart.Type#PIE PIE},
 * {@link be.ceau.chart.Chart.Type#DOUGHNUT DOUGHNUT} and
 * {@link be.ceau.chart.Chart.Type#POLAR POLAR}.
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
		if (!targetType.isCompatible(options)) {
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
	public ChartBuilder addData(String label, int value) {
		return addData(label, new BigDecimal(value));
	}

	@Override
	public ChartBuilder addData(String label, double value) {
		return addData(label, new BigDecimal(String.valueOf(value)));
	}

	@Override
	public ChartBuilder newSeries(String name, Colors colors) {
		// as charts built by this chartbuilder do not use datasets, this method
		// is a no-op
		return this;
	}

	@Override
	public Chart build() {
		List<DataPoint> datapoints = new ArrayList<DataPoint>();
		for (int i = 0; i < values.size(); i++) {
			datapoints.add(new DataPoint(labels.get(i), colors.get(i).rgba(), new Color(colors.get(i), 0.2f).rgba(), values.get(i)));
		}
		Data data = new DataPointData(datapoints);
		if (options == null) {
			options = Options.forType(targetType);
		}
		return new Chart(targetType, data, options);
	}

}
/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import be.ceau.chart.data.Data;
import be.ceau.chart.data.LineData;
import be.ceau.chart.dataset.LineDataset;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.Options;
import be.ceau.chart.options.scales.LinearScale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class LineChart implements Chart {

	private static final ObjectWriter WRITER = new ObjectMapper()
			.writerWithDefaultPrettyPrinter()
			.forType(LineChart.class);

	/**
	 * Static factory, constructs an {@link Data} implementation appropriate
	 * for a {@link LineChart}.
	 * 
	 * @return a new {@link LineData} instance
	 */
	public static LineData data() {
		return new LineData();
	}

	/**
	 * Static factory, constructs an {@link Options} implementation appropriate
	 * for a {@link LineChart}.
	 * 
	 * @return a new {@link LineOptions} instance
	 */
	public static LineOptions options() {
		return new LineOptions();
	}

	private final String type = "line";

	private LineData data;

	private LineOptions options;

	public LineChart() {
	}

	public LineChart(LineData data) {
		this.data = data;
	}

	public LineChart(LineData data, LineOptions options) {
		this.data = data;
		this.options = options;
	}

	@Override
	public String getType() {
		return type;
	}

	public LineData getData() {
		return data;
	}

	public LineChart setData(LineData data) {
		this.data = data;
		return this;
	}

	public LineOptions getOptions() {
		return options;
	}

	public LineChart setOptions(LineOptions options) {
		this.options = options;
		return this;
	}

	@Override
	public String toJson() {
		try {
			return WRITER.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * {@code LineChart} is drawable if at least one dataset has at least one
	 * data point.<br>
	 * If an xAxisID is set on a dataset, an xAxis scale must exist with that id.
	 * <br>
	 * If an yAxisID is set on a dataset, a yAxis scale must exist with that id.
	 * </p>
	 */
	@Override
	public boolean isDrawable() {
		boolean sufficientData = false;
		for (LineDataset dataset : data.getDatasets()) {
			if (dataset.getXAxisID() != null && !hasXAxisWithId(dataset.getXAxisID())) {
				return false;
			}
			if (dataset.getYAxisID() != null && !hasYAxisWithId(dataset.getYAxisID())) {
				return false;
			}
			if (dataset.getData().size() > 0) {
				sufficientData = true;
			}
		}
		return sufficientData;
	}
	
	private boolean hasXAxisWithId(String id) {
		if (options != null && options.getScales() != null && options.getScales().getxAxes() != null) {
			for (LinearScale xAxis : options.getScales().getxAxes()) {
				if (id.equals(xAxis.getId())) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean hasYAxisWithId(String id) {
		if (options != null && options.getScales() != null && options.getScales().getyAxes() != null) {
			for (LinearScale yAxis : options.getScales().getyAxes()) {
				if (id.equals(yAxis.getId())) {
					return true;
				}
			}
		}
		return false;
	}

}

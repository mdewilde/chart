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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.scales.XAxis;
import be.ceau.chart.options.scales.YAxis;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class BarChart implements Chart {

	private static final ObjectWriter WRITER = new ObjectMapper().writerWithDefaultPrettyPrinter().forType(BarChart.class);

	@JsonIgnore
	private boolean vertical = true;

	private BarData data;

	private BarOptions options;

	public BarChart() {
	}

	public BarChart(BarData data, BarOptions options) {
		this.data = data;
		this.options = options;
	}

	public BarData getData() {
		return data;
	}

	public void setData(BarData data) {
		this.data = data;
	}

	public BarOptions getOptions() {
		return options;
	}

	public void setOptions(BarOptions options) {
		this.options = options;
	}

	/**
	 * <p>
	 * Draw this {@code BarChart} horizontally.
	 * </p>
	 * <p>
	 * Default is to draw a vertical {@code BarChart}.
	 * </p>
	 * 
	 * @see #setVertical()
	 */
	public void setHorizontal() {
		this.vertical = false;
	}

	/**
	 * @return true if this {@code BarChart} is set to be drawn horizontally
	 * @see #setHorizontal()
	 */
	public boolean isHorizontal() {
		return !this.vertical;
	}

	/**
	 * <p>
	 * Draw this {@code BarChart} vertically.
	 * </p>
	 * <p>
	 * Vertical drawing is the default for {@code BarChart}.
	 * </p>
	 * 
	 * @see #setHorizontal()
	 */
	public void setVertical() {
		this.vertical = true;
	}

	/**
	 * @return true if this {@code BarChart} is set to be drawn vertically
	 * @see #setVertical()
	 */
	public boolean isVertical() {
		return this.vertical;
	}

	@Override
	@JsonProperty("type")
	public String getType() {
		return this.vertical ? "bar" : "horizontalBar";
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
	 * {@code BarChart} is drawable if at least one dataset has at least one
	 * data point.<br>
	 * If an xAxisID is set on a dataset, an xAxis scale must exist with that
	 * id. <br>
	 * If an yAxisID is set on a dataset, a yAxis scale must exist with that id.
	 * </p>
	 */
	@Override
	public boolean isDrawable() {
		boolean sufficientData = false;
		for (BarDataset dataset : data.getDatasets()) {
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
			for (XAxis xAxis : options.getScales().getxAxes()) {
				if (id.equals(xAxis.getId())) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean hasYAxisWithId(String id) {
		if (options != null && options.getScales() != null && options.getScales().getyAxes() != null) {
			for (YAxis yAxis : options.getScales().getyAxes()) {
				if (id.equals(yAxis.getId())) {
					return true;
				}
			}
		}
		return false;
	}

}

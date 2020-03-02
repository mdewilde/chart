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
import be.ceau.chart.data.PolarData;
import be.ceau.chart.dataset.PolarDataset;
import be.ceau.chart.options.Options;
import be.ceau.chart.options.PolarOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class PolarChart implements Chart {

	private static final ObjectWriter WRITER = new ObjectMapper()
			.writerWithDefaultPrettyPrinter()
			.forType(PolarChart.class);

	/**
	 * Static factory, constructs an {@link Data} implementation appropriate
	 * for a {@link PolarChart}.
	 * 
	 * @return a new {@link PolarData} instance
	 */
	public static PolarData data() {
		return new PolarData();
	}

	/**
	 * Static factory, constructs an {@link Options} implementation appropriate
	 * for a {@link PolarChart}.
	 * 
	 * @return a new {@link PolarOptions} instance
	 */
	public static PolarOptions options() {
		return new PolarOptions();
	}

	private final String type = "polarArea";

	private PolarData data;

	private PolarOptions options;

	public PolarChart() {
	}

	public PolarChart(PolarData data) {
		this.data = data;
	}

	public PolarChart(PolarData data, PolarOptions options) {
		this.data = data;
		this.options = options;
	}

	public PolarData getData() {
		return data;
	}

	public PolarChart setData(PolarData data) {
		this.data = data;
		return this;
	}

	public PolarOptions getOptions() {
		return options;
	}

	public PolarChart setOptions(PolarOptions options) {
		this.options = options;
		return this;
	}

	@Override
	public String getType() {
		return type;
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
	 * {@code PolarChart} is drawable if at least one dataset has at least two
	 * data points.
	 * </p>
	 */
	@Override
	public boolean isDrawable() {
		for (PolarDataset dataset : data.getDatasets()) {
			if (dataset.getData().size() > 1) {
				return true;
			}
		}
		return false;
	}

}

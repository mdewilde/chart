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

import be.ceau.chart.data.BubbleData;
import be.ceau.chart.data.Data;
import be.ceau.chart.options.BubbleOptions;
import be.ceau.chart.options.Options;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class BubbleChart implements Chart {

	private static final ObjectWriter WRITER = new ObjectMapper()
			.writerWithDefaultPrettyPrinter()
			.forType(BubbleChart.class);

	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for
	 * a {@link BubbleChart}.
	 * 
	 * @return a new {@link BubbleData} instance
	 */
	public static BubbleData data() {
		return new BubbleData();
	}

	/**
	 * Static factory, constructs an {@link Options} implementation appropriate
	 * for a {@link BubbleChart}.
	 * 
	 * @return a new {@link BubbleOptions} instance
	 */
	public static BubbleOptions options() {
		return new BubbleOptions();
	}

	private final String type = "bubble";

	private BubbleData data;

	private BubbleOptions options;

	public BubbleChart() {
	}

	public BubbleChart(BubbleData data) {
		this.data = data;
	}

	public BubbleChart(BubbleData data, BubbleOptions options) {
		this.data = data;
		this.options = options;
	}

	public BubbleData getData() {
		return data;
	}

	public BubbleChart setData(BubbleData data) {
		this.data = data;
		return this;
	}

	public BubbleOptions getOptions() {
		return options;
	}

	public BubbleChart setOptions(BubbleOptions options) {
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
	 * {@code BubbleChart} is drawable if at least one dataset has at least one
	 * data point.
	 * </p>
	 */
	@Override
	public boolean isDrawable() {
		return data != null && !data.getDatasets().isEmpty();
	}

}

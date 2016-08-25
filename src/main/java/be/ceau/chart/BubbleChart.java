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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import be.ceau.chart.data.BubbleData;
import be.ceau.chart.options.BubbleOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class BubbleChart implements Chart {

	private static final ObjectWriter WRITER = new ObjectMapper().writerWithDefaultPrettyPrinter().forType(BubbleChart.class);

	private final String type = "bubble";

	private BubbleData data;

	private BubbleOptions options;

	public BubbleChart() {
	}

	public BubbleChart(BubbleData data, BubbleOptions options) {
		this.data = data;
		this.options = options;
	}

	public BubbleData getData() {
		return data;
	}

	public void setData(BubbleData data) {
		this.data = data;
	}

	public BubbleOptions getOptions() {
		return options;
	}

	public void setOptions(BubbleOptions options) {
		this.options = options;
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
		// TODO Auto-generated method stub
		return false;
	}

}

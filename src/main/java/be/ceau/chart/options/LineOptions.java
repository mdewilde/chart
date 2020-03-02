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
package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.elements.LineElements;
import be.ceau.chart.options.scales.LinearScales;
import be.ceau.chart.options.scales.Scale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineOptions extends Options<LineOptions> {
	
	/**
	 * Static factory, constructs a {@link Scale} implementation appropriate
	 * for a {@link LineOptions} instance.
	 * 
	 * @return a new {@link LinearScales} instance
	 */
	public static LinearScales scales() {
		return new LinearScales();
	}

	/**
	 * @see #setShowLines(Boolean)
	 */
	private Boolean showLines;

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setScales(LinearScales)
	 */
	private LinearScales scales;

	private LineElements elements;
	
	/**
	 * @see #setShowLines(Boolean)
	 */
	public Boolean getShowLines() {
		return this.showLines;
	}

	/**
	 * <p>
	 * If false, the lines between points are not drawn
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public LineOptions setShowLines(Boolean showLines) {
		this.showLines = showLines;
		return this;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return this.spanGaps;
	}

	/**
	 * <p>
	 * If true, NaN data does not break the line
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public LineOptions setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
		return this;
	}

	/**
	 * @see #setScales(LinearScales)
	 */
	public LinearScales getScales() {
		return scales;
	}

	/**
	 * The linear scale is use to chart numerical data
	 */
	public LineOptions setScales(LinearScales scales) {
		this.scales = scales;
		return this;
	}

	/**
	 * @return {@link LineElements} instance, or {@code null} if not set
	 */
	public LineElements getElements() {
		return elements;
	}

	/**
	 * @param elements
	 *            an {@link LineElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public LineOptions setElements(LineElements elements) {
		this.elements = elements;
		return this;
	}

}

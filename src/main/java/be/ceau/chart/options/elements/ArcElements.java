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
package be.ceau.chart.options.elements;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Arcs are used in the polar area, doughnut and pie charts.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ArcElements {

	private Arc arc;

	/**
	 * No-arg constructor
	 */
	public ArcElements() {
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param arc
	 *            {@link Arc} instance or {@code null}
	 */
	public ArcElements(Arc arc) {
		this.arc = arc;
	}

	/**
	 * @return {@link Arc} instance or {@code null} if not set
	 * @see #setArc(Arc)
	 */
	public Arc getArc() {
		return arc;
	}

	/**
	 * @param arc
	 *            {@link Arc} instance or {@code null}
	 * @return this {@link ArcElements} instance for chaining
	 */
	public ArcElements setArc(Arc arc) {
		this.arc = arc;
		return this;
	}

}

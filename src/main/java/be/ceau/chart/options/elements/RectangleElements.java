/*
	Copyright 2023 Marceau Dewilde <m@ceau.be>

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
 * Rectangle elements are used to represent the bars in a bar chart.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RectangleElements {

	private Rectangle rectangle;

	/**
	 * No-arg constructor
	 */
	public RectangleElements() {
		
	}

	/**
	 * Constructor
	 * 
	 * @param rectangle
	 *            {@link Rectangle} instance or {@code null}
	 */
	public RectangleElements(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	/**
	 * @return {@link Rectangle} instance or {@code null} if not set
	 * @see #setRectangle(Rectangle)
	 */
	public Rectangle getRectangle() {
		return rectangle;
	}

	/**
	 * @param rectangle
	 *            {@link Rectangle} instance or {@code null}
	 * @return this {@link RectangleElements} instance for chaining
	 */
	public RectangleElements setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
		return this;
	}

}

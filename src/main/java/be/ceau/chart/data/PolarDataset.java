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
package be.ceau.chart.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PolarDataset extends Dataset {

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setBackgroundColor(List)
	 */
	private List<Color> backgroundColor;

	/**
	 * @see #setBorderColor(List)
	 */
	private List<Color> borderColor;

	/**
	 * @see #setBorderWidth(List)
	 */
	private List<Integer> borderWidth;

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	private List<Color> hoverBackgroundColor;

	/**
	 * @see #setHoverBorderColor(List)
	 */
	private List<Color> hoverBorderColor;

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	private List<Integer> hoverBorderWidth;

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
	    return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public void setLabel(String label) {
	    this.label = label;
	}

	/**
	 * @see #setBackgroundColor(List)
	 */
	public List<Color> getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * The fill color of the arcs. See Colors
	 */
	public void setBackgroundColor(List<Color> backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public List<Color> getBorderColor() {
	    return this.borderColor;
	}

	/**
	 * Arc border color
	 */
	public void setBorderColor(List<Color> borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public List<Integer> getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * Border width of arcs in pixels
	 */
	public void setBorderWidth(List<Integer> borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public List<Color> getHoverBackgroundColor() {
	    return this.hoverBackgroundColor;
	}

	/**
	 * Arc background color when hovered
	 */
	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
	    this.hoverBackgroundColor = hoverBackgroundColor;
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public List<Color> getHoverBorderColor() {
	    return this.hoverBorderColor;
	}

	/**
	 * Arc border color when hovered
	 */
	public void setHoverBorderColor(List<Color> hoverBorderColor) {
	    this.hoverBorderColor = hoverBorderColor;
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public List<Integer> getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * Border width of arc when hovered
	 */
	public void setHoverBorderWidth(List<Integer> hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

}

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

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BubbleData {

	/**
	 * @see #setData(List)
	 */
	private List<BubbleDataPoint> data;

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
	private List<BigDecimal> borderWidth;

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
	private List<BigDecimal> hoverBorderWidth;

	/**
	 * @see #setHoverRadius(List)
	 */
	private List<BigDecimal> hoverRadius;

	/**
	 * @see #setData(List)
	 */
	public List<BubbleDataPoint> getData() {
	    return this.data;
	}

	/**
	 * The data to plot as bubbles. See Data format
	 */
	public void setData(List<BubbleDataPoint> data) {
	    this.data = data;
	}

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
	 * The fill color of the bubbles. See Colors
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
	 * The stroke color of the bubbles.
	 */
	public void setBorderColor(List<Color> borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public List<BigDecimal> getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * The stroke width of bubble in pixels.
	 */
	public void setBorderWidth(List<BigDecimal> borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public List<Color> getHoverBackgroundColor() {
	    return this.hoverBackgroundColor;
	}

	/**
	 * The fill color of the bubbles when hovered.
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
	 * The stroke color of the bubbles when hovered.
	 */
	public void setHoverBorderColor(List<Color> hoverBorderColor) {
	    this.hoverBorderColor = hoverBorderColor;
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public List<BigDecimal> getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * The stroke width of the bubbles when hovered.
	 */
	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

	/**
	 * @see #setHoverRadius(List)
	 */
	public List<BigDecimal> getHoverRadius() {
	    return this.hoverRadius;
	}

	/**
	 * Additional radius to add to data radius on hover.
	 */
	public void setHoverRadius(List<BigDecimal> hoverRadius) {
	    this.hoverRadius = hoverRadius;
	}

}

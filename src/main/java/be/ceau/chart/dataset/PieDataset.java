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
package be.ceau.chart.dataset;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.Dataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PieDataset extends Dataset {

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setBackgroundColor(List)
	 */
	private final List<Color> backgroundColor = new ArrayList<Color>();

	/**
	 * @see #setBorderColor(List)
	 */
	private final List<Color> borderColor = new ArrayList<Color>();

	/**
	 * @see #setBorderWidth(List)
	 */
	private final List<Integer> borderWidth = new ArrayList<Integer>();

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	private final List<Color> hoverBackgroundColor = new ArrayList<Color>();

	/**
	 * @see #setHoverBorderColor(List)
	 */
	private final List<Color> hoverBorderColor = new ArrayList<Color>();

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	private final List<Integer> hoverBorderWidth = new ArrayList<Integer>();

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
	 * @see #setBackgroundColor(List)
	 */
	public void addBackgroundColor(Color backgroundColor) {
		this.backgroundColor.add(backgroundColor);
	}

	/**
	 * The fill color of the arcs. 
	 */
	public void setBackgroundColor(List<Color> backgroundColor) {
		this.backgroundColor.clear();
		if (backgroundColor != null) {
			this.backgroundColor.addAll(backgroundColor);
		}
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public List<Color> getBorderColor() {
		return this.borderColor;
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public void addBorderColor(Color borderColor) {
		this.borderColor.add(borderColor);
	}

	/**
	 * Arc border color
	 */
	public void setBorderColor(List<Color> borderColor) {
		this.borderColor.clear();
		if (borderColor != null) {
			this.borderColor.addAll(borderColor);
		}
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public List<Integer> getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public void addBorderWidth(Integer borderWidth) {
		this.borderWidth.add(borderWidth);
	}

	/**
	 * Border width of arcs in pixels
	 */
	public void setBorderWidth(List<Integer> borderWidth) {
		this.borderWidth.clear();
		if (borderWidth != null) {
			this.borderWidth.addAll(borderWidth);
		}
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public List<Color> getHoverBackgroundColor() {
		return this.hoverBackgroundColor;
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public void addHoverBackgroundColor(Color hoverBackgroundColor) {
		this.hoverBackgroundColor.add(hoverBackgroundColor);
	}

	/**
	 * Arc background color when hovered
	 */
	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
		this.hoverBackgroundColor.clear();
		if (hoverBackgroundColor != null) {
			this.hoverBackgroundColor.addAll(hoverBackgroundColor);
		}
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public List<Color> getHoverBorderColor() {
		return this.hoverBorderColor;
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public void addHoverBorderColor(Color hoverBorderColor) {
		this.hoverBorderColor.add(hoverBorderColor);
	}

	/**
	 * Arc border color when hovered
	 */
	public void setHoverBorderColor(List<Color> hoverBorderColor) {
		this.hoverBorderColor.clear();
		if (hoverBorderColor != null) {
			this.hoverBorderColor.addAll(hoverBorderColor);
		}
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public List<Integer> getHoverBorderWidth() {
		return this.hoverBorderWidth;
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public void addHoverBorderWidth(Integer hoverBorderWidth) {
		this.hoverBorderWidth.add(hoverBorderWidth);
	}

	/**
	 * Border width of arc when hovered
	 */
	public void setHoverBorderWidth(List<Integer> hoverBorderWidth) {
		this.hoverBorderWidth.clear();
		if (hoverBorderWidth != null) {
			this.hoverBorderWidth.addAll(hoverBorderWidth);
		}
	}

}

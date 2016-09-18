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

import java.util.List;

import be.ceau.chart.color.Color;
import be.ceau.chart.objects.OptionalArray;

public abstract class AbstractRoundDataset<T extends AbstractRoundDataset<T>> extends Dataset<T> {

	/**
	 * @see #setLabel(String)
	 */
	protected String label;

	/**
	 * @see #setBackgroundColor(List)
	 */
	protected final List<Color> backgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderColor(List)
	 */
	protected final List<Color> borderColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderWidth(List)
	 */
	protected final List<Integer> borderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	protected final List<Color> hoverBackgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderColor(List)
	 */
	protected final List<Color> hoverBorderColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	protected final List<Integer> hoverBorderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	@SuppressWarnings("unchecked")
	public T setLabel(String label) {
		this.label = label;
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addBackgroundColor(Color backgroundColor) {
	    this.backgroundColor.add(backgroundColor);
	    return (T) this;
	}

	/**
	 * The fill color of the bars.
	 */
	@SuppressWarnings("unchecked")
	public T setBackgroundColor(List<Color> backgroundColor) {
	    this.backgroundColor.clear();
	    if (backgroundColor != null) {
	    	this.backgroundColor.addAll(backgroundColor);
	    }
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addBorderColor(Color borderColor) {
	    this.borderColor.add(borderColor);
	    return (T) this;
	}

	/**
	 * Bar border color
	 */
	@SuppressWarnings("unchecked")
	public T setBorderColor(List<Color> borderColor) {
	    this.borderColor.clear();
	    if (borderColor != null) {
	    	this.borderColor.addAll(borderColor);
	    }
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addBorderWidth(Integer borderWidth) {
	    this.borderWidth.add(borderWidth);
	    return (T) this;
	}

	/**
	 * Border width of bar in pixels
	 */
	@SuppressWarnings("unchecked")
	public T setBorderWidth(List<Integer> borderWidth) {
	    this.borderWidth.clear();
	    if (borderWidth != null) {
	    	this.borderWidth.addAll(borderWidth);
	    }
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addHoverBackgroundColor(Color hoverBackgroundColor) {
	    this.hoverBackgroundColor.add(hoverBackgroundColor);
	    return (T) this;
	}

	/**
	 * Bar background color when hovered
	 */
	@SuppressWarnings("unchecked")
	public T setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
	    this.hoverBackgroundColor.clear();
	    if (hoverBackgroundColor != null) {
	    	this.hoverBackgroundColor.addAll(hoverBackgroundColor);
	    }
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addHoverBorderColor(Color hoverBorderColor) {
	    this.hoverBorderColor.add(hoverBorderColor);
	    return (T) this;
	}

	/**
	 * Bar border color when hovered
	 */
	@SuppressWarnings("unchecked")
	public T setHoverBorderColor(List<Color> hoverBorderColor) {
	    this.hoverBorderColor.clear();
	    if (hoverBorderColor != null) {
	    	this.hoverBorderColor.addAll(hoverBorderColor);
	    }
	    return (T) this;
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
	@SuppressWarnings("unchecked")
	public T addHoverBorderWidth(Integer hoverBorderWidth) {
	    this.hoverBorderWidth.add(hoverBorderWidth);
	    return (T) this;
	}

	/**
	 * Border width of bar when hovered
	 */
	@SuppressWarnings("unchecked")
	public T setHoverBorderWidth(List<Integer> hoverBorderWidth) {
	    this.hoverBorderWidth.clear();
	    if (hoverBorderWidth != null) {
	    	this.hoverBorderWidth.addAll(hoverBorderWidth);
	    }
	    return (T) this;
	}
	
}

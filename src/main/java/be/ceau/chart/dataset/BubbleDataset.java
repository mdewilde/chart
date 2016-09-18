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
import be.ceau.chart.datapoint.BubbleDataPoint;
import be.ceau.chart.objects.OptionalArray;

/**
 * <p>
 * A collection of data points for a bubble chart.
 * </p>
 * 
 * <p>
 * For best results, ensure that each property is set with a list of equal
 * length.
 * </p>
 *
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BubbleDataset {

	/**
	 * @see #setData(List)
	 */
	private final List<BubbleDataPoint> data = new ArrayList<BubbleDataPoint>();

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setBackgroundColor(List)
	 */
	private final List<Color> backgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderColor(List)
	 */
	private final List<Color> borderColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderWidth(List)
	 */
	private final List<Integer> borderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	private final List<Color> hoverBackgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderColor(List)
	 */
	private final List<Color> hoverBorderColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	private final List<Integer> hoverBorderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setHoverRadius(List)
	 */
	private final List<Integer> hoverRadius = new OptionalArray<Integer>();

	/**
	 * @see #setData(List)
	 */
	public List<BubbleDataPoint> getData() {
		return this.data;
	}

	/**
	 * @see #setData(List)
	 */
	public BubbleDataset addData(BubbleDataPoint point) {
		this.data.add(point);
		return this;
	}

	/**
	 * The data to plot as bubbles.
	 */
	public BubbleDataset setData(List<BubbleDataPoint> data) {
		this.data.clear();
		if (data != null) {
			this.data.addAll(data);
		}
		return this;
	}

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * <p>
	 * The label for the dataset which appears in the legend and tooltips
	 * </p>
	 */
	public BubbleDataset setLabel(String label) {
		this.label = label;
		return this;
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
	public BubbleDataset addBackgroundColor(Color backgroundColor) {
		this.backgroundColor.add(backgroundColor);
		return this;
	}

	/**
	 * <p>
	 * The fill color of the bubbles.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the backgroundColor at
	 * the corresponding index.
	 * </p>
	 */
	public BubbleDataset setBackgroundColor(List<Color> backgroundColor) {
		this.backgroundColor.clear();
		if (backgroundColor != null) {
			this.backgroundColor.addAll(backgroundColor);
		}
		return this;
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
	public BubbleDataset addBorderColor(Color borderColor) {
		this.borderColor.add(borderColor);
		return this;
	}

	/**
	 * <p>
	 * The stroke color of the bubbles.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the borderColor at the
	 * corresponding index.
	 * </p>
	 */
	public BubbleDataset setBorderColor(List<Color> borderColor) {
		this.borderColor.clear();
		if (borderColor != null) {
			this.borderColor.addAll(borderColor);
		}
		return this;
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
	public BubbleDataset addBorderWidth(Integer borderWidth) {
		this.borderWidth.add(borderWidth);
		return this;
	}

	/**
	 * <p>
	 * The stroke width of bubble in pixels.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the borderWidth at the
	 * corresponding index.
	 * </p>
	 */
	public BubbleDataset setBorderWidth(List<Integer> borderWidth) {
		this.borderWidth.clear();
		if (borderWidth != null) {
			this.borderWidth.addAll(borderWidth);
		}
		return this;
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
	public BubbleDataset addHoverBackgroundColor(Color hoverBackgroundColor) {
		this.hoverBackgroundColor.add(hoverBackgroundColor);
		return this;
	}

	/**
	 * <p>
	 * The fill color of the bubbles when hovered.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBackgroundColor
	 * at the corresponding index.
	 * </p>
	 */
	public BubbleDataset setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
		this.hoverBackgroundColor.clear();
		if (hoverBackgroundColor != null) {
			this.hoverBackgroundColor.addAll(hoverBackgroundColor);
		}
		return this;
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
	public BubbleDataset addHoverBorderColor(Color hoverBorderColor) {
		this.hoverBorderColor.add(hoverBorderColor);
		return this;
	}

	/**
	 * <p>
	 * The stroke color of the bubbles when hovered.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBorderColor at
	 * the corresponding index.
	 * </p>
	 */
	public BubbleDataset setHoverBorderColor(List<Color> hoverBorderColor) {
		this.hoverBorderColor.clear();
		if (hoverBorderColor != null) {
			this.hoverBorderColor.addAll(hoverBorderColor);
		}
		return this;
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
	public BubbleDataset addHoverBorderWidth(Integer hoverBorderWidth) {
		this.hoverBorderWidth.add(hoverBorderWidth);
		return this;
	}

	/**
	 * <p>
	 * The stroke width of the bubbles when hovered.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBorderWidth at
	 * the corresponding index.
	 * </p>
	 */
	public BubbleDataset setHoverBorderWidth(List<Integer> hoverBorderWidth) {
		this.hoverBorderWidth.clear();
		if (hoverBorderWidth != null) {
			this.hoverBorderWidth.addAll(hoverBorderWidth);
		}
		return this;
	}

	/**
	 * @see #setHoverRadius(List)
	 */
	public List<Integer> getHoverRadius() {
		return this.hoverRadius;
	}

	/**
	 * @see #setHoverRadius(List)
	 */
	public BubbleDataset addHoverRadius(Integer hoverRadius) {
		this.hoverRadius.add(hoverRadius);
		return this;
	}

	/**
	 * <p>
	 * Additional radius to add to data radius on hover.
	 * </p>
	 * 
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverRadius at the
	 * corresponding index.
	 * </p>
	 */
	public BubbleDataset setHoverRadius(List<Integer> hoverRadius) {
		this.hoverRadius.clear();
		if (hoverRadius != null) {
			this.hoverRadius.addAll(hoverRadius);
		}
		return this;
	}

}

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
package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.objects.OptionalArray;

/**
 * The grid line configuration is nested under the scale configuration in the
 * gridLines key. It defines options for the grid lines that run perpendicular
 * to the axis.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GridLines {

	/**
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * @see #setColor(List)
	 */
	private final List<Color> color = new OptionalArray<Color>();

	/**
	 * @see #setLineWidth(List)
	 */
	private List<Integer> lineWidth = new OptionalArray<Integer>();

	/**
	 * @see #setDrawBorder(Boolean)
	 */
	private Boolean drawBorder;

	/**
	 * @see #setDrawOnChartArea(Boolean)
	 */
	private Boolean drawOnChartArea;

	/**
	 * @see #setDrawTicks(Boolean)
	 */
	private Boolean drawTicks;

	/**
	 * @see #setTickMarkLength(Integer)
	 */
	private Integer tickMarkLength;

	/**
	 * @see #setZeroLineWidth(Integer)
	 */
	private Integer zeroLineWidth;

	/**
	 * @see #setZeroLineColor(Color)
	 */
	private Color zeroLineColor;

	/**
	 * @see #setOffsetGridLines(Boolean)
	 */
	private Boolean offsetGridLines;

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * <p>
	 * 
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDisplay(Boolean display) {
		this.display = display;
		return this;
	}

	/**
	 * @see #setColor(List)
	 */
	public List<Color> getColor() {
		return this.color;
	}

	/**
	 * @see #setColor(List)
	 */
	public GridLines addColor(Color color) {
		this.color.add(color);
		return this;
	}

	/**
	 * <p>
	 * Color of the grid lines.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "rgba(0, 0, 0, 0.1)"}
	 * </p>
	 */
	public GridLines setColor(List<Color> color) {
		this.color.clear();
		if (color != null) {
			this.color.addAll(color);
		}
		return this;
	}

	/**
	 * @see #setLineWidth(List)
	 */
	public List<Integer> getLineWidth() {
		return this.lineWidth;
	}

	/**
	 * @see #setLineWidth(List)
	 */
	public GridLines addColor(Integer lineWidth) {
		this.lineWidth.add(lineWidth);
		return this;
	}

	/**
	 * <p>
	 * Stroke width of grid lines
	 * </p>
	 * 
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public GridLines setLineWidth(List<Integer> lineWidth) {
		this.lineWidth.clear();
		if (lineWidth != null) {
			this.lineWidth.addAll(lineWidth);
		}
		return this;
	}

	/**
	 * @see #setDrawBorder(Boolean)
	 */
	public Boolean getDrawBorder() {
		return this.drawBorder;
	}

	/**
	 * <p>
	 * If true draw border on the edge of the chart
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawBorder(Boolean drawBorder) {
		this.drawBorder = drawBorder;
		return this;
	}

	/**
	 * @see #setDrawOnChartArea(Boolean)
	 */
	public Boolean getDrawOnChartArea() {
		return this.drawOnChartArea;
	}

	/**
	 * <p>
	 * If true, draw lines on the chart area inside the axis lines. This is
	 * useful when there are multiple axes and you need to control which grid
	 * lines are drawn
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawOnChartArea(Boolean drawOnChartArea) {
		this.drawOnChartArea = drawOnChartArea;
		return this;
	}

	/**
	 * @see #setDrawTicks(Boolean)
	 */
	public Boolean getDrawTicks() {
		return this.drawTicks;
	}

	/**
	 * <p>
	 * If true, draw lines beside the ticks in the axis area beside the chart.
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawTicks(Boolean drawTicks) {
		this.drawTicks = drawTicks;
		return this;
	}

	/**
	 * @see #setTickMarkLength(Integer)
	 */
	public Integer getTickMarkLength() {
		return this.tickMarkLength;
	}

	/**
	 * <p>
	 * Length in pixels that the grid lines will draw into the axis area.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public GridLines setTickMarkLength(Integer tickMarkLength) {
		this.tickMarkLength = tickMarkLength;
		return this;
	}

	/**
	 * @see #setZeroLineWidth(Integer)
	 */
	public Integer getZeroLineWidth() {
		return this.zeroLineWidth;
	}

	/**
	 * <p>
	 * Stroke width of the grid line for the first index (index 0).
	 * </p>
	 * 
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public GridLines setZeroLineWidth(Integer zeroLineWidth) {
		this.zeroLineWidth = zeroLineWidth;
		return this;
	}

	/**
	 * @see #setZeroLineColor(Color)
	 */
	public Color getZeroLineColor() {
		return this.zeroLineColor;
	}

	/**
	 * <p>
	 * Stroke color of the grid line for the first index (index 0).
	 * </p>
	 * 
	 * <p>
	 * Default {@code "rgba(0, 0, 0, 0.25)"}
	 * </p>
	 */
	public GridLines setZeroLineColor(Color zeroLineColor) {
		this.zeroLineColor = zeroLineColor;
		return this;
	}

	/**
	 * @see #setOffsetGridLines(Boolean)
	 */
	public Boolean getOffsetGridLines() {
		return this.offsetGridLines;
	}

	/**
	 * <p>
	 * If true, labels are shifted to be between grid lines. This is used in the
	 * bar chart.
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public GridLines setOffsetGridLines(Boolean offsetGridLines) {
		this.offsetGridLines = offsetGridLines;
		return this;
	}

}
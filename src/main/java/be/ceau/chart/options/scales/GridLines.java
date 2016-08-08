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
package be.ceau.chart.options.scales;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

/**
 * The grid line configuration is nested under the scale configuration in the
 * gridLines key. It defines options for the grid lines that run perpendicular
 * to the axis.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GridLines {
	
	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * Default {@code "rgba(0, 0, 0, 0.1)"}
	 * 
	 * @see #setColor(List)
	 */
	private List<Color> color;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setLineWidth(List)
	 */
	private List<BigDecimal> lineWidth;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDrawBorder(Boolean)
	 */
	private Boolean drawBorder;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDrawOnChartArea(Boolean)
	 */
	private Boolean drawOnChartArea;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDrawTicks(Boolean)
	 */
	private Boolean drawTicks;

	/**
	 * Default {@code 10}
	 * 
	 * @see #setTickMarkLength(BigDecimal)
	 */
	private BigDecimal tickMarkLength;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setZeroLineWidth(BigDecimal)
	 */
	private BigDecimal zeroLineWidth;

	/**
	 * Default {@code "rgba(0, 0, 0, 0.25)"}
	 * 
	 * @see #setZeroLineColor(Color)
	 */
	private Color zeroLineColor;

	/**
	 * Default {@code false}
	 * 
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
	 * 
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setColor(List)
	 */
	public List<Color> getColor() {
	    return this.color;
	}

	/**
	 * Color of the grid lines.
	 */
	public void setColor(List<Color> color) {
	    this.color = color;
	}

	/**
	 * @see #setLineWidth(List)
	 */
	public List<BigDecimal> getLineWidth() {
	    return this.lineWidth;
	}

	/**
	 * Stroke width of grid lines
	 */
	public void setLineWidth(List<BigDecimal> lineWidth) {
	    this.lineWidth = lineWidth;
	}

	/**
	 * @see #setDrawBorder(Boolean)
	 */
	public Boolean getDrawBorder() {
	    return this.drawBorder;
	}

	/**
	 * If true draw border on the edge of the chart
	 */
	public void setDrawBorder(Boolean drawBorder) {
	    this.drawBorder = drawBorder;
	}

	/**
	 * @see #setDrawOnChartArea(Boolean)
	 */
	public Boolean getDrawOnChartArea() {
	    return this.drawOnChartArea;
	}

	/**
	 * If true, draw lines on the chart area inside the axis lines. This is useful when there are multiple axes and you need to control which grid lines are drawn
	 */
	public void setDrawOnChartArea(Boolean drawOnChartArea) {
	    this.drawOnChartArea = drawOnChartArea;
	}

	/**
	 * @see #setDrawTicks(Boolean)
	 */
	public Boolean getDrawTicks() {
	    return this.drawTicks;
	}

	/**
	 * If true, draw lines beside the ticks in the axis area beside the chart.
	 */
	public void setDrawTicks(Boolean drawTicks) {
	    this.drawTicks = drawTicks;
	}

	/**
	 * @see #setTickMarkLength(BigDecimal)
	 */
	public BigDecimal getTickMarkLength() {
	    return this.tickMarkLength;
	}

	/**
	 * Length in pixels that the grid lines will draw into the axis area.
	 */
	public void setTickMarkLength(BigDecimal tickMarkLength) {
	    this.tickMarkLength = tickMarkLength;
	}

	/**
	 * @see #setZeroLineWidth(BigDecimal)
	 */
	public BigDecimal getZeroLineWidth() {
	    return this.zeroLineWidth;
	}

	/**
	 * Stroke width of the grid line for the first index (index 0).
	 */
	public void setZeroLineWidth(BigDecimal zeroLineWidth) {
	    this.zeroLineWidth = zeroLineWidth;
	}

	/**
	 * @see #setZeroLineColor(Color)
	 */
	public Color getZeroLineColor() {
	    return this.zeroLineColor;
	}

	/**
	 * Stroke color of the grid line for the first index (index 0).
	 */
	public void setZeroLineColor(Color zeroLineColor) {
	    this.zeroLineColor = zeroLineColor;
	}

	/**
	 * @see #setOffsetGridLines(Boolean)
	 */
	public Boolean getOffsetGridLines() {
	    return this.offsetGridLines;
	}

	/**
	 * If true, labels are shifted to be between grid lines. This is used in the bar chart.
	 */
	public void setOffsetGridLines(Boolean offsetGridLines) {
	    this.offsetGridLines = offsetGridLines;
	}

}
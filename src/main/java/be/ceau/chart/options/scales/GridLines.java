package be.ceau.chart.options.scales;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

/**
 * The grid line configuration is nested under the scale configuration in the
 * gridLines key. It defines options for the grid lines that run perpendicular
 * to the axis.
 */
public class GridLines {
	
	/**
	 * Default: true
	 */
	private Boolean display;

	/**
	 * Color of the grid lines. Default: "rgba(0, 0, 0, 0.1)"
	 */
	private List<Color> color;

	/**
	 * Stroke width of grid lines Default: 1
	 */
	private List<BigDecimal> lineWidth;

	/**
	 * If true draw border on the edge of the chart Default: true
	 */
	private Boolean drawBorder;

	/**
	 * If true, draw lines on the chart area inside the axis lines. This is
	 * useful when there are multiple axes and you need to control which grid
	 * lines are drawn Default: true
	 */
	private Boolean drawOnChartArea;

	/**
	 * If true, draw lines beside the ticks in the axis area beside the chart.
	 * Default: true
	 */
	private Boolean drawTicks;

	/**
	 * Length in pixels that the grid lines will draw into the axis area.
	 * Default: 10
	 */
	private BigDecimal tickMarkLength;

	/**
	 * Stroke width of the grid line for the first index (index 0). Default: 1
	 */
	private BigDecimal zeroLineWidth;

	/**
	 * Stroke color of the grid line for the first index (index 0). Default:
	 * "rgba(0, 0, 0, 0.25)"
	 */
	private Color zeroLineColor;

	/**
	 * If true, labels are shifted to be between grid lines. This is used in the
	 * bar chart. Default: false
	 */
	private Boolean offsetGridLines;

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public List<Color> getColor() {
		return color;
	}

	public void setColor(List<Color> color) {
		this.color = color;
	}

	public List<BigDecimal> getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(List<BigDecimal> lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Boolean getDrawBorder() {
		return drawBorder;
	}

	public void setDrawBorder(Boolean drawBorder) {
		this.drawBorder = drawBorder;
	}

	public Boolean getDrawOnChartArea() {
		return drawOnChartArea;
	}

	public void setDrawOnChartArea(Boolean drawOnChartArea) {
		this.drawOnChartArea = drawOnChartArea;
	}

	public Boolean getDrawTicks() {
		return drawTicks;
	}

	public void setDrawTicks(Boolean drawTicks) {
		this.drawTicks = drawTicks;
	}

	public BigDecimal getTickMarkLength() {
		return tickMarkLength;
	}

	public void setTickMarkLength(BigDecimal tickMarkLength) {
		this.tickMarkLength = tickMarkLength;
	}

	public BigDecimal getZeroLineWidth() {
		return zeroLineWidth;
	}

	public void setZeroLineWidth(BigDecimal zeroLineWidth) {
		this.zeroLineWidth = zeroLineWidth;
	}

	public Color getZeroLineColor() {
		return zeroLineColor;
	}

	public void setZeroLineColor(Color zeroLineColor) {
		this.zeroLineColor = zeroLineColor;
	}

	public Boolean getOffsetGridLines() {
		return offsetGridLines;
	}

	public void setOffsetGridLines(Boolean offsetGridLines) {
		this.offsetGridLines = offsetGridLines;
	}

}
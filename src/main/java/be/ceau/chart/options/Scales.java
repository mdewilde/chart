package be.ceau.chart.options;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.JavaScriptFunction;
import be.ceau.chart.color.Color;

public class Scales {

	private final GridLines gridLines = new GridLines();
	
	private final ScaleLabel scaleLabel = new ScaleLabel();
	
	private final Ticks ticks = new Ticks();

	public GridLines getGridLines() {
		return gridLines;
	}

	public ScaleLabel getScaleLabel() {
		return scaleLabel;
	}

	public Ticks getTicks() {
		return ticks;
	}

	public static class GridLines {
		/**
		 * 
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
		 * useful when there are multiple axes and you need to control which
		 * grid lines are drawn Default: true
		 */
		private Boolean drawOnChartArea;

		/**
		 * If true, draw lines beside the ticks in the axis area beside the
		 * chart. Default: true
		 */
		private Boolean drawTicks;

		/**
		 * Length in pixels that the grid lines will draw into the axis area.
		 * Default: 10
		 */
		private BigDecimal tickMarkLength;

		/**
		 * Stroke width of the grid line for the first index (index 0). Default:
		 * 1
		 */
		private BigDecimal zeroLineWidth;

		/**
		 * Stroke color of the grid line for the first index (index 0). Default:
		 * "rgba(0, 0, 0, 0.25)"
		 */
		private Color zeroLineColor;

		/**
		 * If true, labels are shifted to be between grid lines. This is used in
		 * the bar chart. Default: false
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

	public static class ScaleLabel {

		/**
		 * Default: false
		 */
		private Boolean display;

		/**
		 * The text for the title. (i.e. "# of People", "Response Choices")
		 * Default: ""
		 */
		private String labelString;

		/**
		 * Font color for the scale title. Default: "#666"
		 */
		private Color fontColor;

		/**
		 * Font family for the scale title, follows CSS font-family options.
		 * Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
		 */
		private String fontFamily;

		/**
		 * Font size for the scale title. Default: 12
		 */
		private BigDecimal fontSize;

		/**
		 * Font style for the scale title, follows CSS font-style options (i.e.
		 * normal, italic, oblique, initial, inherit). Default: "normal"
		 */
		private String fontStyle;

		public Boolean getDisplay() {
			return display;
		}

		public void setDisplay(Boolean display) {
			this.display = display;
		}

		public String getLabelString() {
			return labelString;
		}

		public void setLabelString(String labelString) {
			this.labelString = labelString;
		}

		public Color getFontColor() {
			return fontColor;
		}

		public void setFontColor(Color fontColor) {
			this.fontColor = fontColor;
		}

		public String getFontFamily() {
			return fontFamily;
		}

		public void setFontFamily(String fontFamily) {
			this.fontFamily = fontFamily;
		}

		public BigDecimal getFontSize() {
			return fontSize;
		}

		public void setFontSize(BigDecimal fontSize) {
			this.fontSize = fontSize;
		}

		public String getFontStyle() {
			return fontStyle;
		}

		public void setFontStyle(String fontStyle) {
			this.fontStyle = fontStyle;
		}

	}

	public static class Ticks {

		/**
		 * If true, automatically calculates how many labels that can be shown
		 * and hides labels accordingly. Turn it off to show all labels no
		 * matter what Default: true
		 */
		private Boolean autoSkip;

		/**
		 * Returns the string representation of the tick value as it should be
		 * displayed on the chart. See callback section below. Default:
		 * function(value) { return helpers.isArray(value) ? value : '' + value;
		 * }
		 */
		private JavaScriptFunction callback;

		/**
		 * If true, show the ticks. Default: true
		 */
		private Boolean display;

		/**
		 * Font color for the tick labels. Default: "#666"
		 */
		private Color fontColor;

		/**
		 * Font family for the tick labels, follows CSS font-family options.
		 * Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
		 */
		private String fontFamily;

		/**
		 * Font size for the tick labels. Default: 12
		 */
		private BigDecimal fontSize;

		/**
		 * Font style for the tick labels, follows CSS font-style options (i.e.
		 * normal, italic, oblique, initial, inherit). Default: "normal"
		 */
		private String fontStyle;

		/**
		 * Distance in pixels to offset the label from the centre point of the
		 * tick (in the y direction for the x axis, and the x direction for the
		 * y axis). Note: this can cause labels at the edges to be cropped by
		 * the edge of the canvas Default: 0
		 */
		private BigDecimal labelOffset;

		/**
		 * Maximum rotation for tick labels when rotating to condense labels.
		 * Note: Rotation doesn't occur until necessary. Note: Only applicable
		 * to horizontal scales. Default: 90
		 */
		private BigDecimal maxRotation;

		/**
		 * Minimum rotation for tick labels. Note: Only applicable to horizontal
		 * scales. Default: 0
		 */
		private BigDecimal minRotation;

		/**
		 * Flips tick labels around axis, displaying the labels inside the chart
		 * instead of outside. Note: Only applicable to vertical scales.
		 * Default: false
		 */
		private Boolean mirror;

		/**
		 * Padding between the tick label and the axis. Note: Only applicable to
		 * horizontal scales. Default: 10
		 */
		private BigDecimal padding;

		/**
		 * Reverses order of tick labels. Default: false
		 */
		private Boolean reverse;

		public Boolean getAutoSkip() {
			return autoSkip;
		}

		public void setAutoSkip(Boolean autoSkip) {
			this.autoSkip = autoSkip;
		}

		public JavaScriptFunction getCallback() {
			return callback;
		}

		public void setCallback(JavaScriptFunction callback) {
			this.callback = callback;
		}

		public Boolean getDisplay() {
			return display;
		}

		public void setDisplay(Boolean display) {
			this.display = display;
		}

		public Color getFontColor() {
			return fontColor;
		}

		public void setFontColor(Color fontColor) {
			this.fontColor = fontColor;
		}

		public String getFontFamily() {
			return fontFamily;
		}

		public void setFontFamily(String fontFamily) {
			this.fontFamily = fontFamily;
		}

		public BigDecimal getFontSize() {
			return fontSize;
		}

		public void setFontSize(BigDecimal fontSize) {
			this.fontSize = fontSize;
		}

		public String getFontStyle() {
			return fontStyle;
		}

		public void setFontStyle(String fontStyle) {
			this.fontStyle = fontStyle;
		}

		public BigDecimal getLabelOffset() {
			return labelOffset;
		}

		public void setLabelOffset(BigDecimal labelOffset) {
			this.labelOffset = labelOffset;
		}

		public BigDecimal getMaxRotation() {
			return maxRotation;
		}

		public void setMaxRotation(BigDecimal maxRotation) {
			this.maxRotation = maxRotation;
		}

		public BigDecimal getMinRotation() {
			return minRotation;
		}

		public void setMinRotation(BigDecimal minRotation) {
			this.minRotation = minRotation;
		}

		public Boolean getMirror() {
			return mirror;
		}

		public void setMirror(Boolean mirror) {
			this.mirror = mirror;
		}

		public BigDecimal getPadding() {
			return padding;
		}

		public void setPadding(BigDecimal padding) {
			this.padding = padding;
		}

		public Boolean getReverse() {
			return reverse;
		}

		public void setReverse(Boolean reverse) {
			this.reverse = reverse;
		}

	}

}

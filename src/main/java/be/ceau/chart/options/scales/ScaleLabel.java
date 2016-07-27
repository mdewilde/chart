package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import be.ceau.chart.color.Color;

/**
 * The grid line configuration is nested under the scale configuration in the
 * scaleLabel key. It defines options for the scale title.
 * 
 */
public class ScaleLabel {

	/**
	 * Default: false
	 */
	private Boolean display;

	/**
	 * The text for the title. (i.e. "# of People", "Response Choices") Default:
	 * ""
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
package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

/**
 * The grid line configuration is nested under the scale configuration in the
 * scaleLabel key. It defines options for the scale title.
 * 
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ScaleLabel {

	/**
	 * Default {@code false}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code ""}
	 * 
	 * @see #setLabelString(String labelString)
	 */
	private String labelString;

	/**
	 * Default {@code "#666"}
	 * 
	 * @see #setFontColor(Color fontColor)
	 */
	private Color fontColor;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setFontFamily(String fontFamily)
	 */
	private String fontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setFontSize(BigDecimal fontSize)
	 */
	private BigDecimal fontSize;

	/**
	 * Default {@code "normal"}
	 * 
	 * @see #setFontStyle(String fontStyle)
	 */
	private String fontStyle;

	/**
	 * @see #setDisplay(Boolean display)
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
	 * @see #setLabelString(String labelString)
	 */
	public String getLabelString() {
	    return this.labelString;
	}

	/**
	 * The text for the title. (i.e. "# of People", "Response Choices")
	 */
	public void setLabelString(String labelString) {
	    this.labelString = labelString;
	}

	/**
	 * @see #setFontColor(Color fontColor)
	 */
	public Color getFontColor() {
	    return this.fontColor;
	}

	/**
	 * Font color for the scale title.
	 */
	public void setFontColor(Color fontColor) {
	    this.fontColor = fontColor;
	}

	/**
	 * @see #setFontFamily(String fontFamily)
	 */
	public String getFontFamily() {
	    return this.fontFamily;
	}

	/**
	 * Font family for the scale title, follows CSS font-family options.
	 */
	public void setFontFamily(String fontFamily) {
	    this.fontFamily = fontFamily;
	}

	/**
	 * @see #setFontSize(BigDecimal fontSize)
	 */
	public BigDecimal getFontSize() {
	    return this.fontSize;
	}

	/**
	 * Font size for the scale title.
	 */
	public void setFontSize(BigDecimal fontSize) {
	    this.fontSize = fontSize;
	}

	/**
	 * @see #setFontStyle(String fontStyle)
	 */
	public String getFontStyle() {
	    return this.fontStyle;
	}

	/**
	 * Font style for the scale title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 */
	public void setFontStyle(String fontStyle) {
	    this.fontStyle = fontStyle;
	}

}
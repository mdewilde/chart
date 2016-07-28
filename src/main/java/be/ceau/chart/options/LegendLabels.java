package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LegendLabels {
	/**
	 * Default {@code 40}
	 * 
	 * @see #setBoxWidth(BigDecimal boxWidth)
	 */
	private BigDecimal boxWidth;

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
	 * Default {@code 10}
	 * 
	 * @see #setPadding(BigDecimal padding)
	 */
	private BigDecimal padding;

	/**
	 * Default {@code function(chart) { }}
	 * 
	 * @see #setGenerateLabels:(JavaScriptFunction generateLabels)
	 */
	private JavaScriptFunction generateLabels;

	/**
	 * Default {@code false}
	 * 
	 * @see #setUsePointStyle(Boolean usePointStyle)
	 */
	private Boolean usePointStyle;

	/**
	 * @see #setBoxWidth(BigDecimal boxWidth)
	 */
	public BigDecimal getBoxWidth() {
		return this.boxWidth;
	}

	/**
	 * Width of coloured box
	 */
	public void setBoxWidth(BigDecimal boxWidth) {
		this.boxWidth = boxWidth;
	}

	/**
	 * @see #setFontSize(BigDecimal fontSize)
	 */
	public BigDecimal getFontSize() {
		return this.fontSize;
	}

	/**
	 * Font size inherited from global configuration
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
	 * Font style inherited from global configuration
	 */
	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	/**
	 * @see #setFontColor(Color fontColor)
	 */
	public Color getFontColor() {
		return this.fontColor;
	}

	/**
	 * Font color inherited from global configuration
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
	 * Font family inherited from global configuration
	 */
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	/**
	 * @see #setPadding(BigDecimal padding)
	 */
	public BigDecimal getPadding() {
		return this.padding;
	}

	/**
	 * Padding between rows of colored boxes
	 */
	public void setPadding(BigDecimal padding) {
		this.padding = padding;
	}

	/**
	 * @see #setGenerateLabels(JavaScriptFunction generateLabels)
	 */
	public JavaScriptFunction getGenerateLabels() {
		return this.generateLabels;
	}

	/**
	 * Generates legend items for each thing in the legend. Default
	 * implementation returns the text + styling for the color box. See Legend
	 * Item for details.
	 */
	public void setGenerateLabels(JavaScriptFunction generateLabels) {
		this.generateLabels = generateLabels;
	}

	/**
	 * @see #setUsePointStyle(Boolean usePointStyle)
	 */
	public Boolean getUsePointStyle() {
		return this.usePointStyle;
	}

	/**
	 * Label style will match corresponding point style (size is based on
	 * fontSize, boxWidth is not used in this case).
	 */
	public void setUsePointStyle(Boolean usePointStyle) {
		this.usePointStyle = usePointStyle;
	}

}

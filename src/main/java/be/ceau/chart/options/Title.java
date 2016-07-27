package be.ceau.chart.options;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Title {

	/**
	 * Display the title block false
	 */
	private Boolean display;

	/**
	 * Position of the title. Only 'top' or 'bottom' are currently allowed 'top'
	 */
	private String position;

	/**
	 * Marks that this box should take the full width of the canvas (pushing
	 * down other boxes) true
	 */
	private Boolean fullWidth;

	/**
	 * Font size inherited from global configuration 12
	 */
	private BigDecimal fontSize;

	/**
	 * Font family inherited from global configuration
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String fontFamily;

	/**
	 * Font color inherited from global configuration "#666"
	 */
	private Color fontColor;

	/**
	 * Font styling of the title. 'bold'
	 */
	private String fontStyle;

	/**
	 * BigDecimal of pixels to add above and below the title text 10
	 */
	private BigDecimal padding;

	/**
	 * Title text ''
	 */
	private String text;

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getFullWidth() {
		return fullWidth;
	}

	public void setFullWidth(Boolean fullWidth) {
		this.fullWidth = fullWidth;
	}

	public BigDecimal getFontSize() {
		return fontSize;
	}

	public void setFontSize(BigDecimal fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public Color getFontColor() {
		return fontColor;
	}

	public void setFontColor(Color fontColor) {
		this.fontColor = fontColor;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public BigDecimal getPadding() {
		return padding;
	}

	public void setPadding(BigDecimal padding) {
		this.padding = padding;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}

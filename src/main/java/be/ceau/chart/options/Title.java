package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Title {

	/**
	 * Default {@code false}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code 'top'}
	 * 
	 * @see #setPosition(String position)
	 */
	private String position;

	/**
	 * Default {@code true}
	 * 
	 * @see #setFullWidth(Boolean fullWidth)
	 */
	private Boolean fullWidth;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setFontSize(BigDecimal fontSize)
	 */
	private BigDecimal fontSize;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setFontFamily(String fontFamily)
	 */
	private String fontFamily;

	/**
	 * Default {@code "#666"}
	 * 
	 * @see #setFontColor(Color fontColor)
	 */
	private Color fontColor;

	/**
	 * Default {@code 'bold'}
	 * 
	 * @see #setFontStyle(String fontStyle)
	 */
	private String fontStyle;

	/**
	 * Default {@code 10}
	 * 
	 * @see #setPadding(BigDecimal padding)
	 */
	private BigDecimal padding;

	/**
	 * Default {@code ''}
	 * 
	 * @see #setText(String text)
	 */
	private String text;

	/**
	 * @see #setDisplay(Boolean display)
	 */
	public Boolean getDisplay() {
	    return this.display;
	}

	/**
	 * Display the title block
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setPosition(String position)
	 */
	public String getPosition() {
	    return this.position;
	}

	/**
	 * Position of the title. Only 'top' or 'bottom' are currently allowed
	 */
	public void setPosition(String position) {
	    this.position = position;
	}

	/**
	 * @see #setFullWidth(Boolean fullWidth)
	 */
	public Boolean getFullWidth() {
	    return this.fullWidth;
	}

	/**
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 */
	public void setFullWidth(Boolean fullWidth) {
	    this.fullWidth = fullWidth;
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
	 * @see #setFontStyle(String fontStyle)
	 */
	public String getFontStyle() {
	    return this.fontStyle;
	}

	/**
	 * Font styling of the title.
	 */
	public void setFontStyle(String fontStyle) {
	    this.fontStyle = fontStyle;
	}

	/**
	 * @see #setPadding(BigDecimal padding)
	 */
	public BigDecimal getPadding() {
	    return this.padding;
	}

	/**
	 * Number of pixels to add above and below the title text
	 */
	public void setPadding(BigDecimal padding) {
	    this.padding = padding;
	}

	/**
	 * @see #setText(String text)
	 */
	public String getText() {
	    return this.text;
	}

	/**
	 * Title text
	 */
	public void setText(String text) {
	    this.text = text;
	}

}

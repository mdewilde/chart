package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.JavaScriptFunction;

/**
 * The following options are used to configure the point labels that are shown
 * on the perimeter of the scale. They can be found in the pointLabels sub
 * options. Note that these options only apply if lineArc is false.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PointLabels {

	/**
	 * Default {@code -}
	 * 
	 * @see #setCallback(JavaScriptFunction callback)
	 */
	private JavaScriptFunction callback;

	/**
	 * Default {@code '#666'}
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
	 * @see #setFontSize(BigDecimal fontSize)
	 */
	private BigDecimal fontSize;

	/**
	 * Default {@code 'normal'}
	 * 
	 * @see #setFontStyle(String fontStyle)
	 */
	private String fontStyle;

	/**
	 * @see #setCallback(JavaScriptFunction callback)
	 */
	public JavaScriptFunction getCallback() {
	    return this.callback;
	}

	/**
	 * Callback function to transform data label to axis label
	 */
	public void setCallback(JavaScriptFunction callback) {
	    this.callback = callback;
	}

	/**
	 * @see #setFontColor(Color fontColor)
	 */
	public Color getFontColor() {
	    return this.fontColor;
	}

	/**
	 * Font color
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
	 * Font family to render
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
	 * Font size in pixels
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
	 * Font Style to use
	 */
	public void setFontStyle(String fontStyle) {
	    this.fontStyle = fontStyle;
	}
	
}

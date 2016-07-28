package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GlobalFontSettings {

	/**
	 * Default {@code '#666'}
	 * 
	 * @see #setDefaultFontColor(Color defaultFontColor)
	 */
	private Color defaultFontColor;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setDefaultFontFamily(String defaultFontFamily)
	 */
	private String defaultFontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setDefaultFontSize(BigDecimal defaultFontSize)
	 */
	private BigDecimal defaultFontSize;

	/**
	 * Default {@code 'normal'}
	 * 
	 * @see #setDefaultFontStyle(String defaultFontStyle)
	 */
	private String defaultFontStyle;

	/**
	 * @see #setDefaultFontColor(Color defaultFontColor)
	 */
	public Color getDefaultFontColor() {
	    return this.defaultFontColor;
	}

	/**
	 * Default font color for all text
	 */
	public void setDefaultFontColor(Color defaultFontColor) {
	    this.defaultFontColor = defaultFontColor;
	}

	/**
	 * @see #setDefaultFontFamily(String defaultFontFamily)
	 */
	public String getDefaultFontFamily() {
	    return this.defaultFontFamily;
	}

	/**
	 * Default font family for all text
	 */
	public void setDefaultFontFamily(String defaultFontFamily) {
	    this.defaultFontFamily = defaultFontFamily;
	}

	/**
	 * @see #setDefaultFontSize(BigDecimal defaultFontSize)
	 */
	public BigDecimal getDefaultFontSize() {
	    return this.defaultFontSize;
	}

	/**
	 * Default font size (in px) for text. Does not apply to radialLinear scale point labels
	 */
	public void setDefaultFontSize(BigDecimal defaultFontSize) {
	    this.defaultFontSize = defaultFontSize;
	}

	/**
	 * @see #setDefaultFontStyle(String defaultFontStyle)
	 */
	public String getDefaultFontStyle() {
	    return this.defaultFontStyle;
	}

	/**
	 * Default font style. Does not apply to tooltip title or footer. Does not apply to chart title
	 */
	public void setDefaultFontStyle(String defaultFontStyle) {
	    this.defaultFontStyle = defaultFontStyle;
	}

}

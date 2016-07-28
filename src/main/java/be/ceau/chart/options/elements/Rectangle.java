package be.ceau.chart.options.elements;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Rectangle {

	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * Default {@code 0}
	 * 
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	private BigDecimal borderWidth;

	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBorderColor(Color borderColor)
	 */
	private Color borderColor;

	/**
	 * Default {@code 'bottom'}
	 * 
	 * @see #setBorderSkipped(String borderSkipped)
	 */
	private String borderSkipped;

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * Default bar fill color
	 */
	public void setBackgroundColor(Color backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	public BigDecimal getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * Default bar stroke width
	 */
	public void setBorderWidth(BigDecimal borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderColor(Color borderColor)
	 */
	public Color getBorderColor() {
	    return this.borderColor;
	}

	/**
	 * Default bar stroke color
	 */
	public void setBorderColor(Color borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderSkipped(String borderSkipped)
	 */
	public String getBorderSkipped() {
	    return this.borderSkipped;
	}

	/**
	 * Default skipped (excluded) border for rectangle. Can be one of bottom, left, top, right
	 */
	public void setBorderSkipped(String borderSkipped) {
	    this.borderSkipped = borderSkipped;
	}


}

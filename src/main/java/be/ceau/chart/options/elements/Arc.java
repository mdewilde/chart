package be.ceau.chart.options.elements;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Arc {
	
	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * Default {@code '#fff'}
	 * 
	 * @see #setBorderColor(Color borderColor)
	 */
	private Color borderColor;

	/**
	 * Default {@code 2}
	 * 
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	private BigDecimal borderWidth;

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * Default fill color for arcs. Inherited from the global default
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderColor(Color borderColor)
	 */
	public Color getBorderColor() {
		return this.borderColor;
	}

	/**
	 * Default stroke color for arcs
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	public BigDecimal getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * Default stroke width for arcs
	 */
	public void setBorderWidth(BigDecimal borderWidth) {
		this.borderWidth = borderWidth;
	}

}

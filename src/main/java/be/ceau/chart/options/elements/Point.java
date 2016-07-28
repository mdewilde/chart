package be.ceau.chart.options.elements;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Point {
	
	/**
	 * Default {@code 3}
	 * 
	 * @see #setRadius(BigDecimal radius)
	 */
	private BigDecimal radius;

	/**
	 * Default {@code 'circle'}
	 * 
	 * @see #setPointStyle(String pointStyle)
	 */
	private String pointStyle;

	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * Default {@code 1}
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
	 * Default {@code 1}
	 * 
	 * @see #setHitRadius(BigDecimal hitRadius)
	 */
	private BigDecimal hitRadius;

	/**
	 * Default {@code 4}
	 * 
	 * @see #setHoverRadius(BigDecimal hoverRadius)
	 */
	private BigDecimal hoverRadius;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setHoverBorderWidth(BigDecimal hoverBorderWidth)
	 */
	private BigDecimal hoverBorderWidth;

	/**
	 * @see #setRadius(BigDecimal radius)
	 */
	public BigDecimal getRadius() {
	    return this.radius;
	}

	/**
	 * Default point radius
	 */
	public void setRadius(BigDecimal radius) {
	    this.radius = radius;
	}

	/**
	 * @see #setPointStyle(String pointStyle)
	 */
	public String getPointStyle() {
	    return this.pointStyle;
	}

	/**
	 * Default point style
	 */
	public void setPointStyle(String pointStyle) {
	    this.pointStyle = pointStyle;
	}

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * Default point fill color
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
	 * Default point stroke width
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
	 * Default point stroke color
	 */
	public void setBorderColor(Color borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setHitRadius(BigDecimal hitRadius)
	 */
	public BigDecimal getHitRadius() {
	    return this.hitRadius;
	}

	/**
	 * Extra radius added to point radius for hit detection
	 */
	public void setHitRadius(BigDecimal hitRadius) {
	    this.hitRadius = hitRadius;
	}

	/**
	 * @see #setHoverRadius(BigDecimal hoverRadius)
	 */
	public BigDecimal getHoverRadius() {
	    return this.hoverRadius;
	}

	/**
	 * Default point radius when hovered
	 */
	public void setHoverRadius(BigDecimal hoverRadius) {
	    this.hoverRadius = hoverRadius;
	}

	/**
	 * @see #setHoverBorderWidth(BigDecimal hoverBorderWidth)
	 */
	public BigDecimal getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * Default stroke width when hovered
	 */
	public void setHoverBorderWidth(BigDecimal hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

}

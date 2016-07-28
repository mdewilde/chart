package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

/**
 * Options to configure angled lines that radiate from the center of the chart
 * to the point labels.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AngleLines {

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code 'rgba(0, 0, 0, 0.1)'}
	 * 
	 * @see #setColor(Color color)
	 */
	private Color color;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setLineWidth(BigDecimal lineWidth)
	 */
	private BigDecimal lineWidth;

	/**
	 * @see #setDisplay(Boolean display)
	 */
	public Boolean getDisplay() {
	    return this.display;
	}

	/**
	 * If true, angle lines are shown.
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setColor(Color color)
	 */
	public Color getColor() {
	    return this.color;
	}

	/**
	 * Color of angled lines
	 */
	public void setColor(Color color) {
	    this.color = color;
	}

	/**
	 * @see #setLineWidth(BigDecimal lineWidth)
	 */
	public BigDecimal getLineWidth() {
	    return this.lineWidth;
	}

	/**
	 * Width of angled lines
	 */
	public void setLineWidth(BigDecimal lineWidth) {
	    this.lineWidth = lineWidth;
	}

}

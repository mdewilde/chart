package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import be.ceau.chart.color.Color;

/**
 * Options to configure angled lines that radiate from the center of the chart
 * to the point labels.
 */
public class AngleLines {

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * Default {@code rgba(0, 0, 0, 0.1)} 
	 *
	 * @see #setColor(Color)
	 */
	private Color color;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setLineWidth(BigDecimal)
	 */
	private BigDecimal lineWidth;

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
		return display;
	}

	/**
	 * If true, angle lines are shown.
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Color of angled lines
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	public BigDecimal getLineWidth() {
		return lineWidth;
	}

	/**
	 * Width of angled lines
	 */
	public void setLineWidth(BigDecimal lineWidth) {
		this.lineWidth = lineWidth;
	}

}

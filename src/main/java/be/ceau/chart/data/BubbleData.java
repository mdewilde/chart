package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class BubbleData {

	/**
	 * @see #setData(Array data)
	 */
	private List<BubbleDataPoint> data;

	/**
	 * @see #setLabel(String label)
	 */
	private String label;

	/**
	 * @see #setBackgroundColor(Color Array backgroundColor)
	 */
	private List<Color> backgroundColor;

	/**
	 * @see #setBorderColor(List<Color> borderColor)
	 */
	private List<Color> borderColor;

	/**
	 * @see #setBorderWidth(List<BigDecimal> borderWidth)
	 */
	private List<BigDecimal> borderWidth;

	/**
	 * @see #setHoverBackgroundColor(List<Color> hoverBackgroundColor)
	 */
	private List<Color> hoverBackgroundColor;

	/**
	 * @see #setHoverBorderColor(List<Color> hoverBorderColor)
	 */
	private List<Color> hoverBorderColor;

	/**
	 * @see #setHoverBorderWidth(List<BigDecimal> hoverBorderWidth)
	 */
	private List<BigDecimal> hoverBorderWidth;

	/**
	 * @see #setHoverRadius(List<BigDecimal> hoverRadius)
	 */
	private List<BigDecimal> hoverRadius;

	/**
	 * @see #setData(Array data)
	 */
	public List<BubbleDataPoint> getData() {
	    return this.data;
	}

	/**
	 * The data to plot as bubbles. See Data format
	 */
	public void setData(List<BubbleDataPoint> data) {
	    this.data = data;
	}

	/**
	 * @see #setLabel(String label)
	 */
	public String getLabel() {
	    return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public void setLabel(String label) {
	    this.label = label;
	}

	/**
	 * @see #setBackgroundColor(List backgroundColor)
	 */
	public List<Color> getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * The fill color of the bubbles. See Colors
	 */
	public void setBackgroundColor(List<Color> backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderColor(List<Color> borderColor)
	 */
	public List<Color> getBorderColor() {
	    return this.borderColor;
	}

	/**
	 * The stroke color of the bubbles.
	 */
	public void setBorderColor(List<Color> borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(List<BigDecimal> borderWidth)
	 */
	public List<BigDecimal> getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * The stroke width of bubble in pixels.
	 */
	public void setBorderWidth(List<BigDecimal> borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setHoverBackgroundColor(List<Color> hoverBackgroundColor)
	 */
	public List<Color> getHoverBackgroundColor() {
	    return this.hoverBackgroundColor;
	}

	/**
	 * The fill color of the bubbles when hovered.
	 */
	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
	    this.hoverBackgroundColor = hoverBackgroundColor;
	}

	/**
	 * @see #setHoverBorderColor(List<Color> hoverBorderColor)
	 */
	public List<Color> getHoverBorderColor() {
	    return this.hoverBorderColor;
	}

	/**
	 * The stroke color of the bubbles when hovered.
	 */
	public void setHoverBorderColor(List<Color> hoverBorderColor) {
	    this.hoverBorderColor = hoverBorderColor;
	}

	/**
	 * @see #setHoverBorderWidth(List<BigDecimal> hoverBorderWidth)
	 */
	public List<BigDecimal> getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * The stroke width of the bubbles when hovered.
	 */
	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

	/**
	 * @see #setHoverRadius(List<BigDecimal> hoverRadius)
	 */
	public List<BigDecimal> getHoverRadius() {
	    return this.hoverRadius;
	}

	/**
	 * Additional radius to add to data radius on hover.
	 */
	public void setHoverRadius(List<BigDecimal> hoverRadius) {
	    this.hoverRadius = hoverRadius;
	}

}

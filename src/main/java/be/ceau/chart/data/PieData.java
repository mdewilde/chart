package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class PieData {

	/**
	 * @see #setData(List<BigDecimal> data)
	 */
	private List<BigDecimal> data;

	/**
	 * @see #setLabel(String label)
	 */
	private String label;

	/**
	 * @see #setBackgroundColor(List<Color> backgroundColor)
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
	 * @see #setData(List<BigDecimal> data)
	 */
	public List<BigDecimal> getData() {
	    return this.data;
	}

	/**
	 * The data to plot as arcs
	 */
	public void setData(List<BigDecimal> data) {
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
	 * @see #setBackgroundColor(List<Color> backgroundColor)
	 */
	public List<Color> getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * The fill color of the arcs. See Colors
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
	 * Arc border color
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
	 * Border width of arcs in pixels
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
	 * Arc background color when hovered
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
	 * Arc border color when hovered
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
	 * Border width of arc when hovered
	 */
	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}

}

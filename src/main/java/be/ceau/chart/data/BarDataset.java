package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarDataset {

	/**
	 * @see #setData(List<BigDecimal> data)
	 */
	private List<BigDecimal> data;

	/**
	 * @see #setLabel(String label)
	 */
	private String label;

	/**
	 * @see #setXAxisID(String xAxisID)
	 */
	private String xAxisID;

	/**
	 * @see #setYAxisID(String yAxisID)
	 */
	private String yAxisID;

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
	 * @see #setBorderSkipped(List<String> borderSkipped)
	 */
	private List<String> borderSkipped;

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
	 * The data to plot as bars
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
	 * @see #setXAxisID(String xAxisID)
	 */
	public String getXAxisID() {
	    return this.xAxisID;
	}

	/**
	 * The ID of the x axis to plot this dataset on
	 */
	public void setXAxisID(String xAxisID) {
	    this.xAxisID = xAxisID;
	}

	/**
	 * @see #setYAxisID(String yAxisID)
	 */
	public String getYAxisID() {
	    return this.yAxisID;
	}

	/**
	 * The ID of the y axis to plot this dataset on
	 */
	public void setYAxisID(String yAxisID) {
	    this.yAxisID = yAxisID;
	}

	/**
	 * @see #setBackgroundColor(List<Color> backgroundColor)
	 */
	public List<Color> getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * The fill color of the bars. See Colors
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
	 * Bar border color
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
	 * Border width of bar in pixels
	 */
	public void setBorderWidth(List<BigDecimal> borderWidth) {
	    this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderSkipped(List<String> borderSkipped)
	 */
	public List<String> getBorderSkipped() {
	    return this.borderSkipped;
	}

	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
	 */
	public void setBorderSkipped(List<String> borderSkipped) {
	    this.borderSkipped = borderSkipped;
	}

	/**
	 * @see #setHoverBackgroundColor(List<Color> hoverBackgroundColor)
	 */
	public List<Color> getHoverBackgroundColor() {
	    return this.hoverBackgroundColor;
	}

	/**
	 * Bar background color when hovered
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
	 * Bar border color when hovered
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
	 * Border width of bar when hovered
	 */
	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
	    this.hoverBorderWidth = hoverBorderWidth;
	}
	
}

package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class BarDataset {

	/**
	 * The data to plot as bars
	 */
	private List<BigDecimal> data;

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	private String label;

	/**
	 * The ID of the x axis to plot this dataset on
	 */
	private String xAxisID;

	/**
	 * The ID of the y axis to plot this dataset on
	 */
	private String yAxisID;

	/**
	 * The fill color of the bars. See Colors
	 */
	private List<Color> backgroundColor;

	/**
	 * Bar border color
	 */
	private List<Color> borderColor;

	/**
	 * Border width of bar in pixels
	 */
	private List<BigDecimal> borderWidth;

	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left',
	 * 'top', and 'right'
	 */
	private List<String> borderSkipped;

	/**
	 * Bar background color when hovered
	 */
	private List<Color> hoverBackgroundColor;

	/**
	 * Bar border color when hovered
	 */
	private List<Color> hoverBorderColor;

	/**
	 * Border width of bar when hovered
	 */
	private List<BigDecimal> hoverBorderWidth;

	public List<BigDecimal> getData() {
		return data;
	}

	public void setData(List<BigDecimal> data) {
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getxAxisID() {
		return xAxisID;
	}

	public void setxAxisID(String xAxisID) {
		this.xAxisID = xAxisID;
	}

	public String getyAxisID() {
		return yAxisID;
	}

	public void setyAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
	}

	public List<Color> getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(List<Color> backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public List<Color> getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(List<Color> borderColor) {
		this.borderColor = borderColor;
	}

	public List<BigDecimal> getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(List<BigDecimal> borderWidth) {
		this.borderWidth = borderWidth;
	}

	public List<String> getBorderSkipped() {
		return borderSkipped;
	}

	public void setBorderSkipped(List<String> borderSkipped) {
		this.borderSkipped = borderSkipped;
	}

	public List<Color> getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public List<Color> getHoverBorderColor() {
		return hoverBorderColor;
	}

	public void setHoverBorderColor(List<Color> hoverBorderColor) {
		this.hoverBorderColor = hoverBorderColor;
	}

	public List<BigDecimal> getHoverBorderWidth() {
		return hoverBorderWidth;
	}

	public void setHoverBorderWidth(List<BigDecimal> hoverBorderWidth) {
		this.hoverBorderWidth = hoverBorderWidth;
	}
	
}

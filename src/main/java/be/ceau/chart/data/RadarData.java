package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class RadarData {

	/**
	 * The data to plot in a line
	 */
	private List<BigDecimal> data;

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	private String label;

	/**
	 * If true, fill the area under the line
	 */
	private Boolean fill;

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines. Note
	 * This was renamed from 'tension' but the old name still works.
	 */
	private BigDecimal lineTension;

	/**
	 * The fill color under the line. See Colors
	 */
	private Color backgroundColor;

	/**
	 * The width of the line in pixels
	 */
	private BigDecimal borderWidth;

	/**
	 * The color of the line.
	 */
	private Color borderColor;

	/**
	 * Cap style of the line. See MDN
	 */
	private String borderCapStyle;

	/**
	 * Length and spacing of dashes. See MDN
	 */
	private List<BigDecimal> borderDash;

	/**
	 * Offset for line dashes. See MDN
	 */
	private BigDecimal borderDashOffset;

	/**
	 * Line joint style. See MDN
	 */
	private String borderJoinStyle;

	/**
	 * The border color for points.
	 */
	private List<Color> pointBorderColor;

	/**
	 * The fill color for points
	 */
	private List<Color> pointBackgroundColor;

	/**
	 * The width of the point border in pixels
	 */
	private List<Color> pointBorderWidth;

	/**
	 * The radius of the point shape. If set to 0, nothing is rendered.
	 */
	private List<BigDecimal> pointRadius;

	/**
	 * The radius of the point when hovered
	 */
	private List<BigDecimal> pointHoverRadius;

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	private List<BigDecimal> hitRadius;

	/**
	 * Point background color when hovered
	 */
	private List<Color> pointHoverBackgroundColor;

	/**
	 * Point border color when hovered
	 */
	private List<Color> pointHoverBorderColor;

	/**
	 * Border width of point when hovered
	 */
	private List<BigDecimal> pointHoverBorderWidth;

	/**
	 * The style of point. Options include 'circle', 'triangle', 'rect',
	 * 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'
	 */
	private List<String> pointStyle;

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

	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	public BigDecimal getLineTension() {
		return lineTension;
	}

	public void setLineTension(BigDecimal lineTension) {
		this.lineTension = lineTension;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public BigDecimal getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(BigDecimal borderWidth) {
		this.borderWidth = borderWidth;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public String getBorderCapStyle() {
		return borderCapStyle;
	}

	public void setBorderCapStyle(String borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	public List<BigDecimal> getBorderDash() {
		return borderDash;
	}

	public void setBorderDash(List<BigDecimal> borderDash) {
		this.borderDash = borderDash;
	}

	public BigDecimal getBorderDashOffset() {
		return borderDashOffset;
	}

	public void setBorderDashOffset(BigDecimal borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
	}

	public String getBorderJoinStyle() {
		return borderJoinStyle;
	}

	public void setBorderJoinStyle(String borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	public List<Color> getPointBorderColor() {
		return pointBorderColor;
	}

	public void setPointBorderColor(List<Color> pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	public List<Color> getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(List<Color> pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public List<Color> getPointBorderWidth() {
		return pointBorderWidth;
	}

	public void setPointBorderWidth(List<Color> pointBorderWidth) {
		this.pointBorderWidth = pointBorderWidth;
	}

	public List<BigDecimal> getPointRadius() {
		return pointRadius;
	}

	public void setPointRadius(List<BigDecimal> pointRadius) {
		this.pointRadius = pointRadius;
	}

	public List<BigDecimal> getPointHoverRadius() {
		return pointHoverRadius;
	}

	public void setPointHoverRadius(List<BigDecimal> pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	public List<BigDecimal> getHitRadius() {
		return hitRadius;
	}

	public void setHitRadius(List<BigDecimal> hitRadius) {
		this.hitRadius = hitRadius;
	}

	public List<Color> getPointHoverBackgroundColor() {
		return pointHoverBackgroundColor;
	}

	public void setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	public List<Color> getPointHoverBorderColor() {
		return pointHoverBorderColor;
	}

	public void setPointHoverBorderColor(List<Color> pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	public List<BigDecimal> getPointHoverBorderWidth() {
		return pointHoverBorderWidth;
	}

	public void setPointHoverBorderWidth(List<BigDecimal> pointHoverBorderWidth) {
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	public List<String> getPointStyle() {
		return pointStyle;
	}

	public void setPointStyle(List<String> pointStyle) {
		this.pointStyle = pointStyle;
	}
	
}

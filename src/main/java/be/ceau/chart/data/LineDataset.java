package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class LineDataset {

	/**
	 * var data = { labels: ["January", "February", "March", "April", "May",
	 * "June", "July"], datasets: [ { label: "My First dataset", fill: false,
	 * lineTension: 0.1, backgroundColor: "rgba(75,192,192,0.4)", borderColor:
	 * "rgba(75,192,192,1)", borderCapStyle: 'butt', borderDash: [],
	 * borderDashOffset: 0.0, borderJoinStyle: 'miter', pointBorderColor:
	 * "rgba(75,192,192,1)", pointBackgroundColor: "#fff", pointBorderWidth: 1,
	 * pointHoverRadius: 5, pointHoverBackgroundColor: "rgba(75,192,192,1)",
	 * pointHoverBorderColor: "rgba(220,220,220,1)", pointHoverBorderWidth: 2,
	 * pointRadius: 1, pointHitRadius: 10, data: [65, 59, 80, 81, 56, 55, 40],
	 * spanGaps: false, } ] };
	 */

	/**
	 * The data to plot in a line
	 */
	private final List<BigDecimal> data = new ArrayList<BigDecimal>();

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
	 * If true, fill the area under the line
	 */
	private Boolean fill;

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straight lines
	 */
	private BigDecimal lineTension;

	/**
	 * The fill color under the line
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
	private List<BigDecimal> pointBorderWidth;

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
	private List<BigDecimal> pointHitRadius;

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
	 * String, Array<String>, Image, Array<Image> The style of point. Options
	 * are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star',
	 * 'line', and 'dash'. If the option is an image, that image is drawn on the
	 * canvas using drawImage.
	 */
	private List<String> pointStyle;

	/**
	 * If false, the line is not drawn for this dataset
	 */
	private Boolean showLine;

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	private Boolean spanGaps;

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be
	 * ignored
	 */
	private Boolean steppedLine;

	public List<BigDecimal> getData() {
		return Collections.unmodifiableList(data);
	}

	public void setData(Collection<BigDecimal> data) {
		this.data.clear();
		if (data != null) {
			this.data.addAll(data);
		}
	}

	/**
	 * Add the given data point to the dataset.
	 * 
	 * @param data
	 *            a BigDecimal, if {@code null} is passed,
	 *            {@link BigDecimal#ZERO} will be added to the underlying
	 *            collection.
	 */
	public void addData(BigDecimal data) {
		if (data == null) {
			this.data.add(BigDecimal.ZERO);
		} else {
			this.data.add(data);
		}
	}

	public void addData(int data) {
		this.data.add(new BigDecimal(data));
	}

	public void addData(double data) {
		this.data.add(new BigDecimal(String.valueOf(data)));
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

	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	/**
	 * @see #setLineTension(BigDecimal)
	 */
	public BigDecimal getLineTension() {
		return lineTension;
	}

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straight lines
	 *
	 * @param lineTension
	 */
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

	public List<BigDecimal> getPointBorderWidth() {
		return pointBorderWidth;
	}

	public void setPointBorderWidth(List<BigDecimal> pointBorderWidth) {
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

	public List<BigDecimal> getPointHitRadius() {
		return pointHitRadius;
	}

	public void setPointHitRadius(List<BigDecimal> pointHitRadius) {
		this.pointHitRadius = pointHitRadius;
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

	public Boolean getShowLine() {
		return showLine;
	}

	public void setShowLine(Boolean showLine) {
		this.showLine = showLine;
	}

	public Boolean getSpanGaps() {
		return spanGaps;
	}

	public void setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
	}

	public Boolean getSteppedLine() {
		return steppedLine;
	}

	public void setSteppedLine(Boolean steppedLine) {
		this.steppedLine = steppedLine;
	}

}

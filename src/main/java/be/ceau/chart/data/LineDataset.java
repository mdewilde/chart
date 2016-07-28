package be.ceau.chart.data;

import java.math.BigDecimal;
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
	 * @see #setData(BigDecimal)
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
	 * @see #setFill(Boolean fill)
	 */
	private Boolean fill;

	/**
	 * @see #setLineTension(BigDecimal lineTension)
	 */
	private BigDecimal lineTension;

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	private BigDecimal borderWidth;

	/**
	 * @see #setBorderColor(Color borderColor)
	 */
	private Color borderColor;

	/**
	 * @see #setBorderCapStyle(String borderCapStyle)
	 */
	private String borderCapStyle;

	/**
	 * @see #setBorderDash(List borderDash)
	 */
	private List<BigDecimal> borderDash;

	/**
	 * @see #setBorderDashOffset(BigDecimal borderDashOffset)
	 */
	private BigDecimal borderDashOffset;

	/**
	 * @see #setBorderJoinStyle(String borderJoinStyle)
	 */
	private String borderJoinStyle;

	/**
	 * @see #setPointBorderColor(List pointBorderColor)
	 */
	private List<Color> pointBorderColor;

	/**
	 * @see #setPointBackgroundColor(List pointBackgroundColor)
	 */
	private List<Color> pointBackgroundColor;

	/**
	 * @see #setPointBorderWidth(List pointBorderWidth)
	 */
	private List<BigDecimal> pointBorderWidth;

	/**
	 * @see #setPointRadius(List pointRadius)
	 */
	private List<BigDecimal> pointRadius;

	/**
	 * @see #setPointHoverRadius(List pointHoverRadius)
	 */
	private List<BigDecimal> pointHoverRadius;

	/**
	 * @see #setPointHitRadius(List pointHitRadius)
	 */
	private List<BigDecimal> pointHitRadius;

	/**
	 * @see #setPointHoverBackgroundColor(List pointHoverBackgroundColor)
	 */
	private List<Color> pointHoverBackgroundColor;

	/**
	 * @see #setPointHoverBorderColor(List pointHoverBorderColor)
	 */
	private List<Color> pointHoverBorderColor;

	/**
	 * @see #setPointHoverBorderWidth(List pointHoverBorderWidth)
	 */
	private List<BigDecimal> pointHoverBorderWidth;

	/**
	 * @see #setPointStyle(List pointStyle)
	 */
	private List<String> pointStyle;

	/**
	 * @see #setShowLine(Boolean showLine)
	 */
	private Boolean showLine;

	/**
	 * @see #setSpanGaps(Boolean spanGaps)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setSteppedLine(Boolean steppedLine)
	 */
	private Boolean steppedLine;

	/**
	 * @see #setData(List data)
	 */
	public List<BigDecimal> getData() {
	    return this.data;
	}

	/**
	 * The data to plot in a line
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
	 * @see #setFill(Boolean fill)
	 */
	public Boolean getFill() {
	    return this.fill;
	}

	/**
	 * If true, fill the area under the line
	 */
	public void setFill(Boolean fill) {
	    this.fill = fill;
	}

	/**
	 * @see #setLineTension(BigDecimal lineTension)
	 */
	public BigDecimal getLineTension() {
	    return this.lineTension;
	}

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines. Note This was renamed from 'tension' but the old name still works.
	 */
	public void setLineTension(BigDecimal lineTension) {
	    this.lineTension = lineTension;
	}

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * The fill color under the line. See Colors
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
	 * The width of the line in pixels
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
	 * The color of the line.
	 */
	public void setBorderColor(Color borderColor) {
	    this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderCapStyle(String borderCapStyle)
	 */
	public String getBorderCapStyle() {
	    return this.borderCapStyle;
	}

	/**
	 * Cap style of the line. See MDN
	 */
	public void setBorderCapStyle(String borderCapStyle) {
	    this.borderCapStyle = borderCapStyle;
	}

	/**
	 * @see #setBorderDash(List borderDash)
	 */
	public List<BigDecimal> getBorderDash() {
	    return this.borderDash;
	}

	/**
	 * Length and spacing of dashes. See MDN
	 */
	public void setBorderDash(List<BigDecimal> borderDash) {
	    this.borderDash = borderDash;
	}

	/**
	 * @see #setBorderDashOffset(BigDecimal borderDashOffset)
	 */
	public BigDecimal getBorderDashOffset() {
	    return this.borderDashOffset;
	}

	/**
	 * Offset for line dashes. See MDN
	 */
	public void setBorderDashOffset(BigDecimal borderDashOffset) {
	    this.borderDashOffset = borderDashOffset;
	}

	/**
	 * @see #setBorderJoinStyle(String borderJoinStyle)
	 */
	public String getBorderJoinStyle() {
	    return this.borderJoinStyle;
	}

	/**
	 * Line joint style. See MDN
	 */
	public void setBorderJoinStyle(String borderJoinStyle) {
	    this.borderJoinStyle = borderJoinStyle;
	}

	/**
	 * @see #setPointBorderColor(List<Color> pointBorderColor)
	 */
	public List<Color> getPointBorderColor() {
	    return this.pointBorderColor;
	}

	/**
	 * The border color for points.
	 */
	public void setPointBorderColor(List<Color> pointBorderColor) {
	    this.pointBorderColor = pointBorderColor;
	}

	/**
	 * @see #setPointBackgroundColor(List<Color> pointBackgroundColor)
	 */
	public List<Color> getPointBackgroundColor() {
	    return this.pointBackgroundColor;
	}

	/**
	 * The fill color for points
	 */
	public void setPointBackgroundColor(List<Color> pointBackgroundColor) {
	    this.pointBackgroundColor = pointBackgroundColor;
	}

	/**
	 * @see #setPointBorderWidth(List<BigDecimal> pointBorderWidth)
	 */
	public List<BigDecimal> getPointBorderWidth() {
	    return this.pointBorderWidth;
	}

	/**
	 * The width of the point border in pixels
	 */
	public void setPointBorderWidth(List<BigDecimal> pointBorderWidth) {
	    this.pointBorderWidth = pointBorderWidth;
	}

	/**
	 * @see #setPointRadius(List<BigDecimal> pointRadius)
	 */
	public List<BigDecimal> getPointRadius() {
	    return this.pointRadius;
	}

	/**
	 * The radius of the point shape. If set to 0, nothing is rendered. 
	 */
	public void setPointRadius(List<BigDecimal> pointRadius) {
	    this.pointRadius = pointRadius;
	}

	/**
	 * @see #setPointHoverRadius(List<BigDecimal> pointHoverRadius)
	 */
	public List<BigDecimal> getPointHoverRadius() {
	    return this.pointHoverRadius;
	}

	/**
	 * The radius of the point when hovered
	 */
	public void setPointHoverRadius(List<BigDecimal> pointHoverRadius) {
	    this.pointHoverRadius = pointHoverRadius;
	}

	/**
	 * @see #setPointHitRadius(List<BigDecimal> pointHitRadius)
	 */
	public List<BigDecimal> getPointHitRadius() {
	    return this.pointHitRadius;
	}

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public void setPointHitRadius(List<BigDecimal> pointHitRadius) {
	    this.pointHitRadius = pointHitRadius;
	}

	/**
	 * @see #setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor)
	 */
	public List<Color> getPointHoverBackgroundColor() {
	    return this.pointHoverBackgroundColor;
	}

	/**
	 * Point background color when hovered
	 */
	public void setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor) {
	    this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	/**
	 * @see #setPointHoverBorderColor(List<Color> pointHoverBorderColor)
	 */
	public List<Color> getPointHoverBorderColor() {
	    return this.pointHoverBorderColor;
	}

	/**
	 * Point border color when hovered
	 */
	public void setPointHoverBorderColor(List<Color> pointHoverBorderColor) {
	    this.pointHoverBorderColor = pointHoverBorderColor;
	}

	/**
	 * @see #setPointHoverBorderWidth(List<BigDecimal> pointHoverBorderWidth)
	 */
	public List<BigDecimal> getPointHoverBorderWidth() {
	    return this.pointHoverBorderWidth;
	}

	/**
	 * Border width of point when hovered
	 */
	public void setPointHoverBorderWidth(List<BigDecimal> pointHoverBorderWidth) {
	    this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	/**
	 * @see #setPointStyle(List pointStyle)
	 */
	public List<String> getPointStyle() {
	    return this.pointStyle;
	}

	/**
	 * The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an image, that image is drawn on the canvas using drawImage. 
	 */
	public void setPointStyle(List<String> pointStyle) {
	    this.pointStyle = pointStyle;
	}

	/**
	 * @see #setShowLine(Boolean showLine)
	 */
	public Boolean getShowLine() {
	    return this.showLine;
	}

	/**
	 * If false, the line is not drawn for this dataset
	 */
	public void setShowLine(Boolean showLine) {
	    this.showLine = showLine;
	}

	/**
	 * @see #setSpanGaps(Boolean spanGaps)
	 */
	public Boolean getSpanGaps() {
	    return this.spanGaps;
	}

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public void setSpanGaps(Boolean spanGaps) {
	    this.spanGaps = spanGaps;
	}

	/**
	 * @see #setSteppedLine(Boolean steppedLine)
	 */
	public Boolean getSteppedLine() {
	    return this.steppedLine;
	}

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be ignored
	 */
	public void setSteppedLine(Boolean steppedLine) {
	    this.steppedLine = steppedLine;
	}

}

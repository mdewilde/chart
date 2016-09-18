/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.dataset;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.BorderCapStyle;
import be.ceau.chart.enums.BorderJoinStyle;
import be.ceau.chart.enums.PointStyle;
import be.ceau.chart.objects.OptionalArray;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineDataset extends Dataset<LineDataset> {

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setXAxisID(String)
	 */
	private String xAxisID;

	/**
	 * @see #setYAxisID(String)
	 */
	private String yAxisID;

	/**
	 * @see #setFill(Boolean)
	 */
	private Boolean fill;

	/**
	 * @see #setLineTension(Float)
	 */
	private Float lineTension;

	/**
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * @see #setBorderWidth(Integer)
	 */
	private Integer borderWidth;

	/**
	 * @see #setBorderColor(Color)
	 */
	private Color borderColor;

	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	private BorderCapStyle borderCapStyle;

	/**
	 * @see #setBorderDash(List)
	 */
	private final List<Integer> borderDash = new ArrayList<Integer>();

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	private Float borderDashOffset;

	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	private BorderJoinStyle borderJoinStyle;

	/**
	 * @see #setPointBorderColor(List)
	 */
	private final List<Color> pointBorderColor = new OptionalArray<Color>();

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	private final List<Color> pointBackgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setPointBorderWidth(List)
	 */
	private final List<Integer> pointBorderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setPointRadius(List)
	 */
	private final List<Integer> pointRadius = new OptionalArray<Integer>();

	/**
	 * @see #setPointHoverRadius(List)
	 */
	private final List<Integer> pointHoverRadius = new OptionalArray<Integer>();

	/**
	 * @see #setPointHitRadius(List)
	 */
	private final List<Integer> pointHitRadius = new OptionalArray<Integer>();

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	private final List<Color> pointHoverBackgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	private final List<Color> pointHoverBorderColor = new OptionalArray<Color>();

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	private final List<Integer> pointHoverBorderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setPointStyle(List)
	 */
	private final List<PointStyle> pointStyle = new OptionalArray<PointStyle>();

	/**
	 * @see #setShowLine(Boolean)
	 */
	private Boolean showLine;

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	private Boolean steppedLine;

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public LineDataset setLabel(String label) {
		this.label = label;
		return this;
	}

	/**
	 * @see #setXAxisID(String)
	 */
	public String getXAxisID() {
		return this.xAxisID;
	}

	/**
	 * The ID of the x axis to plot this dataset on. The value for this property
	 * should equal the ID set at {@code chart.options.scales.xAxes.id}
	 */
	public LineDataset setXAxisID(String xAxisID) {
		this.xAxisID = xAxisID;
		return this;
	}

	/**
	 * @see #setYAxisID(String)
	 */
	public String getYAxisID() {
		return this.yAxisID;
	}

	/**
	 * The ID of the y axis to plot this dataset on. The value for this property
	 * should equal the ID set at {@code chart.options.scales.yAxes.id}
	 */
	public LineDataset setYAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
		return this;
	}

	/**
	 * @see #setFill(Boolean)
	 */
	public Boolean getFill() {
		return this.fill;
	}

	/**
	 * If true, fill the area under the line
	 */
	public LineDataset setFill(Boolean fill) {
		this.fill = fill;
		return this;
	}

	/**
	 * @see #setLineTension(BigDecimal)
	 */
	public Float getLineTension() {
		return this.lineTension;
	}

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines.
	 */
	public LineDataset setLineTension(Float lineTension) {
		this.lineTension = lineTension;
		return this;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * The fill color under the line. See Colors
	 */
	public LineDataset setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	/**
	 * @see #setBorderWidth(Integer)
	 */
	public Integer getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * The width of the line in pixels
	 */
	public LineDataset setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return this.borderColor;
	}

	/**
	 * The color of the line.
	 */
	public LineDataset setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	public BorderCapStyle getBorderCapStyle() {
		return this.borderCapStyle;
	}

	/**
	 * Default line cap style.
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with
	 * an equal width and half the height of the line's thickness.
	 * </ul>
	 */
	public LineDataset setBorderCapStyle(BorderCapStyle borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
		return this;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public List<Integer> getBorderDash() {
		return this.borderDash;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public LineDataset addBorderDash(Integer borderDash) {
		this.borderDash.add(borderDash);
		return this;
	}

	/**
	 * Default line dash. A list of numbers that specifies distances to
	 * alternately draw a line and a gap (in coordinate space units). If the
	 * number of elements in the array is odd, the elements of the array get
	 * copied and concatenated. For example, [5, 15, 25] will become [5, 15, 25,
	 * 5, 15, 25].
	 */
	public LineDataset setBorderDash(List<Integer> borderDash) {
		this.borderDash.clear();
		if (borderDash != null) {
			this.borderDash.addAll(borderDash);
		}
		return this;
	}

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	public Float getBorderDashOffset() {
		return this.borderDashOffset;
	}

	/**
	 * Default line dash offset. A float specifying the amount of the offset.
	 * Initially 0.0.
	 */
	public LineDataset setBorderDashOffset(Float borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
		return this;
	}

	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	public BorderJoinStyle getBorderJoinStyle() {
		return this.borderJoinStyle;
	}

	/**
	 * <p>
	 * Default line join style.
	 * </p>
	 * <ul>
	 * <li>{@code round} Rounds off the corners of a shape by filling an
	 * additional sector of disc centered at the common endpoint of connected
	 * segments. The radius for these rounded corners is equal to the line
	 * width.
	 * <li>{@code bevel} Fills an additional triangular area between the common
	 * endpoint of connected segments, and the separate outside rectangular
	 * corners of each segment.
	 * <li>{@code miter} Connected segments are joined by extending their
	 * outside edges to connect at a single point, with the effect of filling an
	 * additional lozenge-shaped area. This setting is effected by the
	 * miterLimit property.
	 * </ul>
	 */
	public LineDataset setBorderJoinStyle(BorderJoinStyle borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
		return this;
	}

	/**
	 * @see #setPointBorderColor(List)
	 */
	public List<Color> getPointBorderColor() {
		return this.pointBorderColor;
	}

	/**
	 * @see #setPointBorderColor(List)
	 */
	public LineDataset addPointBorderColor(Color pointBorderColor) {
		this.pointBorderColor.add(pointBorderColor);
		return this;
	}

	/**
	 * The border color for points.
	 */
	public LineDataset setPointBorderColor(List<Color> pointBorderColor) {
		this.pointBorderColor.clear();
		if (pointBorderColor != null) {
			this.pointBorderColor.addAll(pointBorderColor);
		}
		return this;
	}

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public List<Color> getPointBackgroundColor() {
		return this.pointBackgroundColor;
	}

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public LineDataset addPointBackgroundColor(Color pointBackgroundColor) {
		this.pointBackgroundColor.add(pointBackgroundColor);
		return this;
	}

	/**
	 * The fill color for points
	 */
	public LineDataset setPointBackgroundColor(List<Color> pointBackgroundColor) {
		this.pointBackgroundColor.clear();
		if (pointBackgroundColor != null) {
			this.pointBackgroundColor.addAll(pointBackgroundColor);
		}
		return this;
	}

	/**
	 * @see #setPointBorderWidth(List)
	 */
	public List<Integer> getPointBorderWidth() {
		return this.pointBorderWidth;
	}

	/**
	 * @see #setPointBorderWidth(List)
	 */
	public LineDataset addPointBorderWidth(Integer pointBorderWidth) {
		this.pointBorderWidth.add(pointBorderWidth);
		return this;
	}

	/**
	 * The width of the point border in pixels
	 */
	public LineDataset setPointBorderWidth(List<Integer> pointBorderWidth) {
		this.pointBorderWidth.clear();
		if (pointBorderWidth != null) {
			this.pointBorderWidth.addAll(pointBorderWidth);
		}
		return this;
	}

	/**
	 * @see #setPointRadius(List)
	 */
	public List<Integer> getPointRadius() {
		return this.pointRadius;
	}

	/**
	 * @see #setPointRadius(List)
	 */
	public LineDataset addPointRadius(Integer pointRadius) {
		this.pointRadius.add(pointRadius);
		return this;
	}

	/**
	 * The radius of the point shape. If set to 0, nothing is rendered.
	 */
	public LineDataset setPointRadius(List<Integer> pointRadius) {
		this.pointRadius.clear();
		if (pointRadius != null) {
			this.pointRadius.addAll(pointRadius);
		}
		return this;
	}

	/**
	 * @see #setPointHoverRadius(List)
	 */
	public List<Integer> getPointHoverRadius() {
		return this.pointHoverRadius;
	}

	/**
	 * @see #setPointHoverRadius(List)
	 */
	public LineDataset addPointHoverRadius(Integer pointHoverRadius) {
		this.pointHoverRadius.add(pointHoverRadius);
		return this;
	}

	/**
	 * The radius of the point when hovered
	 */
	public LineDataset setPointHoverRadius(List<Integer> pointHoverRadius) {
		this.pointHoverRadius.clear();
		if (pointHoverRadius != null) {
			this.pointHoverRadius.addAll(pointHoverRadius);
		}
		return this;
	}

	/**
	 * @see #setPointHitRadius(List)
	 */
	public List<Integer> getPointHitRadius() {
		return this.pointHitRadius;
	}

	/**
	 * @see #setPointHitRadius(List)
	 */
	public LineDataset addPointHitRadius(Integer pointHitRadius) {
		this.pointHitRadius.add(pointHitRadius);
		return this;
	}

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public LineDataset setPointHitRadius(List<Integer> pointHitRadius) {
		this.pointHitRadius.clear();
		if (pointHitRadius != null) {
			this.pointHitRadius.addAll(pointHitRadius);
		}
		return this;
	}

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public List<Color> getPointHoverBackgroundColor() {
		return this.pointHoverBackgroundColor;
	}

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public LineDataset addPointHoverBackgroundColor(Color pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor.add(pointHoverBackgroundColor);
		return this;
	}

	/**
	 * Point background color when hovered
	 */
	public LineDataset setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor.clear();
		if (pointHoverBackgroundColor != null) {
			this.pointHoverBackgroundColor.addAll(pointHoverBackgroundColor);
		}
		return this;
	}

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public List<Color> getPointHoverBorderColor() {
		return this.pointHoverBorderColor;
	}

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public LineDataset addPointHoverBorderColor(Color pointHoverBorderColor) {
		this.pointHoverBorderColor.add(pointHoverBorderColor);
		return this;
	}

	/**
	 * Point border color when hovered
	 */
	public LineDataset setPointHoverBorderColor(List<Color> pointHoverBorderColor) {
		this.pointHoverBorderColor.clear();
		if (pointHoverBorderColor != null) {
			this.pointHoverBorderColor.addAll(pointHoverBorderColor);
		}
		return this;
	}

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public List<Integer> getPointHoverBorderWidth() {
		return this.pointHoverBorderWidth;
	}

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public LineDataset addPointHoverBorderWidth(Integer pointHoverBorderWidth) {
		this.pointHoverBorderWidth.add(pointHoverBorderWidth);
		return this;
	}

	/**
	 * Border width of point when hovered
	 */
	public LineDataset setPointHoverBorderWidth(List<Integer> pointHoverBorderWidth) {
		this.pointHoverBorderWidth.clear();
		if (pointHoverBorderWidth != null) {
			this.pointHoverBorderWidth.addAll(pointHoverBorderWidth);
		}
		return this;
	}

	/**
	 * @see #setPointStyle(List)
	 */
	public List<PointStyle> getPointStyle() {
		return this.pointStyle;
	}

	/**
	 * @see #setPointStyle(List)
	 */
	public LineDataset addPointStyle(PointStyle pointStyle) {
		this.pointStyle.add(pointStyle);
		return this;
	}

	/**
	 * The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot',
	 * 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an
	 * image, that image is drawn on the canvas using drawImage.
	 */
	public LineDataset setPointStyle(List<PointStyle> pointStyle) {
		this.pointStyle.clear();
		if (pointStyle != null) {
			this.pointStyle.addAll(pointStyle);
		}
		return this;
	}

	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine() {
		return this.showLine;
	}

	/**
	 * If false, the line is not drawn for this dataset
	 */
	public LineDataset setShowLine(Boolean showLine) {
		this.showLine = showLine;
		return this;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return this.spanGaps;
	}

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public LineDataset setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
		return this;
	}

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	public Boolean getSteppedLine() {
		return this.steppedLine;
	}

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be
	 * ignored
	 */
	public LineDataset setSteppedLine(Boolean steppedLine) {
		this.steppedLine = steppedLine;
		return this;
	}

}

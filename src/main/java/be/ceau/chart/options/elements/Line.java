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
package be.ceau.chart.options.elements;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.BorderCapStyle;
import be.ceau.chart.enums.BorderJoinStyle;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Line {

	/**
	 * @see #setTension(Float)
	 */
	private Float tension;

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
	private List<Integer> borderDash;

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	private Float borderDashOffset;

	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	private BorderJoinStyle borderJoinStyle;

	/**
	 * @see #setCapBezierPoints(Boolean)
	 */
	private Boolean capBezierPoints;

	/**
	 * @see #setFill(Boolean)
	 */
	private Boolean fill;

	/**
	 * @see #setStepped(Boolean)
	 */
	private Boolean stepped;

	/**
	 * @see #setTension(Float)
	 */
	public Float getTension() {
		return this.tension;
	}

	/**
	 * <p>
	 * Default bezier curve tension. Set to 0 for no bezier curves.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 0.4}
	 * </p>
	 */
	public void setTension(Float tension) {
		this.tension = tension;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * <p>
	 * Default line fill color
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderWidth(Integer)
	 */
	public Integer getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * <p>
	 * Default line stroke width
	 * </p>
	 * 
	 * <p>
	 * Default {@code 3}
	 * </p>
	 */
	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return this.borderColor;
	}

	/**
	 * <p>
	 * Default line stroke color
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	public BorderCapStyle getBorderCapStyle() {
		return this.borderCapStyle;
	}

	/**
	 * <p>
	 * Default line cap style.
	 * </p>
	 * 
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with
	 * an equal width and half the height of the line's thickness.
	 * </ul>
	 * 
	 * <p>
	 * Default {@code 'butt'}
	 * </p>
	 */
	public void setBorderCapStyle(BorderCapStyle borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public List<Integer> getBorderDash() {
		return this.borderDash;
	}

	/**
	 * <p>
	 * Default line dash.
	 * </p>
	 *
	 * <p>
	 * A list of numbers that specifies distances to alternately draw a line and
	 * a gap (in coordinate space units). If the number of elements in the array
	 * is odd, the elements of the array get copied and concatenated. For
	 * example, [5, 15, 25] will become [5, 15, 25, 5, 15, 25].
	 * </p>
	 * 
	 * <p>
	 * Default {@code []}
	 * </p>
	 */
	public void setBorderDash(List<Integer> borderDash) {
		this.borderDash = borderDash;
	}

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	public Float getBorderDashOffset() {
		return this.borderDashOffset;
	}

	/**
	 * <p>
	 * Default line dash offset. A float specifying the amount of the offset.
	 * Initially 0.0.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 0.0}
	 * </p>
	 */
	public void setBorderDashOffset(Float borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
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
	 * 
	 * <p>
	 * Default {@code 'miter'}
	 * </p>
	 */
	public void setBorderJoinStyle(BorderJoinStyle borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	/**
	 * @see #setCapBezierPoints(Boolean)
	 */
	public Boolean getCapBezierPoints() {
		return this.capBezierPoints;
	}

	/**
	 * <p>
	 * If true, bezier control points are kept inside the chart. If false, no
	 * restriction is enforced.
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setCapBezierPoints(Boolean capBezierPoints) {
		this.capBezierPoints = capBezierPoints;
	}

	/**
	 * @see #setFill(Boolean)
	 */
	public Boolean getFill() {
		return this.fill;
	}

	/**
	 * <p>
	 * If true, the line is filled.
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	/**
	 * @see #setStepped(Boolean)
	 */
	public Boolean getStepped() {
		return this.stepped;
	}

	/**
	 * <p>
	 * If true, the line is shown as a steeped line and 'tension' will be
	 * ignored
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public void setStepped(Boolean stepped) {
		this.stepped = stepped;
	}

}

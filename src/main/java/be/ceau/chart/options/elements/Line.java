package be.ceau.chart.options.elements;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Line {

	/**
	 * Default {@code 0.4}
	 * 
	 * @see #setTension(BigDecimal tension)
	 */
	private BigDecimal tension;

	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * Default {@code 3}
	 * 
	 * @see #setBorderWidth(BigDecimal borderWidth)
	 */
	private BigDecimal borderWidth;

	/**
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * 
	 * @see #setBorderColor(Color borderColor)
	 */
	private Color borderColor;

	/**
	 * Default {@code 'butt'}
	 * 
	 * @see #setBorderCapStyle(String borderCapStyle)
	 */
	private String borderCapStyle;

	/**
	 * Default {@code []}
	 * 
	 * @see #setBorderDash(List<BigDecimal> borderDash)
	 */
	private List<BigDecimal> borderDash;

	/**
	 * Default {@code 0.0}
	 * 
	 * @see #setBorderDashOffset(BigDecimal borderDashOffset)
	 */
	private BigDecimal borderDashOffset;

	/**
	 * Default {@code 'miter'}
	 * 
	 * @see #setBorderJoinStyle(String borderJoinStyle)
	 */
	private String borderJoinStyle;

	/**
	 * Default {@code true}
	 * 
	 * @see #setCapBezierPoints(Boolean capBezierPoints)
	 */
	private Boolean capBezierPoints;

	/**
	 * Default {@code true}
	 * 
	 * @see #setFill(Boolean fill)
	 */
	private Boolean fill;

	/**
	 * Default {@code false}
	 * 
	 * @see #setStepped(Boolean stepped)
	 */
	private Boolean stepped;

	/**
	 * @see #setTension(BigDecimal tension)
	 */
	public BigDecimal getTension() {
	    return this.tension;
	}

	/**
	 * Default bezier curve tension. Set to 0 for no bezier curves.
	 */
	public void setTension(BigDecimal tension) {
	    this.tension = tension;
	}

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * Default line fill color
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
	 * Default line stroke width
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
	 * Default line stroke color
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
	 * Default line cap style.
	 * <ul>
	 * <li>butt The ends of lines are squared off at the endpoints.
	 * <li>round The ends of lines are rounded.
	 * <li>square The ends of lines are squared off by adding a box with an
	 * equal width and half the height of the line's thickness.
	 * </ul>
	 */
	public void setBorderCapStyle(String borderCapStyle) {
	    this.borderCapStyle = borderCapStyle;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public List<BigDecimal> getBorderDash() {
	    return this.borderDash;
	}

	/**
	 * Default line dash. A list of numbers that specifies distances to
	 * alternately draw a line and a gap (in coordinate space units). If the
	 * number of elements in the array is odd, the elements of the array get
	 * copied and concatenated. For example, [5, 15, 25] will become [5, 15, 25,
	 * 5, 15, 25].
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
	 * Default line dash offset. A float specifying the amount of
	 * the offset. Initially 0.0.
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
	 * Default line join style. Default line join style. round Rounds off the
	 * corners of a shape by filling an additional sector of disc centered at
	 * the common endpoint of connected segments. The radius for these rounded
	 * corners is equal to the line width. bevel Fills an additional triangular
	 * area between the common endpoint of connected segments, and the separate
	 * outside rectangular corners of each segment. miter Connected segments are
	 * joined by extending their outside edges to connect at a single point,
	 * with the effect of filling an additional lozenge-shaped area. This
	 * setting is effected by the miterLimit property.
	 */
	public void setBorderJoinStyle(String borderJoinStyle) {
	    this.borderJoinStyle = borderJoinStyle;
	}

	/**
	 * @see #setCapBezierPoints(Boolean capBezierPoints)
	 */
	public Boolean getCapBezierPoints() {
	    return this.capBezierPoints;
	}

	/**
	 * If true, bezier control points are kept inside the chart. If false, no restriction is enforced.
	 */
	public void setCapBezierPoints(Boolean capBezierPoints) {
	    this.capBezierPoints = capBezierPoints;
	}

	/**
	 * @see #setFill(Boolean fill)
	 */
	public Boolean getFill() {
	    return this.fill;
	}

	/**
	 * If true, the line is filled.
	 */
	public void setFill(Boolean fill) {
	    this.fill = fill;
	}

	/**
	 * @see #setStepped(Boolean stepped)
	 */
	public Boolean getStepped() {
	    return this.stepped;
	}

	/**
	 * If true, the line is shown as a steeped line and 'tension' will be ignored
	 */
	public void setStepped(Boolean stepped) {
	    this.stepped = stepped;
	}

}

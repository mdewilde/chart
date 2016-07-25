package be.ceau.chart.options;

import java.math.BigDecimal;
import java.util.List;

import be.ceau.chart.color.Color;

public class Elements {

	public static class Arc {

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default fill color for arcs. Inherited from
		 * the global default
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color backgroundColor;

		/**
		 * <p>
		 * Color '#fff' Default stroke color for arcs
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color borderColor;

		/**
		 * <p>
		 * borderWidth Number 2 Default stroke width for arcs
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer borderWidth;

		public Color getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(Color backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public Color getBorderColor() {
			return borderColor;
		}

		public void setBorderColor(Color borderColor) {
			this.borderColor = borderColor;
		}

		public Integer getBorderWidth() {
			return borderWidth;
		}

		public void setBorderWidth(Integer borderWidth) {
			this.borderWidth = borderWidth;
		}

	}

	public static class Line {

		/**
		 * <p>
		 * <p>
		 * Default bezier curve tension. Set to 0 for no bezier curves.
		 * </p>
		 * <p>
		 * </p>
		 * 
		 * Default 0.4
		 * </p>
		 * <p>
		 * </p>
		 */
		private BigDecimal tension;

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default line fill color
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color backgroundColor;

		/**
		 * <p>
		 * Number 3 Default line stroke width
		 * </p>
		 * <p>
		 * </p>
		 */
		private BigDecimal borderWidth;

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default line stroke color
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color borderColor;

		/**
		 * <p>
		 * String 'butt' Default line cap style.
		 * <ul>
		 * <li>butt The ends of lines are squared off at the endpoints.
		 * <li>round The ends of lines are rounded.
		 * <li>square The ends of lines are squared off by adding a box with an
		 * equal width and half the height of the line's thickness.
		 * </ul>
		 * </p>
		 * <p>
		 * </p>
		 */
		private String borderCapStyle;

		/**
		 * <p>
		 * Array [] Default line dash: An Array. A list of numbers that
		 * specifies distances to alternately draw a line and a gap (in
		 * coordinate space units). If the number of elements in the array is
		 * odd, the elements of the array get copied and concatenated. For
		 * example, [5, 15, 25] will become [5, 15, 25, 5, 15, 25].
		 * </p>
		 * <p>
		 * </p>
		 */
		private List<Integer> borderDash;

		/**
		 * <p>
		 * Number 0.0 Default line dash offset. A float specifying the amount of
		 * the offset. Initially 0.0.
		 * </p>
		 * <p>
		 * </p>
		 */
		private BigDecimal borderDashOffset;

		/**
		 * <p>
		 * String 'miter' Default line join style. round Rounds off the corners
		 * of a shape by filling an additional sector of disc centered at the
		 * common endpoint of connected segments. The radius for these rounded
		 * corners is equal to the line width. bevel Fills an additional
		 * triangular area between the common endpoint of connected segments,
		 * and the separate outside rectangular corners of each segment. miter
		 * Connected segments are joined by extending their outside edges to
		 * connect at a single point, with the effect of filling an additional
		 * lozenge-shaped area. This setting is effected by the miterLimit
		 * property.
		 * </p>
		 * <p>
		 * </p>
		 */
		private String borderJoinStyle;

		/**
		 * <p>
		 * If true, bezier control points are kept inside the chart. If false,
		 * no restriction is enforced. Default true
		 * </p>
		 * <p>
		 * </p>
		 */
		private Boolean capBezierPoints;

		/**
		 * <p>
		 * If true, the line is filled. Default true
		 * </p>
		 * <p>
		 * </p>
		 */
		private Boolean fill;

		/**
		 * <p>
		 * If true, the line is shown as a steeped line and 'tension' will be
		 * ignored Default false
		 * </p>
		 * <p>
		 * </p>
		 */
		private Boolean stepped;

		public BigDecimal getTension() {
			return tension;
		}

		public void setTension(BigDecimal tension) {
			this.tension = tension;
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

		public List<Integer> getBorderDash() {
			return borderDash;
		}

		public void setBorderDash(List<Integer> borderDash) {
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

		public Boolean getCapBezierPoints() {
			return capBezierPoints;
		}

		public void setCapBezierPoints(Boolean capBezierPoints) {
			this.capBezierPoints = capBezierPoints;
		}

		public Boolean getFill() {
			return fill;
		}

		public void setFill(Boolean fill) {
			this.fill = fill;
		}

		public Boolean getStepped() {
			return stepped;
		}

		public void setStepped(Boolean stepped) {
			this.stepped = stepped;
		}

	}

	public static class Point {

		/**
		 * <p>
		 * Number 3 Default point radius
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer radius;

		/**
		 * <p>
		 * String 'circle' Default point style
		 * </p>
		 * <p>
		 * </p>
		 * <p>
		 * Default {@code circle}
		 * </p>
		 * <p>
		 * </p>
		 */
		private String pointStyle;

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default point fill color
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color backgroundColor;

		/**
		 * <p>
		 * Number 1 Default point stroke width
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer borderWidth;

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default point stroke color
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color borderColor;

		/**
		 * <p>
		 * Number 1 Extra radius added to point radius for hit detection
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer hitRadius;

		/**
		 * <p>
		 * Number 4 Default point radius when hovered
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer hoverRadius;

		/**
		 * <p>
		 * Number 1 Default stroke width when hovered
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer hoverBorderWidth;

		public Integer getRadius() {
			return radius;
		}

		public void setRadius(Integer radius) {
			this.radius = radius;
		}

		public String getPointStyle() {
			return pointStyle;
		}

		public void setPointStyle(String pointStyle) {
			this.pointStyle = pointStyle;
		}

		public Color getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(Color backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public Integer getBorderWidth() {
			return borderWidth;
		}

		public void setBorderWidth(Integer borderWidth) {
			this.borderWidth = borderWidth;
		}

		public Color getBorderColor() {
			return borderColor;
		}

		public void setBorderColor(Color borderColor) {
			this.borderColor = borderColor;
		}

		public Integer getHitRadius() {
			return hitRadius;
		}

		public void setHitRadius(Integer hitRadius) {
			this.hitRadius = hitRadius;
		}

		public Integer getHoverRadius() {
			return hoverRadius;
		}

		public void setHoverRadius(Integer hoverRadius) {
			this.hoverRadius = hoverRadius;
		}

		public Integer getHoverBorderWidth() {
			return hoverBorderWidth;
		}

		public void setHoverBorderWidth(Integer hoverBorderWidth) {
			this.hoverBorderWidth = hoverBorderWidth;
		}

	}

	public static class Rectangle {

		/**
		 * <p>
		 * Default bar fill color
		 * </p>
		 * <p>
		 * Default {@code 'rgba(0,0,0,0.1)'}
		 * </p>
		 */
		private Color backgroundColor;

		/**
		 * <p>
		 * Number 0 Default bar stroke width
		 * </p>
		 * <p>
		 * </p>
		 */
		private Integer borderWidth;

		/**
		 * <p>
		 * Color 'rgba(0,0,0,0.1)' Default bar stroke color
		 * </p>
		 * <p>
		 * </p>
		 */
		private Color borderColor;

		/**
		 * <p>
		 * String 'bottom' Default skipped (excluded) border for rectangle. Can
		 * be one of bottom, left, top, right
		 * </p>
		 * <p>
		 * </p>
		 */
		private String borderSkipped;

		public Color getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(Color backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public Integer getBorderWidth() {
			return borderWidth;
		}

		public void setBorderWidth(Integer borderWidth) {
			this.borderWidth = borderWidth;
		}

		public Color getBorderColor() {
			return borderColor;
		}

		public void setBorderColor(Color borderColor) {
			this.borderColor = borderColor;
		}

		public String getBorderSkipped() {
			return borderSkipped;
		}

		public void setBorderSkipped(String borderSkipped) {
			this.borderSkipped = borderSkipped;
		}

	}

}

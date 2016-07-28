package be.ceau.chart.options.elements;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Elements {

	/**
	 * @see #setArc(Arc)
	 */
	private Arc arc;

	/**
	 * @see #setLine(Line)
	 */
	private Line line;

	/**
	 * @see #setPoint(Point)
	 */
	private Point point;

	/**
	 * @see #setRectangle(Rectangle)
	 */
	private Rectangle rectangle;

	/**
	 * @see #setArc(Arc)
	 */
	public Arc getArc() {
		return arc;
	}

	/**
	 * Arcs are used in the polar area, doughnut and pie charts. They can be
	 * configured with the following options. The global arc options are stored
	 * in Chart.defaults.global.elements.arc.
	 */
	public void setArc(Arc arc) {
		this.arc = arc;
	}

	/**
	 * @see #setLine(Line)
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * Line elements are used to represent the line in a line chart. The global
	 * line options are stored in Chart.defaults.global.elements.line.
	 */
	public void setLine(Line line) {
		this.line = line;
	}

	/**
	 * @see #setPoint(Point)
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * Point elements are used to represent the points in a line chart or a
	 * bubble chart. The global point options are stored in
	 * Chart.defaults.global.elements.point.
	 */
	public void setPoint(Point point) {
		this.point = point;
	}

	/**
	 * @see #setRectangle(Rectangle)
	 */
	public Rectangle getRectangle() {
		return rectangle;
	}

	/**
	 * Rectangle elements are used to represent the bars in a bar chart. The
	 * global rectangle options are stored in
	 * Chart.defaults.global.elements.rectangle.
	 */
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

}

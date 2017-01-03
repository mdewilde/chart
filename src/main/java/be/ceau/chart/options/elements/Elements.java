/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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

/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.ticks.RadialLinearTicks;
import be.ceau.chart.options.ticks.Ticks;

/**
 * The radial linear scale is used specifically for the radar and polar are
 * chart types. It overlays the chart area, rather than being positioned on one
 * of the edges.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadialLinearScale extends Scale<RadialLinearScale> {

	private final String type = "radialLinear";

	/**
	 * @see #setLineArc(Boolean)
	 */
	private Boolean lineArc;

	/**
	 * @see #setAngleLines(AngleLines)
	 */
	private AngleLines angleLines;

	/**
	 * @see #setPointLabels(PointLabels)
	 */
	private PointLabels pointLabels;

	/**
	 * @see #setTicks(Ticks)
	 */
	private Ticks<RadialLinearTicks> ticks;

	public String getType() {
		return type;
	}

	/**
	 * @see #setLineArc(Boolean)
	 */
	public Boolean getLineArc() {
	    return this.lineArc;
	}

	/**
	 * <p>
	 * If true, circular arcs are used else straight lines are used. The former is used by the polar area chart and the latter by the radar chart
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public RadialLinearScale setLineArc(Boolean lineArc) {
	    this.lineArc = lineArc;
	    return this;
	}

	/**
	 * @see #setAngleLines(AngleLines)
	 */
	public AngleLines getAngleLines() {
	    return this.angleLines;
	}

	/**
	 * <p>
	 * See the Angle Line Options section below for details.
	 * </p>
	 * 
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public RadialLinearScale setAngleLines(AngleLines angleLines) {
	    this.angleLines = angleLines;
	    return this;
	}

	/**
	 * @see #setPointLabels(PointLabels)
	 */
	public PointLabels getPointLabels() {
	    return this.pointLabels;
	}

	/**
	 * <p>
	 * See the Point Label Options section below for details.
	 * </p>
	 * 
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public RadialLinearScale setPointLabels(PointLabels pointLabels) {
	    this.pointLabels = pointLabels;
	    return this;
	}

	/**
	 * @see #setTicks(Ticks)
	 */
	public Ticks<RadialLinearTicks> getTicks() {
	    return this.ticks;
	}

	/**
	 * <p>
	 * See the Ticks table below for options.
	 * </p>
	 * 
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public RadialLinearScale setTicks(Ticks<RadialLinearTicks> ticks) {
	    this.ticks = ticks;
	    return this;
	}

}

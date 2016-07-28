package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The radial linear scale is used specifically for the radar and polar are
 * chart types. It overlays the chart area, rather than being positioned on one
 * of the edges.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadialLinearScales extends Scales {

	@Override
	public String getType() {
		return "radialLinear";
	}

	/**
	 * Default {@code false}
	 * 
	 * @see #setLineArc(Boolean lineArc)
	 */
	private Boolean lineArc;

	/**
	 * Default {@code -}
	 * 
	 * @see #setAngleLines(AngleLines angleLines)
	 */
	private AngleLines angleLines;

	/**
	 * Default {@code -}
	 * 
	 * @see #setPointLabels(PointLabels pointLabels)
	 */
	private PointLabels pointLabels;

	/**
	 * Default {@code -}
	 * 
	 * @see #setTicks(Ticks ticks)
	 */
	private Ticks ticks;

	/**
	 * @see #setLineArc(Boolean lineArc)
	 */
	public Boolean getLineArc() {
	    return this.lineArc;
	}

	/**
	 * If true, circular arcs are used else straight lines are used. The former is used by the polar area chart and the latter by the radar chart
	 */
	public void setLineArc(Boolean lineArc) {
	    this.lineArc = lineArc;
	}

	/**
	 * @see #setAngleLines(AngleLines angleLines)
	 */
	public AngleLines getAngleLines() {
	    return this.angleLines;
	}

	/**
	 * See the Angle Line Options section below for details.
	 */
	public void setAngleLines(AngleLines angleLines) {
	    this.angleLines = angleLines;
	}

	/**
	 * @see #setPointLabels(PointLabels pointLabels)
	 */
	public PointLabels getPointLabels() {
	    return this.pointLabels;
	}

	/**
	 * See the Point Label Options section below for details.
	 */
	public void setPointLabels(PointLabels pointLabels) {
	    this.pointLabels = pointLabels;
	}

	/**
	 * @see #setTicks(Ticks ticks)
	 */
	public Ticks getTicks() {
	    return this.ticks;
	}

	/**
	 * See the Ticks table below for options.
	 */
	public void setTicks(Ticks ticks) {
	    this.ticks = ticks;
	}
	
}

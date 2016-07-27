package be.ceau.chart.options.scales;

/**
 * The radial linear scale is used specifically for the radar and polar are
 * chart types. It overlays the chart area, rather than being positioned on one
 * of the edges.
 */
public class RadialLinearScales extends Scales {

	/**
	 * Default {@code false}
	 * 
	 * @see #setLineArc(Boolean)
	 */
	private Boolean lineArc;
	
	/**
	 * The following options are used to configure angled lines that radiate
	 * from the center of the chart to the point labels. They can be found in
	 * the {@code angleLines} sub options. Note that these options only apply if
	 * lineArc is false.
	 */
	private AngleLines angleLines;

	/**
	 * The following options are used to configure the point labels that are
	 * shown on the perimeter of the scale. They can be found in the pointLabels
	 * sub options. Note that these options only apply if lineArc is false.
	 */
	private PointLabels pointLabels;
	
	/**
	 * See the Ticks table below for options.
	 */
	private RadialLinearTicks ticks;
			
	@Override
	public String getType() {
		return "radialLinear";
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(RadialLinearTicks ticks) {
		this.ticks = ticks;
	}

	/**
	 * @see #setLineArc(Boolean)
	 */
	public Boolean getLineArc() {
		return lineArc;
	}

	/**
	 * If true, circular arcs are used else straight lines are used. The former
	 * is used by the polar area chart and the latter by the radar chart
	 */
	public void setLineArc(Boolean lineArc) {
		this.lineArc = lineArc;
	}

	/**
	 * @see #setAngleLines(AngleLines)
	 */
	public AngleLines getAngleLines() {
		return angleLines;
	}

	public void setAngleLines(AngleLines angleLines) {
		this.angleLines = angleLines;
	}

	/**
	 * @see #setPointLabels(PointLabels)
	 */
	public PointLabels getPointLabels() {
		return pointLabels;
	}

	public void setPointLabels(PointLabels pointLabels) {
		this.pointLabels = pointLabels;
	}
	
}

package be.ceau.chart.options.scales;

/**
 * The linear scale is use to chart numerical data. It can be placed on either
 * the x or y axis. The scatter chart type automatically configures a line chart
 * to use one of these scales for the x axis. As the name suggests, linear
 * interpolation is used to determine where a value lies on the axis.
 */
public class LinearScales extends Scales {

	private LinearTicks ticks;

	@Override
	public String getType() {
		return "linear";
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(LinearTicks ticks) {
		this.ticks = ticks;
	}

}

package be.ceau.chart.options.scales;

/**
 * The logarithmic scale is use to chart numerical data. It can be placed on
 * either the x or y axis. As the name suggests, logarithmic interpolation is
 * used to determine where a value lies on the axis.
 */
public class LogarithmicScales extends Scales {

	private LogarithmicTicks ticks;

	@Override
	public String getType() {
		return "logarithmic";
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(LogarithmicTicks ticks) {
		this.ticks = ticks;
	}

}

package be.ceau.chart.options.scales;

/**
 * The time scale is used to display times and dates. It can only be placed on
 * the X axis. When building its ticks, it will automatically calculate the most
 * comfortable unit base on the size of the scale.
 */
public class TimeScales extends Scales {

	private Ticks ticks;
	
	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String getType() {
		return "time";
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(Ticks ticks) {
		this.ticks = ticks;
	}

}

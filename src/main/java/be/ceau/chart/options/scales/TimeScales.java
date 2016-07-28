package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The time scale is used to display times and dates. It can only be placed on
 * the X axis. When building its ticks, it will automatically calculate the most
 * comfortable unit base on the size of the scale.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
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

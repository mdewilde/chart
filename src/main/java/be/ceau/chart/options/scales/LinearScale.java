package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The linear scale is use to chart numerical data. It can be placed on either
 * the x or y axis. The scatter chart type automatically configures a line chart
 * to use one of these scales for the x axis. As the name suggests, linear
 * interpolation is used to determine where a value lies on the axis.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LinearScale extends Scale {

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

package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The radial linear scale is used specifically for the radar and polar are
 * chart types. It overlays the chart area, rather than being positioned on one
 * of the edges.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadialLinearScales {

	private List<RadialLinearScale> xAxes;
	
	private List<RadialLinearScale> yAxes;

	public List<RadialLinearScale> getxAxes() {
		return xAxes;
	}

	public void setxAxes(List<RadialLinearScale> xAxes) {
		this.xAxes = xAxes;
	}

	public List<RadialLinearScale> getyAxes() {
		return yAxes;
	}

	public void setyAxes(List<RadialLinearScale> yAxes) {
		this.yAxes = yAxes;
	}

}

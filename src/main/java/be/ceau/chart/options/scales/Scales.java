package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Scales {

	private List<Scale> xAxes;
	
	private List<Scale> yAxes;

	public List<Scale> getxAxes() {
		return xAxes;
	}

	public void setxAxes(List<Scale> xAxes) {
		this.xAxes = xAxes;
	}

	public List<Scale> getyAxes() {
		return yAxes;
	}

	public void setyAxes(List<Scale> yAxes) {
		this.yAxes = yAxes;
	}

}

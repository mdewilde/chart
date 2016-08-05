package be.ceau.chart.options.scales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarScale extends CategoryScale {

	/**
	 * @see #setxAxes(List)
	 */
	private List<XAxis> xAxes;

	/**
	 * @see #setyAxes(List)
	 */
	private List<YAxis> yAxes;

	/**
	 * @see #setxAxes(List)
	 */
	public List<XAxis> getxAxes() {
		return xAxes;
	}

	/**
	 * The bar chart officially supports only 1 x-axis but uses an array to keep
	 * the API consistent. Use a scatter chart if you need multiple x axes.
	 */
	public void setxAxes(List<XAxis> xAxes) {
		this.xAxes = xAxes;
	}

	/**
	 * @see #setyAxes(List)
	 */
	public List<YAxis> getyAxes() {
		return yAxes;
	}

	/**
	 * 
	 */
	public void setyAxes(List<YAxis> yAxes) {
		this.yAxes = yAxes;
	}

}

package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CategoryTicks extends Ticks {

	/**
	 * @see #setMin(String)
	 */
	private String min;

	/**
	 * @see #setMax(String)
	 */
	private String max;

	/**
	 * @see #setMin(String)
	 */
	public String getMin() {
		return min;
	}

	/**
	 * The minimum item to display. Must be a value in the labels array
	 */
	public void setMin(String min) {
		this.min = min;
	}

	/**
	 * @see #setMax(String)
	 */
	public String getMax() {
		return max;
	}

	/**
	 * The maximum item to display. Must be a value in the labels array
	 */
	public void setMax(String max) {
		this.max = max;
	}

}

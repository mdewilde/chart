package be.ceau.chart.options.scales;

public class LogarithmicTicks extends Ticks {

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

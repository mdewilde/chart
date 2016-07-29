package be.ceau.chart.options.scales;

public class YAxis {

	/**
	 * Default {@code "linear"}
	 * 
	 * @see #setType(String type)
	 */
	private String type;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code "y-axis-0"}
	 * 
	 * @see #setId(String id)
	 */
	private String id;

	/**
	 * Default {@code false}
	 * 
	 * @see #setStacked(Boolean stacked)
	 */
	private Boolean stacked;

	/**
	 * @see #setType(String type)
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * As defined in Scales.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see #setDisplay(Boolean display)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * If true, show the scale.
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}

	/**
	 * @see #setId(String id)
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Id of the axis so that data can bind to it.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setStacked(Boolean stacked)
	 */
	public Boolean getStacked() {
		return this.stacked;
	}

	/**
	 * If true, bars are stacked on the y-axis
	 */
	public void setStacked(Boolean stacked) {
		this.stacked = stacked;
	}

}

package be.ceau.chart.options.scales;

import java.math.BigDecimal;

public class XAxis {

	/**
	 * Default {@code "Category"}
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
	 * Default {@code "x-axis-0"}
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
	 * Default {@code 0.8}
	 * 
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	private BigDecimal categoryPercentage;

	/**
	 * Default {@code 0.9}
	 * 
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	private BigDecimal barPercentage;

	/**
	 * Default {@code offsetGridLines == true}
	 * 
	 * @see #setGridLines(GridLines gridLines)
	 */
	private GridLines gridLines;

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
	 * Id of the axis so that data can bind to it
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
	 * If true, bars are stacked on the x-axis
	 */
	public void setStacked(Boolean stacked) {
		this.stacked = stacked;
	}

	/**
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	public BigDecimal getCategoryPercentage() {
		return this.categoryPercentage;
	}

	/**
	 * Percent (0-1) of the available width (the space between the gridlines for
	 * small datasets) for each data-point to use for the bars. Read More
	 */
	public void setCategoryPercentage(BigDecimal categoryPercentage) {
		this.categoryPercentage = categoryPercentage;
	}

	/**
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	public BigDecimal getBarPercentage() {
		return this.barPercentage;
	}

	/**
	 * Percent (0-1) of the available width each bar should be within the
	 * category percentage. 1.0 will take the whole category width and put the
	 * bars right next to each other. Read More
	 */
	public void setBarPercentage(BigDecimal barPercentage) {
		this.barPercentage = barPercentage;
	}

	/**
	 * @see #setGridLines(GridLines gridLines)
	 */
	public GridLines getGridLines() {
		return this.gridLines;
	}

	/**
	 * 
	 */
	public void setGridLines(GridLines gridLines) {
		this.gridLines = gridLines;
	}

}

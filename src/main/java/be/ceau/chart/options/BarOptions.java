package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarOptions {

	/**
	 * Default {@code "label"}
	 * 
	 * @see #setHover.mode(String hover.mode)
	 */
	private String hover.mode;

	/**
	 * Default {@code -}
	 * 
	 * @see #setScales(CategoryScales)
	 */
	private CategoryScales scales;

	/**
	 * Default {@code }
	 * 
	 * @see #setScales.xAxes(Array scales.xAxes)
	 */
	private Array scales.xAxes;

	/**
	 * Default {@code }
	 * 
	 * @see #setOptions for xAxes( Options for xAxes)
	 */
	private  Options for xAxes;

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
	 * Default {@code See Scales}
	 * 
	 * @see #setGridLines(GridLines gridLines)
	 */
	private GridLines gridLines;

	/**
	 * Default {@code true}
	 * 
	 * @see #setGridLines.offsetGridLines(Boolean gridLines.offsetGridLines)
	 */
	private Boolean gridLines.offsetGridLines;

	/**
	 * Default {@code [{ type: "linear" }]}
	 * 
	 * @see #setScales.yAxes(Array scales.yAxes)
	 */
	private Array scales.yAxes;

	/**
	 * Default {@code }
	 * 
	 * @see #setOptions for yAxes( Options for yAxes)
	 */
	private  Options for yAxes;

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
	 * @see #setHover.mode(String hover.mode)
	 */
	public String getHover.mode() {
	    return this.hover.mode;
	}

	/**
	 * Label's hover mode. "label" is used since the x axis displays data by the index in the dataset.
	 */
	public void setHover.mode(String hover.mode) {
	    this.hover.mode = hover.mode;
	}

	/**
	 * @see #setScales(Scales scales)
	 */
	public Scales getScales() {
	    return this.scales;
	}

	/**
	 * -
	 */
	public void setScales(Scales scales) {
	    this.scales = scales;
	}

	/**
	 * @see #setScales.xAxes(Array scales.xAxes)
	 */
	public Array getScales.xAxes() {
	    return this.scales.xAxes;
	}

	/**
	 * The bar chart officially supports only 1 x-axis but uses an array to keep the API consistent. Use a scatter chart if you need multiple x axes.
	 */
	public void setScales.xAxes(Array scales.xAxes) {
	    this.scales.xAxes = scales.xAxes;
	}

	/**
	 * @see #setOptions for xAxes( Options for xAxes)
	 */
	public  getOptions for xAxes() {
	    return this.Options for xAxes;
	}

	/**
	 * 
	 */
	public void setOptions for xAxes( Options for xAxes) {
	    this.Options for xAxes = Options for xAxes;
	}

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
	 * Percent (0-1) of the available width (the space between the gridlines for small datasets) for each data-point to use for the bars. Read More
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
	 * Percent (0-1) of the available width each bar should be within the category percentage. 1.0 will take the whole category width and put the bars right next to each other. Read More
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

	/**
	 * @see #setGridLines.offsetGridLines(Boolean gridLines.offsetGridLines)
	 */
	public Boolean getGridLines.offsetGridLines() {
	    return this.gridLines.offsetGridLines;
	}

	/**
	 * If true, the bars for a particular data point fall between the grid lines. If false, the grid line will go right down the middle of the bars.
	 */
	public void setGridLines.offsetGridLines(Boolean gridLines.offsetGridLines) {
	    this.gridLines.offsetGridLines = gridLines.offsetGridLines;
	}

	/**
	 * @see #set( )
	 */
	public  get() {
	    return this.;
	}

	/**
	 * 
	 */
	public void set( ) {
	    this. = ;
	}

	/**
	 * @see #setScales.yAxes(Array scales.yAxes)
	 */
	public Array getScales.yAxes() {
	    return this.scales.yAxes;
	}

	/**
	 * 
	 */
	public void setScales.yAxes(Array scales.yAxes) {
	    this.scales.yAxes = scales.yAxes;
	}

	/**
	 * @see #setOptions for yAxes( Options for yAxes)
	 */
	public  getOptions for yAxes() {
	    return this.Options for yAxes;
	}

	/**
	 * 
	 */
	public void setOptions for yAxes( Options for yAxes) {
	    this.Options for yAxes = Options for yAxes;
	}

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

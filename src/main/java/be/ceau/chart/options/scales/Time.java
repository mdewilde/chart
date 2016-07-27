package be.ceau.chart.options.scales;

public class Time {

	/**
	 * See Display Formats section below. -
	 */
	private Object displayFormats;

	/**
	 * If true and the unit is set to 'week', iso weekdays will be used. false
	 */
	private Boolean isoWeekday;

	/**
	 * If defined, this will override the data maximum -
	 */
	private Time max;

	/**
	 * If defined, this will override the data minimum -
	 */
	private Time min;

	/**
	*If defined as a string, it is interpreted as a custom format to be used by moment to parse the date. If this is a function, it must return a moment.js object given the appropriate data value.
	*/
	private String parser;

	/**
	 * If defined, dates will be rounded to the start of this unit. See Time
	 * Units below for the allowed units. -
	 */
	private String round;

	/**
	 * The moment js format string to use for the tooltip. ''
	 */
	private String tooltipFormat;

	/**
	 * If defined, will force the unit to be a certain type. See Time Units
	 * section below for details. -
	 */
	private String unit;

	/**
	 * The number of units between grid lines. 1
	 */
	private Number unitStepSize;

	public Object getDisplayFormats() {
		return displayFormats;
	}

	public void setDisplayFormats(Object displayFormats) {
		this.displayFormats = displayFormats;
	}

	public Boolean getIsoWeekday() {
		return isoWeekday;
	}

	public void setIsoWeekday(Boolean isoWeekday) {
		this.isoWeekday = isoWeekday;
	}

	public Time getMax() {
		return max;
	}

	public void setMax(Time max) {
		this.max = max;
	}

	public Time getMin() {
		return min;
	}

	public void setMin(Time min) {
		this.min = min;
	}

	public String getParser() {
		return parser;
	}

	public void setParser(String parser) {
		this.parser = parser;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getTooltipFormat() {
		return tooltipFormat;
	}

	public void setTooltipFormat(String tooltipFormat) {
		this.tooltipFormat = tooltipFormat;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Number getUnitStepSize() {
		return unitStepSize;
	}

	public void setUnitStepSize(Number unitStepSize) {
		this.unitStepSize = unitStepSize;
	}

//
//	When providing data for the time scale, Chart.js supports all of the formats that Moment.js accepts. See Moment.js docs for details.
//	Display Formats
//
//	The following display formats are used to configure how different time units are formed into strings for the axis tick marks. See moment.js for the allowable format strings.
//	Name 	Default
//	millisecond 	'SSS [ms]'
//	second 	'h:mm:ss a'
//	minute 	'h:mm:ss a'
//	hour 	'MMM D, hA'
//	day 	'll'
//	week 	'll'
//	month 	'MMM YYYY'
//	quarter 	'[Q]Q - YYYY'
//	year 	'YYYY'
//	
//	Time Units
//
//	The following time measurements are supported. The names can be passed as strings to the time.unit config option to force a certain unit.
//
//	    millisecond
//	    second
//	    minute
//	    hour
//	    day
//	    week
//	    month
//	    quarter
//	    year
//
//	For example, to create a chart with a time scale that always displayed units per month, the following config could be used.
//
//	var chartInstance = new Chart(ctx, {
//	    type: 'line',
//	    data: data,
//	    options: {
//	        scales: {
//	            xAxes: [{
//	                time: {
//	                    unit: 'month'
//	                }
//	            }]
//	        }
//	    }
//	})
}

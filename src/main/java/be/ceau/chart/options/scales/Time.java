package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Time {

	/**
	 * Default {@code -}
	 * 
	 * @see #setDisplayFormats(DisplayFormats displayFormats)
	 */
	private DisplayFormats displayFormats;

	/**
	 * Default {@code false}
	 * 
	 * @see #setIsoWeekday(Boolean isoWeekday)
	 */
	private Boolean isoWeekday;

	/**
	 * Default {@code -}
	 * 
	 * @see #setMax(Time max)
	 */
	private Time max;

	/**
	 * Default {@code -}
	 * 
	 * @see #setMin(Time min)
	 */
	private Time min;

	/**
	 * Default {@code -}
	 * 
	 * @see #setParser(String or Function parser)
	 */
	private String parser;

	/**
	 * Default {@code -}
	 * 
	 * @see #setRound(String round)
	 */
	private String round;

	/**
	 * Default {@code ''}
	 * 
	 * @see #setTooltipFormat(String tooltipFormat)
	 */
	private String tooltipFormat;

	/**
	 * Default {@code -}
	 * 
	 * @see #setUnit(String unit)
	 */
	private String unit;

	/**
	 * Default {@code 1}
	 * 
	 * @see #setUnitStepSize(BigDecimal unitStepSize)
	 */
	private BigDecimal unitStepSize;

	/**
	 * @see #setDisplayFormats(DisplayFormats displayFormats)
	 */
	public DisplayFormats getDisplayFormats() {
		return this.displayFormats;
	}

	/**
	 * See Display Formats section below.
	 */
	public void setDisplayFormats(DisplayFormats displayFormats) {
		this.displayFormats = displayFormats;
	}

	/**
	 * @see #setIsoWeekday(Boolean isoWeekday)
	 */
	public Boolean getIsoWeekday() {
		return this.isoWeekday;
	}

	/**
	 * If true and the unit is set to 'week', iso weekdays will be used.
	 */
	public void setIsoWeekday(Boolean isoWeekday) {
		this.isoWeekday = isoWeekday;
	}

	/**
	 * @see #setMax(Time max)
	 */
	public Time getMax() {
		return this.max;
	}

	/**
	 * If defined, this will override the data maximum
	 */
	public void setMax(Time max) {
		this.max = max;
	}

	/**
	 * @see #setMin(Time min)
	 */
	public Time getMin() {
		return this.min;
	}

	/**
	 * If defined, this will override the data minimum
	 */
	public void setMin(Time min) {
		this.min = min;
	}

	/**
	 * @see #setParser(String or Function parser)
	 */
	public String getParser() {
		return this.parser;
	}

	/**
	 * If defined as a string, it is interpreted as a custom format to be used
	 * by moment to parse the date. If this is a function, it must return a
	 * moment.js object given the appropriate data value.
	 */
	public void setParser(String parser) {
		this.parser = parser;
	}

	/**
	 * @see #setRound(String round)
	 */
	public String getRound() {
		return this.round;
	}

	/**
	 * If defined, dates will be rounded to the start of this unit. See Time
	 * Units below for the allowed units.
	 */
	public void setRound(String round) {
		this.round = round;
	}

	/**
	 * @see #setTooltipFormat(String tooltipFormat)
	 */
	public String getTooltipFormat() {
		return this.tooltipFormat;
	}

	/**
	 * The moment js format string to use for the tooltip.
	 */
	public void setTooltipFormat(String tooltipFormat) {
		this.tooltipFormat = tooltipFormat;
	}

	/**
	 * @see #setUnit(String unit)
	 */
	public String getUnit() {
		return this.unit;
	}

	/**
	 * If defined, will force the unit to be a certain type. See Time Units
	 * section below for details.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @see #setUnitStepSize(BigDecimal unitStepSize)
	 */
	public BigDecimal getUnitStepSize() {
		return this.unitStepSize;
	}

	/**
	 * The number of units between grid lines.
	 */
	public void setUnitStepSize(BigDecimal unitStepSize) {
		this.unitStepSize = unitStepSize;
	}

}

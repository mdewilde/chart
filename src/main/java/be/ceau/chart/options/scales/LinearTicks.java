package be.ceau.chart.options.scales;

import java.math.BigDecimal;

public class LinearTicks extends Ticks {

	/**
	 * if true, scale will include 0 if it is not already included.
	 */
	private Boolean beginAtZero;

	/**
	 * User defined minimum number for the scale, overrides minimum value from
	 * data.
	 */
	private BigDecimal min;

	/**
	 * User defined maximum number for the scale, overrides maximum value from
	 * data.
	 */
	private BigDecimal max;

	/**
	 * Maximum number of ticks and gridlines to show. If not defined, it will
	 * limit to 11 ticks but will show all gridlines. 11
	 */
	private BigDecimal maxTicksLimit;

	/**
	 * User defined fixed step size for the scale. If set, the scale ticks will
	 * be enumerated by multiple of stepSize, having one tick per increment. If
	 * not set, the ticks are labeled automatically using the nice numbers
	 * algorithm.
	 */
	private BigDecimal fixedStepSize;

	/**
	 * if defined, it can be used along with the min and the max to give a
	 * custom number of steps. See the example below. -
	 */
	private BigDecimal stepSize;

	/**
	 * User defined maximum number for the scale, overrides maximum value except
	 * for if it is lower than the maximum value. -
	 */
	private BigDecimal suggestedMax;

	/**
	 * User defined minimum number for the scale, overrides minimum value except
	 * for if it is higher than the minimum value. -
	 */
	private BigDecimal suggestedMin;

	public Boolean getBeginAtZero() {
		return beginAtZero;
	}

	public void setBeginAtZero(Boolean beginAtZero) {
		this.beginAtZero = beginAtZero;
	}

	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public BigDecimal getMaxTicksLimit() {
		return maxTicksLimit;
	}

	public void setMaxTicksLimit(BigDecimal maxTicksLimit) {
		this.maxTicksLimit = maxTicksLimit;
	}

	public BigDecimal getFixedStepSize() {
		return fixedStepSize;
	}

	public void setFixedStepSize(BigDecimal fixedStepSize) {
		this.fixedStepSize = fixedStepSize;
	}

	public BigDecimal getStepSize() {
		return stepSize;
	}

	public void setStepSize(BigDecimal stepSize) {
		this.stepSize = stepSize;
	}

	public BigDecimal getSuggestedMax() {
		return suggestedMax;
	}

	public void setSuggestedMax(BigDecimal suggestedMax) {
		this.suggestedMax = suggestedMax;
	}

	public BigDecimal getSuggestedMin() {
		return suggestedMin;
	}

	public void setSuggestedMin(BigDecimal suggestedMin) {
		this.suggestedMin = suggestedMin;
	}

}

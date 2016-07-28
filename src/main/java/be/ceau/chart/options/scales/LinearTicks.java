package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LinearTicks extends Ticks {

	/**
	 * Default {@code -}
	 * 
	 * @see #setBeginAtZero(Boolean beginAtZero)
	 */
	private Boolean beginAtZero;

	/**
	 * Default {@code -}
	 * 
	 * @see #setMin(BigDecimal min)
	 */
	private BigDecimal min;

	/**
	 * Default {@code -}
	 * 
	 * @see #setMax(BigDecimal max)
	 */
	private BigDecimal max;

	/**
	 * Default {@code 11}
	 * 
	 * @see #setMaxTicksLimit(BigDecimal maxTicksLimit)
	 */
	private BigDecimal maxTicksLimit;

	/**
	 * Default {@code -}
	 * 
	 * @see #setFixedStepSize(BigDecimal fixedStepSize)
	 */
	private BigDecimal fixedStepSize;

	/**
	 * Default {@code -}
	 * 
	 * @see #setStepSize(BigDecimal stepSize)
	 */
	private BigDecimal stepSize;

	/**
	 * Default {@code -}
	 * 
	 * @see #setSuggestedMax(BigDecimal suggestedMax)
	 */
	private BigDecimal suggestedMax;

	/**
	 * Default {@code -}
	 * 
	 * @see #setSuggestedMin(BigDecimal suggestedMin)
	 */
	private BigDecimal suggestedMin;

	/**
	 * @see #setBeginAtZero(Boolean beginAtZero)
	 */
	public Boolean getBeginAtZero() {
	    return this.beginAtZero;
	}

	/**
	 * if true, scale will inclulde 0 if it is not already included.
	 */
	public void setBeginAtZero(Boolean beginAtZero) {
	    this.beginAtZero = beginAtZero;
	}

	/**
	 * @see #setMin(BigDecimal min)
	 */
	public BigDecimal getMin() {
	    return this.min;
	}

	/**
	 * User defined minimum number for the scale, overrides minimum value from data.
	 */
	public void setMin(BigDecimal min) {
	    this.min = min;
	}

	/**
	 * @see #setMax(BigDecimal max)
	 */
	public BigDecimal getMax() {
	    return this.max;
	}

	/**
	 * User defined maximum number for the scale, overrides maximum value from data.
	 */
	public void setMax(BigDecimal max) {
	    this.max = max;
	}

	/**
	 * @see #setMaxTicksLimit(BigDecimal maxTicksLimit)
	 */
	public BigDecimal getMaxTicksLimit() {
	    return this.maxTicksLimit;
	}

	/**
	 * Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all gridlines.
	 */
	public void setMaxTicksLimit(BigDecimal maxTicksLimit) {
	    this.maxTicksLimit = maxTicksLimit;
	}

	/**
	 * @see #setFixedStepSize(BigDecimal fixedStepSize)
	 */
	public BigDecimal getFixedStepSize() {
	    return this.fixedStepSize;
	}

	/**
	 * User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize, having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.
	 */
	public void setFixedStepSize(BigDecimal fixedStepSize) {
	    this.fixedStepSize = fixedStepSize;
	}

	/**
	 * @see #setStepSize(BigDecimal stepSize)
	 */
	public BigDecimal getStepSize() {
	    return this.stepSize;
	}

	/**
	 * if defined, it can be used along with the min and the max to give a custom number of steps. See the example below.
	 */
	public void setStepSize(BigDecimal stepSize) {
	    this.stepSize = stepSize;
	}

	/**
	 * @see #setSuggestedMax(BigDecimal suggestedMax)
	 */
	public BigDecimal getSuggestedMax() {
	    return this.suggestedMax;
	}

	/**
	 * User defined maximum number for the scale, overrides maximum value except for if it is lower than the maximum value.
	 */
	public void setSuggestedMax(BigDecimal suggestedMax) {
	    this.suggestedMax = suggestedMax;
	}

	/**
	 * @see #setSuggestedMin(BigDecimal suggestedMin)
	 */
	public BigDecimal getSuggestedMin() {
	    return this.suggestedMin;
	}

	/**
	 * User defined minimum number for the scale, overrides minimum value except for if it is higher than the minimum value.
	 */
	public void setSuggestedMin(BigDecimal suggestedMin) {
	    this.suggestedMin = suggestedMin;
	}

}

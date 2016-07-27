package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import be.ceau.chart.color.Color;

public class RadialLinearTicks extends Ticks {

	/**
	 * Default {@code rgba(255, 255, 255, 0.75)}
	 * 
	 * @see #setBackdropColor(Color)
	 */
	private Color backdropColor;

	/**
	 * Default {@code 2} Horizontal padding of label backdrop 2
	 * 
	 * @see #setBackdropPaddingX(BigDecimal)
	 */
	private BigDecimal backdropPaddingX;

	/**
	 * Default {@code 2} Vertical padding of label backdrop 2
	 * 
	 * @see #setBackdropPaddingY(BigDecimal)
	 */
	private BigDecimal backdropPaddingY;

	/**
	 * @see #setBeginAtZero(Boolean)
	 */
	private Boolean beginAtZero;

	/**
	 * @see #setMin(BigDecimal)
	 */
	private BigDecimal min;

	/**
	 * @see #setMax(BigDecimal)
	 */
	private BigDecimal max;

	/**
	 * Default {@code 11}
	 * 
	 * @see #setMaxTicksLimit(BigDecimal)
	 */
	private BigDecimal maxTicksLimit;

	/**
	 * Default {@code true}
	 * 
	 * @see #setShowLabelBackdrop(Boolean)
	 */
	private Boolean showLabelBackdrop;

	/**
	 * @see #setFixedStepSize(BigDecimal)
	 */
	private BigDecimal fixedStepSize;

	/**
	 * @see #setStepSize(BigDecimal)
	 */
	private BigDecimal stepSize;

	/**
	 * @see #setSuggestedMax(BigDecimal)
	 */
	private BigDecimal suggestedMax;

	/**
	 * @see #setSuggestedMin(BigDecimal)
	 */
	private BigDecimal suggestedMin;

	/**
	 * @see #setBackdropColor(Color)
	 */
	public Color getBackdropColor() {
		return backdropColor;
	}

	/**
	 * Color of label backdrops
	 */
	public void setBackdropColor(Color backdropColor) {
		this.backdropColor = backdropColor;
	}

	/**
	 * @see #setBackdropPaddingX(BigDecimal)
	 */
	public BigDecimal getBackdropPaddingX() {
		return backdropPaddingX;
	}

	/**
	 * Horizontal padding of label backdrop
	 */
	public void setBackdropPaddingX(BigDecimal backdropPaddingX) {
		this.backdropPaddingX = backdropPaddingX;
	}

	/**
	 * @see #setBackdropPaddingY(BigDecimal)
	 */
	public BigDecimal getBackdropPaddingY() {
		return backdropPaddingY;
	}

	/**
	 * Vertical padding of label backdrop
	 */
	public void setBackdropPaddingY(BigDecimal backdropPaddingY) {
		this.backdropPaddingY = backdropPaddingY;
	}

	/**
	 * @see #setBeginAtZero(Boolean)
	 */
	public Boolean getBeginAtZero() {
		return beginAtZero;
	}

	/**
	 * If true, scale will include 0 if it is not already included.
	 */
	public void setBeginAtZero(Boolean beginAtZero) {
		this.beginAtZero = beginAtZero;
	}

	/**
	 * @see #setMin(BigDecimal)
	 */
	public BigDecimal getMin() {
		return min;
	}

	/**
	 * 
	 * User defined minimum number for the scale, overrides minimum value from
	 * data.
	 */
	public void setMin(BigDecimal min) {
		this.min = min;
	}

	/**
	 * @see #setMax(BigDecimal)
	 */
	public BigDecimal getMax() {
		return max;
	}

	/**
	 * User defined maximum number for the scale, overrides maximum value from
	 * data.
	 */
	public void setMax(BigDecimal max) {
		this.max = max;
	}

	/**
	 * @see #setMaxTicksLimit(BigDecimal)
	 */
	public BigDecimal getMaxTicksLimit() {
		return maxTicksLimit;
	}

	/**
	 * Maximum number of ticks and gridlines to show. If not defined, it will
	 * limit to 11 ticks but will show all gridlines. 11
	 */
	public void setMaxTicksLimit(BigDecimal maxTicksLimit) {
		this.maxTicksLimit = maxTicksLimit;
	}

	/**
	 * @see #setShowLabelBackdrop(Boolean)
	 */
	public Boolean getShowLabelBackdrop() {
		return showLabelBackdrop;
	}

	/**
	 * If true, draw a background behind the tick labels true
	 */
	public void setShowLabelBackdrop(Boolean showLabelBackdrop) {
		this.showLabelBackdrop = showLabelBackdrop;
	}

	/**
	 * @see #setFixedStepSize(BigDecimal)
	 */
	public BigDecimal getFixedStepSize() {
		return fixedStepSize;
	}

	/**
	 * User defined fixed step size for the scale. If set, the scale ticks will
	 * be enumerated by multiple of stepSize, having one tick per increment. If
	 * not set, the ticks are labeled automatically using the nice numbers
	 * algorithm.
	 */
	public void setFixedStepSize(BigDecimal fixedStepSize) {
		this.fixedStepSize = fixedStepSize;
	}

	/**
	 * @see #setStepSize(BigDecimal)
	 */
	public BigDecimal getStepSize() {
		return stepSize;
	}

	/**
	 * If defined, it can be used along with the min and the max to give a
	 * custom number of steps.
	 */
	public void setStepSize(BigDecimal stepSize) {
		this.stepSize = stepSize;
	}

	/**
	 * @see #setSuggestedMax(BigDecimal)
	 */
	public BigDecimal getSuggestedMax() {
		return suggestedMax;
	}

	/**
	 * User defined maximum number for the scale, overrides maximum value except
	 * for if it is lower than the maximum value.
	 */
	public void setSuggestedMax(BigDecimal suggestedMax) {
		this.suggestedMax = suggestedMax;
	}

	/**
	 * @see #setSuggestedMin(BigDecimal)
	 */
	public BigDecimal getSuggestedMin() {
		return suggestedMin;
	}

	/**
	 * User defined minimum number for the scale, overrides minimum value except
	 * for if it is higher than the minimum value.
	 */
	public void setSuggestedMin(BigDecimal suggestedMin) {
		this.suggestedMin = suggestedMin;
	}

}

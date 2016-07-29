package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PieOptions extends Options {

	/**
	 * Default {@code 50 - for doughnut, 0 - for pie}
	 * 
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	private BigDecimal cutoutPercentage;

	/**
	 * Default {@code -0.5 * Math.PI}
	 * 
	 * @see #setRotation(BigDecimal rotation)
	 */
	private BigDecimal rotation;

	/**
	 * Default {@code 2 * Math.PI}
	 * 
	 * @see #setCircumference(BigDecimal circumference)
	 */
	private BigDecimal circumference;

	/**
	 * Default {@code true}
	 * 
	 * @see #setAnimation(PieAnimation)
	 */
	private PieAnimation animation;

	/**
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	public BigDecimal getCutoutPercentage() {
	    return this.cutoutPercentage;
	}

	/**
	 * The percentage of the chart that is cut out of the middle.
	 */
	public void setCutoutPercentage(BigDecimal cutoutPercentage) {
	    this.cutoutPercentage = cutoutPercentage;
	}

	/**
	 * @see #setRotation(BigDecimal rotation)
	 */
	public BigDecimal getRotation() {
	    return this.rotation;
	}

	/**
	 * Starting angle to draw arcs from
	 */
	public void setRotation(BigDecimal rotation) {
	    this.rotation = rotation;
	}

	/**
	 * @see #setCircumference(BigDecimal circumference)
	 */
	public BigDecimal getCircumference() {
	    return this.circumference;
	}

	/**
	 * Sweep to allow arcs to cover
	 */
	public void setCircumference(BigDecimal circumference) {
	    this.circumference = circumference;
	}

	/**
	 * @see #setAnimation(PieAnimation)
	 */
	public PieAnimation getAnimation() {
	    return this.animation;
	}

	/**
	 * If true, will animate the rotation of the chart.
	 */
	public void setAnimation(PieAnimation animation) {
	    this.animation = animation;
	}

}

package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;
import be.ceau.chart.options.scales.RadialLinearScales;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PolarOptions extends Options {

	/**
	 * @see #setScale(RadialLinearScales scale)
	 */
	private RadialLinearScales scale;

	/**
	 * Default {@code true}
	 * 
	 * @see #setAnimation(PolarAnimation)
	 */
	private PolarAnimation animation;

	/**
	 * Default {@code function(chart)}
	 * 
	 * @see #setLegendCallback(JavaScriptFunction legendCallback)
	 */
	private JavaScriptFunction legendCallback;

	/**
	 * @see #setScale(RadialLinearScales)
	 */
	public RadialLinearScales getScale() {
		return this.scale;
	}

	/**
	 * Options for the one scale used on the chart. Use this to style the ticks,
	 * labels, and grid.
	 */
	public void setScale(RadialLinearScales scale) {
		this.scale = scale;
	}

	/**
	 * @see #setAnimation.animateRotate(Boolean animation.animateRotate)
	 */
	public PolarAnimation getAnimation() {
		return this.animation;
	}

	/**
	 * If true, will animate the rotation of the chart.
	 */
	public void setAnimation(PolarAnimation animation) {
		this.animation = animation;
	}

	/**
	 * @see #setLegendCallback(JavaScriptFunction legendCallback)
	 */
	public JavaScriptFunction getLegendCallback() {
		return this.legendCallback;
	}

	/**
	 * Generates the HTML legend via calls to generateLegend
	 */
	public void setLegendCallback(JavaScriptFunction legendCallback) {
		this.legendCallback = legendCallback;
	}

}

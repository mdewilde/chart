package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;
import be.ceau.chart.options.scales.RadialLinearScale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PolarOptions extends Options {

	/**
	 * @see #setScale(RadialLinearScale scale)
	 */
	private RadialLinearScale scale;

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
	 * @see #setScale(RadialLinearScale)
	 */
	public RadialLinearScale getScale() {
		return this.scale;
	}

	/**
	 * Options for the one scale used on the chart. Use this to style the ticks,
	 * labels, and grid.
	 */
	public void setScale(RadialLinearScale scale) {
		this.scale = scale;
	}

	/**
	 * @see #setAnimation(PolarAnimation)
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

package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;
import be.ceau.chart.enums.HoverMode;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Hover {

	/**
	 * @see #setMode(HoverMode)
	 */
	private HoverMode mode;

	/**
	 * @see #setAnimationDuration(Integer)
	 */
	private Integer animationDuration;

	/**
	 * @see #setOnHover(JavaScriptFunction)
	 */
	private JavaScriptFunction onHover;

	/**
	 * @see #setMode(HoverMode)
	 */
	public HoverMode getMode() {
		return this.mode;
	}

	/**
	 * <p>
	 * Default {@code single}
	 * </p>
	 * 
	 * <p>
	 * Sets which elements hover. Acceptable options are 'single', 'label',
	 * 'x-axis', or 'dataset'.
	 * </p>
	 * <ul>
	 * <li>{@code single} highlights the closest element.
	 * <li>{@code label} highlights elements in all datasets at the same X value.
	 * <li>{@code x-axis} also highlights elements in all datasets at the same X
	 * value, but activates when hovering anywhere within the vertical slice of
	 * the x-axis representing that X value.
	 * <li>{@code dataset} highlights the closest dataset.
	 * </ul>
	 */
	public void setMode(HoverMode mode) {
		this.mode = mode;
	}

	/**
	 * @see #setAnimationDuration(Integer)
	 */
	public Integer getAnimationDuration() {
		return this.animationDuration;
	}

	/**
	 * Default {@code 400}<br>
	 * 
	 * Duration in milliseconds it takes to animate hover style changes
	 */
	public void setAnimationDuration(Integer animationDuration) {
		this.animationDuration = animationDuration;
	}

	/**
	 * @see #setOnHover(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnHover() {
		return this.onHover;
	}

	/**
	 * Default {@code null}<br>
	 * 
	 * Called when any of the events fire. Called in the context of the chart
	 * and passed an array of active elements (bars, points, etc)
	 */
	public void setOnHover(JavaScriptFunction onHover) {
		this.onHover = onHover;
	}

}

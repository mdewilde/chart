package be.ceau.chart.options;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Hover {

	/**
	 * Sets which elements hover. Acceptable options are 'single', 'label',
	 * 'x-axis', or 'dataset'. single highlights the closest element. label
	 * highlights elements in all datasets at the same X value. 'x-axis' also
	 * highlights elements in all datasets at the same X value, but activates
	 * when hovering anywhere within the vertical slice of the x-axis
	 * representing that X value. dataset highlights the closest dataset.
	 * 'single'
	 */
	private String mode;

	/**
	 * Duration in milliseconds it takes to animate hover style changes 400
	 */
	private BigDecimal animationDuration;

	/**
	 * Called when any of the events fire. Called in the context of the chart
	 * and passed an array of active elements (bars, points, etc) null
	 */
	private JavaScriptFunction onHover;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public BigDecimal getAnimationDuration() {
		return animationDuration;
	}

	public void setAnimationDuration(BigDecimal animationDuration) {
		this.animationDuration = animationDuration;
	}

	public JavaScriptFunction getOnHover() {
		return onHover;
	}

	public void setOnHover(JavaScriptFunction onHover) {
		this.onHover = onHover;
	}

}

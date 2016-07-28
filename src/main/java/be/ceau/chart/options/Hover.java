package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Hover {

	/**
	 * Default {@code 'single'}
	 * 
	 * @see #setMode(String mode)
	 */
	private String mode;

	/**
	 * Default {@code 400}
	 * 
	 * @see #setAnimationDuration(BigDecimal animationDuration)
	 */
	private BigDecimal animationDuration;

	/**
	 * Default {@code null}
	 * 
	 * @see #setOnHover(JavaScriptFunction onHover)
	 */
	private JavaScriptFunction onHover;

	/**
	 * @see #setMode(String mode)
	 */
	public String getMode() {
	    return this.mode;
	}

	/**
	 * Sets which elements hover. Acceptable options are 'single', 'label', 'x-axis', or 'dataset'.  single highlights the closest element.  label highlights elements in all datasets at the same X value.  'x-axis' also highlights elements in all datasets at the same X value, but activates when hovering anywhere within the vertical slice of the x-axis representing that X value.   dataset highlights the closest dataset.
	 */
	public void setMode(String mode) {
	    this.mode = mode;
	}

	/**
	 * @see #setAnimationDuration(BigDecimal animationDuration)
	 */
	public BigDecimal getAnimationDuration() {
	    return this.animationDuration;
	}

	/**
	 * Duration in milliseconds it takes to animate hover style changes
	 */
	public void setAnimationDuration(BigDecimal animationDuration) {
	    this.animationDuration = animationDuration;
	}

	/**
	 * @see #setOnHover(JavaScriptFunction onHover)
	 */
	public JavaScriptFunction getOnHover() {
	    return this.onHover;
	}

	/**
	 * Called when any of the events fire. Called in the context of the chart and passed an array of active elements (bars, points, etc)
	 */
	public void setOnHover(JavaScriptFunction onHover) {
	    this.onHover = onHover;
	}


}

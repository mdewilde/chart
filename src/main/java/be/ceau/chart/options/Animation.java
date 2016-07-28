package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Animation {

	/**
	 * Default {@code 1000}
	 * 
	 * @see #setDuration(BigDecimal duration)
	 */
	private BigDecimal duration;

	/**
	 * Default {@code "easeOutQuart"}
	 * 
	 * @see #setEasing(String easing)
	 */
	private String easing;

	/**
	 * Default {@code none}
	 * 
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	private JavaScriptFunction onProgress;

	/**
	 * Default {@code none}
	 * 
	 * @see #setOnComplete(JavaScriptFunction onComplete)
	 */
	private JavaScriptFunction onComplete;

	/**
	 * @see #setDuration(BigDecimal duration)
	 */
	public BigDecimal getDuration() {
	    return this.duration;
	}

	/**
	 * The number of milliseconds an animation takes.
	 */
	public void setDuration(BigDecimal duration) {
	    this.duration = duration;
	}

	/**
	 * @see #setEasing(String easing)
	 */
	public String getEasing() {
	    return this.easing;
	}

	/**
	 * Easing function to use.
	 */
	public void setEasing(String easing) {
	    this.easing = easing;
	}

	/**
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	public JavaScriptFunction getOnProgress() {
	    return this.onProgress;
	}

	/**
	 * Callback called on each step of an animation. Passed a single argument, an object, containing the chart instance and an object with details of the animation.
	 */
	public void setOnProgress(JavaScriptFunction onProgress) {
	    this.onProgress = onProgress;
	}

	/**
	 * @see #setOnComplete(JavaScriptFunction onComplete)
	 */
	public JavaScriptFunction getOnComplete() {
	    return this.onComplete;
	}

	/**
	 * Callback called at the end of an animation. Passed the same arguments as onProgress
	 */
	public void setOnComplete(JavaScriptFunction onComplete) {
	    this.onComplete = onComplete;
	}

}

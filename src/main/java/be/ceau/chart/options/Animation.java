package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Animation {

	/**
	 * Default {@code 1000}
	 * 
	 * @see #setDuration(BigDecimal)
	 */
	private BigDecimal duration;

	/**
	 * Default {@code easeOutQuart}
	 * 
	 * @see #setEasing(String)
	 */
	private String easing;

	/**
	 * Default {@code none}
	 * 
	 * @see #setOnProgress(JavaScriptFunction)
	 */
	private JavaScriptFunction onProgress;

	/**
	 * Default {@code none}
	 * 
	 * @see #setOnComplete(JavaScriptFunction)
	 */
	private JavaScriptFunction onComplete;

	/**
	 * @see #setDuration(BigDecimal)
	 */
	public BigDecimal getDuration() {
		return duration;
	}

	/**
	 * The number of milliseconds an animation takes
	 */
	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	/**
	 * @see #setEasing(String)
	 */
	public String getEasing() {
		return easing;
	}

	/**
	 * Easing function to use. "easeOutQuart"
	 */
	public void setEasing(String easing) {
		this.easing = easing;
	}

	/**
	 * @see #setOnProgress(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnProgress() {
		return onProgress;
	}

	/**
	 * Callback called on each step of an animation. Passed a single argument,
	 * an object, containing the chart instance and an object with details of
	 * the animation.
	 */
	public void setOnProgress(JavaScriptFunction onProgress) {
		this.onProgress = onProgress;
	}

	/**
	 * @see #setOnComplete(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnComplete() {
		return onComplete;
	}

	/**
	 * Callback called at the end of an animation. Passed the same arguments as
	 * onProgress
	 * 
	 * @see #setOnProgress(JavaScriptFunction)
	 */
	public void setOnComplete(JavaScriptFunction onComplete) {
		this.onComplete = onComplete;
	}

}

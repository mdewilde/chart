package be.ceau.chart.options;

import java.lang.reflect.Field;
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
	 * The number of milliseconds an animation takes. 1000
	 */
	private BigDecimal duration;

	/**
	 * Easing function to use. "easeOutQuart"
	 */
	private String easing;

	/**
	 * Callback called on each step of an animation. Passed a single argument,
	 * an object, containing the chart instance and an object with details of
	 * the animation. none
	 */
	private JavaScriptFunction onProgress;

	/**
	 * Callback called at the end of an animation. Passed the same arguments as
	 * onProgress none
	 */
	private JavaScriptFunction onComplete;

	public BigDecimal getDuration() {
		return duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public String getEasing() {
		return easing;
	}

	public void setEasing(String easing) {
		this.easing = easing;
	}

	public JavaScriptFunction getOnProgress() {
		return onProgress;
	}

	public void setOnProgress(JavaScriptFunction onProgress) {
		this.onProgress = onProgress;
	}

	public JavaScriptFunction getOnComplete() {
		return onComplete;
	}

	public void setOnComplete(JavaScriptFunction onComplete) {
		this.onComplete = onComplete;
	}

	boolean isEmpty() {
		for (Field field : this.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				if (field.get(this) != null) {
					return false;
				}
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

}

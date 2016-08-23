/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.enums.Easing;
import be.ceau.chart.javascript.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Animation {

	/**
	 * @see #setDuration(Integer)
	 */
	private Integer duration;

	/**
	 * @see #setEasing(Easing)
	 */
	private Easing easing;

	/**
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	private JavaScriptFunction onProgress;

	/**
	 * @see #setOnComplete(JavaScriptFunction onComplete)
	 */
	private JavaScriptFunction onComplete;

	/**
	 * @see #setDuration(Integer)
	 */
	public Integer getDuration() {
		return this.duration;
	}

	/**
	 * <p>
	 * Default {@code 1000}
	 * </p>
	 * 
	 * <p>
	 * The number of milliseconds an animation takes.
	 * </p>
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @see #setEasing(Easing)
	 */
	public Easing getEasing() {
		return this.easing;
	}

	/**
	 * <p>
	 * Default {@link Easing#EASE_OUT_QUART}
	 * </p>
	 * 
	 * <p>
	 * Easing function to use.
	 * </p>
	 * 
	 * <p>
	 * Easing functions adapted from Robert Penner's easing equations
	 * http://www.robertpenner.com/easing/
	 * </p>
	 */
	public void setEasing(Easing easing) {
		this.easing = easing;
	}

	/**
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	public JavaScriptFunction getOnProgress() {
		return this.onProgress;
	}

	/**
	 * <p>
	 * Default {@code none}
	 * </p>
	 * 
	 * <p>
	 * Callback called on each step of an animation. Passed a single argument,
	 * an object, containing the chart instance and an object with details of
	 * the animation.
	 * </p>
	 */
	public void setOnProgress(JavaScriptFunction onProgress) {
		this.onProgress = onProgress;
	}

	/**
	 * @see #setOnComplete(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnComplete() {
		return this.onComplete;
	}

	/**
	 * <p>
	 * Default {@code none}
	 * </p>
	 * 
	 * <p>
	 * Callback called at the end of an animation. Passed the same arguments as
	 * onProgress
	 * </p>
	 */
	public void setOnComplete(JavaScriptFunction onComplete) {
		this.onComplete = onComplete;
	}

}

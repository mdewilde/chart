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

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;

import be.ceau.chart.data.JavaScriptFunction;

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
	 * Default {@link Animation.Easing#EASE_OUT_QUART}
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

	public static enum Easing {

		LINEAR,
		EASE_IN_QUAD,
		EASE_OUT_QUAD,
		EASE_IN_OUT_QUAD,
		EASE_IN_CUBIC,
		EASE_OUT_CUBIC,
		EASE_IN_OUT_CUBIC,
		EASE_IN_QUART,
		EASE_OUT_QUART,
		EASE_IN_OUT_QUART,
		EASE_IN_QUINT,
		EASE_OUT_QUINT,
		EASE_IN_OUT_QUINT,
		EASE_IN_SINE,
		EASE_OUT_SINE,
		EASE_IN_OUT_SINE,
		EASE_IN_EXPO,
		EASE_OUT_EXPO,
		EASE_IN_OUT_EXPO,
		EASE_IN_CIRC,
		EASE_OUT_CIRC,
		EASE_IN_OUT_CIRC,
		EASE_IN_ELASTIC,
		EASE_OUT_ELASTIC,
		EASE_IN_OUT_ELASTIC,
		EASE_IN_BACK,
		EASE_OUT_BACK,
		EASE_IN_OUT_BACK,
		EASE_IN_BOUNCE,
		EASE_OUT_BOUNCE,
		EASE_IN_OUT_BOUNCE;

		private final String serialized;

		private Easing() {
			StringBuilder sb = new StringBuilder();
			for (String s : name().split("_")) {
				if (sb.length() == 0) {
					sb.append(s.toLowerCase(Locale.ENGLISH));
				} else {
					sb.append(s.substring(0, 1).toUpperCase(Locale.ENGLISH));
					sb.append(s.substring(1).toLowerCase(Locale.ENGLISH));
				}
			}
			this.serialized = sb.toString();
		}

		@Override
		@JsonValue
		public String toString() {
			return this.serialized;
		}

	}

}

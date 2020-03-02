/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

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

import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.animation.PolarAnimation;
import be.ceau.chart.options.elements.ArcElements;
import be.ceau.chart.options.scales.RadialLinearScale;
import be.ceau.chart.options.scales.Scale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PolarOptions extends Options<PolarOptions> {

	/**
	 * Static factory, constructs a {@link Scale} implementation appropriate
	 * for a {@link PolarOptions} instance.
	 * 
	 * @return a new {@link RadialLinearScale} instance
	 */
	public static RadialLinearScale scales() {
		return new RadialLinearScale();
	}

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

	private ArcElements elements;

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
	public PolarOptions setScale(RadialLinearScale scale) {
		this.scale = scale;
		return this;
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
	public PolarOptions setAnimation(PolarAnimation animation) {
		this.animation = animation;
		return this;
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
	public PolarOptions setLegendCallback(JavaScriptFunction legendCallback) {
		this.legendCallback = legendCallback;
		return this;
	}

	/**
	 * @return {@link ArcElements} instance, or {@code null} if not set
	 */
	public ArcElements getElements() {
		return elements;
	}

	/**
	 * @param elements
	 *            an {@link ArcElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public PolarOptions setElements(ArcElements elements) {
		this.elements = elements;
		return this;
	}

}

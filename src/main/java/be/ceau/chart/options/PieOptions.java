/*
	Copyright 2023 Marceau Dewilde <m@ceau.be>

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

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.animation.PieAnimation;
import be.ceau.chart.options.elements.ArcElements;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PieOptions extends Options<PieOptions> {

	/**
	 * Default {@code 50 - for doughnut, 0 - for pie}
	 * 
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	private BigDecimal cutoutPercentage;

	/**
	 * Default {@code -0.5 * Math.PI}
	 * 
	 * @see #setRotation(BigDecimal rotation)
	 */
	private BigDecimal rotation;

	/**
	 * Default {@code 2 * Math.PI}
	 * 
	 * @see #setCircumference(BigDecimal circumference)
	 */
	private BigDecimal circumference;

	/**
	 * Default {@code true}
	 * 
	 * @see #setAnimation(PieAnimation)
	 */
	private PieAnimation animation;

	private ArcElements elements;
	
	/**
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	public BigDecimal getCutoutPercentage() {
	    return this.cutoutPercentage;
	}

	/**
	 * The percentage of the chart that is cut out of the middle.
	 */
	public PieOptions setCutoutPercentage(BigDecimal cutoutPercentage) {
	    this.cutoutPercentage = cutoutPercentage;
	    return this;
	}

	/**
	 * @see #setRotation(BigDecimal rotation)
	 */
	public BigDecimal getRotation() {
	    return this.rotation;
	}

	/**
	 * Starting angle to draw arcs from
	 */
	public PieOptions setRotation(BigDecimal rotation) {
	    this.rotation = rotation;
	    return this;
	}

	/**
	 * @see #setCircumference(BigDecimal circumference)
	 */
	public BigDecimal getCircumference() {
	    return this.circumference;
	}

	/**
	 * Sweep to allow arcs to cover
	 */
	public PieOptions setCircumference(BigDecimal circumference) {
	    this.circumference = circumference;
	    return this;
	}

	/**
	 * @see #setAnimation(PieAnimation)
	 */
	@Override
	public PieAnimation getAnimation() {
	    return this.animation;
	}

	/**
	 * If true, will animate the rotation of the chart.
	 */
	public PieOptions setAnimation(PieAnimation animation) {
	    this.animation = animation;
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
	public PieOptions setElements(ArcElements elements) {
		this.elements = elements;
		return this;
	}

}

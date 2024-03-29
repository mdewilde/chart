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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.elements.RadarElements;
import be.ceau.chart.options.scales.RadialLinearScale;
import be.ceau.chart.options.scales.Scale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarOptions extends Options<RadarOptions> {

	/**
	 * Static factory, constructs a {@link Scale} implementation appropriate
	 * for a {@link RadarOptions} instance.
	 * 
	 * @return a new {@link RadialLinearScale} instance
	 */
	public static RadialLinearScale scales() {
		return new RadialLinearScale();
	}

	/**
	 * @see #setScale(RadialLinearScale)
	 */
	private RadialLinearScale scale;

	/**
	 * @see #setRadarElements(RadarElements)
	 */
	private RadarElements elements;

	/**
	 * @see #setScale(RadialLinearScale)
	 */
	public RadialLinearScale getScale() {
		return this.scale;
	}

	/**
	 * Options for the one scale used on the chart. Use this to style the ticks,
	 * labels, and grid lines.
	 */
	public RadarOptions setScale(RadialLinearScale scale) {
		this.scale = scale;
		return this;
	}

	/**
	 * @see #setElements(RadarElements)
	 */
	public RadarElements getElements() {
		return this.elements;
	}

	/**
	 * Options for all line elements used on the chart, as defined in the global
	 * elements, duplicated here to show Radar chart specific defaults.
	 */
	public RadarOptions setElements(RadarElements elements) {
		this.elements = elements;
		return this;
	}

}

/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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

import be.ceau.chart.options.scales.BarScale;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarOptions extends Options<BarOptions> {

	/**
	 * Default {@code "label"}
	 * 
	 * @see #setHover(Hover)
	 */
	private Hover hover;

	/**
	 * Default {@code -}
	 * 
	 * @see #setScales(BarScale)
	 */
	private BarScale scales;

	/**
	 * @see #setHover(Hover)
	 */
	public Hover getHover() {
		return hover;
	}

	/**
	 * Label's hover mode. "label" is used since the x axis displays data by the
	 * index in the dataset.
	 */
	public BarOptions setHover(Hover hover) {
		this.hover = hover;
		return this;
	}

	/**
	 * @see #setScales(BarScale)
	 */
	public BarScale getScales() {
		return scales;
	}

	public void setScales(BarScale scales) {
		this.scales = scales;
	}

}

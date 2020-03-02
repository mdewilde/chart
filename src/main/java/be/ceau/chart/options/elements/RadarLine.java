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
package be.ceau.chart.options.elements;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarLine extends Line {

	/**
	 * @see #setLineTension(Float)
	 */
	private Float lineTension;

	/**
	 * @see #setLineTension(Float)
	 */
	public Float getLineTension() {
		return lineTension;
	}

	/**
	 * <p>
	 * Tension exhibited by lines when calculating splineCurve. Setting to 0
	 * creates straight lines
	 * </p>
	 * 
	 * <p>
	 * Default {@code 0}
	 * </p>
	 */
	public RadarLine setLineTension(Float lineTension) {
		this.lineTension = lineTension;
	    return this;
	}

}

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
package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LogarithmicTicks extends Ticks {

	/**
	 * @see #setMin(String)
	 */
	private String min;

	/**
	 * @see #setMax(String)
	 */
	private String max;

	/**
	 * @see #setMin(String)
	 */
	public String getMin() {
		return min;
	}

	/**
	 * The minimum item to display. Must be a value in the labels array
	 */
	public void setMin(String min) {
		this.min = min;
	}

	/**
	 * @see #setMax(String)
	 */
	public String getMax() {
		return max;
	}

	/**
	 * The maximum item to display. Must be a value in the labels array
	 */
	public void setMax(String max) {
		this.max = max;
	}

}

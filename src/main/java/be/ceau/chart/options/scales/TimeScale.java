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
package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.ticks.Ticks;

/**
 * The time scale is used to display times and dates. It can only be placed on
 * the X axis. When building its ticks, it will automatically calculate the most
 * comfortable unit base on the size of the scale.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TimeScale extends Scale<TimeScale> {

	private final String type = "time";

	private Ticks ticks;
	
	private Time time;

	public String getType() {
		return type;
	}

	public Time getTime() {
		return time;
	}

	public TimeScale setTime(Time time) {
		this.time = time;
	    return this;
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public TimeScale setTicks(Ticks ticks) {
		this.ticks = ticks;
	    return this;
	}

}

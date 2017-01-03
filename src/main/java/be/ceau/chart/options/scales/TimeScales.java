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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The time scale is used to display times and dates. It can only be placed on
 * the X axis. When building its ticks, it will automatically calculate the most
 * comfortable unit base on the size of the scale.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TimeScales {

	private List<TimeScale> xAxes;
	
	private List<TimeScale> yAxes;

	public List<TimeScale> getxAxes() {
		return xAxes;
	}

	public void setxAxes(List<TimeScale> xAxes) {
		this.xAxes = xAxes;
	}

	public List<TimeScale> getyAxes() {
		return yAxes;
	}

	public void setyAxes(List<TimeScale> yAxes) {
		this.yAxes = yAxes;
	}

}

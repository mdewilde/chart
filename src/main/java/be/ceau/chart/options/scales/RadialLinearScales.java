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
 * The radial linear scale is used specifically for the radar and polar are
 * chart types. It overlays the chart area, rather than being positioned on one
 * of the edges.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadialLinearScales {

	private List<RadialLinearScale> xAxes;
	
	private List<RadialLinearScale> yAxes;

	public List<RadialLinearScale> getxAxes() {
		return xAxes;
	}

	public RadialLinearScales setxAxes(List<RadialLinearScale> xAxes) {
		this.xAxes = xAxes;
	    return this;
	}

	public List<RadialLinearScale> getyAxes() {
		return yAxes;
	}

	public RadialLinearScales setyAxes(List<RadialLinearScale> yAxes) {
		this.yAxes = yAxes;
	    return this;
	}

}

/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import be.ceau.chart.Data;
import be.ceau.chart.model.DataPoint;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Instances of this class contain data for drawing a pie chart.
 */
public class PieData implements Data {

	private final List<DataPoint> dataPoints;

	public PieData(List<DataPoint> datapoints) {
		if (datapoints == null) {
			throw new IllegalArgumentException("List<DataPoint> datapoints argument can not be null");
		}
		this.dataPoints = new ArrayList<DataPoint>(datapoints);
	}

	@JsonValue
	private List<DataPoint> getDataPoints() {
		return Collections.unmodifiableList(dataPoints);
	}

}
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
package be.ceau.chart.v1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link be.ceau.chart.v1.data.Data Data} implementation for
 * {@link be.ceau.chart.Chart Chart} objects backed by {@link be.ceau.chart.v1.data.DataPoint DataPoint} instances.<br>
 * Instances of this class are immutable.
 */
public class DataPointData implements Data {

	@JsonProperty
	private final List<DataPoint> dataPoints;

	/**
	 * Constructs a new DoughnutData instance.
	 * 
	 * @param dataPoints the data points to display on the Chart
	 * @throws IllegalArgumentException
	 *             if constructor argument is <code>null</code>
	 */
	public DataPointData(List<DataPoint> dataPoints) {
		if (dataPoints == null) {
			throw new IllegalArgumentException("dataPoints argument can not be null");
		}
		this.dataPoints = Collections.unmodifiableList(new ArrayList<DataPoint>(dataPoints));
	}

}
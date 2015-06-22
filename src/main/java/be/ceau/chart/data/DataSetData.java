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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link be.ceau.chart.data.Data Data} implementation for
 * {@link be.ceau.chart.Chart Chart} objects backed by {@link be.ceau.chart.data.DataSet DataSet} instances.<br>
 * Instances of this class are immutable.
 */
public class DataSetData implements Data {

	@JsonProperty
	private final List<String> labels;

	@JsonProperty
	private final List<DataSet> datasets;

	/**
	 * Constructs a new DataSetData instance.
	 * 
	 * @param labels
	 *            the labels to display on the Chart's X-axis
	 * @param datasets
	 *            the different data sets to display on the Chart
	 * @throws IllegalArgumentException
	 *             if either argument is <code>null</code> or if at least one
	 *             DataSet has a different number of elements than the
	 *             collection of labels.
	 */
	public DataSetData(List<String> labels, List<DataSet> datasets) {
		if (labels == null || datasets == null) {
			throw new IllegalArgumentException("neither argument can not be null");
		}
		for (DataSet dataset : datasets) {
			if (dataset.getDataLength() != labels.size()) {
				throw new IllegalArgumentException("number of X-axis labels does not match number of datapoints in at least one dataset");
			}
		}
		this.labels = Collections.unmodifiableList(new ArrayList<String>(labels));
		this.datasets = Collections.unmodifiableList(new ArrayList<DataSet>(datasets));
	}

}
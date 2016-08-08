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
package be.ceau.chart.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.v1.Dataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Data {

	/**
	 * @see #setDatasets(List)
	 */
	private List<Dataset> datasets;

	/**
	 * @see #setLabels(List)
	 */
	private List<String> labels;

	/**
	 * @see #setXLabels(List)
	 */
	private List<String> xLabels;

	/**
	 * @see #setYLabels(List)
	 */
	private List<String> yLabels;

	/**
	 * @see #setDatasets(List)
	 */
	public List<Dataset> getDatasets() {
		return this.datasets;
	}

	/**
	 * Contains data for each dataset. See the documentation for each chart type
	 * to determine the valid options that can be attached to the dataset
	 */
	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}

	/**
	 * @see #setLabels(List)
	 */
	public List<String> getLabels() {
		return this.labels;
	}

	/**
	 * Optional parameter that is used with the category axis.
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	/**
	 * @see #setXLabels(List)
	 */
	public List<String> getXLabels() {
		return this.xLabels;
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the
	 * axis is horizontal
	 */
	public void setXLabels(List<String> xLabels) {
		this.xLabels = xLabels;
	}

	/**
	 * @see #setYLabels(List)
	 */
	public List<String> getYLabels() {
		return this.yLabels;
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the
	 * axis is vertical
	 */
	public void setYLabels(List<String> yLabels) {
		this.yLabels = yLabels;
	}

}

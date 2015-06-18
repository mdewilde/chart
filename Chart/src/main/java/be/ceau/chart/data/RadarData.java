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

import java.util.List;

import be.ceau.chart.Data;
import be.ceau.chart.model.DataSet;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RadarData implements Data {
	
	// the x-axis labels
	@JsonProperty private final String[] labels;
	
	// the different datasets. one is enough, more are possible
	@JsonProperty private final DataSet[] datasets;

	public RadarData(List<String> labels, List<DataSet> datasets) {
		if (labels == null || datasets == null) {
			throw new IllegalArgumentException("arguments may not be null");
		}
		for (DataSet dataset : datasets) {
			if (dataset.getDataLength() != labels.size()) {
				throw new IllegalArgumentException("number of X-axis labels does not match number of datapoints in at least one dataset");
			}
		}
		String[] labelsTemp = new String[labels.size()];
		this.labels = labels.toArray(labelsTemp);
		DataSet[] datasetsTemp = new DataSet[datasets.size()];
		this.datasets = datasets.toArray(datasetsTemp);
	}

}

/*
var data = {
    labels: ["Eating", "Drinking", "Sleeping", "Designing", "Coding", "Cycling", "Running"],
    datasets: [
        {
            label: "My First dataset",
            fillColor: "rgba(220,220,220,0.2)",
            strokeColor: "rgba(220,220,220,1)",
            pointColor: "rgba(220,220,220,1)",
            pointStrokeColor: "#fff",
            pointHighlightFill: "#fff",
            pointHighlightStroke: "rgba(220,220,220,1)",
            data: [65, 59, 90, 81, 56, 55, 40]
        },
        {
            label: "My Second dataset",
            fillColor: "rgba(151,187,205,0.2)",
            strokeColor: "rgba(151,187,205,1)",
            pointColor: "rgba(151,187,205,1)",
            pointStrokeColor: "#fff",
            pointHighlightFill: "#fff",
            pointHighlightStroke: "rgba(151,187,205,1)",
            data: [28, 48, 40, 19, 96, 27, 100]
        }
    ]
};
*/
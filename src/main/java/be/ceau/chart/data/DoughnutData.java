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
import be.ceau.chart.model.DataPoint;


public class DoughnutData implements Data {
	
	private DataPoint[] dataPoints;
	
	public DoughnutData(List<DataPoint> datapoints) {
		if (datapoints == null) {
			throw new IllegalArgumentException("List<DataPoint> argument may not be null");
		}
		this.dataPoints = new DataPoint[datapoints.size()];
		this.dataPoints = datapoints.toArray(dataPoints);
	}

}

/*
var data = [
    {
        value: 300,
        color:"#F7464A",
        highlight: "#FF5A5E",
        label: "Red"
    },
    {
        value: 50,
        color: "#46BFBD",
        highlight: "#5AD3D1",
        label: "Green"
    },
    {
        value: 100,
        color: "#FDB45C",
        highlight: "#FFC870",
        label: "Yellow"
    }
]
*/
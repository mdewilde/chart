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

Chart is a Java library that can be used in combination with Chart.js.

Use the Chart Java library to generate Chart data and configurations from within your Java application.

All models are annotated to allow for easy JSON export.

Usage example

In Java:

		ChartBuilder builder = Chart.builder(Type.LINE);
		builder.newSeries(null, Colors.green());
		builder.addData("one", new BigDecimal(1));
		builder.addData("two", new BigDecimal(2));
		builder.addData("three", new BigDecimal(3));
		Chart chart = b.build();
	
		ObjectWriter writer = new ObjectMapper().writer().forType(Chart.class);
		return writer.writeValueAsString(chart);

In JavaScript:

		// canvas: the id of the canvas element in which to draw the chart
		// json: a json object containing type, data and options
		function render(canvas, json) {
			if (typeof canvas === 'undefined' || typeof json === 'undefined') {
				return false;
			}
			if (!json.hasOwnProperty('type') || !json.hasOwnProperty('data') || !json.hasOwnProperty('options')) {
				return false;
			}
			var element = document.getElementById(canvas);
			if (typeof element === 'undefined' || element === null) {
				return false;
			}
			var ctx = element.getContext('2d');
			switch (json.type) {
				case "LINE":
					new Chart(ctx).Line(json.data, json.options);
					break;
				case "BAR":
					new Chart(ctx).Bar(json.data, json.options);
					break;
				case "RADAR":
					new Chart(ctx).Radar(json.data, json.options);
					break;
				case "PIE":
					new Chart(ctx).Pie(json.data, json.options);
					break;
				case "DOUGHNUT":
					new Chart(ctx).Doughnut(json.data, json.options);
					break;
				case "POLAR":
					new Chart(ctx).Polar(json.data, json.options);
					break;
			}
		}
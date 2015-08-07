# Chart.java

Chart.java is a Java library for use in combination with the excellent [Chart.js](http://www.chartjs.org/) project.

Use the Chart.java library to generate Chart data and configurations from within your Java application.

All models are annotated to allow for easy JSON export.

### Usage example

In Java:

```Java
Chart chart = Chart.builder(Type.BAR)
		.newSeries("First", Colors.green())
		.addData("one", 1)
		.addData("two", 2)
		.addData("three", 3)
		.build();

ObjectWriter writer = new ObjectMapper().writer().forType(Chart.class);
return writer.writeValueAsString(chart);
```

In JavaScript:

```JavaScript
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
```

### Maven Central
Include this project directly from Maven Central
```XML
<groupId>be.ceau</groupId>
<artifactId>chart</artifactId>
<version>0.9</version>
```

###	Source code
Source code is available on [GitHub](https://github.com/mdewilde/chart).

### Javadoc
Browse this project's [Javadoc](http://www.ceau.be/chart/apidocs/index.html).

### Download
Download this project
* [chart-0.9-javadoc.jar](http://www.ceau.be/chart/chart-0.9-javadoc.jar)
* [chart-0.9-javadoc.jar.asc](http://www.ceau.be/chart/chart-0.9-javadoc.jar.asc)
* [chart-0.9-sources.jar](http://www.ceau.be/chart/chart-0.9-sources.jar)
* [chart-0.9-sources.jar.asc](http://www.ceau.be/chart/chart-0.9-sources.jar.asc)
* [chart-0.9.jar](http://www.ceau.be/chart/chart-0.9.jar)
* [chart-0.9.jar.asc](http://www.ceau.be/chart/chart-0.9.jar.asc)
* [chart-0.9.pom](http://www.ceau.be/chart/chart-0.9.pom)
* [chart-0.9.pom.asc](http://www.ceau.be/chart/chart-0.9.pom.asc)

### GnuPG public key
Verify signature files with my [GnuPG public key](http://www.ceau.be/pubkey.gpg).

### License
SimpleMail is licensed under [the Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.txt).
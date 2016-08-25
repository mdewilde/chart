# Chart.java

Chart.java enables integration with the excellent [Chart.js](http://www.chartjs.org/) library from within a Java application.

### Usage example

In Java:

```Java

return new BubbleChart(data, options).toJson();
```

In JavaScript:

```JavaScript
var ctx = document.getElementById('canvasId').getContext('2d');
new Chart(ctx, json);
```

### Test
See example charts by running the included unit tests:
```XML
mvn clean compile test
```

###	Source code
Source code is available on [GitHub](https://github.com/mdewilde/chart).

### Javadoc
Browse this project's [Javadoc](https://www.ceau.be/chart/apidocs/index.html).

### Maven Central
Include this project directly from Maven Central
```XML
<groupId>be.ceau</groupId>
<artifactId>chart</artifactId>
<version>${project.version}</version>
```
![Maven Central badge](https://maven-badges.herokuapp.com/maven-central/be.ceau/chart/badge.svg)

### Download
Download this project
* [chart-2.0.0-SNAPSHOT-javadoc.jar](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT-javadoc.jar)
* [chart-2.0.0-SNAPSHOT-javadoc.jar.asc](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT-javadoc.jar.asc)
* [chart-2.0.0-SNAPSHOT-sources.jar](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT-sources.jar)
* [chart-2.0.0-SNAPSHOT-sources.jar.asc](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT-sources.jar.asc)
* [chart-2.0.0-SNAPSHOT.jar](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT.jar)
* [chart-2.0.0-SNAPSHOT.jar.asc](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT.jar.asc)
* [chart-2.0.0-SNAPSHOT.pom](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT.pom)
* [chart-2.0.0-SNAPSHOT.pom.asc](https://www.ceau.be/chart/chart-2.0.0-SNAPSHOT.pom.asc)

### GnuPG public key
Verify signature files with my [GnuPG public key](https://www.ceau.be/pubkey.gpg).

### License
Chart.java is licensed under [the Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.txt).
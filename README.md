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

### Compatibility chart

Chart.js | Chart.java
------------ | -------------
1.x | 0.9.x
2.x | 2.x

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
* [chart-2.0.1-javadoc.jar](https://www.ceau.be/chart/chart-2.0.1-javadoc.jar)
* [chart-2.0.1-javadoc.jar.asc](https://www.ceau.be/chart/chart-2.0.1-javadoc.jar.asc)
* [chart-2.0.1-sources.jar](https://www.ceau.be/chart/chart-2.0.1-sources.jar)
* [chart-2.0.1-sources.jar.asc](https://www.ceau.be/chart/chart-2.0.1-sources.jar.asc)
* [chart-2.0.1.jar](https://www.ceau.be/chart/chart-2.0.1.jar)
* [chart-2.0.1.jar.asc](https://www.ceau.be/chart/chart-2.0.1.jar.asc)
* [chart-2.0.1.pom](https://www.ceau.be/chart/chart-2.0.1.pom)
* [chart-2.0.1.pom.asc](https://www.ceau.be/chart/chart-2.0.1.pom.asc)

### GnuPG public key
Verify signature files with my [GnuPG public key](https://www.ceau.be/pubkey.gpg).

### License
Chart.java is licensed under [the Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.txt).
# Chart.java

[![Maven Central badge](https://maven-badges.herokuapp.com/maven-central/be.ceau/chart/badge.svg)](https://mvnrepository.com/artifact/be.ceau/chart)  [![Javadocs](https://javadoc.io/badge/be.ceau/chart.svg)](https://javadoc.io/doc/be.ceau/chart)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)

Chart.java enables integration with the excellent [Chart.js](http://www.chartjs.org/) library from within a Java application.

### Usage example

In Java:

```Java
return new BubbleChart(data, options).toJson();
```

In JavaScript:

```JavaScript
var ctx = document.getElementById('canvasId'));
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

### Javadoc
Browse this project's javadoc at [javadoc.io](https://javadoc.io/doc/be.ceau/chart).

### Maven Central
Include this project directly from Maven Central
```XML
<groupId>be.ceau</groupId>
<artifactId>chart</artifactId>
<version>${project.version}</version>
```

### Download
Downloads for this project at [Maven Central](https://repo1.maven.org/maven2/be/ceau/chart/).

### Other resources
The [docs for Chart.js](http://www.chartjs.org/docs/) is a helpful source of information on what's possible and how to achieve it. 

### GnuPG public key
Verify signature files with my [GnuPG public key](https://www.ceau.be/pubkey.gpg).

### License
Chart.java is licensed under [the Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.txt).
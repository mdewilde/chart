package be.ceau.chart;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import org.junit.Test;

import be.ceau.chart.Chart.Type;
import be.ceau.chart.color.Colors;

public class ChartTests {

	@Test
	public void testBarChart() throws IOException, URISyntaxException {
		
		String json = Chart.builder(Type.BAR)
						.newSeries("First", Colors.green())
						.addData("one", 1)
						.addData("two", 2)
						.addData("three", 3)
						.build()
						.toJSON();

		File tmp = File.createTempFile("chart_test_", ".html");
		PrintWriter out = new PrintWriter(tmp);
		out.write(createWebPage(json));
		out.close();
		
		Desktop.getDesktop().browse(tmp.toURI());

	}

	
	private String createWebPage(String json) {
		String line = System.getProperty("line.separator");
		return new StringBuilder()
				.append("<!DOCTYPE html>")
				.append(line)
				.append("<html lang='en'>")
				.append(line)
				.append("<head>")
				.append(line)
				.append("<meta charset='UTF-8'>")
				.append(line)
				.append("<title>Chart.java test page</title>")
				.append(line)
				.append("<meta name='author' content='Marceau Dewilde'>")
				.append(line)
				.append("<script src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.1.6/Chart.js'></script>")
				.append(line)
				.append("<script>")
				.append("function r(e,t){new Chart(document.getElementById(e).getContext('2d'),t)}")
				.append("</script>")
				.append(line)
				.append("</head>")
				.append(line)
				.append("<body>")
				.append(line)
				.append("<canvas id='test'></canvas>")
				.append(line)
				.append("<script>")
				.append(line)
				.append("r('test', ")
				.append(json) 
				.append(");")
				.append("</script>")
				.append(line)
				.append("</body>")
				.append(line)
				.append("</html>")
				.toString();
	}
	
}

package be.ceau.chart;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Random;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.LineData;
import be.ceau.chart.data.LineDataset;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.Options;

public class ChartTests {

	private static final Random RANDOM = new Random(System.nanoTime());
	
//	@Test
//	public void testBarChart() throws IOException {
//		
//		String json = Chart.builder(Type.BAR)
//						.newSeries("First", Colors.green())
//						.addData("one", 1)
//						.addData("two", 2)
//						.addData("three", 3)
//						.build()
//						.toJSON();
//
//
//	}

	@Test
	public void options() throws JsonProcessingException, IOException {
		
		LineOptions options = new LineOptions();
		options.setSpanGaps(true);
		
		ObjectWriter CHART_WRITER = new ObjectMapper().writerWithDefaultPrettyPrinter().forType(LineOptions.class);

		openInBrowser(CHART_WRITER.writeValueAsString(options));

	}
	
//	@Test
	public void lineChart() throws IOException {
		LineData data = new LineData();
		LineOptions options = new LineOptions();
		LineDataset dataset = new LineDataset();
		data.addDataset(dataset);
		
		dataset.addData(25);
		dataset.addData(32);
		dataset.addData(14);
		dataset.addData(16);
		dataset.addData(23);
		dataset.setLabel("dataset");
		data.addLabel("Monday");
		data.addLabel("Tuesday");
		data.addLabel("Wednesday");
		data.addLabel("Thursday");
		data.addLabel("Friday");
		
		dataset.setLineTension(new BigDecimal("0.02"));

		dataset.setBackgroundColor(new Color(Color.BLANCHED_ALMOND, 0.45f));
		dataset.setBorderColor(Color.random());
		dataset.setFill(true);
		
		LineChart chart = new LineChart(data, options);
		
		ObjectWriter CHART_WRITER = new ObjectMapper().writerWithDefaultPrettyPrinter().forType(LineChart.class);

		openInBrowser(CHART_WRITER.writeValueAsString(chart));

	}
	
	private void openInBrowser(String json) throws IOException {
		
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
				.append("<script src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.1.6/Chart.min.js'></script>")
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
				.append("<div><pre>")
				.append(json)
				.append("</div></pre>")
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

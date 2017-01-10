package be.ceau.chart.tests;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.LineChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.data.LineData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.dataset.LineDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.elements.Line;
import be.ceau.chart.options.elements.LineElements;
import be.ceau.chart.options.elements.Point;
import be.ceau.chart.options.elements.Rectangle;
import be.ceau.chart.options.elements.RectangleElements;
import be.ceau.chart.tests.util.Opener;

public class ElementsTest {

	@Test
	public void barChartWithRectangle() throws IOException {

		BarDataset dataset = new BarDataset()
				.setData(129, 510, 239, 122);

		BarData data = BarChart.data()
				.addLabels("monday", "tuesday", "wednesday", "thursday")
				.addDataset(dataset);

		Rectangle rectangle = new Rectangle()
				.setBackgroundColor(Color.RED)
				.setBorderWidth(20);

		BarOptions options = BarChart.options()
				.setElements(new RectangleElements(rectangle));

		BarChart chart = new BarChart(data, options);

		Opener.inBrowser(chart);
		
	}

	@Test
	public void linechartElements() throws IOException {

		LineDataset dataset = new LineDataset()
				.setData(129, 510, 239, 122);

		LineData data = LineChart.data()
				.addLabels("monday", "tuesday", "wednesday", "thursday")
				.addDataset(dataset);

		Line line = new Line()
				.setBackgroundColor(Color.BLUE)
				.setBorderDash(Arrays.asList(4, 8, 2, 1));
		
		Point point = new Point()
				.setBackgroundColor(Color.YELLOW)
				.setRadius(7)
				.setHoverRadius(11);
		
		LineElements lineElements = new LineElements(line, point);

		LineOptions options = LineChart.options()
				.setElements(lineElements);

		LineChart chart = new LineChart(data, options);

		Opener.inBrowser(chart);
		
	}

}

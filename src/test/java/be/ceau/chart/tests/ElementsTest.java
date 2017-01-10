package be.ceau.chart.tests;

import java.io.IOException;

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
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

}

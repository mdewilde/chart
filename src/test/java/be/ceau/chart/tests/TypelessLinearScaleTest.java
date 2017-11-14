package be.ceau.chart.tests;

import java.io.IOException;

import org.junit.Test;

import be.ceau.chart.LineChart;
import be.ceau.chart.data.LineData;
import be.ceau.chart.dataset.LineDataset;
import be.ceau.chart.enums.FontStyle;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.scales.LinearScale;
import be.ceau.chart.options.scales.LinearScales;
import be.ceau.chart.options.ticks.LinearTicks;
import be.ceau.chart.tests.util.Opener;

/*
 * Debugging for https://github.com/mdewilde/chart/issues/11
 */
public class TypelessLinearScaleTest {

	@Test
	public void typelessLinearScaleTest() throws IOException {

		LineDataset dataset = new LineDataset()
				.setLabel("typelessLinearScaleTest")
				.addData(65)
				.addData(59)
				.addData(80)
				.setBorderWidth(1);

		LineData data = LineChart.data()
				.addLabel("January")
				.addLabel("February")
				.addLabel("March")
				.addDataset(dataset);

		LinearTicks ticks = new LinearTicks().setFontStyle(FontStyle.BOLD);
		LinearScale axis = new LinearScale().setTicks(ticks);
		LinearScales scales = new LinearScales().addxAxis(axis);
		LineOptions options = new LineOptions().setScales(scales);

		Opener.inBrowser(new LineChart(data, options));

	}
	
	
}

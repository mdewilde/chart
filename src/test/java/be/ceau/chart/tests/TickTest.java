package be.ceau.chart.tests;

import java.io.IOException;

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.scales.BarScale;
import be.ceau.chart.options.ticks.LinearTicks;
import be.ceau.chart.tests.util.Opener;

/*
 * Debugging for https://github.com/mdewilde/chart/issues/3
 */
public class TickTest {

	@Test
	public void tickTest() throws IOException {

		BarDataset dataset = new BarDataset()
				.setLabel("TickTest")
				.addData(65)
				.addData(59)
				.addData(80)
				.addData(81)
				.addData(56)
				.addData(55)
				.setBorderWidth(1);

		BarData data = BarChart.data()
				.addLabel("January")
				.addLabel("February")
				.addLabel("March")
				.addDataset(dataset);

		LinearTicks ticks = new LinearTicks()
				.setMin(0)
				.setMax(100)
				.setStepSize(10);

		BarScale barScale = new BarScale()
				.addyAxes(BarScale.yAxis().setTicks(ticks));

		BarOptions options = BarChart.options()
				.setScales(barScale);

		Opener.inBrowser(new BarChart(data, options));

	}
}

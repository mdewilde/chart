/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.tests;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.Chart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.scales.BarScale;
import be.ceau.chart.options.ticks.LinearTicks;
import be.ceau.chart.tests.util.Opener;
import be.ceau.chart.tests.util.TestFactory;

public class BarTest extends ChartTest {

	@Override
	public Chart createChart() {
		BarChart chart = new BarChart();
		chart.setData(TestFactory.newBarData());
		chart.setOptions(TestFactory.randomInstance(BarOptions.class));
		System.out.println("Chart is" + (chart.isDrawable() ? " " : " NOT ") + "drawable");
		return chart;
	}

	/**
	 * Create the example chart found at
	 * <a href="http://www.chartjs.org/docs/#bar-chart-example-usage">Chart.js
	 * </a> web site
	 * 
	 * @throws IOException
	 */
	@Test
	public void createExampleChart() throws IOException {
		Opener.inBrowser(createExampleBarChart());
	}

	/**
	 * Create the example chart found at
	 * <a href="http://www.chartjs.org/docs/#bar-chart-example-usage">Chart.js
	 * </a> web site horizontally
	 * 
	 * @throws IOException
	 */
	@Test
	public void createHorizontalExampleChart() throws IOException {
		BarChart barChart = createExampleBarChart();
		barChart.setHorizontal();
		Opener.inBrowser(barChart);
	}

	private BarChart createExampleBarChart() {
		BarDataset dataset = new BarDataset()
				.setLabel("sample chart")
				.setData(65, 59, 80, 81, 56, 55, 40)
				.addBackgroundColors(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.GRAY, Color.BLACK)
				.addBorderColors(Color.GREEN, Color.RED, Color.YELLOW, Color.BLUE, Color.GRAY, Color.ORANGE, Color.WHITE)
				.setBorderWidth(2);

		BarData data = new BarData()
				.addLabels("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
				.addDataset(dataset);

		LinearTicks ticks = new LinearTicks()
				.setMin(20)
				.setMax(100)
				.setStepSize(5);

		BarScale scale = new BarScale()
				.addxAxes(BarScale.xAxis().setBarThickness(new BigDecimal(50)))
				.addyAxes(BarScale.yAxis().setTicks(ticks));

		BarOptions options = new BarOptions()
				.setScales(scale);

		return new BarChart(data, options);
	}

}

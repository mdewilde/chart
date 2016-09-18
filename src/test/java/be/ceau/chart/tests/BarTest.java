/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.Chart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.scales.BarScale;
import be.ceau.chart.options.scales.XAxis;
import be.ceau.chart.options.scales.YAxis;
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
		BarDataset dataset = new BarDataset();
		dataset.setLabel("My First dataset");
		dataset.addBackgroundColor(new Color(255, 99, 132, 0.2f));
		dataset.addBackgroundColor(new Color(54, 162, 235, 0.2f));
		dataset.addBackgroundColor(new Color(255, 206, 86, 0.2f));
		dataset.addBackgroundColor(new Color(75, 192, 192, 0.2f));
		dataset.addBackgroundColor(new Color(153, 102, 255, 0.2f));
		dataset.addBackgroundColor(new Color(255, 159, 64, 0.2f));
		dataset.addBorderColor(new Color(255, 99, 132, 1));
		dataset.addBorderColor(new Color(54, 162, 235, 1));
		dataset.addBorderColor(new Color(255, 206, 86, 1));
		dataset.addBorderColor(new Color(75, 192, 192, 1));
		dataset.addBorderColor(new Color(153, 102, 255, 1));
		dataset.addBorderColor(new Color(255, 159, 64, 1));

		dataset.setBorderWidth(1);
		dataset.addData(65);
		dataset.addData(59);
		dataset.addData(80);
		dataset.addData(81);
		dataset.addData(56);
		dataset.addData(55);
		dataset.addData(40);

		BarData data = new BarData();
		data.addLabel("January");
		data.addLabel("February");
		data.addLabel("March");
		data.addLabel("April");
		data.addLabel("May");
		data.addLabel("June");
		data.addLabel("July");
		data.addDataset(dataset);

		BarOptions options = new BarOptions();

		XAxis xAxis = new XAxis();
		xAxis.setStacked(true);

		YAxis yAxis = new YAxis();
		yAxis.setStacked(true);

		BarScale barScale = new BarScale();
		barScale.addxAxes(xAxis);
		barScale.addyAxes(yAxis);

		options.setScales(barScale);

		BarChart chart = new BarChart();
		chart.setData(data);
		chart.setOptions(options);
		return chart;
	}

}

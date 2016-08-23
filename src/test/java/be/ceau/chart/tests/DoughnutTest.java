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

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.Chart;
import be.ceau.chart.DoughnutChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.DoughnutData;
import be.ceau.chart.dataset.DoughnutDataset;
import be.ceau.chart.options.DoughnutOptions;
import be.ceau.chart.tests.util.Generator;
import be.ceau.chart.tests.util.TestFactory;

public class DoughnutTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		DoughnutChart chart = new DoughnutChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}
	
	private DoughnutData newData() {
		DoughnutDataset dataset = new DoughnutDataset();
		DoughnutData data = new DoughnutData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
			dataset.addBackgroundColor(Color.random());
		}
		dataset.addBorderColor(Color.random());
		dataset.addBorderWidth(Generator.nextInt(22));
		dataset.addHoverBackgroundColor(Color.random());
		dataset.addHoverBorderColor(Color.random());
		dataset.addHoverBorderWidth(Generator.nextInt(22));
		return data;
	}
	
	private DoughnutOptions newOptions() {
		DoughnutOptions options = new DoughnutOptions();
		options.setAnimation(TestFactory.newAnimation());
		options.setEvents(TestFactory.getEventList());
		options.setHover(TestFactory.newHover());
		options.setLegend(TestFactory.newLegend());
		options.setTitle(TestFactory.newTitle());
		options.setTooltips(TestFactory.newTooltips());
		return options;
	}

}

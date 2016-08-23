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
import be.ceau.chart.PolarChart;
import be.ceau.chart.data.PolarData;
import be.ceau.chart.dataset.PolarDataset;
import be.ceau.chart.options.PolarOptions;
import be.ceau.chart.tests.util.Generator;
import be.ceau.chart.tests.util.TestFactory;

public class PolarTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		PolarChart chart = new PolarChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private PolarData newData() {
		PolarDataset dataset = new PolarDataset();
		PolarData data = new PolarData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private PolarOptions newOptions() {
		PolarOptions options = new PolarOptions();
		options.setAnimation(TestFactory.newAnimation());
		options.setEvents(TestFactory.getEventList());
		options.setHover(TestFactory.newHover());
		options.setLegend(TestFactory.newLegend());
		options.setTitle(TestFactory.newTitle());
		options.setTooltips(TestFactory.newTooltips());
		return options;
	}

}

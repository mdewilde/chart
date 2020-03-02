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

import be.ceau.chart.Chart;
import be.ceau.chart.DoughnutChart;
import be.ceau.chart.data.DoughnutData;
import be.ceau.chart.options.DoughnutOptions;
import be.ceau.chart.tests.util.TestFactory;

public class DoughnutTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		DoughnutChart chart = new DoughnutChart();
		chart.setData(TestFactory.randomInstance(DoughnutData.class));
		chart.setOptions(TestFactory.randomInstance(DoughnutOptions.class));
		System.out.println("Chart is" + (chart.isDrawable() ? " " : " NOT ") + "drawable");
		return chart;
	}
	
}

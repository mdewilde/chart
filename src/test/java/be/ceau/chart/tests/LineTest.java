/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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
import be.ceau.chart.LineChart;
import be.ceau.chart.data.LineData;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.tests.util.TestFactory;

public class LineTest extends ChartTest {

	@Override
	public Chart createChart() {
		LineChart chart = new LineChart();
		chart.setData(TestFactory.randomInstance(LineData.class));
		chart.setOptions(TestFactory.randomInstance(LineOptions.class));
		System.out.println("Chart is" + (chart.isDrawable() ? " " : " NOT ") + "drawable");
		return chart;
	}

}

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
import java.util.Arrays;
import java.util.Collections;
import java.util.Map.Entry;

import be.ceau.chart.Chart;
import be.ceau.chart.LineChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.LineData;
import be.ceau.chart.dataset.LineDataset;
import be.ceau.chart.enums.BorderCapStyle;
import be.ceau.chart.enums.BorderJoinStyle;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.scales.GridLines;
import be.ceau.chart.options.scales.LinearScale;
import be.ceau.chart.options.scales.LinearScales;
import be.ceau.chart.options.scales.LinearTicks;
import be.ceau.chart.tests.util.Generator;
import be.ceau.chart.tests.util.TestFactory;

public class LineTest extends ChartTest {

	@Override
	public Chart createChart() {
		LineChart chart = new LineChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private LineData newData() {
		LineDataset dataset = new LineDataset();
		LineData data = new LineData();
		dataset.setBackgroundColor(Color.random());
		dataset.setBorderCapStyle(BorderCapStyle.ROUND);
		dataset.setBorderColor(Color.random());
		dataset.setBorderDash(Arrays.asList(10, 2));
		dataset.setBorderDashOffset(20);
		dataset.setBorderJoinStyle(BorderJoinStyle.MITER);
		dataset.setBorderWidth(2);
		dataset.setFill(true);
		dataset.setLabel("LineChart test");
		dataset.setLineTension(0.6f);
		dataset.setPointBackgroundColor(Collections.singletonList(Color.random()));
		dataset.setSpanGaps(false);

		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}

		data.addDataset(dataset);
		return data;
	}
	
	private LineOptions newOptions() {
		LineOptions options = new LineOptions();

		options.setAnimation(TestFactory.newAnimation());
		options.setEvents(TestFactory.getEventList());
		options.setHover(TestFactory.newHover());
		options.setLegend(TestFactory.newLegend());
		options.setTitle(TestFactory.newTitle());
		options.setTooltips(TestFactory.newTooltips());

		options.setLegendCallback(new JavaScriptFunction("function(){ alert('legendCallback'); }"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function(){ console.log('onclick'); }"));
		options.setOnResize(new JavaScriptFunction("function(){ console.log('resized'); }"));
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(1000);
		options.setShowLines(true);
		options.setSpanGaps(true);



		options.setScales(newLinearScales());
		return options;
	}
	
	private LinearScales newLinearScales() {
		LinearScales linearScales = new LinearScales();
		LinearScale scale = new LinearScale();
		scale.setDisplay(true);
		scale.setGridLines(newGridLines());
		scale.setTicks(newTicks());
		linearScales.setxAxes(Collections.singletonList(scale));
		linearScales.setyAxes(Collections.singletonList(scale));
		return linearScales;
	}

	private LinearTicks newTicks() {
		LinearTicks ticks = new LinearTicks();
		ticks.setBeginAtZero(true);
		ticks.setMax(new BigDecimal(2500));
		return ticks;
	}

	private GridLines newGridLines() {
		GridLines gridLines = new GridLines();
		gridLines.setDisplay(true);
		gridLines.addColor(Color.LIGHT_CYAN);
		gridLines.setDrawBorder(true);
		gridLines.setDrawOnChartArea(true);
		gridLines.setDrawTicks(true);
//		gridLines.setLineWidth(Arrays.asList(1, 2, 3, 4, 5));
		gridLines.setOffsetGridLines(true);
		gridLines.setTickMarkLength(Generator.nextInt(2));
		gridLines.setZeroLineColor(Color.AQUA);
		gridLines.setZeroLineWidth(Generator.nextInt(2));
		return gridLines;
	}

}

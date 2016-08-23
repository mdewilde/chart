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

import be.ceau.chart.BubbleChart;
import be.ceau.chart.Chart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BubbleData;
import be.ceau.chart.dataset.BubbleDataPoint;
import be.ceau.chart.dataset.BubbleDataset;
import be.ceau.chart.enums.PointStyle;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.BubbleOptions;
import be.ceau.chart.options.elements.BubbleElements;
import be.ceau.chart.options.elements.Point;
import be.ceau.chart.tests.util.Generator;
import be.ceau.chart.tests.util.TestFactory;

public class BubbleTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		BubbleChart chart = new BubbleChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}
	
	private BubbleData newData() {
		BubbleDataset dataset = new BubbleDataset();
		BubbleData data = new BubbleData();
		data.addDataset(dataset);

		dataset.setLabel("BubbleTestDataset");
		
		for (BubbleDataPoint point : Generator.generateBubbleDataPoints()) {
			dataset.addData(point);
			dataset.addBackgroundColor(Color.random());
			dataset.addBorderColor(Color.random());
			dataset.addBorderWidth(Generator.nextInt(10));
			dataset.addHoverBackgroundColor(Color.random());
			dataset.addHoverBorderColor(Color.random());
			dataset.addHoverBorderWidth(Generator.nextInt(10));
			dataset.addHoverRadius(Generator.nextInt(10));
		}
		return data;
	}
	
	private BubbleOptions newOptions() {
		BubbleOptions options = new BubbleOptions();
		options.setElements(newBubbleElements());

		options.setAnimation(TestFactory.newAnimation());
		options.setEvents(TestFactory.getEventList());
		options.setHover(TestFactory.newHover());
		options.setLegend(TestFactory.newLegend());

		options.setLegendCallback(new JavaScriptFunction("function() {console.log('legend callback');}"));
		
		options.setMaintainAspectRatio(Generator.maybe());

		options.setOnClick(new JavaScriptFunction("function() {console.log('onclick');}"));
		
		options.setOnResize(new JavaScriptFunction("function() {console.log('onresize');}"));
		
		options.setResponsive(Generator.maybe());
		options.setResponsiveAnimationDuration(Generator.nextInt(2000));
		
		options.setTitle(TestFactory.newTitle());
		options.setTooltips(TestFactory.newTooltips());
		return options;
	}
	
	private BubbleElements newBubbleElements() {
		BubbleElements elements = new BubbleElements();
		elements.setPoints(newPoint());
		return elements;
	}
	
	private Point newPoint() {
		Point point = new Point();
		point.setBackgroundColor(Color.random());
		point.setBorderColor(Color.random());
		point.setBorderWidth(6);
		point.setHitRadius(4);
		point.setHoverBorderWidth(6);
		point.setHoverRadius(3);
		point.setPointStyle(PointStyle.CIRCLE);
		point.setRadius(21);
		return point;
	}
	
}

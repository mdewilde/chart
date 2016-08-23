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
import be.ceau.chart.RadarChart;
import be.ceau.chart.data.RadarData;
import be.ceau.chart.dataset.RadarDataset;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.RadarOptions;
import be.ceau.chart.options.elements.RadarElements;
import be.ceau.chart.options.scales.AngleLines;
import be.ceau.chart.options.scales.PointLabels;
import be.ceau.chart.options.scales.RadialLinearScale;
import be.ceau.chart.tests.util.Generator;
import be.ceau.chart.tests.util.TestFactory;

public class RadarTest extends ChartTest {

	@Override
	public Chart createChart() {
		RadarChart chart = new RadarChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private RadarData newData() {
		RadarDataset dataset = new RadarDataset();
		RadarData data = new RadarData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private RadarOptions newOptions() {
		RadarOptions options = new RadarOptions();
		
		options.setAnimation(TestFactory.newAnimation());
		options.setEvents(TestFactory.getEventList());
		options.setHover(TestFactory.newHover());
		options.setLegend(TestFactory.newLegend());
		options.setTitle(TestFactory.newTitle());
		options.setTooltips(TestFactory.newTooltips());
		
		options.setLegendCallback(new JavaScriptFunction("function(){console.log('legenCallback');}"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function(){console.log('onClick');}"));
		options.setOnResize(new JavaScriptFunction("function(){console.log('onResize');}"));
		options.setRadarElements(newRadarElements());
		options.setResponsive(true);
		options.setScale(newScale());

//		options.setRadarElements(elements);

		return options;
	}

	private RadarElements newRadarElements() {
		RadarElements radarElements = new RadarElements();
		return radarElements;
	}
	
	private RadialLinearScale newScale() {
//		try {
//			return Generator.randomInstance(RadialLinearScale.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new IllegalArgumentException();
//		}
				RadialLinearScale scale = new RadialLinearScale();
		
		
//		scale.setAfterBuildTicks(afterBuildTicks);
//		scale.setAfterCalculateTickRotation(afterCalculateTickRotation);
//		scale.setAfterDataLimits(afterDataLimits);
//		scale.setAfterFit(afterFit);
//		scale.setAfterSetDimensions(afterSetDimensions);
//		scale.setAfterTickToLabelConversion(afterTickToLabelConversion);
//		scale.setAfterUpdate(afterUpdate);
//		scale.setAngleLines(angleLines);
//		scale.setBeforeBuildTicks(beforeBuildTicks);
//		scale.setBeforeCalculateTickRotation(beforeCalculateTickRotation);
//		scale.setBeforeDataLimits(beforeDataLimits);
//		scale.setBeforeFit(beforeFit);
//		scale.setBeforeSetDimensions(beforeSetDimensions);
//		scale.setBeforeTickToLabelConversion(beforeTickToLabelConversion);
//		scale.setBeforeUpdate();
		scale.setDisplay(true);
		
		scale.setLineArc(true);
		scale.setAngleLines(newAngleLines());
		scale.setPointLabels(newPointLabels());
		scale.setTicks(TestFactory.newTicks());
		return scale;
	}
	
	private AngleLines newAngleLines() {
		AngleLines angleLines = new AngleLines();
		return angleLines;
	}	
	
	private PointLabels newPointLabels() {
		PointLabels pointLabels = new PointLabels();
		return pointLabels;
	}	


}

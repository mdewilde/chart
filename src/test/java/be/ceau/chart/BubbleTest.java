package be.ceau.chart;

import java.util.Arrays;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.BubbleData;
import be.ceau.chart.dataset.BubbleDataPoint;
import be.ceau.chart.dataset.BubbleDataset;
import be.ceau.chart.enums.Event;
import be.ceau.chart.enums.PointStyle;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.Animation;
import be.ceau.chart.options.BubbleOptions;
import be.ceau.chart.options.Hover;
import be.ceau.chart.options.Legend;
import be.ceau.chart.options.Title;
import be.ceau.chart.options.Tooltips;
import be.ceau.chart.options.elements.BubbleElements;
import be.ceau.chart.options.elements.Point;

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
		options.setAnimation(newAnimation());
		options.setElements(newBubbleElements());
		options.setEvents(Arrays.asList(Event.blur, Event.input));
		options.setHover(newHover());
		options.setLegend(newLegend());
		options.setLegendCallback(new JavaScriptFunction("function() {console.log('legend callback');}"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function() {console.log('onclick');}"));
		options.setOnResize(new JavaScriptFunction("function() {console.log('onresize');}"));
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(400);
		options.setTitle(newTitle());
		options.setTooltips(newTooltips());
		return options;
	}
	
	private Animation newAnimation() {
		Animation animation = new Animation();
		return animation;
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
	
	private Hover newHover() {
		Hover hover = new Hover();
		return hover;
	}
	
	private Legend newLegend() {
		Legend legend = new Legend();
		return legend;
	}
	
	private Title newTitle() {
		Title title = new Title();
		return title;
	}
	
	private Tooltips newTooltips() {
		Tooltips tooltips = new Tooltips();
		return tooltips;
	}

}

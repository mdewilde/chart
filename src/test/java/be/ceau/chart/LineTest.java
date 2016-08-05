package be.ceau.chart;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map.Entry;

import org.junit.Test;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.JavaScriptFunction;
import be.ceau.chart.data.LineData;
import be.ceau.chart.data.LineDataset;
import be.ceau.chart.enums.HoverMode;
import be.ceau.chart.enums.TitlePosition;
import be.ceau.chart.options.Animation;
import be.ceau.chart.options.Hover;
import be.ceau.chart.options.Legend;
import be.ceau.chart.options.LineOptions;
import be.ceau.chart.options.Title;
import be.ceau.chart.options.Tooltips;
import be.ceau.chart.options.scales.GridLines;
import be.ceau.chart.options.scales.LinearScale;
import be.ceau.chart.options.scales.LinearScales;
import be.ceau.chart.options.scales.LinearTicks;

public class LineTest {

	@Test
	public void line() throws IOException {
		
		LineChart lineChart = new LineChart();
		
		LineData data = new LineData();
		LineDataset dataset = new LineDataset();
		
		dataset.setBackgroundColor(Color.random());
		dataset.setBorderCapStyle("round");
		dataset.setBorderColor(Color.random());
		dataset.setBorderDash(Arrays.asList(new BigDecimal(10), new BigDecimal(2)));
		dataset.setBorderDashOffset(new BigDecimal(20));
		dataset.setBorderJoinStyle("miter");
		dataset.setBorderWidth(new BigDecimal(2));
		dataset.setFill(true);
		dataset.setLabel("LineChart test");
		dataset.setLineTension(new BigDecimal("0.6"));
		dataset.setPointBackgroundColor(Collections.singletonList(Color.random()));
		dataset.setSpanGaps(false);
		
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}

		data.addDataset(dataset);
		
		lineChart.setData(data);
		
		LineOptions options = new LineOptions();
		Animation animation = new Animation();
		options.setAnimation(animation);
		
//		options.setEvents(events);
		
		Hover hover = new Hover();
		hover.setAnimationDuration(700);
		hover.setMode(HoverMode.DATASET);
		hover.setOnHover(new JavaScriptFunction("function(){ console.log('onHover callback'); }"));
		
		options.setHover(hover);
		
		
		Legend legend = new Legend();
		options.setLegend(legend);
		options.setLegendCallback(new JavaScriptFunction("function(){ alert('legendCallback'); }"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function(){ console.log('onclick'); }"));
		options.setOnResize(new JavaScriptFunction("function(){ console.log('resized'); }"));
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(1000);
		options.setShowLines(true);
		options.setSpanGaps(true);
		
		Title title = new Title();
		title.setDisplay(true);
		title.setFontColor(Color.random());
		title.setFontFamily("Times New Roman");
		title.setFontSize(new BigDecimal(24));
		title.setFullWidth(true);
		title.setPadding(28);
		title.setPosition(TitlePosition.BOTTOM);
		title.setText("it's the title");
		
		options.setTitle(title);
		
		Tooltips tooltips = new Tooltips();
		tooltips.setEnabled(true);
		tooltips.setBackgroundColor(Color.RED);
		tooltips.setBodyFontColor(Color.AZURE);
//		tooltips.setBodyFontFamily(bodyFontFamily);
//		tooltips.setBodyFontStyle(bodyFontStyle);
//		tooltips.setMode(mode);
		tooltips.setTitleFontColor(Color.CHARTREUSE);
		
		options.setTooltips(tooltips);
		
		options.setScales(getLinearScales());
		
		lineChart.setOptions(options);
		
		
		
		String json = lineChart.toJson();
		
		Filer.toBrowser(lineChart.getType(), json);
	
	}

	private LinearScales getLinearScales() {
		LinearScales linearScales = new LinearScales();
		LinearScale scale = new LinearScale();
		scale.setDisplay(true);
		scale.setGridLines(getGridLines());
		scale.setTicks(getTicks());
		linearScales.setxAxes(Collections.singletonList(scale));
		linearScales.setyAxes(Collections.singletonList(scale));
		return linearScales;
	}

	private LinearTicks getTicks() {
		LinearTicks ticks = new LinearTicks();
		ticks.setBeginAtZero(true);
		ticks.setMax(new BigDecimal(150));
		return ticks;
	}

	private GridLines getGridLines() {
		GridLines gridLines = new GridLines();
		gridLines.setDisplay(true);
		gridLines.setColor(Collections.singletonList(Color.LIGHT_CYAN));
		return gridLines;
	}

}

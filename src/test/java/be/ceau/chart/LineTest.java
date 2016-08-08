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
import be.ceau.chart.enums.FontStyle;
import be.ceau.chart.enums.HoverMode;
import be.ceau.chart.enums.TitlePosition;
import be.ceau.chart.options.Animation;
import be.ceau.chart.options.Hover;
import be.ceau.chart.options.Legend;
import be.ceau.chart.options.LegendLabels;
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
		
		dataset.setBackgroundColor(Color.DARK_SEA_GREEN);
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

		options.setAnimation(newAnimation());
		
//		 options.setEvents(events);
		
		options.setHover(newHover());
		
		options.setLegendCallback(new JavaScriptFunction("function(){ alert('legendCallback'); }"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function(){ console.log('onclick'); }"));
		options.setOnResize(new JavaScriptFunction("function(){ console.log('resized'); }"));
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(1000);
		options.setShowLines(true);
		options.setSpanGaps(true);
	
		options.setLegend(newLegend());

		options.setLegendCallback(new JavaScriptFunction("function(){ alert('legendCallback'); }"));
		options.setMaintainAspectRatio(true);
		options.setOnClick(new JavaScriptFunction("function(){ console.log('onclick'); }"));
		options.setOnResize(new JavaScriptFunction("function(){ console.log('resized'); }"));
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(1000);
		options.setShowLines(true);
		options.setSpanGaps(true);
		
		
		options.setTitle(newTitle());
		options.setTooltips(newTooltips());
		options.setScales(newLinearScales());
		
		lineChart.setOptions(options);
		
		
		
		String json = lineChart.toJson();
		
		Opener.toBrowser(lineChart.getType(), json);

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
		gridLines.setColor(Collections.singletonList(Color.LIGHT_CYAN));
		return gridLines;
	}

	private Animation newAnimation() {
		Animation animation = new Animation();
		animation.setDuration(2000);
		animation.setEasing(Animation.Easing.EASE_OUT_SINE);
		animation.setOnComplete(new JavaScriptFunction("function(){console.log('onComplete');}"));
		animation.setOnProgress(new JavaScriptFunction("function(){console.log('onProgress');}"));
		return animation;
	}
	
	private Hover newHover() {
		Hover hover = new Hover();
		hover.setAnimationDuration(700);
		hover.setMode(HoverMode.DATASET);
		hover.setOnHover(new JavaScriptFunction("function(){ console.log('onHover'); }"));
		return hover;
	}
	
	private Legend newLegend() {
		Legend legend = new Legend();
		legend.setDisplay(true);
		legend.setFullWidth(true);
		legend.setLabels(newLegendLabels());
		legend.setOnClick(new JavaScriptFunction("function(){ console.log('onClick'); }"));
		legend.setPosition(Legend.Position.TOP);
		return legend;
	}
	
	private LegendLabels newLegendLabels() {
		LegendLabels legendLabels = new LegendLabels();
		legendLabels.setBoxWidth(150);
		legendLabels.setFontColor(Color.ANTIQUE_WHITE);
		legendLabels.setFontFamily("Verdana");
		legendLabels.setFontSize(15);
		legendLabels.setFontStyle("bold");
		legendLabels.setGenerateLabels(new JavaScriptFunction("function(){ console.log('generateLabels'); }"));
		legendLabels.setPadding(20);
		legendLabels.setUsePointStyle(true);
		return legendLabels;
	}

	private Title newTitle() {
		Title title = new Title();
		title.setDisplay(true);
		title.setFontColor(Color.CHOCOLATE);
		title.setFontFamily("Verdana");
		title.setFontSize(24);
		title.setFontStyle("normal");
		title.setFullWidth(true);
		title.setPadding(28);
		title.setPosition(TitlePosition.BOTTOM);
		title.setText("LineTest Title");
		return title;
	}
	
	private Tooltips newTooltips() {
		Tooltips tooltips = new Tooltips();
		tooltips.setBackgroundColor(Color.RED);
		tooltips.setBodyFontColor(Color.AZURE);
		tooltips.setBodyFontFamily("Verdana");
		tooltips.setBodyFontStyle(FontStyle.BOLD);
//		tooltips.setBodySpacing();
//		tooltips.setCaretSize(caretSize);
//		tooltips.setCornerRadius(cornerRadius);
//		tooltips.setCustom(custom);
//		tooltips.setEnabled(enabled);
//		tooltips.setFooterFontColor(footerFontColor);
//		tooltips.setFooterFontFamily(footerFontFamily);
//		tooltips.setFooterFontSize(footerFontSize);
//		tooltips.setFooterFontStyle(footerFontStyle);
//		tooltips.setFooterMarginTop(footerMarginTop);
//		tooltips.setFooterSpacing(footerSpacing);
//		tooltips.setItemSort(itemSort);
//		tooltips.setMode(mode);
//		tooltips.setMultiKeyBackground(multiKeyBackground);
//		tooltips.setTitleFontColor(titleFontColor);
//		tooltips.setTitleFontFamily(titleFontFamily);
//		tooltips.setTitleFontSize(titleFontSize);
//		tooltips.setTitleFontStyle();
//		tooltips.setTitleMarginBottom(titleMarginBottom);
//		tooltips.setTitleSpacing(titleSpacing);
//		tooltips.setXPadding(xPadding);
//		tooltips.setYPadding(yPadding);
		return tooltips;
	}

}

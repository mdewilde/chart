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
package be.ceau.chart.tests.util;

import static be.ceau.chart.tests.util.Generator.maybe;

import java.util.EnumSet;
import java.util.Set;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.Easing;
import be.ceau.chart.enums.Event;
import be.ceau.chart.enums.FontStyle;
import be.ceau.chart.enums.HoverMode;
import be.ceau.chart.enums.TitlePosition;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.Animation;
import be.ceau.chart.options.Hover;
import be.ceau.chart.options.Legend;
import be.ceau.chart.options.LegendLabels;
import be.ceau.chart.options.Title;
import be.ceau.chart.options.Tooltips;
import be.ceau.chart.options.scales.Ticks;

/**
 * Factory for randomized test instances of common Chart objects.
 */
public class TestFactory {

	public static Animation newAnimation() {
		Animation animation = new Animation();
		animation.setDuration(Generator.nextInt(5000));
		animation.setEasing(Generator.any(Easing.class));
		animation.setOnComplete(new JavaScriptFunction("function(){console.log('animation complete');}"));
		animation.setOnProgress(new JavaScriptFunction("function(){console.log('animation progress');}"));
		return animation;
	}

	public static Set<Event> getEventList() {
		Set<Event> set = EnumSet.noneOf(Event.class);
		for (int i = 0; i < Generator.nextInt(Event.values().length); i++) {
			set.add(Generator.any(Event.class));
		}
		return set;
	}
	
	public static Hover newHover() {
		Hover hover = new Hover();
		hover.setAnimationDuration(Generator.nextInt(10000));
		hover.setMode(Generator.any(HoverMode.class));
		hover.setOnHover(new JavaScriptFunction("function(){console.log('hover');}"));
		return hover;
	}

	public static Legend newLegend() {
		Legend legend = new Legend();
		legend.setDisplay(maybe());
		legend.setFullWidth(maybe());
		legend.setLabels(newLegendLabels());
		legend.setOnClick(new JavaScriptFunction("function(){ console.log('legend click'); }"));
		legend.setPosition(Legend.Position.TOP);
		return legend;
	}

	private static LegendLabels newLegendLabels() {
		LegendLabels legendLabels = new LegendLabels();
		legendLabels.setBoxWidth(150);
		legendLabels.setFontColor(Color.ANTIQUE_WHITE);
		legendLabels.setFontFamily("Verdana");
		legendLabels.setFontSize(15);
		legendLabels.setFontStyle("bold");
		legendLabels.setGenerateLabels(new JavaScriptFunction("function(){ console.log('generateLabels'); }"));
		legendLabels.setPadding(20);
		legendLabels.setUsePointStyle(maybe());
		return legendLabels;
	}
	
	public static Title newTitle() {
		Title title = new Title();
		title.setDisplay(maybe());
		title.setFontColor(Color.random());
		title.setFontFamily("Verdana");
		title.setFontSize(24);
		title.setFontStyle("normal");
		title.setFullWidth(maybe());
		title.setPadding(28);
		title.setPosition(Generator.any(TitlePosition.class));
		title.setText("LineTest Title");
		return title;
	}
	
	public static Tooltips newTooltips() {
		Tooltips tooltips = new Tooltips();
		tooltips.setBackgroundColor(Color.random());
		tooltips.setBodyFontColor(Color.random());
		tooltips.setBodyFontFamily("Verdana");
		tooltips.setBodyFontStyle(Generator.any(FontStyle.class));
		tooltips.setBodySpacing(Generator.nextInt(90));
		tooltips.setCaretSize(Generator.nextInt(40));
		tooltips.setCornerRadius(Generator.nextInt(12));
		tooltips.setCustom(null);
		tooltips.setEnabled(Generator.maybe());
		tooltips.setFooterFontColor(Color.random());
		tooltips.setFooterFontFamily("sans serif");
		tooltips.setFooterFontSize(Generator.nextInt(100));
		tooltips.setFooterFontStyle(Generator.any(FontStyle.class));
		tooltips.setFooterMarginTop(Generator.nextInt(100));
		tooltips.setFooterSpacing(Generator.nextInt(100));
		tooltips.setItemSort(null);
		tooltips.setMode("single");
		tooltips.setMultiKeyBackground(Color.random());
		tooltips.setTitleFontColor(Color.random());
		tooltips.setTitleFontFamily("serif");
		tooltips.setTitleFontSize(Generator.nextInt(100));
		tooltips.setTitleFontStyle(Generator.any(FontStyle.class));
		tooltips.setTitleMarginBottom(Generator.nextInt(75));
		tooltips.setTitleSpacing(Generator.nextInt(75));
		tooltips.setXPadding(Generator.nextInt(100));
		tooltips.setYPadding(Generator.nextInt(100));
		return tooltips;
	}
	
	public static Ticks newTicks() {
		Ticks ticks = new Ticks();
		ticks.setAutoSkip(true);
		ticks.setDisplay(true);
		
		
		return ticks;
	}

}

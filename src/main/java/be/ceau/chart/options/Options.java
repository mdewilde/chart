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
package be.ceau.chart.options;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.enums.Event;
import be.ceau.chart.javascript.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Options {

	/**
	 * Default {@code true}
	 * 
	 * @see #setResponsive(Boolean)
	 */
	private Boolean responsive;

	/**
	 * Default {@code 0}
	 * 
	 * @see #setResponsiveAnimationDuration(BigDecimal)
	 */
	private Integer responsiveAnimationDuration;

	/**
	 * Default {@code true}
	 * 
	 * @see #setMaintainAspectRatio(Boolean)
	 */
	private Boolean maintainAspectRatio;

	/**
	 * Default
	 * {@code ["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]}
	 * 
	 * @see #setEvents(List)
	 */
	private List<Event> events;

	/**
	 * Default {@code null}
	 * 
	 * @see #setOnClick(JavaScriptFunction)
	 */
	private JavaScriptFunction onClick;

	/**
	 * Default {@code function (chart) { }}
	 * 
	 * @see #setLegendCallback(JavaScriptFunction)
	 */
	private JavaScriptFunction legendCallback;

	/**
	 * Default {@code null}
	 * 
	 * @see #setOnResize(JavaScriptFunction)
	 */
	private JavaScriptFunction onResize;

	/**
	 * @see #setTitle(Title)
	 */
	private Title title;

	private Legend legend;

	private Tooltips tooltips;

	private Hover hover;

	private Animation animation;

	/**
	 * @see #setResponsive(Boolean)
	 */
	public Boolean getResponsive() {
		return this.responsive;
	}

	/**
	 * Resizes when the canvas container does.
	 */
	public void setResponsive(Boolean responsive) {
		this.responsive = responsive;
	}

	/**
	 * @see #setResponsiveAnimationDuration(Integer)
	 */
	public Integer getResponsiveAnimationDuration() {
		return this.responsiveAnimationDuration;
	}

	/**
	 * Duration in milliseconds it takes to animate to new size after a resize
	 * event.
	 */
	public void setResponsiveAnimationDuration(Integer responsiveAnimationDuration) {
		this.responsiveAnimationDuration = responsiveAnimationDuration;
	}

	/**
	 * @see #setMaintainAspectRatio(Boolean)
	 */
	public Boolean getMaintainAspectRatio() {
		return this.maintainAspectRatio;
	}

	/**
	 * Maintain the original canvas aspect ratio (width / height) when resizing
	 */
	public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
		this.maintainAspectRatio = maintainAspectRatio;
	}

	/**
	 * @see #setEvents(List)
	 */
	public List<Event> getEvents() {
		return this.events;
	}

	/**
	 * Events that the chart should listen to for tooltips and hovering
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick() {
		return this.onClick;
	}

	/**
	 * Called if the event is of type 'mouseup' or 'click'. Called in the
	 * context of the chart and passed an array of active elements
	 */
	public void setOnClick(JavaScriptFunction onClick) {
		this.onClick = onClick;
	}

	/**
	 * @see #setLegendCallback(JavaScriptFunction)
	 */
	public JavaScriptFunction getLegendCallback() {
		return this.legendCallback;
	}

	/**
	 * Function to generate a legend. Receives the chart object to generate a
	 * legend from. Default implementation returns an HTML string.
	 */
	public void setLegendCallback(JavaScriptFunction legendCallback) {
		this.legendCallback = legendCallback;
	}

	/**
	 * @see #setOnResize(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnResize() {
		return this.onResize;
	}

	/**
	 * Called when a resize occurs. Gets passed two arguemnts: the chart
	 * instance and the new size.
	 */
	public void setOnResize(JavaScriptFunction onResize) {
		this.onResize = onResize;
	}

	/**
	 * @see #setTitle(Title)
	 */
	public Title getTitle() {
		return title;
	}

	/**
	 * The title configuration is passed into the options.title namespace. The
	 * global options for the chart title is defined in
	 * Chart.defaults.global.title.
	 */
	public void setTitle(Title title) {
		this.title = title;
	}

	/**
	 * @see #setLegend(Legend)
	 */
	public Legend getLegend() {
		return legend;
	}

	/**
	 * The legend configuration is passed into the options.legend namespace. The
	 * global options for the chart legend is defined in
	 * Chart.defaults.global.legend.
	 */
	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	/**
	 * @see #setTooltips(Tooltips)
	 */
	public Tooltips getTooltips() {
		return tooltips;
	}

	/**
	 * The tooltip label configuration is nested below the tooltip configuration
	 * using the callbacks key. The tooltip has the following callbacks for
	 * providing text. For all functions, 'this' will be the tooltip object
	 * created from the Chart.Tooltip constructor.
	 * 
	 * All functions are called with the same arguments: a tooltip item and the
	 * data object passed to the chart. All functions must return either a
	 * string or an array of strings. Arrays of strings are treated as multiple
	 * lines of text.
	 */
	public void setTooltips(Tooltips tooltips) {
		this.tooltips = tooltips;
	}

	/**
	 * @see #setHover(Hover)
	 */
	public Hover getHover() {
		return hover;
	}

	/**
	 * The hover configuration is passed into the options.hover namespace. The
	 * global hover configuration is at Chart.defaults.global.hover.
	 */
	public void setHover(Hover hover) {
		this.hover = hover;
	}

	/**
	 * @see #setAnimation(Animation)
	 */
	public Animation getAnimation() {
		return animation;
	}

	/**
	 * The following animation options are available. The global options for are
	 * defined in Chart.defaults.global.animation.
	 */
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

}

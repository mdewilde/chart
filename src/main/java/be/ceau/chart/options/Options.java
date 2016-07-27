package be.ceau.chart.options;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Options {

	/**
	 * default {@code true}
	 * 
	 * @see #setResponsive(Boolean)
	 */
	private Boolean responsive;

	/**
	 * default {@code 0}
	 * 
	 * @see #setResponsiveAnimationDuration(BigDecimal)
	 */
	private BigDecimal responsiveAnimationDuration;

	/**
	 * default {@code true}
	 * 
	 * @see #setMaintainAspectRatio()
	 */
	private Boolean maintainAspectRatio;

	/**
	 * default {@code ["mousemove", "mouseout", "click", "touchstart",
	 * "touchmove", "touchend"]}
	 * 
	 * @see #setEvents(List)
	 */
	private final List<String> events = new ArrayList<String>();

	/**
	 * default {@code null}
	 * 
	 * @see #setOnClick(JavaScriptFunction)
	 */
	private JavaScriptFunction onClick;

	/**
	 * default <code>function (chart) { }</code>
	 *
	 * @see #setLegendCallback(JavaScriptFunction)
	 */
	private JavaScriptFunction legendCallback;

	/**
	 * default {@code null}
	 *
	 * @see #setOnResize(JavaScriptFunction)
	 */
	private JavaScriptFunction onResize;

	/**
	 * @see #getTitle()
	 */
	private Title title;

	/**
	 * @see #getLegend()
	 */
	private Legend legend;

	/**
	 * @see #getTooltips()
	 */
	private Tooltips tooltips;

	/**
	 * @see #getHover()
	 */
	private Hover hover;

	/**
	 * @see #getAnimation()
	 */
	private Animation animation;

	/**
	 * @see #setResponsive(Boolean)
	 */
	public Boolean getResponsive() {
		return responsive;
	}

	/**
	 * Resizes when the canvas container does.
	 */
	public void setResponsive(Boolean responsive) {
		this.responsive = responsive;
	}

	/**
	 * @see #setResponsiveAnimationDuration(BigDecimal)
	 */
	public BigDecimal getResponsiveAnimationDuration() {
		return responsiveAnimationDuration;
	}

	/**
	 * Duration in milliseconds it takes to animate to new size after a resize
	 * event.
	 */
	public void setResponsiveAnimationDuration(BigDecimal responsiveAnimationDuration) {
		this.responsiveAnimationDuration = responsiveAnimationDuration;
	}

	/**
	 * @see #setMaintainAspectRatio(Boolean)
	 */
	public Boolean getMaintainAspectRatio() {
		return maintainAspectRatio;
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
	public List<String> getEvents() {
		return events;
	}

	/**
	 * Events that the chart should listen to for tooltips and hovering
	 */
	public void setEvents(List<String> events) {
		this.events.clear();
		if (events != null) {
			this.events.addAll(events);
		}
	}

	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick() {
		return onClick;
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
		return legendCallback;
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
		return onResize;
	}

	/**
	 * Called when a resize occurs. Gets passed two arguments: the chart
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
	 * Options for chart legends
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
	 * Options for chart tooltips
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
	 * Options for chart hover behavior
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
	 * Options for chart animation
	 */
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

}

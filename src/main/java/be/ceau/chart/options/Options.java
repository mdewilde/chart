package be.ceau.chart.options;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Options {

	/**
	 * Default {@code true}
	 * 
	 * @see #setResponsive(Boolean responsive)
	 */
	private Boolean responsive;

	/**
	 * Default {@code 0}
	 * 
	 * @see #setResponsiveAnimationDuration(BigDecimal responsiveAnimationDuration)
	 */
	private BigDecimal responsiveAnimationDuration;

	/**
	 * Default {@code true}
	 * 
	 * @see #setMaintainAspectRatio(Boolean maintainAspectRatio)
	 */
	private Boolean maintainAspectRatio;

	/**
	 * Default {@code ["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]}
	 * 
	 * @see #setEvents(List<String> events)
	 */
	private List<String> events;

	/**
	 * Default {@code null}
	 * 
	 * @see #setOnClick(JavaScriptFunction onClick)
	 */
	private JavaScriptFunction onClick;

	/**
	 * Default {@code function (chart) { }}
	 * 
	 * @see #setLegendCallback(JavaScriptFunction legendCallback)
	 */
	private JavaScriptFunction legendCallback;

	/**
	 * Default {@code null}
	 * 
	 * @see #setOnResize(JavaScriptFunction onResize)
	 */
	private JavaScriptFunction onResize;

	/**
	 * @see #setResponsive(Boolean responsive)
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
	 * @see #setResponsiveAnimationDuration(BigDecimal responsiveAnimationDuration)
	 */
	public BigDecimal getResponsiveAnimationDuration() {
	    return this.responsiveAnimationDuration;
	}

	/**
	 * Duration in milliseconds it takes to animate to new size after a resize event.
	 */
	public void setResponsiveAnimationDuration(BigDecimal responsiveAnimationDuration) {
	    this.responsiveAnimationDuration = responsiveAnimationDuration;
	}

	/**
	 * @see #setMaintainAspectRatio(Boolean maintainAspectRatio)
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
	 * @see #setEvents(List<String> events)
	 */
	public List<String> getEvents() {
	    return this.events;
	}

	/**
	 * Events that the chart should listen to for tooltips and hovering
	 */
	public void setEvents(List<String> events) {
	    this.events = events;
	}

	/**
	 * @see #setOnClick(JavaScriptFunction onClick)
	 */
	public JavaScriptFunction getOnClick() {
	    return this.onClick;
	}

	/**
	 * Called if the event is of type 'mouseup' or 'click'. Called in the context of the chart and passed an array of active elements
	 */
	public void setOnClick(JavaScriptFunction onClick) {
	    this.onClick = onClick;
	}

	/**
	 * @see #setLegendCallback(JavaScriptFunction legendCallback)
	 */
	public JavaScriptFunction getLegendCallback() {
	    return this.legendCallback;
	}

	/**
	 * Function to generate a legend. Receives the chart object to generate a legend from. Default implementation returns an HTML string.
	 */
	public void setLegendCallback(JavaScriptFunction legendCallback) {
	    this.legendCallback = legendCallback;
	}

	/**
	 * @see #setOnResize(JavaScriptFunction onResize)
	 */
	public JavaScriptFunction getOnResize() {
	    return this.onResize;
	}

	/**
	 * Called when a resize occurs. Gets passed two arguemnts: the chart instance and the new size.
	 */
	public void setOnResize(JavaScriptFunction onResize) {
	    this.onResize = onResize;
	}

}

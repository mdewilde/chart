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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.Chart;


@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public abstract class Options {

	/**
	 * Static factory for constructing a default Options instance of the desired type.
	 * @param type the desired Chart.Type, not <code>null</code>
	 * @return Options
	 * @throws IllegalArgumentException if argument is <code>null</code>
	 */
	public static Options forType(Chart.Type type) {
		if (type == null) {
			throw new IllegalArgumentException("Chart.Type argument can not be null");
		}
		switch (type) {
			case BAR:
				return BarOptions.defaultInstance();
			case DOUGHNUT:
				return DoughnutOptions.defaultInstance();
			case LINE:
				return LineOptions.defaultInstance();
			case PIE:
				return PieOptions.defaultInstance();
			case POLAR:
				return PolarOptions.defaultInstance();
			case RADAR:
				return RadarOptions.defaultInstance();
			default:
				throw new UnsupportedOperationException("Chart.Type " + String.valueOf(type) + " is not supported");
		}
	}
	
	protected Boolean animation;
	protected Integer animationSteps;
	protected String animationEasing;
	protected Boolean showScale;
	protected Boolean scaleOverride;
	protected Integer scaleSteps;
	protected Integer scaleStepWidth;
	protected Integer scaleStartValue;
	protected String scaleLineColor;
	protected Integer scaleLineWidth;
	protected Boolean scaleShowLabels;
	protected String scaleLabel;
	protected Boolean scaleIntegersOnly;
	protected Boolean scaleBeginAtZero;
	protected String scaleFontFamily;
	protected Integer scaleFontSize;
	protected String scaleFontStyle;
	protected String scaleFontColor;
	protected Boolean responsive;
    protected Integer responsiveAnimationDuration;
	protected Boolean maintainAspectRatio;
	protected Boolean showTooltips;
	protected List<String> tooltipEvents;
	protected String tooltipFillColor;
	protected String tooltipFontColor;
	protected String tooltipFontFamily;
	protected Integer tooltipFontSize;
	protected String tooltipFontStyle;
	protected String tooltipTitleFontColor;
	protected String tooltipTitleFontFamily;
	protected Integer tooltipTitleFontSize;
	protected String tooltipTitleFontStyle;
	protected Integer tooltipCaretSize;
	protected Integer tooltipCornerRadius;
	protected String tooltipTemplate;
	protected Integer tooltipXOffset;
	protected Integer tooltipXPadding;
	protected Integer tooltipYPadding;
	protected String multiTooltipTemplate;
	protected String legendTemplate;

	// Function - Will fire on animation progression.
	// onAnimationProgress: function(){};

	// Function - Will fire on animation completion.
	// onAnimationComplete: function(){};
	
	public Boolean getAnimation() {
		return animation;
	}
	
	/**
	 * Whether to animate the chart
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	public Integer getAnimationSteps() {
		return animationSteps;
	}

	/**
	 *  Number of animation steps
	 */
	public void setAnimationSteps(Integer animationSteps) {
		this.animationSteps = animationSteps;
	}

	public String getAnimationEasing() {
		return animationEasing;
	}

	/**
	 *  Animation easing effect
	 */
	public void setAnimationEasing(AnimationEasing animationEasing) {
		if (animationEasing == null) {
			this.animationEasing = null;
		} else {
			this.animationEasing = animationEasing.toString();
		}
	}

	public Boolean getShowScale() {
		return showScale;
	}

	/**
	 * If we should show the scale at all
	 */
	public void setShowScale(Boolean showScale) {
		this.showScale = showScale;
	}

	public Boolean getScaleOverride() {
		return scaleOverride;
	}

	/**
	 * If we want to override with a hard coded scale
	 */
	public void setScaleOverride(Boolean scaleOverride) {
		this.scaleOverride = scaleOverride;
	}

	public Integer getScaleSteps() {
		return scaleSteps;
	}

	/**
	 * The number of steps in a hard coded scale
	 */
	public void setScaleSteps(Integer scaleSteps) {
		this.scaleSteps = scaleSteps;
	}

	public Integer getScaleStepWidth() {
		return scaleStepWidth;
	}

	/**
	 * The value jump in the hard coded scale
	 */
	public void setScaleStepWidth(Integer scaleStepWidth) {
		this.scaleStepWidth = scaleStepWidth;
	}

	public Integer getScaleStartValue() {
		return scaleStartValue;
	}

	/**
	 * The scale starting value
	 */
	public void setScaleStartValue(Integer scaleStartValue) {
		this.scaleStartValue = scaleStartValue;
	}

	public String getScaleLineColor() {
		return scaleLineColor;
	}

	/**
	 * Colour of the scale line
	 */
	public void setScaleLineColor(String scaleLineColor) {
		this.scaleLineColor = scaleLineColor;
	}

	public Integer getScaleLineWidth() {
		return scaleLineWidth;
	}

	/**
	 * Pixel width of the scale line
	 */
	public void setScaleLineWidth(Integer scaleLineWidth) {
		this.scaleLineWidth = scaleLineWidth;
	}

	public Boolean getScaleShowLabels() {
		return scaleShowLabels;
	}

	/**
	 * Whether to show labels on the scale
	 */
	public void setScaleShowLabels(Boolean scaleShowLabels) {
		this.scaleShowLabels = scaleShowLabels;
	}

	public String getScaleLabel() {
		return scaleLabel;
	}

	/**
	 * Interpolated JS string - can access value
	 */
	public void setScaleLabel(String scaleLabel) {
		this.scaleLabel = scaleLabel;
	}

	public Boolean getScaleIntegersOnly() {
		return scaleIntegersOnly;
	}

	/**
	 * Whether the scale should stick to Integers, not floats even if drawing space is there
	 */
	public void setScaleIntegersOnly(Boolean scaleIntegersOnly) {
		this.scaleIntegersOnly = scaleIntegersOnly;
	}

	public Boolean getScaleBeginAtZero() {
		return scaleBeginAtZero;
	}

	/**
	 * Whether the scale should start at zero, or an order of magnitude down from the lowest value
	 */
	public void setScaleBeginAtZero(Boolean scaleBeginAtZero) {
		this.scaleBeginAtZero = scaleBeginAtZero;
	}

	public String getScaleFontFamily() {
		return scaleFontFamily;
	}

	/**
	 * Scale label font declaration for the scale label
	 */
	public void setScaleFontFamily(String scaleFontFamily) {
		this.scaleFontFamily = scaleFontFamily;
	}

	public Integer getScaleFontSize() {
		return scaleFontSize;
	}

	/**
	 * Scale label font size in pixels
	 */
	public void setScaleFontSize(Integer scaleFontSize) {
		this.scaleFontSize = scaleFontSize;
	}

	public String getScaleFontStyle() {
		return scaleFontStyle;
	}

	/**
	 * Scale label font weight style
	 */
	public void setScaleFontStyle(String scaleFontStyle) {
		this.scaleFontStyle = scaleFontStyle;
	}

	public String getScaleFontColor() {
		return scaleFontColor;
	}

	/**
	 * Scale label font colour
	 */
	public void setScaleFontColor(String scaleFontColor) {
		this.scaleFontColor = scaleFontColor;
	}

	public Boolean getResponsive() {
		return responsive;
	}

	/**
	 * whether or not the chart should be responsive and resize when the browser does.
	 */
	public void setResponsive(Boolean responsive) {
		this.responsive = responsive;
	}

	public Integer getResponsiveAnimationDuration() {
		return responsiveAnimationDuration;
	}

	public void setResponsiveAnimationDuration(Integer responsiveAnimationDuration) {
		this.responsiveAnimationDuration = responsiveAnimationDuration;
	}

	public Boolean getMaintainAspectRatio() {
		return maintainAspectRatio;
	}

	/** 
	 * Whether to maintain the starting aspect ratio or not when responsive,
	 * if set to false, will take up entire container
	 */
	public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
		this.maintainAspectRatio = maintainAspectRatio;
	}

	public Boolean getShowTooltips() {
		return showTooltips;
	}

	/**
	 * Determines whether to draw tooltips on the canvas or not
	 */
	public void setShowTooltips(Boolean showTooltips) {
		this.showTooltips = showTooltips;
	}

	public List<String> getTooltipEvents() {
		if (tooltipEvents == null) {
			return Collections.emptyList();
		} else {
			return Collections.unmodifiableList(tooltipEvents);
		}
	}

	/**
	 * Array of string names to attach tooltip events
	 */
	public void setTooltipEvents(List<String> tooltipEvents) {
		this.tooltipEvents = new ArrayList<String>();
		if (tooltipEvents != null) {
			this.tooltipEvents.addAll(tooltipEvents);
		}
	}

	public String getTooltipFillColor() {
		return tooltipFillColor;
	}

	/**
	 * Tooltip background colour
	 */
	public void setTooltipFillColor(String tooltipFillColor) {
		this.tooltipFillColor = tooltipFillColor;
	}

	public String getTooltipFontFamily() {
		return tooltipFontFamily;
	}

	/**
	 * Tooltip label font declaration for the scale label
	 */
	public void setTooltipFontFamily(String tooltipFontFamily) {
		this.tooltipFontFamily = tooltipFontFamily;
	}

	public Integer getTooltipFontSize() {
		return tooltipFontSize;
	}

	/**
	 * Tooltip label font size in pixels
	 */
	public void setTooltipFontSize(Integer tooltipFontSize) {
		this.tooltipFontSize = tooltipFontSize;
	}

	public String getTooltipFontStyle() {
		return tooltipFontStyle;
	}

	/**
	 * Tooltip font weight style
	 */
	public void setTooltipFontStyle(String tooltipFontStyle) {
		this.tooltipFontStyle = tooltipFontStyle;
	}

	public String getTooltipFontColor() {
		return tooltipFontColor;
	}

	/**
	 * Tooltip label font colour
	 */
	public void setTooltipFontColor(String tooltipFontColor) {
		this.tooltipFontColor = tooltipFontColor;
	}

	public String getTooltipTitleFontFamily() {
		return tooltipTitleFontFamily;
	}

	/**
	 * Tooltip title font declaration for the scale label
	 */
	public void setTooltipTitleFontFamily(String tooltipTitleFontFamily) {
		this.tooltipTitleFontFamily = tooltipTitleFontFamily;
	}

	public Integer getTooltipTitleFontSize() {
		return tooltipTitleFontSize;
	}

	/**
	 * Tooltip title font size in pixels
	 */
	public void setTooltipTitleFontSize(Integer tooltipTitleFontSize) {
		this.tooltipTitleFontSize = tooltipTitleFontSize;
	}

	public String getTooltipTitleFontStyle() {
		return tooltipTitleFontStyle;
	}

	/**
	 * Tooltip title font weight style
	 */
	public void setTooltipTitleFontStyle(String tooltipTitleFontStyle) {
		this.tooltipTitleFontStyle = tooltipTitleFontStyle;
	}

	public String getTooltipTitleFontColor() {
		return tooltipTitleFontColor;
	}

	/**
	 * Tooltip title font colour
	 */
	public void setTooltipTitleFontColor(String tooltipTitleFontColor) {
		this.tooltipTitleFontColor = tooltipTitleFontColor;
	}

	public Integer getTooltipYPadding() {
		return tooltipYPadding;
	}

	/**
	 * pixel width of padding around tooltip text
	 */
	public void setTooltipYPadding(Integer tooltipYPadding) {
		this.tooltipYPadding = tooltipYPadding;
	}

	public Integer getTooltipXPadding() {
		return tooltipXPadding;
	}

	/**
	 * pixel width of padding around tooltip text
	 */
	public void setTooltipXPadding(Integer tooltipXPadding) {
		this.tooltipXPadding = tooltipXPadding;
	}

	public Integer getTooltipCaretSize() {
		return tooltipCaretSize;
	}

	/**
	 * Size of the caret on the tooltip
	 */
	public void setTooltipCaretSize(Integer tooltipCaretSize) {
		this.tooltipCaretSize = tooltipCaretSize;
	}

	public Integer getTooltipCornerRadius() {
		return tooltipCornerRadius;
	}

	/**
	 * Pixel radius of the tooltip border
	 */
	public void setTooltipCornerRadius(Integer tooltipCornerRadius) {
		this.tooltipCornerRadius = tooltipCornerRadius;
	}

	public Integer getTooltipXOffset() {
		return tooltipXOffset;
	}

	/**
	 * Pixel offset from point x to tooltip edge
	 */
	public void setTooltipXOffset(Integer tooltipXOffset) {
		this.tooltipXOffset = tooltipXOffset;
	}

	public String getTooltipTemplate() {
		return tooltipTemplate;
	}

	/**
	 * Template string for single tooltips
	 */
	public void setTooltipTemplate(String tooltipTemplate) {
		this.tooltipTemplate = tooltipTemplate;
	}

	public String getMultiTooltipTemplate() {
		return multiTooltipTemplate;
	}

	/**
	 * Template string for single tooltips
	 */
	public void setMultiTooltipTemplate(String multiTooltipTemplate) {
		this.multiTooltipTemplate = multiTooltipTemplate;
	}

	public String getLegendTemplate() {
		return legendTemplate;
	}

	/**
	 * A legend template
	 */
	public void setLegendTemplate(String legendTemplate) {
		this.legendTemplate = legendTemplate;
	}

	public abstract Chart.Type getChartType();

}
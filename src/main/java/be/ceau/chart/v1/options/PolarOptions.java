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
package be.ceau.chart.v1.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.v1.Chart;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class PolarOptions extends Options {

	private Boolean scaleShowLabelBackdrop;
	private String scaleBackdropColor;
	private Integer scaleBackdropPaddingY;
	private Integer scaleBackdropPaddingX;
	private Boolean scaleShowLine;
	private Boolean segmentShowStroke;
	private String segmentStrokeColor;
	private Integer segmentStrokeWidth;
	private Boolean animateRotate;
	private Boolean animateScale;

    public static final PolarOptions defaultInstance() {
    	PolarOptions options = new PolarOptions();
		options.setResponsive(true);
		options.setResponsiveAnimationDuration(1000);
		options.setMaintainAspectRatio(true);
		options.setAnimation(true);
		options.setAnimationEasing(AnimationEasing.easeOutBounce);
		options.setScaleIntegersOnly(true);
		return options;
    }

	public Boolean getScaleShowLabelBackdrop() {
		return scaleShowLabelBackdrop;
	}

	/**
	 * Show a backdrop to the scale label
	 */
	public void setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
		this.scaleShowLabelBackdrop = scaleShowLabelBackdrop;
	}

	public String getScaleBackdropColor() {
		return scaleBackdropColor;
	}

	/**
	 * The colour of the label backdrop
	 */
	public void setScaleBackdropColor(String scaleBackdropColor) {
		this.scaleBackdropColor = scaleBackdropColor;
	}

	public Integer getScaleBackdropPaddingY() {
		return scaleBackdropPaddingY;
	}

	/**
	 * The backdrop padding above & below the label in pixels
	 */
	public void setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
		this.scaleBackdropPaddingY = scaleBackdropPaddingY;
	}

	public Integer getScaleBackdropPaddingX() {
		return scaleBackdropPaddingX;
	}

	/**
	 * The backdrop padding to the side of the label in pixels
	 */
	public void setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
	}

	public Boolean getScaleShowLine() {
		return scaleShowLine;
	}

	/**
	 * Show line for each value in the scale
	 */
	public void setScaleShowLine(Boolean scaleShowLine) {
		this.scaleShowLine = scaleShowLine;
	}

	public Boolean getSegmentShowStroke() {
		return segmentShowStroke;
	}

	/**
	 * Stroke a line around each segment in the chart
	 */
	public void setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
	}

	public String getSegmentStrokeColor() {
		return segmentStrokeColor;
	}

	/**
	 * The colour of the stroke on each segement.
	 */
	public void setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
	}

	public Integer getSegmentStrokeWidth() {
		return segmentStrokeWidth;
	}

	/**
	 * The width of the stroke value in pixels
	 */
	public void setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
	}

	public Boolean getAnimateRotate() {
		return animateRotate;
	}

	/**
	 * Whether to animate the rotation of the chart
	 */
	public void setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
	}

	public Boolean getAnimateScale() {
		return animateScale;
	}

	/**
	 * Whether to animate scaling the chart from the centre
	 */
	public void setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
	}

	public Chart.Type getChartType() {
		return Chart.Type.POLAR;
	}

}
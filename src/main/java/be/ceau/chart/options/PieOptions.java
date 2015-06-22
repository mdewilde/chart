/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

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

import be.ceau.chart.Chart;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class PieOptions extends Options {

	private Boolean segmentShowStroke;
	private String segmentStrokeColor;
	private Integer segmentStrokeWidth;
	private Boolean animateRotate;
	private Boolean animateScale;

	public static PieOptions defaultInstance() {
		PieOptions options = new PieOptions();
		options.setResponsive(true);
		options.setMaintainAspectRatio(true);
		options.setAnimation(true);
		options.setAnimationEasing(AnimationEasing.easeOutBounce);
		options.setScaleIntegersOnly(true);
		options.setAnimateRotate(true);
		return options;
	}
	
	public Boolean getSegmentShowStroke() {
		return segmentShowStroke;
	}

	/**
	 * Whether we should show a stroke on each segment
	 */
	public void setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
	}

	public String getSegmentStrokeColor() {
		return segmentStrokeColor;
	}

	/**
	 * The colour of each segment stroke
	 */
	public void setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
	}

	public Integer getSegmentStrokeWidth() {
		return segmentStrokeWidth;
	}

	/** 
	 * The width of each segment stroke
	 */
	public void setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
	}

	public Boolean getAnimateRotate() {
		return animateRotate;
	}

	/**
	 * Whether we animate the rotation of the Pie
	 */
	public void setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
	}

	public Boolean getAnimateScale() {
		return animateScale;
	}

	/**
	 * Whether we animate scaling the Pie from the centre
	 */
	public void setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
	}

	public Chart.Type getChartType() {
		return Chart.Type.PIE;
	}

}

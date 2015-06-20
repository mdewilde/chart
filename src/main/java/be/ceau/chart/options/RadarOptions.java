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
import be.ceau.chart.enums.AnimationEasing;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class RadarOptions extends Options {

	private Boolean scaleShowLine;
	private Boolean angleShowLineOut;
	private Boolean scaleShowLabels;
	private Boolean scaleBeginAtZero;
	private String angleLineColor;
	private Integer angleLineWidth;
	private String pointLabelFontFamily;
	private String pointLabelFontStyle;
	private Integer pointLabelFontSize;
	private String pointLabelFontColor;
	private Boolean pointDot;
	private Integer pointDotRadius;
	private Integer pointDotStrokeWidth;
	private Integer pointHitDetectionRadius;
	private Boolean datasetStroke;
	private Integer datasetStrokeWidth;
	private Boolean datasetFill;

	public static RadarOptions defaultInstance() {
		RadarOptions options = new RadarOptions();
		options.setResponsive(true);
		options.setAnimation(true);
		options.setAnimationEasing(AnimationEasing.easeOutBounce);
		options.setScaleBeginAtZero(true);
		options.setScaleIntegersOnly(true);
		return options;
	}
	
	public Boolean getScaleShowLine() {
		return scaleShowLine;
	}

	/**
	 * Whether to show lines for each scale point
	 */
	public void setScaleShowLine(Boolean scaleShowLine) {
		this.scaleShowLine = scaleShowLine;
	}

	public Boolean getAngleShowLineOut() {
		return angleShowLineOut;
	}

	/**
	 * Whether we show the angle lines out of the radar
	 */
	public void setAngleShowLineOut(Boolean angleShowLineOut) {
		this.angleShowLineOut = angleShowLineOut;
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

	public Boolean getScaleBeginAtZero() {
		return scaleBeginAtZero;
	}

	/**
	 * Whether the scale should begin at zero
	 */
	public void setScaleBeginAtZero(Boolean scaleBeginAtZero) {
		this.scaleBeginAtZero = scaleBeginAtZero;
	}

	public String getAngleLineColor() {
		return angleLineColor;
	}

	/**
	 * Colour of the angle line
	 */
	public void setAngleLineColor(String angleLineColor) {
		this.angleLineColor = angleLineColor;
	}

	public Integer getAngleLineWidth() {
		return angleLineWidth;
	}

	/**
	 * Pixel width of the angle line
	 */
	public void setAngleLineWidth(Integer angleLineWidth) {
		this.angleLineWidth = angleLineWidth;
	}

	public String getPointLabelFontFamily() {
		return pointLabelFontFamily;
	}

	/**
	 * Point label font declaration
	 */
	public void setPointLabelFontFamily(String pointLabelFontFamily) {
		this.pointLabelFontFamily = pointLabelFontFamily;
	}

	public String getPointLabelFontStyle() {
		return pointLabelFontStyle;
	}

	/**
	 * Point label font weight
	 */
	public void setPointLabelFontStyle(String pointLabelFontStyle) {
		this.pointLabelFontStyle = pointLabelFontStyle;
	}

	public Integer getPointLabelFontSize() {
		return pointLabelFontSize;
	}

	/**
	 * Point label font size in pixels
	 */
	public void setPointLabelFontSize(Integer pointLabelFontSize) {
		this.pointLabelFontSize = pointLabelFontSize;
	}

	public String getPointLabelFontColor() {
		return pointLabelFontColor;
	}

	/**
	 * Point label font colour
	 */
	public void setPointLabelFontColor(String pointLabelFontColor) {
		this.pointLabelFontColor = pointLabelFontColor;
	}

	public Boolean getPointDot() {
		return pointDot;
	}

	/**
	 * Whether to show a dot for each point
	 */
	public void setPointDot(Boolean pointDot) {
		this.pointDot = pointDot;
	}

	public Integer getPointDotRadius() {
		return pointDotRadius;
	}

	/**
	 * Radius of each point dot in pixels
	 */
	public void setPointDotRadius(Integer pointDotRadius) {
		this.pointDotRadius = pointDotRadius;
	}

	public Integer getPointDotStrokeWidth() {
		return pointDotStrokeWidth;
	}

	/**
	 * Pixel width of point dot stroke
	 */
	public void setPointDotStrokeWidth(Integer pointDotStrokeWidth) {
		this.pointDotStrokeWidth = pointDotStrokeWidth;
	}

	public Integer getPointHitDetectionRadius() {
		return pointHitDetectionRadius;
	}

	/**
	 * amount extra to add to the radius to cater for hit detection outside the drawn point
	 */
	public void setPointHitDetectionRadius(Integer pointHitDetectionRadius) {
		this.pointHitDetectionRadius = pointHitDetectionRadius;
	}

	public Boolean getDatasetStroke() {
		return datasetStroke;
	}

	/**
	 * Whether to show a stroke for datasets
	 */
	public void setDatasetStroke(Boolean datasetStroke) {
		this.datasetStroke = datasetStroke;
	}

	public Integer getDatasetStrokeWidth() {
		return datasetStrokeWidth;
	}

	/**
	 * Pixel width of dataset stroke
	 */
	public void setDatasetStrokeWidth(Integer datasetStrokeWidth) {
		this.datasetStrokeWidth = datasetStrokeWidth;
	}

	public Boolean getDatasetFill() {
		return datasetFill;
	}

	/**
	 * Whether to fill the dataset with a colour
	 */
	public void setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
	}
	
	public Chart.Type getChartType() {
		return Chart.Type.RADAR;
	}

}
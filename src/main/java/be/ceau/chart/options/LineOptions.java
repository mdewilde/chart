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
public class LineOptions extends Options {

    private Boolean scaleShowGridLines;
    private String scaleGridLineColor;
    private Integer scaleGridLineWidth;
    private Boolean bezierCurve;
    private Double bezierCurveTension;
    private Boolean pointDot;
    private Integer pointDotRadius;
    private Integer pointDotStrokeWidth;
    private Integer pointHitDetectionRadius;
    private Boolean datasetStroke;
    private Integer datasetStrokeWidth;
    private Boolean datasetFill;

    public static final LineOptions defaultInstance() {
    	LineOptions options = new LineOptions();
		options.setResponsive(true);
		options.setMaintainAspectRatio(true);
		options.setAnimation(true);
		options.setAnimationEasing(AnimationEasing.easeOutBounce);
		options.setScaleIntegersOnly(true);
		return options;
    }
    
	public Boolean getScaleShowGridLines() {
		return scaleShowGridLines;
	}

    /** 
     * Whether grid lines are shown across the chart
     */
	public void setScaleShowGridLines(Boolean scaleShowGridLines) {
		this.scaleShowGridLines = scaleShowGridLines;
	}

	public String getScaleGridLineColor() {
		return scaleGridLineColor;
	}

    /**
     * Colour of the grid lines
     */
	public void setScaleGridLineColor(String scaleGridLineColor) {
		this.scaleGridLineColor = scaleGridLineColor;
	}

	public Integer getScaleGridLineWidth() {
		return scaleGridLineWidth;
	}

    /**
     * Width of the grid lines
     */
	public void setScaleGridLineWidth(Integer scaleGridLineWidth) {
		this.scaleGridLineWidth = scaleGridLineWidth;
	}

	public Boolean getBezierCurve() {
		return bezierCurve;
	}

    /**
     * Whether the line is curved between points
     */
	public void setBezierCurve(Boolean bezierCurve) {
		this.bezierCurve = bezierCurve;
	}

	public Double getBezierCurveTension() {
		return bezierCurveTension;
	}

    /**
     * Tension of the bezier curve between points
     */
	public void setBezierCurveTension(Double bezierCurveTension) {
		this.bezierCurveTension = bezierCurveTension;
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
     * Amount extra to add to the radius to cater for hit detection outside the drawn point
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
		return Chart.Type.LINE;
	}

}
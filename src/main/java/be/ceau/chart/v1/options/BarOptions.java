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

import be.ceau.chart.Chart;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class BarOptions extends Options {

    private Boolean scaleShowGridLines;
    private Boolean scaleGridLineColor;
    private Integer scaleGridLineWidth;
    private Boolean barShowStroke;
    private Integer barStrokeWidth;
    private Integer barValueSpacing;
    private Integer barDatasetSpacing;

    public static final BarOptions defaultInstance() {
    	BarOptions options = new BarOptions();
//		options.setResponsive(true);
//		options.setResponsiveAnimationDuration(1000);
		options.setMaintainAspectRatio(true);
//		options.setAnimation(true);
//		options.setAnimationEasing(AnimationEasing.easeOutBounce);
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

	public Boolean getScaleGridLineColor() {
		return scaleGridLineColor;
	}

    /**
     * Colour of the grid lines
     */
	public void setScaleGridLineColor(Boolean scaleGridLineColor) {
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

	public Boolean getBarShowStroke() {
		return barShowStroke;
	}

    /**
     * If there is a stroke on each bar
     */
	public void setBarShowStroke(Boolean barShowStroke) {
		this.barShowStroke = barShowStroke;
	}

	public Integer getBarStrokeWidth() {
		return barStrokeWidth;
	}

    /**
     * Pixel width of the bar stroke
     */
	public void setBarStrokeWidth(Integer barStrokeWidth) {
		this.barStrokeWidth = barStrokeWidth;
	}

	public Integer getBarValueSpacing() {
		return barValueSpacing;
	}

    /**
     * Spacing between each of the X value sets
     */
	public void setBarValueSpacing(Integer barValueSpacing) {
		this.barValueSpacing = barValueSpacing;
	}

	public Integer getBarDatasetSpacing() {
		return barDatasetSpacing;
	}

    /**
     * Spacing between data sets within X values
     */
	public void setBarDatasetSpacing(Integer barDatasetSpacing) {
		this.barDatasetSpacing = barDatasetSpacing;
	}
	
	public Chart.Type getChartType() {
		return Chart.Type.BAR;
	}

}

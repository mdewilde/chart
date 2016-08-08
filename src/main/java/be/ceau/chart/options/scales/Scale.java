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
package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;
import be.ceau.chart.enums.ScalesPosition;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public abstract class Scale {

	/**
	 * @see #setType(String)
	 */
	private String type;

	/**
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * @see #setPosition(ScalesPosition)
	 */
	private ScalesPosition position;

	/**
	 * @see #setId(String)
	 */
	private String id;

	/**
	 * @see #setBeforeUpdate(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeUpdate;

	/**
	 * @see #setBeforeSetDimensions(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeSetDimensions;

	/**
	 * @see #setAfterSetDimensions(JavaScriptFunction)
	 */
	private JavaScriptFunction afterSetDimensions;

	/**
	 * @see #setBeforeDataLimits(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeDataLimits;

	/**
	 * @see #setAfterDataLimits(JavaScriptFunction)
	 */
	private JavaScriptFunction afterDataLimits;

	/**
	 * @see #setBeforeBuildTicks(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeBuildTicks;

	/**
	 * @see #setAfterBuildTicks(JavaScriptFunction)
	 */
	private JavaScriptFunction afterBuildTicks;

	/**
	 * @see #setBeforeTickToLabelConversion(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeTickToLabelConversion;

	/**
	 * @see #setAfterTickToLabelConversion(JavaScriptFunction)
	 */
	private JavaScriptFunction afterTickToLabelConversion;

	/**
	 * @see #setBeforeCalculateTickRotation(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeCalculateTickRotation;

	/**
	 * @see #setAfterCalculateTickRotation(JavaScriptFunction)
	 */
	private JavaScriptFunction afterCalculateTickRotation;

	/**
	 * @see #setBeforeFit(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeFit;

	/**
	 * @see #setAfterFit(JavaScriptFunction)
	 */
	private JavaScriptFunction afterFit;

	/**
	 * @see #setAfterUpdate(JavaScriptFunction)
	 */
	private JavaScriptFunction afterUpdate;

	/**
	 * @see #setGridLines(GridLines)
	 */
	private GridLines gridLines;

	/**
	 * @see #setScaleLabel(ScaleLabel)
	 */
	private ScaleLabel scaleLabel;

	/**
	 * @see #setTicks(Ticks)
	 */
	private Ticks ticks;

	/**
	 * @see #setType(String)
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * <p>
	 * Type of scale being employed. Custom scales can be created and registered
	 * with a string key. Options: "category", "linear", "logarithmic", "time",
	 * "radialLinear"
	 * </p>
	 * 
	 * <p>
	 * Default {@code Chart specific.}
	 * </p>
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * <p>
	 * If true, show the scale including gridlines, ticks, and labels. Overrides
	 * gridLines.display, scaleLabel.display, and ticks.display.
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}

	/**
	 * @see #setPosition(ScalesPosition)
	 */
	public ScalesPosition getPosition() {
		return this.position;
	}

	/**
	 * <p>
	 * Position of the scale. Possible values are 'top', 'left', 'bottom' and
	 * 'right'.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "left"}
	 * </p>
	 */
	public void setPosition(ScalesPosition position) {
		this.position = position;
	}

	/**
	 * @see #setId(String)
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * <p>
	 * The ID is used to link datasets and scale axes together. The properties
	 * datasets.xAxisID or datasets.yAxisID have to match the scale properties
	 * scales.xAxes.id or scales.yAxes.id. This is especially needed if
	 * multi-axes charts are used.
	 * </p>
	 * 
	 * <p>
	 * Default {@code }
	 * </p>
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setBeforeUpdate(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeUpdate() {
		return this.beforeUpdate;
	}

	/**
	 * <p>
	 * Callback called before the update process starts. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeUpdate(JavaScriptFunction beforeUpdate) {
		this.beforeUpdate = beforeUpdate;
	}

	/**
	 * @see #setBeforeSetDimensions(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeSetDimensions() {
		return this.beforeSetDimensions;
	}

	/**
	 * <p>
	 * Callback that runs before dimensions are set. Passed a single argument,
	 * the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeSetDimensions(JavaScriptFunction beforeSetDimensions) {
		this.beforeSetDimensions = beforeSetDimensions;
	}

	/**
	 * @see #setAfterSetDimensions(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterSetDimensions() {
		return this.afterSetDimensions;
	}

	/**
	 * <p>
	 * Callback that runs after dimensions are set. Passed a single argument,
	 * the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterSetDimensions(JavaScriptFunction afterSetDimensions) {
		this.afterSetDimensions = afterSetDimensions;
	}

	/**
	 * @see #setBeforeDataLimits(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeDataLimits() {
		return this.beforeDataLimits;
	}

	/**
	 * <p>
	 * Callback that runs before data limits are determined. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeDataLimits(JavaScriptFunction beforeDataLimits) {
		this.beforeDataLimits = beforeDataLimits;
	}

	/**
	 * @see #setAfterDataLimits(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterDataLimits() {
		return this.afterDataLimits;
	}

	/**
	 * <p>
	 * Callback that runs after data limits are determined. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterDataLimits(JavaScriptFunction afterDataLimits) {
		this.afterDataLimits = afterDataLimits;
	}

	/**
	 * @see #setBeforeBuildTicks(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeBuildTicks() {
		return this.beforeBuildTicks;
	}

	/**
	 * <p>
	 * Callback that runs before ticks are created. Passed a single argument,
	 * the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeBuildTicks(JavaScriptFunction beforeBuildTicks) {
		this.beforeBuildTicks = beforeBuildTicks;
	}

	/**
	 * @see #setAfterBuildTicks(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterBuildTicks() {
		return this.afterBuildTicks;
	}

	/**
	 * <p>
	 * Callback that runs after ticks are created. Useful for filtering ticks.
	 * Passed a single argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterBuildTicks(JavaScriptFunction afterBuildTicks) {
		this.afterBuildTicks = afterBuildTicks;
	}

	/**
	 * @see #setBeforeTickToLabelConversion(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeTickToLabelConversion() {
		return this.beforeTickToLabelConversion;
	}

	/**
	 * <p>
	 * Callback that runs before ticks are converted into strings. Passed a
	 * single argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeTickToLabelConversion(JavaScriptFunction beforeTickToLabelConversion) {
		this.beforeTickToLabelConversion = beforeTickToLabelConversion;
	}

	/**
	 * @see #setAfterTickToLabelConversion(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterTickToLabelConversion() {
		return this.afterTickToLabelConversion;
	}

	/**
	 * <p>
	 * Callback that runs after ticks are converted into strings. Passed a
	 * single argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterTickToLabelConversion(JavaScriptFunction afterTickToLabelConversion) {
		this.afterTickToLabelConversion = afterTickToLabelConversion;
	}

	/**
	 * @see #setBeforeCalculateTickRotation(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeCalculateTickRotation() {
		return this.beforeCalculateTickRotation;
	}

	/**
	 * <p>
	 * Callback that runs before tick rotation is determined. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeCalculateTickRotation(JavaScriptFunction beforeCalculateTickRotation) {
		this.beforeCalculateTickRotation = beforeCalculateTickRotation;
	}

	/**
	 * @see #setAfterCalculateTickRotation(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterCalculateTickRotation() {
		return this.afterCalculateTickRotation;
	}

	/**
	 * <p>
	 * Callback that runs after tick rotation is determined. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterCalculateTickRotation(JavaScriptFunction afterCalculateTickRotation) {
		this.afterCalculateTickRotation = afterCalculateTickRotation;
	}

	/**
	 * @see #setBeforeFit(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeFit() {
		return this.beforeFit;
	}

	/**
	 * <p>
	 * Callback that runs before the scale fits to the canvas. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setBeforeFit(JavaScriptFunction beforeFit) {
		this.beforeFit = beforeFit;
	}

	/**
	 * @see #setAfterFit(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterFit() {
		return this.afterFit;
	}

	/**
	 * <p>
	 * Callback that runs after the scale fits to the canvas. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterFit(JavaScriptFunction afterFit) {
		this.afterFit = afterFit;
	}

	/**
	 * @see #setAfterUpdate(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterUpdate() {
		return this.afterUpdate;
	}

	/**
	 * <p>
	 * Callback that runs at the end of the update process. Passed a single
	 * argument, the scale instance.
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setAfterUpdate(JavaScriptFunction afterUpdate) {
		this.afterUpdate = afterUpdate;
	}

	/**
	 * @see #setGridLines(GridLines)
	 */
	public GridLines getGridLines() {
		return this.gridLines;
	}

	/**
	 * <p>
	 * See grid line configuration section.
	 * </p>
	 * 
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public void setGridLines(GridLines gridLines) {
		this.gridLines = gridLines;
	}

	/**
	 * @see #setScaleLabel(ScaleLabel)
	 */
	public ScaleLabel getScaleLabel() {
		return this.scaleLabel;
	}

	/**
	 * <p>
	 * See scale title configuration section.
	 * </p>
	 * 
	 * <p>
	 * Default {@code }
	 * </p>
	 */
	public void setScaleLabel(ScaleLabel scaleLabel) {
		this.scaleLabel = scaleLabel;
	}

//	/**
//	 * @see #setTicks(Ticks)
//	 */
//	public Ticks getTicks() {
//		return this.ticks;
//	}
//
//	/**
//	 * <p>
//	 * See ticks configuration section.
//	 * </p>
//	 * 
//	 * <p>
//	 * Default {@code }
//	 * </p>
//	 */
//	public void setTicks(Ticks ticks) {
//		this.ticks = ticks;
//	}

	public abstract Ticks getTicks();

}

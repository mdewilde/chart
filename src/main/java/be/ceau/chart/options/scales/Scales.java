package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public abstract class Scales {

	/**
	 * Default {@code true}
	 * 
	 * 
	 * If true, show the scale including gridlines, ticks, and labels. Overrides
	 * gridLines.display, scaleLabel.display, and ticks.display. true
	 */
	private Boolean display;

	/**
	 * 
	 * Position of the scale. Possible values are 'top', 'left', 'bottom' and
	 * 'right'. "left"
	 */
	private String position;

	/**
	 * 
	 * The ID is used to link datasets and scale axes together. The properties
	 * datasets.xAxisID or datasets.yAxisID have to match the scale properties
	 * scales.xAxes.id or scales.yAxes.id. This is especially needed if
	 * multi-axes charts are used.
	 *
	 */
	private String id;

	/**
	 * 
	 * Callback called before the update process starts. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction beforeUpdate;

	/**
	 * 
	 * Callback that runs before dimensions are set. Passed a single argument,
	 * the scale instance. undefined
	 */
	private JavaScriptFunction beforeSetDimensions;

	/**
	 * 
	 * Callback that runs after dimensions are set. Passed a single argument,
	 * the scale instance. undefined
	 */
	private JavaScriptFunction afterSetDimensions;

	/**
	 * 
	 * Callback that runs before data limits are determined. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction beforeDataLimits;

	/**
	 * 
	 * Callback that runs after data limits are determined. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction afterDataLimits;

	/**
	 * 
	 * Callback that runs before ticks are created. Passed a single argument,
	 * the scale instance. undefined
	 */
	private JavaScriptFunction beforeBuildTicks;

	/**
	 * 
	 * Callback that runs after ticks are created. Useful for filtering ticks.
	 * Passed a single argument, the scale instance. undefined
	 */
	private JavaScriptFunction afterBuildTicks;

	/**
	 * 
	 * Callback that runs before ticks are converted into strings. Passed a
	 * single argument, the scale instance. undefined
	 */
	private JavaScriptFunction beforeTickToLabelConversion;

	/**
	 * 
	 * Callback that runs after ticks are converted into strings. Passed a
	 * single argument, the scale instance. undefined
	 */
	private JavaScriptFunction afterTickToLabelConversion;

	/**
	 * 
	 * Callback that runs before tick rotation is determined. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction beforeCalculateTickRotation;

	/**
	 * 
	 * Callback that runs after tick rotation is determined. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction afterCalculateTickRotation;

	/**
	 * 
	 * Callback that runs before the scale fits to the canvas. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction beforeFit;

	/**
	 * 
	 * Callback that runs after the scale fits to the canvas. Passed a single
	 * argument, the scale instance. undefined
	 */
	private JavaScriptFunction afterFit;

	/**
	 * Callback that runs at the end of the update process. Passed a single
	 * argument, the scale instance. undefined
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
	 * Type of scale being employed. Custom scales can be created and registered
	 * with a string key.
	 */
	public abstract String getType();

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JavaScriptFunction getBeforeUpdate() {
		return beforeUpdate;
	}

	public void setBeforeUpdate(JavaScriptFunction beforeUpdate) {
		this.beforeUpdate = beforeUpdate;
	}

	public JavaScriptFunction getBeforeSetDimensions() {
		return beforeSetDimensions;
	}

	public void setBeforeSetDimensions(JavaScriptFunction beforeSetDimensions) {
		this.beforeSetDimensions = beforeSetDimensions;
	}

	public JavaScriptFunction getAfterSetDimensions() {
		return afterSetDimensions;
	}

	public void setAfterSetDimensions(JavaScriptFunction afterSetDimensions) {
		this.afterSetDimensions = afterSetDimensions;
	}

	public JavaScriptFunction getBeforeDataLimits() {
		return beforeDataLimits;
	}

	public void setBeforeDataLimits(JavaScriptFunction beforeDataLimits) {
		this.beforeDataLimits = beforeDataLimits;
	}

	public JavaScriptFunction getAfterDataLimits() {
		return afterDataLimits;
	}

	public void setAfterDataLimits(JavaScriptFunction afterDataLimits) {
		this.afterDataLimits = afterDataLimits;
	}

	public JavaScriptFunction getBeforeBuildTicks() {
		return beforeBuildTicks;
	}

	public void setBeforeBuildTicks(JavaScriptFunction beforeBuildTicks) {
		this.beforeBuildTicks = beforeBuildTicks;
	}

	public JavaScriptFunction getAfterBuildTicks() {
		return afterBuildTicks;
	}

	public void setAfterBuildTicks(JavaScriptFunction afterBuildTicks) {
		this.afterBuildTicks = afterBuildTicks;
	}

	public JavaScriptFunction getBeforeTickToLabelConversion() {
		return beforeTickToLabelConversion;
	}

	public void setBeforeTickToLabelConversion(JavaScriptFunction beforeTickToLabelConversion) {
		this.beforeTickToLabelConversion = beforeTickToLabelConversion;
	}

	public JavaScriptFunction getAfterTickToLabelConversion() {
		return afterTickToLabelConversion;
	}

	public void setAfterTickToLabelConversion(JavaScriptFunction afterTickToLabelConversion) {
		this.afterTickToLabelConversion = afterTickToLabelConversion;
	}

	public JavaScriptFunction getBeforeCalculateTickRotation() {
		return beforeCalculateTickRotation;
	}

	public void setBeforeCalculateTickRotation(JavaScriptFunction beforeCalculateTickRotation) {
		this.beforeCalculateTickRotation = beforeCalculateTickRotation;
	}

	public JavaScriptFunction getAfterCalculateTickRotation() {
		return afterCalculateTickRotation;
	}

	public void setAfterCalculateTickRotation(JavaScriptFunction afterCalculateTickRotation) {
		this.afterCalculateTickRotation = afterCalculateTickRotation;
	}

	public JavaScriptFunction getBeforeFit() {
		return beforeFit;
	}

	public void setBeforeFit(JavaScriptFunction beforeFit) {
		this.beforeFit = beforeFit;
	}

	public JavaScriptFunction getAfterFit() {
		return afterFit;
	}

	public void setAfterFit(JavaScriptFunction afterFit) {
		this.afterFit = afterFit;
	}

	public JavaScriptFunction getAfterUpdate() {
		return afterUpdate;
	}

	public void setAfterUpdate(JavaScriptFunction afterUpdate) {
		this.afterUpdate = afterUpdate;
	}

	/**
	 * @see #setGridLines(GridLines)
	 */
	public GridLines getGridLines() {
		return gridLines;
	}

	public void setGridLines(GridLines gridLines) {
		this.gridLines = gridLines;
	}

	/**
	 * @see #setScaleLabel(ScaleLabel)
	 */
	public ScaleLabel getScaleLabel() {
		return scaleLabel;
	}

	public void setScaleLabel(ScaleLabel scaleLabel) {
		this.scaleLabel = scaleLabel;
	}

	/**
	 * @see #setTicks(Ticks)
	 */
	public abstract Ticks getTicks();

}

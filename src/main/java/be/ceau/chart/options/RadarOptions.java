package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.elements.RadarElements;
import be.ceau.chart.options.scales.RadialLinearScales;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarOptions extends Options {

	/**
	 * @see #setScale(Scale scale)
	 */
	private RadialLinearScales scale;

	/**
	 * @see #setRadarElements(RadarElements)
	 */
	private RadarElements elements;

	/**
	 * @see #setScale(Scale scale)
	 */
	public RadialLinearScales getScale() {
		return this.scale;
	}

	/**
	 * Options for the one scale used on the chart. Use this to style the ticks,
	 * labels, and grid lines.
	 */
	public void setScale(RadialLinearScales scale) {
		this.scale = scale;
	}

	/**
	 * @see #setRadarElements(RadarElements)
	 */
	public RadarElements getRadarElements() {
		return this.elements;
	}

	/**
	 * Options for all line elements used on the chart, as defined in the global
	 * elements, duplicated here to show Radar chart specific defaults.
	 */
	public void setRadarElements(RadarElements elements) {
		this.elements = elements;
	}

}

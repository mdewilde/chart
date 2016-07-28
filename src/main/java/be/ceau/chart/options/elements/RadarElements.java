package be.ceau.chart.options.elements;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarElements {

	/**
	 * @see #setLine(RadarLine)
	 */
	private RadarLine line;
	/**
	 * @see #setLine(RadarLine)
	 */
	public RadarLine getLine() {
		return line;
	}

	/**
	 * Line elements are used to represent the line in a line chart. The global
	 * line options are stored in Chart.defaults.global.elements.line.
	 */
	public void setLine(RadarLine line) {
		this.line = line;
	}

}

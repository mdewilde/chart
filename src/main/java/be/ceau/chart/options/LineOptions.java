package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.scales.LinearScales;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineOptions extends Options {

	/**
	 * @see #setShowLines(Boolean)
	 */
	private Boolean showLines;

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setLinearScales(LinearScales)
	 */
	private LinearScales linearScales;
	
	/**
	 * @see #setShowLines(Boolean)
	 */
	public Boolean getShowLines() {
		return this.showLines;
	}

	/**
	 * <p>
	 * If false, the lines between points are not drawn
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setShowLines(Boolean showLines) {
		this.showLines = showLines;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return this.spanGaps;
	}

	/**
	 * <p>
	 * If true, NaN data does not break the line
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public void setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
	}

	/**
	 * @see #setLinearScales(LinearScales)
	 */
	public LinearScales getLinearScales() {
		return linearScales;
	}

	/**
	 * The linear scale is use to chart numerical data
	 */
	public void setLinearScales(LinearScales linearScales) {
		this.linearScales = linearScales;
	}

}

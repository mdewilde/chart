package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineOptions extends Options {

	/**
	 * Default {@code true}
	 * 
	 * @see #setShowLines(Boolean showLines)
	 */
	private Boolean showLines;

	/**
	 * Default {@code false}
	 * 
	 * @see #setSpanGaps(Boolean spanGaps)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setShowLines(Boolean showLines)
	 */
	public Boolean getShowLines() {
	    return this.showLines;
	}

	/**
	 * If false, the lines between points are not drawn
	 */
	public void setShowLines(Boolean showLines) {
	    this.showLines = showLines;
	}

	/**
	 * @see #setSpanGaps(Boolean spanGaps)
	 */
	public Boolean getSpanGaps() {
	    return this.spanGaps;
	}

	/**
	 * If true, NaN data does not break the line 
	 */
	public void setSpanGaps(Boolean spanGaps) {
	    this.spanGaps = spanGaps;
	}

}

package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
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
	 * @see #setShowLines(Boolean)
	 */
	public Boolean getShowLines() {
		return showLines;
	}

	/**
	 * If false, the lines between points are not drawn
	 */
	public void setShowLines(Boolean showLines) {
		this.showLines = showLines;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return spanGaps;
	}

	/**
	 * If true, NaN data does not break the line
	 */
	public void setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
	}

}

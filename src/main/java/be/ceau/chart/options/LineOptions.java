package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class LineOptions {
	
	/**
	 * If false, the lines between points are not drawn
	 */
	private Boolean showLines;
	
	/**
	 * If true, NaN data does not break the line 
	 */
	private Boolean spanGaps;

	public Boolean getShowLines() {
		return showLines;
	}

	public void setShowLines(Boolean showLines) {
		this.showLines = showLines;
	}

	public Boolean getSpanGaps() {
		return spanGaps;
	}

	public void setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
	}
	
}

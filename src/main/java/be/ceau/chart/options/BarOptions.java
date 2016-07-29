package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.scales.BarScales;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarOptions extends Options {

	/**
	 * Default {@code "label"}
	 * 
	 * @see #setHover(Hover)
	 */
	private Hover hover;

	/**
	 * Default {@code -}
	 * 
	 * @see #setScales(BarScales)
	 */
	private BarScales scales;

	/**
	 * @see #setHover(Hover)
	 */
	public Hover getHover() {
		return hover;
	}

	/**
	 * Label's hover mode. "label" is used since the x axis displays data by the
	 * index in the dataset.
	 */
	public void setHover(Hover hover) {
		this.hover = hover;
	}

	/**
	 * @see #setScales(BarScales)
	 */
	public BarScales getScales() {
		return scales;
	}

	public void setScales(BarScales scales) {
		this.scales = scales;
	}

}

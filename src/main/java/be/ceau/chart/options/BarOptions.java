package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.scales.BarScale;

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
	 * @see #setScales(BarScale)
	 */
	private BarScale scales;

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
	 * @see #setScales(BarScale)
	 */
	public BarScale getScales() {
		return scales;
	}

	public void setScales(BarScale scales) {
		this.scales = scales;
	}

}

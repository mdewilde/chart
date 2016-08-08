package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HoverMode {

	/**
	 * highlights the closest element
	 */
	SINGLE,
	
	/**
	 * highlights elements in all datasets at the same X value
	 */
	LABEL,
	
	/**
	 * highlights elements in all datasets at the same X
	 * value, activates when hovering anywhere within the vertical slice of
	 * the x-axis representing that X value.
	 */
	X_AXIS,
	
	/**
	 * highlights the closest dataset
	 */
	DATASET;

	private final String serialized;

	private HoverMode() {
		this.serialized = name().toLowerCase(Locale.ENGLISH);
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}

}

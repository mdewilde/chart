package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorderJoinStyle {

	/**
	 * Rounds off the corners of a shape by filling an
	 * additional sector of disc centered at the common endpoint of connected
	 * segments. The radius for these rounded corners is equal to the line
	 * width.
	 */
	ROUND,
	
	/**
	 * Fills an additional triangular area between the common
	 * endpoint of connected segments, and the separate outside rectangular
	 * corners of each segment.
	 */
	BEVEL,
	
	/**
	 * Connected segments are joined by extending their outside edges to connect
	 * at a single point, with the effect of filling an additional
	 * lozenge-shaped area. This setting is effected by the miterLimit property.
	 */
	MITER;

	private final String serialized;

	private BorderJoinStyle() {
		this.serialized = name().toLowerCase(Locale.ENGLISH);
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}

}

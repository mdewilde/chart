package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorderCapStyle {

	/***
	 * The ends of lines are squared off at the endpoints.
	 */
	BUTT,

	/**
	 * The ends of lines are rounded.
	 */
	ROUND,

	/**
	 * The ends of lines are squared off by adding a box with an equal width and
	 * half the height of the line's thickness.
	 */
	SQUARE;

	private final String serialized;

	private BorderCapStyle() {
		this.serialized = name().toLowerCase(Locale.ENGLISH);
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}

}

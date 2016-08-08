package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ScalesPosition {

	TOP,
	LEFT,
	BOTTOM,
	RIGHT;

	private final String serialized;

	private ScalesPosition() {
		this.serialized = name().toLowerCase(Locale.ENGLISH);
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}

}

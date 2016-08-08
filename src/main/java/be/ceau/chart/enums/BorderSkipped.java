package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorderSkipped {
	
	BOTTOM,
	LEFT,
	TOP,
	RIGHT;
	
	private final String serialized;

	private BorderSkipped() {
		this.serialized = name().toLowerCase(Locale.ENGLISH);
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}

}

package be.ceau.chart.enums;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PointStyle {

	CIRCLE,
	TRIANGLE,
	RECT,
	RECT_ROT,
	CROSS,
	CROSS_ROT,
	STAR,
	LINE,
	DASH;
	
	private final String serialized;

	private PointStyle() {
		StringBuilder sb = new StringBuilder();
		for (String s : name().split("_")) {
			if (sb.length() == 0) {
				sb.append(s.toLowerCase(Locale.ENGLISH));
			} else {
				sb.append(s.substring(0, 1).toUpperCase(Locale.ENGLISH));
				sb.append(s.substring(1).toLowerCase(Locale.ENGLISH));
			}
		}
		this.serialized = sb.toString();
	}

	@Override
	@JsonValue
	public String toString() {
		return this.serialized;
	}
	
}

package be.ceau.chart.enums;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

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

	public static class Serializer extends JsonSerializer<HoverMode> {

		@Override
		public void serialize(HoverMode value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeString(value.name().toLowerCase(Locale.ENGLISH).replaceAll("_", "-"));
		}

	}

}

package be.ceau.chart.enums;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = ScalesPosition.Serializer.class)
public enum ScalesPosition {

	TOP,
	LEFT,
	BOTTOM,
	RIGHT;

	public static class Serializer extends JsonSerializer<ScalesPosition> {

		@Override
		public void serialize(ScalesPosition value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeString(value.name().toLowerCase(Locale.ENGLISH));
		}

	}

}

package be.ceau.chart.enums;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public enum FontStyle {

	NORMAL,
	ITALIC, 
	OBLIQUE, 
	INITIAL,
	INHERIT;
	
	public static class Serializer extends JsonSerializer<FontStyle> {

		@Override
		public void serialize(FontStyle value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeString(value.name().toLowerCase(Locale.ENGLISH));
		}

	}
	
}

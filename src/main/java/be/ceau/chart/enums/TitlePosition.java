package be.ceau.chart.enums;

import java.io.IOException;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = TitlePosition.Serializer.class)
public enum TitlePosition {

	TOP,
	BOTTOM;
	
	public static class Serializer extends JsonSerializer<TitlePosition> {

		@Override
		public void serialize(TitlePosition value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeString(value.name().toLowerCase(Locale.ENGLISH));
		}

	}

	
}

package be.ceau.chart;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = JavaScriptFunction.Serializer.class)
public class JavaScriptFunction {

	private final String function;

	public JavaScriptFunction(String function) {
		super();
		this.function = function;
	}

	public String getFunction() {
		return function;
	}

	public static class Serializer extends JsonSerializer<JavaScriptFunction> {

		@Override
		public void serialize(JavaScriptFunction value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
			gen.writeString(value.function);
		}

	}

}

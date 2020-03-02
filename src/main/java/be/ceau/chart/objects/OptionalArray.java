/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.objects;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * {@link ArrayList} subclass with special serialization behavior: if only one
 * item is contained, the item will be serialized as a single value.
 */
@JsonSerialize(using = OptionalArray.Serializer.class)
public class OptionalArray<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1470940649764L;

	public static class Serializer<T> extends JsonSerializer<OptionalArray<T>> {

		@Override
		public boolean isEmpty(SerializerProvider provider, OptionalArray<T> value) {
			return value == null || value.isEmpty();
		}

		@Override
		public void serialize(OptionalArray<T> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
			if (value != null && !value.isEmpty()) {
				if (value.size() == 1) {
					jgen.writeObject(value.get(0));
				} else {
					jgen.writeStartArray();
					for (T t : value) {
						jgen.writeObject(t);
					}
					jgen.writeEndArray();
				}
			}
		}

	}

}

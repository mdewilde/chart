/*
	Copyright 2023 Marceau Dewilde <m@ceau.be>

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

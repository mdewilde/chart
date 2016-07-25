/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.v1.data;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class DataPoint {

	private final String label;
	private final String color;
	private final String highlight;
	private final BigDecimal value;
	
	public DataPoint(String label, String color, String highlight, BigDecimal value) {
		this.label = label;
		this.color = color;
		this.highlight = highlight;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public String getColor() {
		return color;
	}

	public String getHighlight() {
		return highlight;
	}

	public BigDecimal getValue() {
		return value;
	}
	
}
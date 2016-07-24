/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import be.ceau.chart.color.Colors;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class DataSet {

	private final String label;
	private final String fillColor;
	private final String strokeColor;
	private final String pointColor;
	private final String pointStrokeColor;
	private final String pointHighlightFill;
	private final String pointHighlightStroke;
	private final List<BigDecimal> data;

	@JsonIgnore
	private final BigDecimal min;
	@JsonIgnore
	private final BigDecimal max;

	public DataSet(String label, Colors colors, List<BigDecimal> data) {
		this.label = label;
		this.fillColor = colors.getFillColor().rgba();
		this.strokeColor = colors.getStrokeColor().rgba();
		this.pointColor = colors.getPointColor().rgba();
		this.pointStrokeColor = colors.getPointStrokeColor().rgba();
		this.pointHighlightFill = colors.getPointHighlightFill().rgba();
		this.pointHighlightStroke = colors.getPointHighlightStroke().rgba();
		this.data = Collections.unmodifiableList(new ArrayList<BigDecimal>(data));
		BigDecimal tempMin = new BigDecimal(Long.MAX_VALUE);
		BigDecimal tempMax = new BigDecimal(Long.MIN_VALUE);
		for (BigDecimal point : this.data) {
			if (point.compareTo(tempMin) < 0) {
				tempMin = point;
			}
			if (point.compareTo(tempMax) > 0) {
				tempMax = point;
			}
		}
		this.min = tempMin;
		this.max = tempMax;
	}

	/**
	 * @return the number of values in this dataset
	 */
	public int getDataLength() {
		return this.data.size();
	}

	public BigDecimal getMin() {
		return this.min;
	}

	public BigDecimal getMax() {
		return this.max;
	}

	public String getLabel() {
		return label;
	}

	public String getFillColor() {
		return fillColor;
	}

	public String getStrokeColor() {
		return strokeColor;
	}

	public String getPointColor() {
		return pointColor;
	}

	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	public String getPointHighlightFill() {
		return pointHighlightFill;
	}

	public String getPointHighlightStroke() {
		return pointHighlightStroke;
	}

	public List<BigDecimal> getData() {
		return data;
	}

}
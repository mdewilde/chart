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
package be.ceau.chart.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Dataset {

	/**
	 * The data to plot as arcs
	 */
	private final List<BigDecimal> data;

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	private final String label;
	
	/**
	 * The fill color of the arcs
	 */
	private final List<Color> backgroundColor;
	
	/**
	 * Arc border color
	 */
	private final List<Color> borderColor;
	
	/**
	 * Border width of arcs in pixels
	 */
	private final List<BigDecimal> borderWidth;

	/**
	 * Arc background color when hovered
	 */
	private final List<Color> hoverBackgroundColor;

	/**
	 * Arc border color when hovered
	 */
	private final List<Color> hoverBorderColor;

	/**
	 * Border width of arc when hovered
	 */
	private final List<BigDecimal> hoverBorderWidth;
	
	/**
	 * The lowest value in this dataset
	 */
	@JsonIgnore
	private final BigDecimal min;
	
	/**
	 * The highest value in this dataset
	 */
	@JsonIgnore
	private final BigDecimal max;

	public Dataset(Collection<BigDecimal> data, String label, Collection<Color> backgroundColor, Collection<Color> borderColor, 
			Collection<BigDecimal> borderWidth, Collection<Color> hoverBackgroundColor, Collection<Color> hoverBorderColor, 
			Collection<BigDecimal> hoverBorderWidth) {
		BigDecimal _min = new BigDecimal(Long.MAX_VALUE);
		BigDecimal _max = new BigDecimal(Long.MIN_VALUE);
		for (BigDecimal point : this.data) {
			if (point.compareTo(_min) < 0) {
				_min = point;
			}
			if (point.compareTo(_max) > 0) {
				_max = point;
			}
		}
		this.min = _min;
		this.max = _max;
		this.data = Collections.unmodifiableList(new ArrayList<BigDecimal>(data));
		this.label = label;
		if (backgroundColor == null) {
			this.backgroundColor = Collections.emptyList();
		} else {
			this.backgroundColor = Collections.unmodifiableList(new ArrayList<Color>(backgroundColor));
		}
		if (borderColor == null) {
			this.borderColor = Collections.emptyList(); 
		} else {
			this.borderColor = Collections.unmodifiableList(new ArrayList<Color>(borderColor));
		}
		if (borderWidth == null) {
			this.borderWidth = Collections.emptyList();
		} else {
			this.borderWidth = Collections.unmodifiableList(new ArrayList<BigDecimal>(borderWidth));
		}
		if (hoverBackgroundColor == null) {
			this.hoverBackgroundColor = Collections.emptyList();
		} else {
			this.hoverBackgroundColor = Collections.unmodifiableList(new ArrayList<Color>(hoverBackgroundColor));
		}
		if (hoverBorderColor == null) {
			this.hoverBorderColor = Collections.emptyList();
		} else {
			this.hoverBorderColor = Collections.unmodifiableList(new ArrayList<Color>(hoverBorderColor));
		}
		if (hoverBorderWidth == null) {
			this.hoverBorderWidth = Collections.emptyList();
		} else {
			this.hoverBorderWidth = Collections.unmodifiableList(new ArrayList<BigDecimal>(hoverBorderWidth));
		}
	}

	/**
	 * @return the number of values in this dataset
	 */
	public int getDataLength() {
		return this.data.size();
	}

	public List<BigDecimal> getData() {
		return data;
	}

	public String getLabel() {
		return label;
	}

	public List<Color> getBackgroundColor() {
		return backgroundColor;
	}

	public List<Color> getBorderColor() {
		return borderColor;
	}

	public List<BigDecimal> getBorderWidth() {
		return borderWidth;
	}

	public List<Color> getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public List<Color> getHoverBorderColor() {
		return hoverBorderColor;
	}

	public List<BigDecimal> getHoverBorderWidth() {
		return hoverBorderWidth;
	}

	public BigDecimal getMin() {
		return min;
	}

	public BigDecimal getMax() {
		return max;
	}

}
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
package be.ceau.chart.dataset;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.objects.OptionalArray;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public abstract class BaseLineDataset<T extends PointDataset<T, O>, O> extends PointDataset<T, O> {

	/**
	 * @see #setXAxisID(String)
	 */
	private String xAxisID;

	/**
	 * @see #setYAxisID(String)
	 */
	private String yAxisID;

	/**
	 * @see #setPointHitRadius(List)
	 */
	private final List<Integer> pointHitRadius = new OptionalArray<Integer>();

	/**
	 * @see #setShowLine(Boolean)
	 */
	private Boolean showLine;

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	private Boolean steppedLine;

	/**
	 * @see #setXAxisID(String)
	 */
	public String getXAxisID() {
		return this.xAxisID;
	}

	/**
	 * The ID of the x axis to plot this dataset on. The value for this property
	 * should equal the ID set at {@code chart.options.scales.xAxes.id}
	 */
	@SuppressWarnings("unchecked")
	public T setXAxisID(String xAxisID) {
		this.xAxisID = xAxisID;
		return (T) this;
	}

	/**
	 * @see #setYAxisID(String)
	 */
	public String getYAxisID() {
		return this.yAxisID;
	}

	/**
	 * The ID of the y axis to plot this dataset on. The value for this property
	 * should equal the ID set at {@code chart.options.scales.yAxes.id}
	 */
	@SuppressWarnings("unchecked")
	public T setYAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
		return (T) this;
	}

	/**
	 * @see #setPointHitRadius(List)
	 */
	public List<Integer> getPointHitRadius() {
		return this.pointHitRadius;
	}

	/**
	 * @see #setPointHitRadius(List)
	 */
	@SuppressWarnings("unchecked")
	public T addPointHitRadius(Integer pointHitRadius) {
		this.pointHitRadius.add(pointHitRadius);
		return (T) this;
	}

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	@SuppressWarnings("unchecked")
	public T setPointHitRadius(List<Integer> pointHitRadius) {
		this.pointHitRadius.clear();
		if (pointHitRadius != null) {
			this.pointHitRadius.addAll(pointHitRadius);
		}
		return (T) this;
	}

	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine() {
		return this.showLine;
	}

	/**
	 * If false, the line is not drawn for this dataset
	 */
	@SuppressWarnings("unchecked")
	public T setShowLine(Boolean showLine) {
		this.showLine = showLine;
		return (T) this;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return this.spanGaps;
	}

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	@SuppressWarnings("unchecked")
	public T setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
		return (T) this;
	}

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	public Boolean getSteppedLine() {
		return this.steppedLine;
	}

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be
	 * ignored
	 */
	@SuppressWarnings("unchecked")
	public T setSteppedLine(Boolean steppedLine) {
		this.steppedLine = steppedLine;
		return (T) this;
	}

}

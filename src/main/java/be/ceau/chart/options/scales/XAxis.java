/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class XAxis {

	/**
	 * Default {@code "Category"}
	 * 
	 * @see #setType(String type)
	 */
	private String type;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code "x-axis-0"}
	 * 
	 * @see #setId(String id)
	 */
	private String id;

	/**
	 * Default {@code false}
	 * 
	 * @see #setStacked(Boolean stacked)
	 */
	private Boolean stacked;

	/**
	 * Default {@code 0.8}
	 * 
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	private BigDecimal categoryPercentage;

	/**
	 * Default {@code 0.9}
	 * 
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	private BigDecimal barPercentage;

	/**
	 * Default {@code offsetGridLines == true}
	 * 
	 * @see #setGridLines(GridLines gridLines)
	 */
	private GridLines gridLines;

	/**
	 * @see #setType(String type)
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * As defined in Scales.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see #setDisplay(Boolean display)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * If true, show the scale.
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}

	/**
	 * @see #setId(String id)
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Id of the axis so that data can bind to it
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setStacked(Boolean stacked)
	 */
	public Boolean getStacked() {
		return this.stacked;
	}

	/**
	 * If true, bars are stacked on the x-axis
	 */
	public void setStacked(Boolean stacked) {
		this.stacked = stacked;
	}

	/**
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	public BigDecimal getCategoryPercentage() {
		return this.categoryPercentage;
	}

	/**
	 * Percent (0-1) of the available width (the space between the gridlines for
	 * small datasets) for each data-point to use for the bars. Read More
	 */
	public void setCategoryPercentage(BigDecimal categoryPercentage) {
		this.categoryPercentage = categoryPercentage;
	}

	/**
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	public BigDecimal getBarPercentage() {
		return this.barPercentage;
	}

	/**
	 * Percent (0-1) of the available width each bar should be within the
	 * category percentage. 1.0 will take the whole category width and put the
	 * bars right next to each other. Read More
	 */
	public void setBarPercentage(BigDecimal barPercentage) {
		this.barPercentage = barPercentage;
	}

	/**
	 * @see #setGridLines(GridLines gridLines)
	 */
	public GridLines getGridLines() {
		return this.gridLines;
	}

	/**
	 * 
	 */
	public void setGridLines(GridLines gridLines) {
		this.gridLines = gridLines;
	}

}

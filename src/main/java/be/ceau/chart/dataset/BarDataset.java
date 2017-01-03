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
package be.ceau.chart.dataset;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.enums.BorderSkipped;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarDataset extends BackgroundBorderHoverDataset {

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setXAxisID(String)
	 */
	private String xAxisID;

	/**
	 * @see #setYAxisID(String)
	 */
	private String yAxisID;

	/**
	 * @see #setBorderSkipped(List)
	 */
	private final List<BorderSkipped> borderSkipped = new OptionalArray<BorderSkipped>();

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
	    return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public void setLabel(String label) {
	    this.label = label;
	}

	/**
	 * @see #setXAxisID(String)
	 */
	public String getXAxisID() {
	    return this.xAxisID;
	}

	/**
	 * The ID of the x axis to plot this dataset on
	 */
	public void setXAxisID(String xAxisID) {
	    this.xAxisID = xAxisID;
	}

	/**
	 * @see #setYAxisID(String)
	 */
	public String getYAxisID() {
	    return this.yAxisID;
	}

	/**
	 * The ID of the y axis to plot this dataset on
	 */
	public void setYAxisID(String yAxisID) {
	    this.yAxisID = yAxisID;
	}

	/**
	 * @see #setBorderSkipped(List)
	 */
	public List<BorderSkipped> getBorderSkipped() {
	    return this.borderSkipped;
	}

	/**
	 * @see #setBorderSkipped(List)
	 */
	public void addBorderSkipped(BorderSkipped borderSkipped) {
	    this.borderSkipped.add(borderSkipped);
	}

	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
	 */
	public void setBorderSkipped(List<BorderSkipped> borderSkipped) {
	    this.borderSkipped.clear();
	    if (borderSkipped != null) {
	    	this.borderSkipped.addAll(borderSkipped);
	    }
	}

}

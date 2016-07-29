package be.ceau.chart.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.v1.Dataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Data {

	/**
	 * @see #setDatasets(List<Dataset> datasets)
	 */
	private List<Dataset> datasets;

	/**
	 * @see #setLabels(List<String> labels)
	 */
	private List<String> labels;

	/**
	 * @see #setXLabels(List<String> xLabels)
	 */
	private List<String> xLabels;

	/**
	 * @see #setYLabels(List<String> yLabels)
	 */
	private List<String> yLabels;

	/**
	 * @see #setDatasets(List<Datasets> datasets)
	 */
	public List<Dataset> getDatasets() {
		return this.datasets;
	}

	/**
	 * Contains data for each dataset. See the documentation for each chart type
	 * to determine the valid options that can be attached to the dataset
	 */
	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}

	/**
	 * @see #setLabels(List<String> labels)
	 */
	public List<String> getLabels() {
		return this.labels;
	}

	/**
	 * Optional parameter that is used with the category axis.
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	/**
	 * @see #setXLabels(List<String> xLabels)
	 */
	public List<String> getXLabels() {
		return this.xLabels;
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the
	 * axis is horizontal
	 */
	public void setXLabels(List<String> xLabels) {
		this.xLabels = xLabels;
	}

	/**
	 * @see #setYLabels(List<String> yLabels)
	 */
	public List<String> getYLabels() {
		return this.yLabels;
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the
	 * axis is vertical
	 */
	public void setYLabels(List<String> yLabels) {
		this.yLabels = yLabels;
	}

}

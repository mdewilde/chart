package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Data {
	
	/**
	 * Contains data for each dataset. See the documentation for each chart type
	 * to determine the valid options that can be attached to the dataset
	 */
	private final List<Dataset> datasets = new ArrayList<Dataset>();
	
	/**
	 * Optional parameter that is used with the category axis
	 */
	private final List<String> labels = new ArrayList<String>();

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is horizontal
	 */
	private final List<String> xLabels = new ArrayList<String>();

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is vertical
	 */
	private final List<String> yLabels = new ArrayList<String>();

	public Data() {
		
	}

	public List<Dataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	public List<String> getLabels() {
		return Collections.unmodifiableList(labels);
	}

	public List<String> getxLabels() {
		return Collections.unmodifiableList(xLabels);
	}

	public List<String> getyLabels() {
		return Collections.unmodifiableList(yLabels);
	}

	public void addDataset(Dataset dataset) {
		datasets.add(dataset);
	}

	public void addLabel(String label) {
		labels.add(label);
	}

	public void addXLabel(String xLabel) {
		xLabels.add(xLabel);
	}

	public void addYLabel(String yLabel) {
		yLabels.add(yLabel);
	}

}

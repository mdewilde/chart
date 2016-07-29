package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarData {

	private final List<String> labels = new ArrayList<String>();
	private final List<BarDataset> datasets = new ArrayList<BarDataset>();

	public List<String> getLabels() {
		return Collections.unmodifiableList(labels);
	}

	public void setLabels(Collection<String> labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(labels);
		}
	}

	public void addLabel(String label) {
		this.labels.add(label);
	}

	public List<BarDataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	public void setDatasets(Collection<BarDataset> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
	}

	public void addDataset(BarDataset dataset) {
		this.datasets.add(dataset);
	}

}

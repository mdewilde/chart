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
public class LineData {

	private final List<String> labels = new ArrayList<String>();
	private final List<LineDataset> datasets = new ArrayList<LineDataset>();

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

	public List<LineDataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	public void setDatasets(Collection<LineDataset> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
	}

	public void addDataset(LineDataset dataset) {
		this.datasets.add(dataset);
	}

}

package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import be.ceau.chart.dataset.Dataset;

public class Data<D extends Data<D, S>, S extends Dataset<S>> {

	private final List<String> labels = new ArrayList<String>();
	private final List<S> datasets = new ArrayList<S>();

	/**
	 * @return unmodifiable list of all labels, never {@code null}
	 */
	public List<String> getLabels() {
		return Collections.unmodifiableList(labels);
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this {@code LineData} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D setLabels(Collection<String> labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(labels);
		}
		return (D) this;
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this {@code LineData} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D setLabels(String... labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(Arrays.asList(labels));
		}
		return (D) this;
	}

	/**
	 * Adds the label to the backing label list
	 * 
	 * @return this {@code LineData} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D addLabel(String label) {
		this.labels.add(label);
		return (D) this;
	}

	/**
	 * Adds the labels to the backing label list
	 * 
	 * @return this {@code LineData} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D addLabels(String... label) {
		this.labels.addAll(Arrays.asList(label));
		return (D) this;
	}
	
	/**
	 * @return unmodifiable list of all {@link T} objects, never
	 *         {@code null}
	 */
	public List<S> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	/**
	 * @return this {@code T} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D setDatasets(Collection<S> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
		return (D) this;
	}

	/**
	 * @return this {@code T} to allow method chaining
	 */
	@SuppressWarnings("unchecked")
	public D addDataset(S dataset) {
		this.datasets.add(dataset);
		return (D) this;
	}

}

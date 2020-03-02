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
package be.ceau.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.dataset.BubbleDataset;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BubbleData {

	private final List<BubbleDataset> datasets = new ArrayList<BubbleDataset>();
	
	/**
	 * @return unmodifiable list of all {@link BubbleDataset} objects, never
	 *         {@code null}
	 */
	public List<BubbleDataset> getDatasets() {
		return Collections.unmodifiableList(datasets);
	}

	public BubbleData setDatasets(Collection<BubbleDataset> datasets) {
		clearDatasets();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
		return this;
	}

	public BubbleData setDatasets(BubbleDataset... datasets) {
		clearDatasets();
		if (datasets != null) {
			for (int i = 0; i < datasets.length; i++) {
				this.datasets.add(datasets[i]);
			}
		}
		return this;
	}

	public BubbleData clearDatasets() {
		this.datasets.clear();
		return this;
	}

	public BubbleData addDataset(BubbleDataset dataset) {
		this.datasets.add(dataset);
		return this;
	}

}

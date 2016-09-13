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
package be.ceau.chart.dataset;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Dataset {

	/**
	 * @see #setData(BigDecimal)
	 */
	protected final List<BigDecimal> data = new ArrayList<BigDecimal>();

	/**
	 * @see #setData(List)
	 */
	public List<BigDecimal> getData() {
		return this.data;
	}

	/**
	 * The data to plot in a line
	 */
	public void setData(List<BigDecimal> data) {
		this.data.clear();
		if (data != null) {
			this.data.addAll(data);
		}
	}

	/**
	 * @see #setData(List)
	 */
	public void addData(int data) {
		this.data.add(new BigDecimal(data));
	}

	/**
	 * @see #setData(List)
	 */
	public void addData(double data) {
		this.data.add(new BigDecimal(String.valueOf(data)));
	}

	/**
	 * @see #setData(List)
	 */
	public void addData(BigDecimal data) {
		this.data.add(data);
	}

	
}

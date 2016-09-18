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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Dataset<T extends Dataset<T>> {

	/**
	 * @see #setData(BigDecimal)
	 */
	private final List<BigDecimal> data = new ArrayList<BigDecimal>();

	/**
	 * @return an unmodifiable view of the data held in this {@code Dataset},
	 *         never {@code null}
	 */
	public List<BigDecimal> getData() {
		return Collections.unmodifiableList(this.data);
	}

	/**
	 * Sets the backing data list to the argument, replacing any data already
	 * added or set
	 * 
	 * @param data
	 *            The data to plot in a line
	 */
	@SuppressWarnings("unchecked")
	public T setData(List<BigDecimal> data) {
		clearData();
		if (data != null) {
			this.data.addAll(data);
		}
		return (T) this;
	}

	/**
	 * Sets the backing data list to the argument, replacing any data already
	 * added or set
	 * 
	 * @param data
	 *            The data to plot in a line
	 */
	@SuppressWarnings("unchecked")
	public T setData(BigDecimal... data) {
		clearData();
		if (data != null) {
			this.data.addAll(Arrays.asList(data));
		}
		return (T) this;
	}

	/**
	 * Sets the backing data list to the argument, replacing any data already
	 * added or set
	 * 
	 * @param data
	 *            The data to plot in a line
	 */
	@SuppressWarnings("unchecked")
	public T setData(int... data) {
		clearData();
		if (data != null) {
			for (int i = 0; i < data.length; i++) {
				this.data.add(new BigDecimal(data[i]));
			}
		}
		return (T) this;
	}

	/**
	 * Sets the backing data list to the argument, replacing any data already
	 * added or set
	 * 
	 * @param data
	 *            The data to plot in a line
	 */
	@SuppressWarnings("unchecked")
	public T setData(double... data) {
		clearData();
		if (data != null) {
			for (int i = 0; i < data.length; i++) {
				this.data.add(new BigDecimal(String.valueOf(data[i])));
			}
		}
		return (T) this;
	}

	/**
	 * Remove all data held by this {@code Dataset}
	 */
	@SuppressWarnings("unchecked")
	public T clearData() {
		this.data.clear();
		return (T) this;
	}

	/**
	 * Add the data point to this {@code Dataset}
	 * 
	 * @param data
	 *            a {@code BigDecimal}, can be {@code null} to signify absence of data
	 *            for a given point
	 * @see #setDataPoints(List)
	 */
	@SuppressWarnings("unchecked")
	public T addData(BigDecimal data) {
		this.data.add(data);
		return (T) this;
	}

	/**
	 * Add the data point to this {@code Dataset}
	 * 
	 * @see #setDataPoints(List)
	 */
	@SuppressWarnings("unchecked")
	public T addData(int data) {
		this.data.add(new BigDecimal(data));
		return (T) this;
	}

	/**
	 * Add the data point to this {@code Dataset}
	 *
	 * @see #setDataPoints(List)
	 */
	@SuppressWarnings("unchecked")
	public T addData(double data) {
		this.data.add(new BigDecimal(String.valueOf(data)));
		return (T) this;
	}

}

package be.ceau.chart.data;

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
	 * The data to plot in a line
	 */
	public void addData(int data) {
		this.data.add(new BigDecimal(data));
	}

	/**
	 * The data to plot in a line
	 */
	public void addData(double data) {
		this.data.add(new BigDecimal(String.valueOf(data)));
	}

	/**
	 * The data to plot in a line
	 */
	public void addData(BigDecimal data) {
		this.data.add(data);
	}

	
}

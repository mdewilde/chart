package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.data.PolarData;
import be.ceau.chart.data.PolarDataset;
import be.ceau.chart.options.PolarOptions;

public class PolarTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		PolarChart chart = new PolarChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private PolarData newData() {
		PolarDataset dataset = new PolarDataset();
		PolarData data = new PolarData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private PolarOptions newOptions() {
		PolarOptions options = new PolarOptions();
		return options;
	}

}

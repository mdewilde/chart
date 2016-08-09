package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.data.BarData;
import be.ceau.chart.data.BarDataset;
import be.ceau.chart.options.BarOptions;

public class BarTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		BarChart chart = new BarChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private BarData newData() {
		BarDataset dataset = new BarDataset();
		BarData data = new BarData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private BarOptions newOptions() {
		BarOptions options = new BarOptions();
		options.setAnimation(null);
		return options;
	}

}

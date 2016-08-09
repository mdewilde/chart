package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.data.DoughnutData;
import be.ceau.chart.data.DoughnutDataset;
import be.ceau.chart.options.DoughnutOptions;

public class DoughnutTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		DoughnutChart chart = new DoughnutChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}
	
	private DoughnutData newData() {
		DoughnutDataset dataset = new DoughnutDataset();
		DoughnutData data = new DoughnutData();
//		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
//			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private DoughnutOptions newOptions() {
		DoughnutOptions options = new DoughnutOptions();
		return options;
	}

}

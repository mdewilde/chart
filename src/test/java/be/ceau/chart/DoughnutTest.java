package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.DoughnutData;
import be.ceau.chart.dataset.DoughnutDataset;
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
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
			dataset.addBackgroundColor(Color.random());
			dataset.addBorderColor(Color.random());
			dataset.addBorderWidth(Generator.nextInt(22));
			dataset.addHoverBackgroundColor(Color.random());
			dataset.addHoverBorderColor(Color.random());
			dataset.addHoverBorderWidth(Generator.nextInt(22));
		}
		return data;
	}
	
	private DoughnutOptions newOptions() {
		DoughnutOptions options = new DoughnutOptions();
		return options;
	}

}

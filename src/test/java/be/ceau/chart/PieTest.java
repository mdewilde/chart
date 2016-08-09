package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.data.PieData;
import be.ceau.chart.data.PieDataset;
import be.ceau.chart.options.PieOptions;

public class PieTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		PieChart chart = new PieChart();
		chart.setData(newData());
		chart.setPieOptions(newOptions());
		return chart;
	}

	private PieData newData() {
		PieDataset dataset = new PieDataset();
		PieData data = new PieData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private PieOptions newOptions() {
		PieOptions options = new PieOptions();
		return options;
	}

}

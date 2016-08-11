package be.ceau.chart;

import java.math.BigDecimal;
import java.util.Map.Entry;

import be.ceau.chart.data.RadarData;
import be.ceau.chart.dataset.RadarDataset;
import be.ceau.chart.options.RadarOptions;

public class RadarTest extends ChartTest {

	@Override
	public Chart createChart() {
		RadarChart chart = new RadarChart();
		chart.setData(newData());
		chart.setOptions(newOptions());
		return chart;
	}

	private RadarData newData() {
		RadarDataset dataset = new RadarDataset();
		RadarData data = new RadarData();
		data.addDataset(dataset);
		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		return data;
	}
	
	private RadarOptions newOptions() {
		RadarOptions options = new RadarOptions();
		return options;
	}

}

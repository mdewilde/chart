package be.ceau.chart;

import be.ceau.chart.data.BubbleData;
import be.ceau.chart.options.BubbleOptions;

public class BubbleTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		BubbleChart chart = new BubbleChart();
		return chart;
	}
	
	private BubbleData newData() {
//		BubbleDataset dataset = new BubbleDataset();
//		BubbleData data = new BubbleData();
//		data.addDataset(dataset);
//		for (Entry<String, BigDecimal> entry : Generator.generateData().entrySet()) {
//			data.addLabel(entry.getKey());
//			dataset.addData(entry.getValue());
//		}
//		return data;
		return null;
	}
	
	private BubbleOptions newOptions() {
		return null;
	}

}

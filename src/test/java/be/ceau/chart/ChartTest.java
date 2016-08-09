package be.ceau.chart;

import java.io.IOException;

import org.junit.Test;

public abstract class ChartTest {

	public abstract Chart createChart();

	@Test
	public void chartTest() throws IOException {
		Chart chart = createChart();
		Opener.toBrowser(chart.getType(), chart.toJson());
	}

}

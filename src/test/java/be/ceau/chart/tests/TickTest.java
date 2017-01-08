package be.ceau.chart.tests;

import java.io.IOException;

import org.junit.Test;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.scales.BarScale;
import be.ceau.chart.options.ticks.CategoryTicks;
import be.ceau.chart.tests.util.Opener;

/*
 * Debugging for https://github.com/mdewilde/chart/issues/3
 */
public class TickTest {

	@Test
	public void tickTest() throws IOException {
		
		BarDataset dataset = new BarDataset()
				.setLabel("TickTest")

				.addData(65)
				.addBackgroundColor(new Color(255, 99, 132, 0.2))
				.addBorderColor(new Color(255, 99, 132, 1))
				
				.addData(59)
				.addBackgroundColor(new Color(54, 162, 235, 0.2))
				.addBorderColor(new Color(54, 162, 235, 1))
				
				.addData(80)
				.addBackgroundColor(new Color(255, 206, 86, 0.2))
				.addBorderColor(new Color(255, 206, 86, 1))
				
				.addData(81)
				.addBackgroundColor(new Color(75, 192, 192, 0.2))
				.addBorderColor(new Color(75, 192, 192, 1))
				
				.addData(56)
				.addBackgroundColor(new Color(153, 102, 255, 0.2))
				.addBorderColor(new Color(153, 102, 255, 1))
				
				.addData(55)
				.addBackgroundColor(new Color(255, 159, 64, 0.2))
				.addBorderColor(new Color(255, 159, 64, 1))
				
				.addData(40)
				.addBackgroundColor(new Color(Color.CYAN, 0.2))
				.addBorderColor(new Color(Color.DARK_CYAN, 0.2))
				
				.setBorderWidth(1);

		
		BarData data = new BarData()
				.addLabel("January")
				.addLabel("February")
				.addLabel("March");

		data.addDataset(dataset);
		
		BarOptions options = new BarOptions();
		
		BarScale scale = new BarScale();
		
		
		CategoryTicks ticks = new CategoryTicks();
		
		ticks.setMax("100");
		ticks.setMin("0");
		
		scale.setTicks(ticks);
		
		options.setScales(scale);
		
	
		Opener.inBrowser(new BarChart(data, options));
		
	}	
}

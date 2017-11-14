package be.ceau.chart.tests;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import be.ceau.chart.BarChart;

public class DeserializeTest {

	@Test
	public void deserialize() {
		try {

			Scanner scanner = new Scanner(getClass().getResource("/chart.json").openStream());
			String text = scanner.useDelimiter("\\A").next();
			scanner.close(); 

			ObjectReader reader = new ObjectMapper().readerFor(BarChart.class);
			
			BarChart barChart = reader.readValue(text);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

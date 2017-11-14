package be.ceau.chart.tests;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class DeserializeTest {

	@Test
	public void deserialize() {
		try {

			Scanner scanner = new Scanner(getClass().getResource("/chart.json").openStream());
			String text = scanner.useDelimiter("\\A").next();
			scanner.close(); 

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

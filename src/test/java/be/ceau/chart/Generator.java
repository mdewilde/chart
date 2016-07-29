package be.ceau.chart;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Generator {

	private static final Random RANDOM = new Random(System.nanoTime());
	
	public static Map<String, BigDecimal> generateData() {
		
		Map<String, BigDecimal> data = new LinkedHashMap<String, BigDecimal>();
		
		// first choose random number of points we will generate - more than 20 is overkill
		int datapoints = RANDOM.nextInt(20) + 1;
		
		for (int i = 1; i <= datapoints; i++) {
			
			data.put("#" + i, new BigDecimal(RANDOM.nextInt(500)));

		}
		
		
		return data;
		
	}
	
}

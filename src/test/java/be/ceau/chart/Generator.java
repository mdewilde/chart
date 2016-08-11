package be.ceau.chart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import be.ceau.chart.dataset.BubbleDataPoint;

public class Generator {

	private static final Random RANDOM = new Random(System.nanoTime());
	
	private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	private static final char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

	public static Map<String, BigDecimal> generateData() {
		
		Map<String, BigDecimal> data = new LinkedHashMap<String, BigDecimal>();
		
		// first choose random number of points we will generate - 4 minimum - more than 20 is overkill
		int datapoints = RANDOM.nextInt(20) + 5;
		
		for (int i = 4; i <= datapoints; i++) {
			
			data.put(newWord(), new BigDecimal(RANDOM.nextInt(500)));

		}

		return data;
		
	}
	
	public static int nextInt(int bound) {
		return RANDOM.nextInt(bound);
	}
	
	public static List<BubbleDataPoint> generateBubbleDataPoints() {
		List<BubbleDataPoint> list = new ArrayList<BubbleDataPoint>();
		
		// first choose random number of points we will generate - 4 minimum - more than 20 is overkill
		int datapoints = RANDOM.nextInt(20) + 5;
		
		for (int i = 4; i <= datapoints; i++) {
			
			BubbleDataPoint point = new BubbleDataPoint();
			point.setX(new BigDecimal(RANDOM.nextInt(500)));
			point.setY(new BigDecimal(RANDOM.nextInt(500)));
			point.setR(new BigDecimal(RANDOM.nextInt(50)));
			list.add(point);
			
		}

		return list;
	}
	
	private static String newWord() {
		return new StringBuilder()
				.append(consonants[RANDOM.nextInt(consonants.length)])
				.append(vowels[RANDOM.nextInt(vowels.length)])
				.append(consonants[RANDOM.nextInt(consonants.length)])
				.toString();
	}
	
}

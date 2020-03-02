/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.tests.util;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Generator {

	private static final Random RANDOM = new Random(System.nanoTime());
	
	private static final int MINIMUM = 0;
	
	private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	private static final char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

	public static Map<String, BigDecimal> generateData() {
		
		Map<String, BigDecimal> data = new LinkedHashMap<String, BigDecimal>();
		
		// first choose random number of points we will generate - 0 minimum - more than 20 is overkill
		int datapoints = RANDOM.nextInt(20) + MINIMUM + 1;
		
		for (int i = MINIMUM; i <= datapoints; i++) {
			
			data.put(newWord(), new BigDecimal(RANDOM.nextInt(500)));

		}

		return data;
		
	}
	
	public static char nextChar() {
		return (char) RANDOM.nextInt(127 + 1);
	}
	
	public static byte nextByte() {
		return (byte) RANDOM.nextInt(127 + 1);
	}

	public static short nextShort() {
		return (short) RANDOM.nextInt(32767 + 1);
	}
	
	public static int nextInt(int bound) {
		return RANDOM.nextInt(bound);
	}
	
	public static int nextInt() {
		return RANDOM.nextInt();
	}

	public static long nextLong() {
		return RANDOM.nextLong();
	}

	public static float nextFloat() {
		return RANDOM.nextFloat();
	}
	
	public static double nextDouble() {
		return RANDOM.nextDouble();
	}

	public static BigDecimal nextBigDecimal(int bound) {
		return new BigDecimal(RANDOM.nextInt(bound));
	}
	
	public static boolean maybe() {
		return RANDOM.nextBoolean();
	}

	public static String newWord() {
		return new StringBuilder()
				.append(consonants[RANDOM.nextInt(consonants.length)])
				.append(vowels[RANDOM.nextInt(vowels.length)])
				.append(consonants[RANDOM.nextInt(consonants.length)])
				.toString();
	}
	
}

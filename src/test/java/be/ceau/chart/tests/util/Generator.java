/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import be.ceau.chart.color.Color;
import be.ceau.chart.dataset.BubbleDataPoint;
import be.ceau.chart.enums.FontFamily;
import be.ceau.chart.javascript.JavaScriptFunction;

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
	
	public static int nextInt(int bound) {
		return RANDOM.nextInt(bound);
	}
	
	public static BigDecimal nextBigDecimal(int bound) {
		return new BigDecimal(RANDOM.nextInt(bound));
	}

	public static <E> E any(Class<E> e) {
		E[] es = e.getEnumConstants();
		return es[Generator.nextInt(es.length)];
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
	
	public static boolean maybe() {
		return RANDOM.nextBoolean();
	}

	public static <T> T randomInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		T t = clazz.newInstance();
		for (Method method : clazz.getMethods()) {
			if (method.getName().startsWith("set")) {
				method.setAccessible(true);
				for (Class<?> clazzz : method.getParameterTypes()) {
					method.invoke(t, instance(clazzz, method.getName()));
				}
			}
		}
		return t;
	}

	private static <T> Object instance(Class<T> t, String label) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (t == null) {
			return null;
		}
		if (Boolean.class.equals(t)) {
			return maybe();
		}
		if (BigDecimal.class.equals(t)) {
			return nextBigDecimal(10);
		}
		if (Color.class.equals(t)) {
			return Color.random();
		}
		if (JavaScriptFunction.class.equals(t)) {
			return new JavaScriptFunction("function(){console.log('" + label + "');}");
		}
		if (Integer.class.equals(t)) {
			return nextInt(10);
		}
		if (String.class.equals(t)) {
			if (label.toLowerCase(Locale.ENGLISH).contains("fontfamily")) {
				Field field = FontFamily.class.getDeclaredFields()[nextInt(FontFamily.class.getDeclaredFields().length)];
				return field.get(FontFamily.class);
			}
			return label;
		}
		if (t.isEnum()) {
			return any(t);
		}
		if (t.getPackage().getName().startsWith("be.ceau.chart")) {
			return randomInstance(t);
		}
		if (List.class.equals(t)) {
			return Collections.emptyList();
		}
		return t.newInstance();
	}
	
}

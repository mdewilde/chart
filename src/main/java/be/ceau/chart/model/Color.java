/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.model;

import java.util.Random;

public class Color {

	public static final Color BLACK = new Color(0, 0, 0, 1f);
	public static final Color WHITE = new Color(255, 255, 255, 1f);
	public static final Color TRANSPARENT = new Color(0, 0, 0, 0f);
	private static Random randomizer = new Random(System.nanoTime());

	private final int r;
	private final int g;
	private final int b;
	private final float a;

	/**
	 * @param r value for Red color channel. Value between 0 and 255 (inclusive).
	 * @param g value for Green color channel. Value between 0 and 255 (inclusive).
	 * @param b value for Blue color channel. Value between 0 and 255 (inclusive).
	 * @param alpha value for alpha transparency. Value between 0 and 1 (inclusive), with 0 fully transparent and 1 fully opaque.
	 */
	public Color(int r, int g, int b, float alpha) {
		if (!Color.isChannelWithinBounds(r) || !Color.isChannelWithinBounds(g) || !Color.isChannelWithinBounds(b) || !Color.isAlphaWithinBounds(alpha)) {
			throw new IllegalArgumentException("at least one argument is not within bounds");
		}
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = alpha;
	}

	/**
	 * Constructs a new Color instance with the RGB values of the Color argument and the alpha transparency of the float argument.
	 */
	public Color(Color color, float alpha) {
		if (color == null) {
			throw new IllegalArgumentException("Color argument may not be null");
		}
		if (!Color.isAlphaWithinBounds(alpha)) {
			throw new IllegalArgumentException("alpha float argument is not within allowed bounds: allowed values are between 0 and 1 (inclusive), but value passed is " + alpha);
		}
		this.r = color.getR();
		this.g = color.getG();
		this.b = color.getB();
		this.a = alpha;
	}
	
	public static Color random() {
		int r = randomizer.nextInt(256);
		int g = randomizer.nextInt(256);
		int b = randomizer.nextInt(256);
		float a = randomizer.nextFloat();
		return new Color(r,g,b,a);
	}
	
	public static boolean isChannelWithinBounds(int channel) {
		return channel >= 0 && channel <= 255;
	}

	public static boolean isAlphaWithinBounds(float alpha) {
		return Float.compare(0.0f, alpha) <= 0 && Float.compare(1.0f, alpha) >= 0;
	}
	
	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public float getA() {
		return a;
	}

	public String rgba() {
		return "rgba(" + r + "," + g + "," + b + "," + a +")";
	}
	
	@Override
	public String toString() {
		return rgba();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(a);
		result = prime * result + b;
		result = prime * result + g;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		if (Float.floatToIntBits(a) != Float.floatToIntBits(other.a))
			return false;
		if (b != other.b)
			return false;
		if (g != other.g)
			return false;
		if (r != other.r)
			return false;
		return true;
	}

}

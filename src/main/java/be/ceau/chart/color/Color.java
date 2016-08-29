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
package be.ceau.chart.color;

import java.util.Locale;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonValue;

public class Color {

	private static final Random RANDOMIZER = new Random(System.nanoTime());

	public static final Color TRANSPARENT = new Color(0, 0, 0, 0f);
	public static final Color BLACK = new Color(0, 0, 0);
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color RED = new Color(255, 0, 0);
	public static final Color LIME = new Color(0, 255, 0);
	public static final Color BLUE = new Color(0, 0, 255);
	public static final Color YELLOW = new Color(255, 255, 0);
	public static final Color CYAN = new Color(0, 255, 255);
	public static final Color MAGENTA = new Color(255, 0, 255);
	public static final Color SILVER = new Color(192, 192, 192);
	public static final Color GRAY = new Color(128, 128, 128);
	public static final Color MAROON = new Color(128, 0, 0);
	public static final Color OLIVE = new Color(128, 128, 0);
	public static final Color GREEN = new Color(0, 128, 0);
	public static final Color PURPLE = new Color(128, 0, 128);
	public static final Color TEAL = new Color(0, 128, 128);
	public static final Color NAVY = new Color(0, 0, 128);
	public static final Color DARK_RED = new Color(139, 0, 0);
	public static final Color BROWN = new Color(165, 42, 42);
	public static final Color FIREBRICK = new Color(178, 34, 34);
	public static final Color CRIMSON = new Color(220, 20, 60);
	public static final Color TOMATO = new Color(255, 99, 71);
	public static final Color CORAL = new Color(255, 127, 80);
	public static final Color INDIAN_RED = new Color(205, 92, 92);
	public static final Color LIGHT_CORAL = new Color(240, 128, 128);
	public static final Color DARK_SALMON = new Color(233, 150, 122);
	public static final Color SALMON = new Color(250, 128, 114);
	public static final Color LIGHT_SALMON = new Color(255, 160, 122);
	public static final Color ORANGE_RED = new Color(255, 69, 0);
	public static final Color DARK_ORANGE = new Color(255, 140, 0);
	public static final Color ORANGE = new Color(255, 165, 0);
	public static final Color GOLD = new Color(255, 215, 0);
	public static final Color DARK_GOLDEN_ROD = new Color(184, 134, 11);
	public static final Color GOLDEN_ROD = new Color(218, 165, 32);
	public static final Color PALE_GOLDEN_ROD = new Color(238, 232, 170);
	public static final Color DARK_KHAKI = new Color(189, 183, 107);
	public static final Color KHAKI = new Color(240, 230, 140);
	public static final Color YELLOW_GREEN = new Color(154, 205, 50);
	public static final Color DARK_OLIVE_GREEN = new Color(85, 107, 47);
	public static final Color OLIVE_DRAB = new Color(107, 142, 35);
	public static final Color LAWN_GREEN = new Color(124, 252, 0);
	public static final Color CHARTREUSE = new Color(127, 255, 0);
	public static final Color GREEN_YELLOW = new Color(173, 255, 47);
	public static final Color DARK_GREEN = new Color(0, 100, 0);
	public static final Color FOREST_GREEN = new Color(34, 139, 34);
	public static final Color LIME_GREEN = new Color(50, 205, 50);
	public static final Color LIGHT_GREEN = new Color(144, 238, 144);
	public static final Color PALE_GREEN = new Color(152, 251, 152);
	public static final Color DARK_SEA_GREEN = new Color(143, 188, 143);
	public static final Color MEDIUM_SPRING_GREEN = new Color(0, 250, 154);
	public static final Color SPRING_GREEN = new Color(0, 255, 127);
	public static final Color SEA_GREEN = new Color(46, 139, 87);
	public static final Color MEDIUM_AQUA_MARINE = new Color(102, 205, 170);
	public static final Color MEDIUM_SEA_GREEN = new Color(60, 179, 113);
	public static final Color LIGHT_SEA_GREEN = new Color(32, 178, 170);
	public static final Color DARK_SLATE_GRAY = new Color(47, 79, 79);
	public static final Color DARK_CYAN = new Color(0, 139, 139);
	public static final Color AQUA = new Color(0, 255, 255);
	public static final Color LIGHT_CYAN = new Color(224, 255, 255);
	public static final Color DARK_TURQUOISE = new Color(0, 206, 209);
	public static final Color TURQUOISE = new Color(64, 224, 208);
	public static final Color MEDIUM_TURQUOISE = new Color(72, 209, 204);
	public static final Color PALE_TURQUOISE = new Color(175, 238, 238);
	public static final Color AQUA_MARINE = new Color(127, 255, 212);
	public static final Color POWDER_BLUE = new Color(176, 224, 230);
	public static final Color CADET_BLUE = new Color(95, 158, 160);
	public static final Color STEEL_BLUE = new Color(70, 130, 180);
	public static final Color CORN_FLOWER_BLUE = new Color(100, 149, 237);
	public static final Color DEEP_SKY_BLUE = new Color(0, 191, 255);
	public static final Color DODGER_BLUE = new Color(30, 144, 255);
	public static final Color LIGHT_BLUE = new Color(173, 216, 230);
	public static final Color SKY_BLUE = new Color(135, 206, 235);
	public static final Color LIGHT_SKY_BLUE = new Color(135, 206, 250);
	public static final Color MIDNIGHT_BLUE = new Color(25, 25, 112);
	public static final Color DARK_BLUE = new Color(0, 0, 139);
	public static final Color MEDIUM_BLUE = new Color(0, 0, 205);
	public static final Color ROYAL_BLUE = new Color(65, 105, 225);
	public static final Color BLUE_VIOLET = new Color(138, 43, 226);
	public static final Color INDIGO = new Color(75, 0, 130);
	public static final Color DARK_SLATE_BLUE = new Color(72, 61, 139);
	public static final Color SLATE_BLUE = new Color(106, 90, 205);
	public static final Color MEDIUM_SLATE_BLUE = new Color(123, 104, 238);
	public static final Color MEDIUM_PURPLE = new Color(147, 112, 219);
	public static final Color DARK_MAGENTA = new Color(139, 0, 139);
	public static final Color DARK_VIOLET = new Color(148, 0, 211);
	public static final Color DARK_ORCHID = new Color(153, 50, 204);
	public static final Color MEDIUM_ORCHID = new Color(186, 85, 211);
	public static final Color THISTLE = new Color(216, 191, 216);
	public static final Color PLUM = new Color(221, 160, 221);
	public static final Color VIOLET = new Color(238, 130, 238);
	public static final Color ORCHID = new Color(218, 112, 214);
	public static final Color MEDIUM_VIOLET_RED = new Color(199, 21, 133);
	public static final Color PALE_VIOLET_RED = new Color(219, 112, 147);
	public static final Color DEEP_PINK = new Color(255, 20, 147);
	public static final Color HOT_PINK = new Color(255, 105, 180);
	public static final Color LIGHT_PINK = new Color(255, 182, 193);
	public static final Color PINK = new Color(255, 192, 203);
	public static final Color ANTIQUE_WHITE = new Color(250, 235, 215);
	public static final Color BEIGE = new Color(245, 245, 220);
	public static final Color BISQUE = new Color(255, 228, 196);
	public static final Color BLANCHED_ALMOND = new Color(255, 235, 205);
	public static final Color WHEAT = new Color(245, 222, 179);
	public static final Color CORN_SILK = new Color(255, 248, 220);
	public static final Color LEMON_CHIFFON = new Color(255, 250, 205);
	public static final Color LIGHT_GOLDEN_ROD_YELLOW = new Color(250, 250, 210);
	public static final Color LIGHT_YELLOW = new Color(255, 255, 224);
	public static final Color SADDLE_BROWN = new Color(139, 69, 19);
	public static final Color SIENNA = new Color(160, 82, 45);
	public static final Color CHOCOLATE = new Color(210, 105, 30);
	public static final Color PERU = new Color(205, 133, 63);
	public static final Color SANDY_BROWN = new Color(244, 164, 96);
	public static final Color BURLY_WOOD = new Color(222, 184, 135);
	public static final Color TAN = new Color(210, 180, 140);
	public static final Color ROSY_BROWN = new Color(188, 143, 143);
	public static final Color MOCCASIN = new Color(255, 228, 181);
	public static final Color NAVAJO_WHITE = new Color(255, 222, 173);
	public static final Color PEACH_PUFF = new Color(255, 218, 185);
	public static final Color MISTY_ROSE = new Color(255, 228, 225);
	public static final Color LAVENDER_BLUSH = new Color(255, 240, 245);
	public static final Color LINEN = new Color(250, 240, 230);
	public static final Color OLD_LACE = new Color(253, 245, 230);
	public static final Color PAPAYA_WHIP = new Color(255, 239, 213);
	public static final Color SEA_SHELL = new Color(255, 245, 238);
	public static final Color MINT_CREAM = new Color(245, 255, 250);
	public static final Color SLATE_GRAY = new Color(112, 128, 144);
	public static final Color LIGHT_SLATE_GRAY = new Color(119, 136, 153);
	public static final Color LIGHT_STEEL_BLUE = new Color(176, 196, 222);
	public static final Color LAVENDER = new Color(230, 230, 250);
	public static final Color FLORAL_WHITE = new Color(255, 250, 240);
	public static final Color ALICE_BLUE = new Color(240, 248, 255);
	public static final Color GHOST_WHITE = new Color(248, 248, 255);
	public static final Color HONEYDEW = new Color(240, 255, 240);
	public static final Color IVORY = new Color(255, 255, 240);
	public static final Color AZURE = new Color(240, 255, 255);
	public static final Color SNOW = new Color(255, 250, 250);
	public static final Color DIM_GRAY = new Color(105, 105, 105);
	public static final Color DARK_GRAY = new Color(169, 169, 169);
	public static final Color LIGHT_GRAY = new Color(211, 211, 211);
	public static final Color GAINSBORO = new Color(220, 220, 220);
	public static final Color WHITE_SMOKE = new Color(245, 245, 245);

	private final int r;
	private final int g;
	private final int b;
	private final float a;

	/**
	 * Constructs a new Color instance
	 * 
	 * @param r
	 *            value for Red color channel. Value between 0 and 255
	 *            (inclusive).
	 * @param g
	 *            value for Green color channel. Value between 0 and 255
	 *            (inclusive).
	 * @param b
	 *            value for Blue color channel. Value between 0 and 255
	 *            (inclusive).
	 * @param alpha
	 *            value for alpha transparency. Value between 0 and 1
	 *            (inclusive), with 0 fully transparent and 1 fully opaque.
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
	 * Constructs a new Color instance with alpha set fully opaque
	 * 
	 * @param r
	 *            value for Red color channel. Value between 0 and 255
	 *            (inclusive).
	 * @param g
	 *            value for Green color channel. Value between 0 and 255
	 *            (inclusive).
	 * @param b
	 *            value for Blue color channel. Value between 0 and 255
	 *            (inclusive).
	 */
	public Color(int r, int g, int b) {
		this(r, g, b, 1.0f);
	}

	/**
	 * Constructs a new Color instance with the RGB values of the Color argument
	 * and the alpha transparency of the float argument.
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
		int r = RANDOMIZER.nextInt(256);
		int g = RANDOMIZER.nextInt(256);
		int b = RANDOMIZER.nextInt(256);
		float a = RANDOMIZER.nextFloat();
		return new Color(r, g, b, a);
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

	@JsonValue
	public String rgba() {
		return "rgba(" + r + "," + g + "," + b + "," + String.format(Locale.US, "%.3f", a) + ")";
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

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


public class Colors {

	private Color fillColor;
	private Color strokeColor;
	private Color pointColor;
	private Color pointStrokeColor;
	private Color pointHighlightFill;
	private Color pointHighlightStroke;

	public Colors(Color fillColor, Color strokeColor, Color pointColor) {
		this.fillColor = fillColor;
		this.strokeColor = strokeColor;
		this.pointColor = pointColor;
		this.pointStrokeColor = Color.WHITE;
		this.pointHighlightFill = Color.WHITE;
		this.pointHighlightStroke = pointColor;
	}

	/**
	 * Creates a new color scheme based on the single Color argument. It does so by varying alpha transparency.
	 */
	public Colors(Color color) {
		this.fillColor = new Color(color, 0.5f);
		this.strokeColor = new Color(color, 1f);
		this.pointColor = new Color(color, 1f);
		this.pointStrokeColor = Color.WHITE;
		this.pointHighlightFill = Color.WHITE;
		this.pointHighlightStroke = this.pointColor;
	}

	public static Colors random() {
		return new Colors(Color.random());
	}

	public static Colors green() {
		return new Colors(new Color(0, 190, 0, 1f));
	}
	
	public static Colors red() {
		return new Colors(new Color(190, 0, 0, 1f));
	}
	
	public static Colors grayish() {
		return new Colors(new Color(217, 217, 217, 0.25f), new Color(107, 156, 217, 0.75f), new Color(107, 156, 217, 1f));
	}

	public Color getFillColor() {
		if (fillColor == null) {
			return Color.TRANSPARENT;
		} else {
			return fillColor;
		}
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public Color getStrokeColor() {
		if (strokeColor == null) {
			return Color.TRANSPARENT;
		} else {
			return strokeColor;
		}
	}

	public void setStrokeColor(Color strokeColor) {
		this.strokeColor = strokeColor;
	}

	public Color getPointColor() {
		if (pointColor == null) {
			return Color.TRANSPARENT;
		} else {
			return pointColor;
		}
	}

	public void setPointColor(Color pointColor) {
		this.pointColor = pointColor;
	}

	public Color getPointStrokeColor() {
		if (pointStrokeColor == null) {
			return Color.TRANSPARENT;
		} else {
			return pointStrokeColor;
		}
	}

	public void setPointStrokeColor(Color pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
	}

	public Color getPointHighlightFill() {
		if (pointHighlightFill == null) {
			return Color.TRANSPARENT;
		} else {
			return pointHighlightFill;
		}
	}

	public void setPointHighlightFill(Color pointHighlightFill) {
		this.pointHighlightFill = pointHighlightFill;
	}

	public Color getPointHighlightStroke() {
		if (pointHighlightStroke == null) {
			return Color.TRANSPARENT;
		} else {
			return pointHighlightStroke;
		}
	}

	public void setPointHighlightStroke(Color pointHighlightStroke) {
		this.pointHighlightStroke = pointHighlightStroke;
	}

}

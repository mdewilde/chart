/*
	Copyright 2023 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.FontStyle;
import be.ceau.chart.javascript.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LegendLabels {
	
	/**
	 * @see #setBoxWidth(Integer)
	 */
	private Integer boxWidth;

	/**
	 * @see #setFontSize(Integer)
	 */
	private Integer fontSize;

	/**
	 * @see #setFontStyle(FontStyle)
	 */
	private FontStyle fontStyle;

	/**
	 * @see #setFontColor(Color)
	 */
	private Color fontColor;

	/**
	 * @see #setFontFamily(String)
	 */
	private String fontFamily;

	/**
	 * @see #setPadding(Integer)
	 */
	private Integer padding;

	/**
	 * @see #setGenerateLabels(JavaScriptFunction)
	 */
	private JavaScriptFunction generateLabels;

	/**
	 * @see #setUsePointStyle(Boolean)
	 */
	private Boolean usePointStyle;

	/**
	 * @see #setBoxWidth(Integer)
	 */
	public Integer getBoxWidth() {
	    return this.boxWidth;
	}

	/**
	 * <p>
	 * Width of coloured box
	 * </p>
	 * 
	 * <p>
	 * Default {@code 40}
	 * </p>
	 */
	public LegendLabels setBoxWidth(Integer boxWidth) {
	    this.boxWidth = boxWidth;
	    return this;
	}

	/**
	 * @see #setFontSize(Integer)
	 */
	public Integer getFontSize() {
	    return this.fontSize;
	}

	/**
	 * <p>
	 * Font size inherited from global configuration
	 * </p>
	 * 
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public LegendLabels setFontSize(Integer fontSize) {
	    this.fontSize = fontSize;
	    return this;
	}

	/**
	 * @see #setFontStyle(FontStyle)
	 */
	public FontStyle getFontStyle() {
	    return this.fontStyle;
	}

	/**
	 * <p>
	 * Font style inherited from global configuration
	 * </p>
	 * 
	 * <p>
	 * Default {@code "normal"}
	 * </p>
	 */
	public LegendLabels setFontStyle(FontStyle fontStyle) {
	    this.fontStyle = fontStyle;
	    return this;
	}

	/**
	 * @see #setFontColor(Color)
	 */
	public Color getFontColor() {
	    return this.fontColor;
	}

	/**
	 * <p>
	 * Font color inherited from global configuration
	 * </p>
	 * 
	 * <p>
	 * Default {@code "#666"}
	 * </p>
	 */
	public LegendLabels setFontColor(Color fontColor) {
	    this.fontColor = fontColor;
	    return this;
	}

	/**
	 * @see #setFontFamily(String)
	 */
	public String getFontFamily() {
	    return this.fontFamily;
	}

	/**
	 * <p>
	 * Font family inherited from global configuration
	 * </p>
	 * 
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public LegendLabels setFontFamily(String fontFamily) {
	    this.fontFamily = fontFamily;
	    return this;
	}

	/**
	 * @see #setPadding(Integer)
	 */
	public Integer getPadding() {
	    return this.padding;
	}

	/**
	 * <p>
	 * Padding between rows of colored boxes
	 * </p>
	 * 
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public LegendLabels setPadding(Integer padding) {
	    this.padding = padding;
	    return this;
	}

	/**
	 * @see #setGenerateLabels(JavaScriptFunction)
	 */
	public JavaScriptFunction getGenerateLabels() {
	    return this.generateLabels;
	}

	/**
	 * <p>
	 * Generates legend items for each thing in the legend. Default implementation returns the text + styling for the color box. See Legend Item for details.
	 * </p>
	 * 
	 * <p>
	 * Default {@code function(chart) {  }}
	 * </p>
	 */
	public LegendLabels setGenerateLabels(JavaScriptFunction generateLabels) {
	    this.generateLabels = generateLabels;
	    return this;
	}

	/**
	 * @see #setUsePointStyle(Boolean)
	 */
	public Boolean getUsePointStyle() {
	    return this.usePointStyle;
	}

	/**
	 * <p>
	 * Label style will match corresponding point style (size is based on fontSize, boxWidth is not used in this case).
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public LegendLabels setUsePointStyle(Boolean usePointStyle) {
	    this.usePointStyle = usePointStyle;
	    return this;
	}

}

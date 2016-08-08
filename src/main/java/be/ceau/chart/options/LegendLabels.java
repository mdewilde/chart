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
package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.JavaScriptFunction;

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
	 * @see #setFontStyle(String)
	 */
	private String fontStyle;

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
	public void setBoxWidth(Integer boxWidth) {
	    this.boxWidth = boxWidth;
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
	public void setFontSize(Integer fontSize) {
	    this.fontSize = fontSize;
	}

	/**
	 * @see #setFontStyle(String)
	 */
	public String getFontStyle() {
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
	public void setFontStyle(String fontStyle) {
	    this.fontStyle = fontStyle;
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
	public void setFontColor(Color fontColor) {
	    this.fontColor = fontColor;
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
	public void setFontFamily(String fontFamily) {
	    this.fontFamily = fontFamily;
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
	public void setPadding(Integer padding) {
	    this.padding = padding;
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
	public void setGenerateLabels(JavaScriptFunction generateLabels) {
	    this.generateLabels = generateLabels;
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
	public void setUsePointStyle(Boolean usePointStyle) {
	    this.usePointStyle = usePointStyle;
	}

}

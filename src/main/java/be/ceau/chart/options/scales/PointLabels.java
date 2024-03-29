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
package be.ceau.chart.options.scales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.FontStyle;
import be.ceau.chart.javascript.JavaScriptFunction;

/**
 * The following options are used to configure the point labels that are shown
 * on the perimeter of the scale. They can be found in the pointLabels sub
 * options. Note that these options only apply if lineArc is false.
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PointLabels {

	/**
	 * @see #setCallback(JavaScriptFunction)
	 */
	private JavaScriptFunction callback;

	/**
	 * @see #setFontColor(Color)
	 */
	private Color fontColor;

	/**
	 * @see #setFontFamily(String)
	 */
	private String fontFamily;

	/**
	 * @see #setFontSize(BigDecimal)
	 */
	private BigDecimal fontSize;

	/**
	 * @see #setFontStyle(FontStyle)
	 */
	private FontStyle fontStyle;

	/**
	 * @see #setCallback(JavaScriptFunction)
	 */
	public JavaScriptFunction getCallback() {
	    return this.callback;
	}

	/**
	 * <p>
	 * Callback function to transform data label to axis label
	 * </p>
	 * 
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public PointLabels setCallback(JavaScriptFunction callback) {
	    this.callback = callback;
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
	 * Font color
	 * </p>
	 * 
	 * <p>
	 * Default {@code '#666'}
	 * </p>
	 */
	public PointLabels setFontColor(Color fontColor) {
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
	 * Font family to render
	 * </p>
	 * 
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public PointLabels setFontFamily(String fontFamily) {
	    this.fontFamily = fontFamily;
	    return this;
	}

	/**
	 * @see #setFontSize(BigDecimal)
	 */
	public BigDecimal getFontSize() {
	    return this.fontSize;
	}

	/**
	 * <p>
	 * Font size in pixels
	 * </p>
	 * 
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public PointLabels setFontSize(BigDecimal fontSize) {
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
	 * Font Style to use
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'normal'}
	 * </p>
	 */
	public PointLabels setFontStyle(FontStyle fontStyle) {
	    this.fontStyle = fontStyle;
	    return this;
	}
	
}

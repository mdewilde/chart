/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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

/**
 * The grid line configuration is nested under the scale configuration in the
 * scaleLabel key. It defines options for the scale title.
 * 
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ScaleLabel {

	/**
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * @see #setLabelString(String)
	 */
	private String labelString;

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
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
	    return this.display;
	}

	/**
	 * <p>
	 * 
	 * </p>
	 * 
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setLabelString(String)
	 */
	public String getLabelString() {
	    return this.labelString;
	}

	/**
	 * <p>
	 * The text for the title. (i.e. "# of People", "Response Choices")
	 * </p>
	 * 
	 * <p>
	 * Default {@code ""}
	 * </p>
	 */
	public void setLabelString(String labelString) {
	    this.labelString = labelString;
	}

	/**
	 * @see #setFontColor(Color)
	 */
	public Color getFontColor() {
	    return this.fontColor;
	}

	/**
	 * <p>
	 * Font color for the scale title.
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
	 * Font family for the scale title, follows CSS font-family options.
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
	 * @see #setFontSize(BigDecimal)
	 */
	public BigDecimal getFontSize() {
	    return this.fontSize;
	}

	/**
	 * <p>
	 * Font size for the scale title.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public void setFontSize(BigDecimal fontSize) {
	    this.fontSize = fontSize;
	}

	/**
	 * @see #setFontStyle(FontStyle)
	 */
	public FontStyle getFontStyle() {
	    return this.fontStyle;
	}

	/**
	 * <p>
	 * Font style for the scale title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 * </p>
	 * 
	 * <p>
	 * Default {@code "normal"}
	 * </p>
	 */
	public void setFontStyle(FontStyle fontStyle) {
	    this.fontStyle = fontStyle;
	}

}
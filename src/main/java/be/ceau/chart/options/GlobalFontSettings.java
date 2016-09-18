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

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GlobalFontSettings {

	/**
	 * Default {@code '#666'}
	 * 
	 * @see #setDefaultFontColor(Color defaultFontColor)
	 */
	private Color defaultFontColor;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setDefaultFontFamily(String defaultFontFamily)
	 */
	private String defaultFontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setDefaultFontSize(BigDecimal defaultFontSize)
	 */
	private BigDecimal defaultFontSize;

	/**
	 * Default {@code 'normal'}
	 * 
	 * @see #setDefaultFontStyle(String defaultFontStyle)
	 */
	private String defaultFontStyle;

	/**
	 * @see #setDefaultFontColor(Color defaultFontColor)
	 */
	public Color getDefaultFontColor() {
	    return this.defaultFontColor;
	}

	/**
	 * Default font color for all text
	 */
	public GlobalFontSettings setDefaultFontColor(Color defaultFontColor) {
	    this.defaultFontColor = defaultFontColor;
	    return this;
	}

	/**
	 * @see #setDefaultFontFamily(String defaultFontFamily)
	 */
	public String getDefaultFontFamily() {
	    return this.defaultFontFamily;
	}

	/**
	 * Default font family for all text
	 */
	public GlobalFontSettings setDefaultFontFamily(String defaultFontFamily) {
	    this.defaultFontFamily = defaultFontFamily;
	    return this;
	}

	/**
	 * @see #setDefaultFontSize(BigDecimal defaultFontSize)
	 */
	public BigDecimal getDefaultFontSize() {
	    return this.defaultFontSize;
	}

	/**
	 * Default font size (in px) for text. Does not apply to radialLinear scale point labels
	 */
	public GlobalFontSettings setDefaultFontSize(BigDecimal defaultFontSize) {
	    this.defaultFontSize = defaultFontSize;
	    return this;
	}

	/**
	 * @see #setDefaultFontStyle(String defaultFontStyle)
	 */
	public String getDefaultFontStyle() {
	    return this.defaultFontStyle;
	}

	/**
	 * Default font style. Does not apply to tooltip title or footer. Does not apply to chart title
	 */
	public GlobalFontSettings setDefaultFontStyle(String defaultFontStyle) {
	    this.defaultFontStyle = defaultFontStyle;
	    return this;
	}

}

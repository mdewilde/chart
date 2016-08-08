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
import be.ceau.chart.enums.FontStyle;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Tooltips {

	/**
	 * @see #setEnabled(Boolean)
	 */
	private Boolean enabled;

	/**
	 * @see #setCustom(JavaScriptFunction)
	 */
	private JavaScriptFunction custom;

	/**
	 * @see #setMode(String)
	 */
	private String mode;

	/**
	 * @see #setItemSort(JavaScriptFunction)
	 */
	private JavaScriptFunction itemSort;

	/**
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * @see #setTitleFontFamily(String)
	 */
	private String titleFontFamily;

	/**
	 * @see #setTitleFontSize(Integer)
	 */
	private Integer titleFontSize;

	/**
	 * @see #setTitleFontStyle(FontStyle)
	 */
	private FontStyle titleFontStyle;

	/**
	 * @see #setTitleFontColor(Color)
	 */
	private Color titleFontColor;

	/**
	 * @see #setTitleSpacing(Integer)
	 */
	private Integer titleSpacing;

	/**
	 * @see #setTitleMarginBottom(Integer)
	 */
	private Integer titleMarginBottom;

	/**
	 * @see #setBodyFontFamily(String)
	 */
	private String bodyFontFamily;

	/**
	 * @see #setBodyFontSize(Integer)
	 */
	private Integer bodyFontSize;

	/**
	 * @see #setBodyFontStyle(FontStyle)
	 */
	private FontStyle bodyFontStyle;

	/**
	 * @see #setBodyFontColor(Color)
	 */
	private Color bodyFontColor;

	/**
	 * @see #setBodySpacing(Integer)
	 */
	private Integer bodySpacing;

	/**
	 * @see #setFooterFontFamily(String)
	 */
	private String footerFontFamily;

	/**
	 * @see #setFooterFontSize(Integer)
	 */
	private Integer footerFontSize;

	/**
	 * @see #setFooterFontStyle(FontStyle)
	 */
	private FontStyle footerFontStyle;

	/**
	 * @see #setFooterFontColor(Color)
	 */
	private Color footerFontColor;

	/**
	 * @see #setFooterSpacing(Integer)
	 */
	private Integer footerSpacing;

	/**
	 * @see #setFooterMarginTop(Integer)
	 */
	private Integer footerMarginTop;

	/**
	 * @see #setXPadding(Integer)
	 */
	private Integer xPadding;

	/**
	 * @see #setYPadding(Integer)
	 */
	private Integer yPadding;

	/**
	 * @see #setCaretSize(Integer)
	 */
	private Integer caretSize;

	/**
	 * @see #setCornerRadius(Integer)
	 */
	private Integer cornerRadius;

	/**
	 * @see #setMultiKeyBackground(Color)
	 */
	private Color multiKeyBackground;

//	/**
//	 * @see #setCallbacks(Callbacks)
//	 */
//	private Callbacks callbacks;

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
	    return this.enabled;
	}

	/**
	 * <p>
	 * Are tooltips enabled
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setEnabled(Boolean enabled) {
	    this.enabled = enabled;
	}

	/**
	 * @see #setCustom(JavaScriptFunction)
	 */
	public JavaScriptFunction getCustom() {
	    return this.custom;
	}

	/**
	 * <p>
	 * See section below
	 * </p>
	 * 
	 * <p>
	 * Default {@code null}
	 * </p>
	 */
	public void setCustom(JavaScriptFunction custom) {
	    this.custom = custom;
	}

	/**
	 * @see #setMode(String)
	 */
	public String getMode() {
	    return this.mode;
	}

	/**
	 * <p>
	 * Sets which elements appear in the tooltip. Acceptable options are 'single', 'label' or 'x-axis'.  single highlights the closest element.  label highlights elements in all datasets at the same X value.  'x-axis' also highlights elements in all datasets at the same X value, but activates when hovering anywhere within the vertical slice of the x-axis representing that X value.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'single'}
	 * </p>
	 */
	public void setMode(String mode) {
	    this.mode = mode;
	}

	/**
	 * @see #setItemSort(JavaScriptFunction)
	 */
	public JavaScriptFunction getItemSort() {
	    return this.itemSort;
	}

	/**
	 * <p>
	 * Allows sorting of tooltip items. Must implement a function that can be passed to Array.prototype.sort
	 * </p>
	 * 
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public void setItemSort(JavaScriptFunction itemSort) {
	    this.itemSort = itemSort;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * <p>
	 * Background color of the tooltip
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.8)'}
	 * </p>
	 */
	public void setBackgroundColor(Color backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setTitleFontFamily(String)
	 */
	public String getTitleFontFamily() {
	    return this.titleFontFamily;
	}

	/**
	 * <p>
	 * Font family for tooltip title inherited from global font family
	 * </p>
	 * 
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public void setTitleFontFamily(String titleFontFamily) {
	    this.titleFontFamily = titleFontFamily;
	}

	/**
	 * @see #setTitleFontSize(Integer)
	 */
	public Integer getTitleFontSize() {
	    return this.titleFontSize;
	}

	/**
	 * <p>
	 * Font size for tooltip title inherited from global font size
	 * </p>
	 * 
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public void setTitleFontSize(Integer titleFontSize) {
	    this.titleFontSize = titleFontSize;
	}

	/**
	 * @see #setTitleFontStyle(FontStyle)
	 */
	public FontStyle getTitleFontStyle() {
	    return this.titleFontStyle;
	}

	/**
	 * <p>
	 * 
	 * </p>
	 * 
	 * <p>
	 * Default {@code "bold"}
	 * </p>
	 */
	public void setTitleFontStyle(FontStyle titleFontStyle) {
	    this.titleFontStyle = titleFontStyle;
	}

	/**
	 * @see #setTitleFontColor(Color)
	 */
	public Color getTitleFontColor() {
	    return this.titleFontColor;
	}

	/**
	 * <p>
	 * Font color for tooltip title
	 * </p>
	 * 
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public void setTitleFontColor(Color titleFontColor) {
	    this.titleFontColor = titleFontColor;
	}

	/**
	 * @see #setTitleSpacing(Integer)
	 */
	public Integer getTitleSpacing() {
	    return this.titleSpacing;
	}

	/**
	 * <p>
	 * Spacing to add to top and bottom of each title line.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public void setTitleSpacing(Integer titleSpacing) {
	    this.titleSpacing = titleSpacing;
	}

	/**
	 * @see #setTitleMarginBottom(Integer)
	 */
	public Integer getTitleMarginBottom() {
	    return this.titleMarginBottom;
	}

	/**
	 * <p>
	 * Margin to add on bottom of title section
	 * </p>
	 * 
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public void setTitleMarginBottom(Integer titleMarginBottom) {
	    this.titleMarginBottom = titleMarginBottom;
	}

	/**
	 * @see #setBodyFontFamily(String)
	 */
	public String getBodyFontFamily() {
	    return this.bodyFontFamily;
	}

	/**
	 * <p>
	 * Font family for tooltip items inherited from global font family
	 * </p>
	 * 
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public void setBodyFontFamily(String bodyFontFamily) {
	    this.bodyFontFamily = bodyFontFamily;
	}

	/**
	 * @see #setBodyFontSize(Integer)
	 */
	public Integer getBodyFontSize() {
	    return this.bodyFontSize;
	}

	/**
	 * <p>
	 * Font size for tooltip items inherited from global font size
	 * </p>
	 * 
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public void setBodyFontSize(Integer bodyFontSize) {
	    this.bodyFontSize = bodyFontSize;
	}

	/**
	 * @see #setBodyFontStyle(FontStyle)
	 */
	public FontStyle getBodyFontStyle() {
	    return this.bodyFontStyle;
	}

	/**
	 * <p>
	 * 
	 * </p>
	 * 
	 * <p>
	 * Default {@code "normal"}
	 * </p>
	 */
	public void setBodyFontStyle(FontStyle bodyFontStyle) {
	    this.bodyFontStyle = bodyFontStyle;
	}

	/**
	 * @see #setBodyFontColor(Color)
	 */
	public Color getBodyFontColor() {
	    return this.bodyFontColor;
	}

	/**
	 * <p>
	 * Font color for tooltip items.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public void setBodyFontColor(Color bodyFontColor) {
	    this.bodyFontColor = bodyFontColor;
	}

	/**
	 * @see #setBodySpacing(Integer)
	 */
	public Integer getBodySpacing() {
	    return this.bodySpacing;
	}

	/**
	 * <p>
	 * Spacing to add to top and bottom of each tooltip item
	 * </p>
	 * 
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public void setBodySpacing(Integer bodySpacing) {
	    this.bodySpacing = bodySpacing;
	}

	/**
	 * @see #setFooterFontFamily(String)
	 */
	public String getFooterFontFamily() {
	    return this.footerFontFamily;
	}

	/**
	 * <p>
	 * Font family for tooltip footer inherited from global font family.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public void setFooterFontFamily(String footerFontFamily) {
	    this.footerFontFamily = footerFontFamily;
	}

	/**
	 * @see #setFooterFontSize(Integer)
	 */
	public Integer getFooterFontSize() {
	    return this.footerFontSize;
	}

	/**
	 * <p>
	 * Font size for tooltip footer inherited from global font size.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public void setFooterFontSize(Integer footerFontSize) {
	    this.footerFontSize = footerFontSize;
	}

	/**
	 * @see #setFooterFontStyle(FontStyle)
	 */
	public FontStyle getFooterFontStyle() {
	    return this.footerFontStyle;
	}

	/**
	 * <p>
	 * Font style for tooltip footer.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "bold"}
	 * </p>
	 */
	public void setFooterFontStyle(FontStyle footerFontStyle) {
	    this.footerFontStyle = footerFontStyle;
	}

	/**
	 * @see #setFooterFontColor(Color)
	 */
	public Color getFooterFontColor() {
	    return this.footerFontColor;
	}

	/**
	 * <p>
	 * Font color for tooltip footer.
	 * </p>
	 * 
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public void setFooterFontColor(Color footerFontColor) {
	    this.footerFontColor = footerFontColor;
	}

	/**
	 * @see #setFooterSpacing(Integer)
	 */
	public Integer getFooterSpacing() {
	    return this.footerSpacing;
	}

	/**
	 * <p>
	 * Spacing to add to top and bottom of each footer line.
	 * </p>
	 * 
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public void setFooterSpacing(Integer footerSpacing) {
	    this.footerSpacing = footerSpacing;
	}

	/**
	 * @see #setFooterMarginTop(Integer)
	 */
	public Integer getFooterMarginTop() {
	    return this.footerMarginTop;
	}

	/**
	 * <p>
	 * Margin to add before drawing the footer
	 * </p>
	 * 
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public void setFooterMarginTop(Integer footerMarginTop) {
	    this.footerMarginTop = footerMarginTop;
	}

	/**
	 * @see #setXPadding(Integer)
	 */
	public Integer getXPadding() {
	    return this.xPadding;
	}

	/**
	 * <p>
	 * Padding to add on left and right of tooltip
	 * </p>
	 * 
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public void setXPadding(Integer xPadding) {
	    this.xPadding = xPadding;
	}

	/**
	 * @see #setYPadding(Integer)
	 */
	public Integer getYPadding() {
	    return this.yPadding;
	}

	/**
	 * <p>
	 * Padding to add on top and bottom of tooltip
	 * </p>
	 * 
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public void setYPadding(Integer yPadding) {
	    this.yPadding = yPadding;
	}

	/**
	 * @see #setCaretSize(Integer)
	 */
	public Integer getCaretSize() {
	    return this.caretSize;
	}

	/**
	 * <p>
	 * Size, in px, of the tooltip arrow
	 * </p>
	 * 
	 * <p>
	 * Default {@code 5}
	 * </p>
	 */
	public void setCaretSize(Integer caretSize) {
	    this.caretSize = caretSize;
	}

	/**
	 * @see #setCornerRadius(Integer)
	 */
	public Integer getCornerRadius() {
	    return this.cornerRadius;
	}

	/**
	 * <p>
	 * Radius of tooltip corner curves
	 * </p>
	 * 
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public void setCornerRadius(Integer cornerRadius) {
	    this.cornerRadius = cornerRadius;
	}

	/**
	 * @see #setMultiKeyBackground(Color)
	 */
	public Color getMultiKeyBackground() {
	    return this.multiKeyBackground;
	}

	/**
	 * <p>
	 * Color to draw behind the colored boxes when multiple items are in the tooltip
	 * </p>
	 * 
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public void setMultiKeyBackground(Color multiKeyBackground) {
	    this.multiKeyBackground = multiKeyBackground;
	}
//
//	/**
//	 * @see #setCallbacks(Callbacks)
//	 */
//	public Callbacks getCallbacks() {
//	    return this.callbacks;
//	}
//
//	/**
//	 * <p>
//	 * See the callbacks section below
//	 * </p>
//	 * 
//	 * <p>
//	 * Default {@code }
//	 * </p>
//	 */
//	public void setCallbacks(Callbacks callbacks) {
//	    this.callbacks = callbacks;
//	}


}

package be.ceau.chart.options;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.JavaScriptFunction;
import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Tooltips {

	/**
	 * Are tooltips enabled true
	 */
	private Boolean enabled;

	/**
	 * See section below null
	 */
	private JavaScriptFunction custom;

	/**
	 * Sets which elements appear in the tooltip. Acceptable options are
	 * 'single', 'label' or 'x-axis'. single highlights the closest element.
	 * label highlights elements in all datasets at the same X value. 'x-axis'
	 * also highlights elements in all datasets at the same X value, but
	 * activates when hovering anywhere within the vertical slice of the x-axis
	 * representing that X value. 'single'
	 */
	private String mode;

	/**
	 * Allows sorting of tooltip items. Must implement a function that can be
	 * passed to Array.prototype.sort undefined
	 */
	private JavaScriptFunction itemSort;

	/**
	 * Background color of the tooltip 'rgba(0,0,0,0.8)'
	 */
	private Color backgroundColor;

	/**
	 * Font family for tooltip title inherited from global font family
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String titleFontFamily;

	/**
	 * Font size for tooltip title inherited from global font size 12
	 */
	private BigDecimal titleFontSize;

	/**
	 * "bold"
	 */
	private String titleFontStyle;

	/**
	 * Font color for tooltip title "#fff"
	 */
	private Color titleFontColor;

	/**
	 * Spacing to add to top and bottom of each title line. 2
	 */
	private BigDecimal titleSpacing;

	/**
	 * Margin to add on bottom of title section 6
	 */
	private BigDecimal titleMarginBottom;

	/**
	 * Font family for tooltip items inherited from global font family
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String bodyFontFamily;

	/**
	 * Font size for tooltip items inherited from global font size 12
	 */
	private BigDecimal bodyFontSize;

	/**
	 * "normal"
	 */
	private String bodyFontStyle;

	/**
	 * Font color for tooltip items. "#fff"
	 */
	private Color bodyFontColor;

	/**
	 * Spacing to add to top and bottom of each tooltip item 2
	 */
	private BigDecimal bodySpacing;

	/**
	 * Font family for tooltip footer inherited from global font family.
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String footerFontFamily;

	/**
	 * Font size for tooltip footer inherited from global font size. 12
	 */
	private BigDecimal footerFontSize;

	/**
	 * Font style for tooltip footer. "bold"
	 */
	private String footerFontStyle;

	/**
	 * Font color for tooltip footer. "#fff"
	 */
	private Color footerFontColor;

	/**
	 * Spacing to add to top and bottom of each footer line. 2
	 */
	private BigDecimal footerSpacing;

	/**
	 * Margin to add before drawing the footer 6
	 */
	private BigDecimal footerMarginTop;

	/**
	 * Padding to add on left and right of tooltip 6
	 */
	private BigDecimal xPadding;

	/**
	 * Padding to add on top and bottom of tooltip 6
	 */
	private BigDecimal yPadding;

	/**
	 * Size, in px, of the tooltip arrow 5
	 */
	private BigDecimal caretSize;

	/**
	 * Radius of tooltip corner curves 6
	 */
	private BigDecimal cornerRadius;

	/**
	 * Color to draw behind the colored boxes when multiple items are in the
	 * tooltip "#fff"
	 */
	private Color multiKeyBackground;

//	/**
//	 * See the callbacks section below
//	 */
//	private Object callbacks;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public JavaScriptFunction getCustom() {
		return custom;
	}

	public void setCustom(JavaScriptFunction custom) {
		this.custom = custom;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public JavaScriptFunction getItemSort() {
		return itemSort;
	}

	public void setItemSort(JavaScriptFunction itemSort) {
		this.itemSort = itemSort;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getTitleFontFamily() {
		return titleFontFamily;
	}

	public void setTitleFontFamily(String titleFontFamily) {
		this.titleFontFamily = titleFontFamily;
	}

	public BigDecimal getTitleFontSize() {
		return titleFontSize;
	}

	public void setTitleFontSize(BigDecimal titleFontSize) {
		this.titleFontSize = titleFontSize;
	}

	public String getTitleFontStyle() {
		return titleFontStyle;
	}

	public void setTitleFontStyle(String titleFontStyle) {
		this.titleFontStyle = titleFontStyle;
	}

	public Color getTitleFontColor() {
		return titleFontColor;
	}

	public void setTitleFontColor(Color titleFontColor) {
		this.titleFontColor = titleFontColor;
	}

	public BigDecimal getTitleSpacing() {
		return titleSpacing;
	}

	public void setTitleSpacing(BigDecimal titleSpacing) {
		this.titleSpacing = titleSpacing;
	}

	public BigDecimal getTitleMarginBottom() {
		return titleMarginBottom;
	}

	public void setTitleMarginBottom(BigDecimal titleMarginBottom) {
		this.titleMarginBottom = titleMarginBottom;
	}

	public String getBodyFontFamily() {
		return bodyFontFamily;
	}

	public void setBodyFontFamily(String bodyFontFamily) {
		this.bodyFontFamily = bodyFontFamily;
	}

	public BigDecimal getBodyFontSize() {
		return bodyFontSize;
	}

	public void setBodyFontSize(BigDecimal bodyFontSize) {
		this.bodyFontSize = bodyFontSize;
	}

	public String getBodyFontStyle() {
		return bodyFontStyle;
	}

	public void setBodyFontStyle(String bodyFontStyle) {
		this.bodyFontStyle = bodyFontStyle;
	}

	public Color getBodyFontColor() {
		return bodyFontColor;
	}

	public void setBodyFontColor(Color bodyFontColor) {
		this.bodyFontColor = bodyFontColor;
	}

	public BigDecimal getBodySpacing() {
		return bodySpacing;
	}

	public void setBodySpacing(BigDecimal bodySpacing) {
		this.bodySpacing = bodySpacing;
	}

	public String getFooterFontFamily() {
		return footerFontFamily;
	}

	public void setFooterFontFamily(String footerFontFamily) {
		this.footerFontFamily = footerFontFamily;
	}

	public BigDecimal getFooterFontSize() {
		return footerFontSize;
	}

	public void setFooterFontSize(BigDecimal footerFontSize) {
		this.footerFontSize = footerFontSize;
	}

	public String getFooterFontStyle() {
		return footerFontStyle;
	}

	public void setFooterFontStyle(String footerFontStyle) {
		this.footerFontStyle = footerFontStyle;
	}

	public Color getFooterFontColor() {
		return footerFontColor;
	}

	public void setFooterFontColor(Color footerFontColor) {
		this.footerFontColor = footerFontColor;
	}

	public BigDecimal getFooterSpacing() {
		return footerSpacing;
	}

	public void setFooterSpacing(BigDecimal footerSpacing) {
		this.footerSpacing = footerSpacing;
	}

	public BigDecimal getFooterMarginTop() {
		return footerMarginTop;
	}

	public void setFooterMarginTop(BigDecimal footerMarginTop) {
		this.footerMarginTop = footerMarginTop;
	}

	public BigDecimal getxPadding() {
		return xPadding;
	}

	public void setxPadding(BigDecimal xPadding) {
		this.xPadding = xPadding;
	}

	public BigDecimal getyPadding() {
		return yPadding;
	}

	public void setyPadding(BigDecimal yPadding) {
		this.yPadding = yPadding;
	}

	public BigDecimal getCaretSize() {
		return caretSize;
	}

	public void setCaretSize(BigDecimal caretSize) {
		this.caretSize = caretSize;
	}

	public BigDecimal getCornerRadius() {
		return cornerRadius;
	}

	public void setCornerRadius(BigDecimal cornerRadius) {
		this.cornerRadius = cornerRadius;
	}

	public Color getMultiKeyBackground() {
		return multiKeyBackground;
	}

	public void setMultiKeyBackground(Color multiKeyBackground) {
		this.multiKeyBackground = multiKeyBackground;
	}

//	public Object getCallbacks() {
//		return callbacks;
//	}
//
//	public void setCallbacks(Object callbacks) {
//		this.callbacks = callbacks;
//	}
}

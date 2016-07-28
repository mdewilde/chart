package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Tooltips {

	/**
	 * Default {@code true}
	 * 
	 * @see #setEnabled(Boolean enabled)
	 */
	private Boolean enabled;

	/**
	 * Default {@code null}
	 * 
	 * @see #setCustom(JavaScriptFunction custom)
	 */
	private JavaScriptFunction custom;

	/**
	 * Default {@code 'single'}
	 * 
	 * @see #setMode(String mode)
	 */
	private String mode;

	/**
	 * Default {@code undefined}
	 * 
	 * @see #setItemSort(JavaScriptFunction itemSort)
	 */
	private JavaScriptFunction itemSort;

	/**
	 * Default {@code 'rgba(0,0,0,0.8)'}
	 * 
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	private Color backgroundColor;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setTitleFontFamily(String titleFontFamily)
	 */
	private String titleFontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setTitleFontSize(BigDecimal titleFontSize)
	 */
	private BigDecimal titleFontSize;

	/**
	 * Default {@code "bold"}
	 * 
	 * @see #setTitleFontStyle(String titleFontStyle)
	 */
	private String titleFontStyle;

	/**
	 * Default {@code "#fff"}
	 * 
	 * @see #setTitleFontColor(Color titleFontColor)
	 */
	private Color titleFontColor;

	/**
	 * Default {@code 2}
	 * 
	 * @see #setTitleSpacing(BigDecimal titleSpacing)
	 */
	private BigDecimal titleSpacing;

	/**
	 * Default {@code 6}
	 * 
	 * @see #setTitleMarginBottom(BigDecimal titleMarginBottom)
	 */
	private BigDecimal titleMarginBottom;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setBodyFontFamily(String bodyFontFamily)
	 */
	private String bodyFontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setBodyFontSize(BigDecimal bodyFontSize)
	 */
	private BigDecimal bodyFontSize;

	/**
	 * Default {@code "normal"}
	 * 
	 * @see #setBodyFontStyle(String bodyFontStyle)
	 */
	private String bodyFontStyle;

	/**
	 * Default {@code "#fff"}
	 * 
	 * @see #setBodyFontColor(Color bodyFontColor)
	 */
	private Color bodyFontColor;

	/**
	 * Default {@code 2}
	 * 
	 * @see #setBodySpacing(BigDecimal bodySpacing)
	 */
	private BigDecimal bodySpacing;

	/**
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * 
	 * @see #setFooterFontFamily(String footerFontFamily)
	 */
	private String footerFontFamily;

	/**
	 * Default {@code 12}
	 * 
	 * @see #setFooterFontSize(BigDecimal footerFontSize)
	 */
	private BigDecimal footerFontSize;

	/**
	 * Default {@code "bold"}
	 * 
	 * @see #setFooterFontStyle(String footerFontStyle)
	 */
	private String footerFontStyle;

	/**
	 * Default {@code "#fff"}
	 * 
	 * @see #setFooterFontColor(Color footerFontColor)
	 */
	private Color footerFontColor;

	/**
	 * Default {@code 2}
	 * 
	 * @see #setFooterSpacing(BigDecimal footerSpacing)
	 */
	private BigDecimal footerSpacing;

	/**
	 * Default {@code 6}
	 * 
	 * @see #setFooterMarginTop(BigDecimal footerMarginTop)
	 */
	private BigDecimal footerMarginTop;

	/**
	 * Default {@code 6}
	 * 
	 * @see #setXPadding(BigDecimal xPadding)
	 */
	private BigDecimal xPadding;

	/**
	 * Default {@code 6}
	 * 
	 * @see #setYPadding(BigDecimal yPadding)
	 */
	private BigDecimal yPadding;

	/**
	 * Default {@code 5}
	 * 
	 * @see #setCaretSize(BigDecimal caretSize)
	 */
	private BigDecimal caretSize;

	/**
	 * Default {@code 6}
	 * 
	 * @see #setCornerRadius(BigDecimal cornerRadius)
	 */
	private BigDecimal cornerRadius;

	/**
	 * Default {@code "#fff"}
	 * 
	 * @see #setMultiKeyBackground(Color multiKeyBackground)
	 */
	private Color multiKeyBackground;

//	/**
//	 * Default {@code }
//	 * 
//	 * @see #setCallbacks(Callbacks callbacks)
//	 */
//	private Callbacks callbacks;

	/**
	 * @see #setEnabled(Boolean enabled)
	 */
	public Boolean getEnabled() {
	    return this.enabled;
	}

	/**
	 * Are tooltips enabled
	 */
	public void setEnabled(Boolean enabled) {
	    this.enabled = enabled;
	}

	/**
	 * @see #setCustom(JavaScriptFunction custom)
	 */
	public JavaScriptFunction getCustom() {
	    return this.custom;
	}

	/**
	 * See section below
	 */
	public void setCustom(JavaScriptFunction custom) {
	    this.custom = custom;
	}

	/**
	 * @see #setMode(String mode)
	 */
	public String getMode() {
	    return this.mode;
	}

	/**
	 * Sets which elements appear in the tooltip. Acceptable options are 'single', 'label' or 'x-axis'.  single highlights the closest element.  label highlights elements in all datasets at the same X value.  'x-axis' also highlights elements in all datasets at the same X value, but activates when hovering anywhere within the vertical slice of the x-axis representing that X value.
	 */
	public void setMode(String mode) {
	    this.mode = mode;
	}

	/**
	 * @see #setItemSort(JavaScriptFunction itemSort)
	 */
	public JavaScriptFunction getItemSort() {
	    return this.itemSort;
	}

	/**
	 * Allows sorting of tooltip items. Must implement a function that can be passed to Array.prototype.sort
	 */
	public void setItemSort(JavaScriptFunction itemSort) {
	    this.itemSort = itemSort;
	}

	/**
	 * @see #setBackgroundColor(Color backgroundColor)
	 */
	public Color getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * Background color of the tooltip
	 */
	public void setBackgroundColor(Color backgroundColor) {
	    this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setTitleFontFamily(String titleFontFamily)
	 */
	public String getTitleFontFamily() {
	    return this.titleFontFamily;
	}

	/**
	 * Font family for tooltip title inherited from global font family
	 */
	public void setTitleFontFamily(String titleFontFamily) {
	    this.titleFontFamily = titleFontFamily;
	}

	/**
	 * @see #setTitleFontSize(BigDecimal titleFontSize)
	 */
	public BigDecimal getTitleFontSize() {
	    return this.titleFontSize;
	}

	/**
	 * Font size for tooltip title inherited from global font size
	 */
	public void setTitleFontSize(BigDecimal titleFontSize) {
	    this.titleFontSize = titleFontSize;
	}

	/**
	 * @see #setTitleFontStyle(String titleFontStyle)
	 */
	public String getTitleFontStyle() {
	    return this.titleFontStyle;
	}

	/**
	 * 
	 */
	public void setTitleFontStyle(String titleFontStyle) {
	    this.titleFontStyle = titleFontStyle;
	}

	/**
	 * @see #setTitleFontColor(Color titleFontColor)
	 */
	public Color getTitleFontColor() {
	    return this.titleFontColor;
	}

	/**
	 * Font color for tooltip title
	 */
	public void setTitleFontColor(Color titleFontColor) {
	    this.titleFontColor = titleFontColor;
	}

	/**
	 * @see #setTitleSpacing(BigDecimal titleSpacing)
	 */
	public BigDecimal getTitleSpacing() {
	    return this.titleSpacing;
	}

	/**
	 * Spacing to add to top and bottom of each title line.
	 */
	public void setTitleSpacing(BigDecimal titleSpacing) {
	    this.titleSpacing = titleSpacing;
	}

	/**
	 * @see #setTitleMarginBottom(BigDecimal titleMarginBottom)
	 */
	public BigDecimal getTitleMarginBottom() {
	    return this.titleMarginBottom;
	}

	/**
	 * Margin to add on bottom of title section
	 */
	public void setTitleMarginBottom(BigDecimal titleMarginBottom) {
	    this.titleMarginBottom = titleMarginBottom;
	}

	/**
	 * @see #setBodyFontFamily(String bodyFontFamily)
	 */
	public String getBodyFontFamily() {
	    return this.bodyFontFamily;
	}

	/**
	 * Font family for tooltip items inherited from global font family
	 */
	public void setBodyFontFamily(String bodyFontFamily) {
	    this.bodyFontFamily = bodyFontFamily;
	}

	/**
	 * @see #setBodyFontSize(BigDecimal bodyFontSize)
	 */
	public BigDecimal getBodyFontSize() {
	    return this.bodyFontSize;
	}

	/**
	 * Font size for tooltip items inherited from global font size
	 */
	public void setBodyFontSize(BigDecimal bodyFontSize) {
	    this.bodyFontSize = bodyFontSize;
	}

	/**
	 * @see #setBodyFontStyle(String bodyFontStyle)
	 */
	public String getBodyFontStyle() {
	    return this.bodyFontStyle;
	}

	/**
	 * 
	 */
	public void setBodyFontStyle(String bodyFontStyle) {
	    this.bodyFontStyle = bodyFontStyle;
	}

	/**
	 * @see #setBodyFontColor(Color bodyFontColor)
	 */
	public Color getBodyFontColor() {
	    return this.bodyFontColor;
	}

	/**
	 * Font color for tooltip items.
	 */
	public void setBodyFontColor(Color bodyFontColor) {
	    this.bodyFontColor = bodyFontColor;
	}

	/**
	 * @see #setBodySpacing(BigDecimal bodySpacing)
	 */
	public BigDecimal getBodySpacing() {
	    return this.bodySpacing;
	}

	/**
	 * Spacing to add to top and bottom of each tooltip item
	 */
	public void setBodySpacing(BigDecimal bodySpacing) {
	    this.bodySpacing = bodySpacing;
	}

	/**
	 * @see #setFooterFontFamily(String footerFontFamily)
	 */
	public String getFooterFontFamily() {
	    return this.footerFontFamily;
	}

	/**
	 * Font family for tooltip footer inherited from global font family.
	 */
	public void setFooterFontFamily(String footerFontFamily) {
	    this.footerFontFamily = footerFontFamily;
	}

	/**
	 * @see #setFooterFontSize(BigDecimal footerFontSize)
	 */
	public BigDecimal getFooterFontSize() {
	    return this.footerFontSize;
	}

	/**
	 * Font size for tooltip footer inherited from global font size.
	 */
	public void setFooterFontSize(BigDecimal footerFontSize) {
	    this.footerFontSize = footerFontSize;
	}

	/**
	 * @see #setFooterFontStyle(String footerFontStyle)
	 */
	public String getFooterFontStyle() {
	    return this.footerFontStyle;
	}

	/**
	 * Font style for tooltip footer.
	 */
	public void setFooterFontStyle(String footerFontStyle) {
	    this.footerFontStyle = footerFontStyle;
	}

	/**
	 * @see #setFooterFontColor(Color footerFontColor)
	 */
	public Color getFooterFontColor() {
	    return this.footerFontColor;
	}

	/**
	 * Font color for tooltip footer.
	 */
	public void setFooterFontColor(Color footerFontColor) {
	    this.footerFontColor = footerFontColor;
	}

	/**
	 * @see #setFooterSpacing(BigDecimal footerSpacing)
	 */
	public BigDecimal getFooterSpacing() {
	    return this.footerSpacing;
	}

	/**
	 * Spacing to add to top and bottom of each footer line.
	 */
	public void setFooterSpacing(BigDecimal footerSpacing) {
	    this.footerSpacing = footerSpacing;
	}

	/**
	 * @see #setFooterMarginTop(BigDecimal footerMarginTop)
	 */
	public BigDecimal getFooterMarginTop() {
	    return this.footerMarginTop;
	}

	/**
	 * Margin to add before drawing the footer
	 */
	public void setFooterMarginTop(BigDecimal footerMarginTop) {
	    this.footerMarginTop = footerMarginTop;
	}

	/**
	 * @see #setXPadding(BigDecimal xPadding)
	 */
	public BigDecimal getXPadding() {
	    return this.xPadding;
	}

	/**
	 * Padding to add on left and right of tooltip
	 */
	public void setXPadding(BigDecimal xPadding) {
	    this.xPadding = xPadding;
	}

	/**
	 * @see #setYPadding(BigDecimal yPadding)
	 */
	public BigDecimal getYPadding() {
	    return this.yPadding;
	}

	/**
	 * Padding to add on top and bottom of tooltip
	 */
	public void setYPadding(BigDecimal yPadding) {
	    this.yPadding = yPadding;
	}

	/**
	 * @see #setCaretSize(BigDecimal caretSize)
	 */
	public BigDecimal getCaretSize() {
	    return this.caretSize;
	}

	/**
	 * Size, in px, of the tooltip arrow
	 */
	public void setCaretSize(BigDecimal caretSize) {
	    this.caretSize = caretSize;
	}

	/**
	 * @see #setCornerRadius(BigDecimal cornerRadius)
	 */
	public BigDecimal getCornerRadius() {
	    return this.cornerRadius;
	}

	/**
	 * Radius of tooltip corner curves
	 */
	public void setCornerRadius(BigDecimal cornerRadius) {
	    this.cornerRadius = cornerRadius;
	}

	/**
	 * @see #setMultiKeyBackground(Color multiKeyBackground)
	 */
	public Color getMultiKeyBackground() {
	    return this.multiKeyBackground;
	}

	/**
	 * Color to draw behind the colored boxes when multiple items are in the tooltip
	 */
	public void setMultiKeyBackground(Color multiKeyBackground) {
	    this.multiKeyBackground = multiKeyBackground;
	}

//	/**
//	 * @see #setCallbacks(Callbacks callbacks)
//	 */
//	public Callbacks getCallbacks() {
//	    return this.callbacks;
//	}
//
//	/**
//	 * See the callbacks section below
//	 */
//	public void setCallbacks(Callbacks callbacks) {
//	    this.callbacks = callbacks;
//	}

}

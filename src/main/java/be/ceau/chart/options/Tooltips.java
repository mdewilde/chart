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
	 * <p>Default {@code true}</p>
	 * 
	 * @see #setEnabled(Boolean)
	 */
	private Boolean enabled;

	/**
	 * <p>Default {@code null}</p>
	 * 
	 * @see #setCustom(JavaScriptFunction)
	 */
	private JavaScriptFunction custom;

	/**
	 * <p>Default {@code 'single'}</p>
	 * 
	 * @see #setMode(String)
	 */
	private String mode;

	/**
	 * <p>Default {@code undefined}</p>
	 * 
	 * @see #setItemSort(JavaScriptFunction)
	 */
	private JavaScriptFunction itemSort;

	/**
	 * <p>Default {@code 'rgba(0,0,0,0.8)'}</p>
	 * 
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * <p>Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}</p>
	 * 
	 * @see #setTitleFontFamily(String)
	 */
	private String titleFontFamily;

	/**
	 * <p>Default {@code 12}</p>
	 * 
	 * @see #setTitleFontSize(BigDecimal)
	 */
	private BigDecimal titleFontSize;

	/**
	 * <p>Default {@code "bold"}</p>
	 * 
	 * @see #setTitleFontStyle(String)
	 */
	private String titleFontStyle;

	/**
	 * <p>Default {@code "#fff"}</p>
	 * 
	 * @see #setTitleFontColor(Color)
	 */
	private Color titleFontColor;

	/**
	 * <p>Default {@code 2}</p>
	 * 
	 * @see #setTitleSpacing(BigDecimal)
	 */
	private BigDecimal titleSpacing;

	/**
	 * <p>Default {@code 6}</p>
	 * 
	 * @see #setTitleMarginBottom(BigDecimal)
	 */
	private BigDecimal titleMarginBottom;

	/**
	 * <p>Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}</p>
	 * 
	 * @see #setBodyFontFamily(String)
	 */
	private String bodyFontFamily;

	/**
	 * <p>Default {@code 12}</p>
	 * 
	 * @see #setBodyFontSize(BigDecimal)
	 */
	private BigDecimal bodyFontSize;

	/**
	 * <p>Default {@code "normal"}</p>
	 * 
	 * @see #setBodyFontStyle(String)
	 */
	private String bodyFontStyle;

	/**
	 * <p>Default {@code "#fff"}</p>
	 * 
	 * @see #setBodyFontColor(Color)
	 */
	private Color bodyFontColor;

	/**
	 * <p>Default {@code 2}</p>
	 * 
	 * @see #setBodySpacing(BigDecimal)
	 */
	private BigDecimal bodySpacing;

	/**
	 * <p>Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}</p>
	 * 
	 * @see #setFooterFontFamily(String)
	 */
	private String footerFontFamily;

	/**
	 * <p>Default {@code 12}</p>
	 * 
	 * @see #setFooterFontSize(BigDecimal)
	 */
	private BigDecimal footerFontSize;

	/**
	 * <p>Default {@code "bold"}</p>
	 * 
	 * @see #setFooterFontStyle(String)
	 */
	private String footerFontStyle;

	/**
	 * <p>Default {@code "#fff"}</p>
	 * 
	 * @see #setFooterFontColor(Color)
	 */
	private Color footerFontColor;

	/**
	 * <p>Default {@code 2}</p>
	 * 
	 * @see #setFooterSpacing(BigDecimal)
	 */
	private BigDecimal footerSpacing;

	/**
	 * <p>Default {@code 6}</p>
	 * 
	 * @see #setFooterMarginTop(BigDecimal)
	 */
	private BigDecimal footerMarginTop;

	/**
	 * <p>Default {@code 6}</p>
	 * 
	 * @see #setXPadding(BigDecimal)
	 */
	private BigDecimal xPadding;

	/**
	 * <p>Default {@code 6}</p>
	 * 
	 * @see #setYPadding(BigDecimal)
	 */
	private BigDecimal yPadding;

	/**
	 * <p>Default {@code 5}</p>
	 * 
	 * @see #setCaretSize(BigDecimal)
	 */
	private BigDecimal caretSize;

	/**
	 * <p>Default {@code 6}</p>
	 * 
	 * @see #setCornerRadius(BigDecimal)
	 */
	private BigDecimal cornerRadius;

	/**
	 * <p>Default {@code "#fff"}</p>
	 * 
	 * @see #setMultiKeyBackground(Color)
	 */
	private Color multiKeyBackground;

	// /**
	// * <p>Default {@code }
	// *
	// * @see #setCallbacks(Callbacks callbacks)
	// */
	// private Callbacks callbacks;

	/**
	 * @see #setEnabled(Boolean)
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
	 * @see #setCustom(JavaScriptFunction)
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
	 * @see #setMode(String)
	 */
	public String getMode() {
		return this.mode;
	}

	/**
	 * Sets which elements appear in the tooltip. Acceptable options are
	 * 'single', 'label' or 'x-axis'. single highlights the closest element.
	 * label highlights elements in all datasets at the same X value. 'x-axis'
	 * also highlights elements in all datasets at the same X value, but
	 * activates when hovering anywhere within the vertical slice of the x-axis
	 * representing that X value.
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
	 * Allows sorting of tooltip items. Must implement a function that can be
	 * passed to Array.prototype.sort
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
	 * Background color of the tooltip
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
	 * Font family for tooltip title inherited from global font family
	 */
	public void setTitleFontFamily(String titleFontFamily) {
		this.titleFontFamily = titleFontFamily;
	}

	/**
	 * @see #setTitleFontSize(BigDecimal)
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
	 * @see #setTitleFontStyle(String)
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
	 * @see #setTitleFontColor(Color)
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
	 * @see #setTitleSpacing(BigDecimal)
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
	 * @see #setTitleMarginBottom(BigDecimal)
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
	 * @see #setBodyFontFamily(String)
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
	 * @see #setBodyFontSize(BigDecimal)
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
	 * @see #setBodyFontStyle(String)
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
	 * @see #setBodyFontColor(Color)
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
	 * @see #setBodySpacing(BigDecimal)
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
	 * @see #setFooterFontFamily(String)
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
	 * @see #setFooterFontSize(BigDecimal)
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
	 * @see #setFooterFontStyle(String)
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
	 * @see #setFooterFontColor(Color)
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
	 * @see #setFooterSpacing(BigDecimal)
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
	 * @see #setFooterMarginTop(BigDecimal)
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
	 * @see #setXPadding(BigDecimal)
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
	 * @see #setYPadding(BigDecimal)
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
	 * @see #setCaretSize(BigDecimal)
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
	 * @see #setCornerRadius(BigDecimal)
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
	 * @see #setMultiKeyBackground(Color)
	 */
	public Color getMultiKeyBackground() {
		return this.multiKeyBackground;
	}

	/**
	 * Color to draw behind the colored boxes when multiple items are in the
	 * tooltip
	 */
	public void setMultiKeyBackground(Color multiKeyBackground) {
		this.multiKeyBackground = multiKeyBackground;
	}

	// /**
	// * @see #setCallbacks(Callbacks callbacks)
	// */
	// public Callbacks getCallbacks() {
	// return this.callbacks;
	// }
	//
	// /**
	// * See the callbacks section below
	// */
	// public void setCallbacks(Callbacks callbacks) {
	// this.callbacks = callbacks;
	// }

}

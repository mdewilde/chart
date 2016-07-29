package be.ceau.chart.options;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.TitlePosition;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Title {

	/**
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * @see #setPosition(TitlePosition)
	 */
	private TitlePosition position;

	/**
	 * @see #setFullWidth(Boolean)
	 */
	private Boolean fullWidth;

	/**
	 * @see #setFontSize(BigDecimal)
	 */
	private BigDecimal fontSize;

	/**
	 * @see #setFontFamily(String)
	 */
	private String fontFamily;

	/**
	 * @see #setFontColor(Color)
	 */
	private Color fontColor;

	/**
	 * @see #setFontStyle(String)
	 */
	private String fontStyle;

	/**
	 * @see #setPadding(Integer)
	 */
	private Integer padding;

	/**
	 * @see #setText(String)
	 */
	private String text;

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * <p>
	 * Display the title block
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
	 * @see #setPosition(TitlePosition)
	 */
	public TitlePosition getPosition() {
		return this.position;
	}

	/**
	 * <p>
	 * Position of the title. Only 'top' or 'bottom' are currently allowed
	 * </p>
	 * 
	 * <p>
	 * Default {@code 'top'}
	 * </p>
	 */
	public void setPosition(TitlePosition position) {
		this.position = position;
	}

	/**
	 * @see #setFullWidth(Boolean)
	 */
	public Boolean getFullWidth() {
		return this.fullWidth;
	}

	/**
	 * <p>
	 * Marks that this box should take the full width of the canvas (pushing
	 * down other boxes)
	 * </p>
	 * 
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public void setFullWidth(Boolean fullWidth) {
		this.fullWidth = fullWidth;
	}

	/**
	 * @see #setFontSize(BigDecimal)
	 */
	public BigDecimal getFontSize() {
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
	public void setFontSize(BigDecimal fontSize) {
		this.fontSize = fontSize;
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
	 * @see #setFontStyle(String)
	 */
	public String getFontStyle() {
		return this.fontStyle;
	}

	/**
	 * <p>
	 * Font styling of the title, follows CSS font-style options (i.e. normal,
	 * italic, oblique, initial, inherit).
	 * </p>
	 * TODO?!
	 * <p>
	 * Default {@code 'bold'}
	 * </p>
	 */
	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	/**
	 * @see #setPadding(Integer)
	 */
	public Integer getPadding() {
		return this.padding;
	}

	/**
	 * <p>
	 * Number of pixels to add above and below the title text
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
	 * @see #setText(String)
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * <p>
	 * Title text
	 * </p>
	 * 
	 * <p>
	 * Default {@code ""}
	 * </p>
	 */
	public void setText(String text) {
		this.text = text;
	}

}

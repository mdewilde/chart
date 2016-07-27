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
public class Legend {

	/**
	 * Is the legend displayed true
	 */
	private Boolean display;

	/**
	 * Position of the legend. Options are 'top' or 'bottom' 'top'
	 */
	private String position;

	/**
	 * Marks that this box should take the full width of the canvas (pushing
	 * down other boxes) true
	 */
	private Boolean fullWidth;

	/**
	 * A callback that is called when a click is registered on top of a label
	 * item function(event, legendItem) {}
	 */
	private JavaScriptFunction onClick;

	/**
	 * See the Legend Label Configuration section below. -
	 */
	private Labels labels;

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getFullWidth() {
		return fullWidth;
	}

	public void setFullWidth(Boolean fullWidth) {
		this.fullWidth = fullWidth;
	}

	public JavaScriptFunction getOnClick() {
		return onClick;
	}

	public void setOnClick(JavaScriptFunction onClick) {
		this.onClick = onClick;
	}

	public Labels getLabels() {
		return labels;
	}

	public void setLabels(Labels labels) {
		this.labels = labels;
	}

	public static class Labels {

		/**
		 * Width of coloured box 40
		 */
		private BigDecimal boxWidth;

		/**
		 * Font size inherited from global configuration 12
		 */
		private BigDecimal fontSize;

		/**
		 * Font style inherited from global configuration "normal"
		 */
		private String fontStyle;

		/**
		 * Font color inherited from global configuration "#666"
		 */
		private Color fontColor;

		/**
		 * Font family inherited from global configuration
		 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
		 */
		private String fontFamily;

		/**
		 * Padding between rows of colored boxes 10
		 */
		private BigDecimal padding;

		/**
		 * Generates legend items for each thing in the legend. Default
		 * implementation returns the text + styling for the color box. See
		 * Legend Item for details. function(chart) { }
		 */
		private JavaScriptFunction generateLabels;

		/**
		 * Label style will match corresponding point style (size is based on
		 * fontSize, boxWidth is not used in this case). false
		 */
		private Boolean usePointStyle;

		public BigDecimal getBoxWidth() {
			return boxWidth;
		}

		public void setBoxWidth(BigDecimal boxWidth) {
			this.boxWidth = boxWidth;
		}

		public BigDecimal getFontSize() {
			return fontSize;
		}

		public void setFontSize(BigDecimal fontSize) {
			this.fontSize = fontSize;
		}

		public String getFontStyle() {
			return fontStyle;
		}

		public void setFontStyle(String fontStyle) {
			this.fontStyle = fontStyle;
		}

		public Color getFontColor() {
			return fontColor;
		}

		public void setFontColor(Color fontColor) {
			this.fontColor = fontColor;
		}

		public String getFontFamily() {
			return fontFamily;
		}

		public void setFontFamily(String fontFamily) {
			this.fontFamily = fontFamily;
		}

		public BigDecimal getPadding() {
			return padding;
		}

		public void setPadding(BigDecimal padding) {
			this.padding = padding;
		}

		public JavaScriptFunction getGenerateLabels() {
			return generateLabels;
		}

		public void setGenerateLabels(JavaScriptFunction generateLabels) {
			this.generateLabels = generateLabels;
		}

		public Boolean getUsePointStyle() {
			return usePointStyle;
		}

		public void setUsePointStyle(Boolean usePointStyle) {
			this.usePointStyle = usePointStyle;
		}

	}
	
}

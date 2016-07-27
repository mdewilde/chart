package be.ceau.chart.options.scales;

import be.ceau.chart.JavaScriptFunction;
import be.ceau.chart.color.Color;

public class PointLabels {

	/**
	 * 
	 * Callback function to transform data label to axis label -
	 */
	private JavaScriptFunction callback;

	/**
	 * 
	 * Font color '#666'
	 */
	private Color fontColor;

	/**
	 * 
	 * Font family to render
	 * "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 */
	private String fontFamily;

	/**
	 * 
	 * Font size in pixels 10
	 */
	private Number fontSize;

	/**
	 * 
	 * Font Style to use 'normal'
	 */
	private String fontStyle;
}

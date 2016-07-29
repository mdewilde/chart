package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Legend {

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * Default {@code 'top'}
	 * 
	 * @see #setPosition(String)
	 */
	private String position;

	/**
	 * Default {@code true}
	 * 
	 * @see #setFullWidth(Boolean)
	 */
	private Boolean fullWidth;

	/**
	 * Default {@code function(event, legendItem) {}}
	 * 
	 * @see #setOnClick(JavaScriptFunction)
	 */
	private JavaScriptFunction onClick;

	/**
	 * Default {@code -}
	 * 
	 * @see #setLabels(LegendLabels)
	 */
	private LegendLabels labels;

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
	    return this.display;
	}

	/**
	 * Is the legend displayed
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setPosition(String)
	 */
	public String getPosition() {
	    return this.position;
	}

	/**
	 * Position of the legend. Options are 'top' or 'bottom'
	 */
	public void setPosition(String position) {
	    this.position = position;
	}

	/**
	 * @see #setFullWidth(Boolean)
	 */
	public Boolean getFullWidth() {
	    return this.fullWidth;
	}

	/**
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 */
	public void setFullWidth(Boolean fullWidth) {
	    this.fullWidth = fullWidth;
	}

	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick() {
	    return this.onClick;
	}

	/**
	 * A callback that is called when a click is registered on top of a label item
	 */
	public void setOnClick(JavaScriptFunction onClick) {
	    this.onClick = onClick;
	}

	/**
	 * @see #setLabels(LegendLabels)
	 */
	public LegendLabels getLabels() {
	    return this.labels;
	}

	/**
	 * See the Legend Label Configuration section below.
	 */
	public void setLabels(LegendLabels labels) {
	    this.labels = labels;
	}
	
}

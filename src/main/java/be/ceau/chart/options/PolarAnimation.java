package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PolarAnimation extends Animation {

	/**
	 * Default {@code true}
	 * 
	 * @see #setAnimateRotate(Boolean)
	 */
	private Boolean animateRotate;

	/**
	 * Default {@code true}
	 * 
	 * @see #setAnimateScale(Boolean)
	 */
	private Boolean animateScale;

	/**
	 * @see #setAnimateRotate(Boolean animation.animateRotate)
	 */
	public Boolean getAnimateRotate() {
	    return this.animateRotate;
	}

	/**
	 * If true, will animate the rotation of the chart.
	 */
	public void setAnimateRotate(Boolean animateRotate) {
	    this.animateRotate = animateRotate;
	}

	/**
	 * @see #setAnimateScale(Boolean)
	 */
	public Boolean getAnimateScale() {
	    return this.animateScale;
	}

	/**
	 * If true, will animate scaling the chart.
	 */
	public void setAnimateScale(Boolean animateScale) {
	    this.animateScale = animateScale;
	}

}

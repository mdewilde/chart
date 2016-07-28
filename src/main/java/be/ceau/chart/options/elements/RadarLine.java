package be.ceau.chart.options.elements;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarLine extends Line {

	/**
	 * Default {@code 0}
	 * 
	 * @see #setLineTension(BigDecimal)
	 */
	private BigDecimal lineTension;

	/**
	 * @see #setLineTension(BigDecimal)
	 */
	public BigDecimal getLineTension() {
		return lineTension;
	}

	/**
	 * Tension exhibited by lines when calculating splineCurve. Setting to 0 creates straight lines
	 */
	public void setLineTension(BigDecimal lineTension) {
		this.lineTension = lineTension;
	} 	
	

}

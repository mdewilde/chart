package be.ceau.chart.data;

import java.math.BigDecimal;

public class BubbleDataPoint {

	// X Value
	private BigDecimal x;

	// Y Value
	private BigDecimal y;

	// Radius of bubble. This is not scaled.
	private BigDecimal r;

	public BigDecimal getX() {
		return x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	public BigDecimal getR() {
		return r;
	}

	public void setR(BigDecimal r) {
		this.r = r;
	}

}

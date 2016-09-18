/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.datapoint;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BubbleDataPoint {

	/**
	 * @see #setX(BigDecimal)
	 */
	private BigDecimal x;

	/**
	 * @see #setY(BigDecimal)
	 */
	private BigDecimal y;

	/**
	 * @see #setR(BigDecimal)
	 */
	private BigDecimal r;

	public BubbleDataPoint() {
	}

	public BubbleDataPoint(BigDecimal x, BigDecimal y, BigDecimal r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	/**
	 * @see #setX(BigDecimal)
	 */
	public BigDecimal getX() {
		return x;
	}

	/**
	 * X Value
	 */
	public void setX(int x) {
		this.x = new BigDecimal(x);
	}
	
	/**
	 * X Value
	 */
	public void setX(double x) {
		this.x = new BigDecimal(String.valueOf(x));
	}
	
	/**
	 * X Value
	 */
	public void setX(BigDecimal x) {
		this.x = x;
	}

	/**
	 * @see #setY(BigDecimal)
	 */
	public BigDecimal getY() {
		return y;
	}

	/**
	 * @see #setY(BigDecimal)
	 */
	public void setY(int y) {
		this.y = new BigDecimal(y);
	}

	/**
	 * @see #setY(BigDecimal)
	 */
	public void setY(double y) {
		this.y = new BigDecimal(String.valueOf(y));
	}

	/**
	 * Y Value
	 */
	public void setY(BigDecimal y) {
		this.y = y;
	}

	/**
	 * @see #setR(BigDecimal)
	 */
	public BigDecimal getR() {
		return r;
	}

	/**
	 * @see #setR(BigDecimal)
	 */
	public void setR(double r) {
		this.r = new BigDecimal(String.valueOf(r));
	}

	/**
	 * Radius of bubble
	 */
	public void setR(BigDecimal r) {
		this.r = r;
	}

}

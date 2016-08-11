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
package be.ceau.chart.dataset;

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

	/**
	 * @see #setX(BigDecimal)
	 */
	public BigDecimal getX() {
		return x;
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
	 * Radius of bubble
	 */
	public void setR(BigDecimal r) {
		this.r = r;
	}

}

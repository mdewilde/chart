/*
	Copyright 2017 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart;

public interface Chart {

	/**
	 * @return type of this Chart implementation for proper drawing in
	 *         JavaScript.
	 */
	public String getType();

	/**
	 * <p>
	 * Convert {@code this} instance to Json for use with Chart.js library.
	 * </p>
	 * 
	 * @return json representation of {@code this} {@link Chart}
	 */
	public String toJson();

	/**
	 * <p>
	 * Optional check to determine whether the current state of {@code this}
	 * object will generate a drawable JSON string.
	 * </p>
	 * 
	 * @return true if {@code this} component is drawable in its current state
	 */
	public boolean isDrawable();

}

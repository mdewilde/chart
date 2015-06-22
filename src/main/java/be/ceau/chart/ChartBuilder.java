/*
	Copyright 2015 Marceau Dewilde <m@ceau.be>

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

import java.math.BigDecimal;

import be.ceau.chart.color.Colors;
import be.ceau.chart.options.Options;

/**
 * Builder for Chart instances.
 */
public interface ChartBuilder {

	/**
	 * Add a single datapoint with corresponding label to the chart (in the current series, if applicable)
	 */
	public ChartBuilder addData(String label, BigDecimal value);

	/**
	 * Sets the Options for the target Chart
	 * @throws IllegalArgumentException if Options argument is null or not of a type compatible with Chart.Type used to create this ChartBuilder
	 */
	public ChartBuilder setOptions(Options options);
	
	/**
	 * For those charttypes that allow multiple series, a call to this method will start that new series. Otherwise, the call is a no-op.
	 */
	public ChartBuilder newSeries(String name, Colors colors);
	
	/**
	 * @return a valid, serializable Chart.
	 * @throws IllegalArgumentException if a precondition is not met
	 */
	public Chart build();

}

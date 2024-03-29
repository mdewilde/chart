/*
	Copyright 2023 Marceau Dewilde <m@ceau.be>

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
/**
 * <p>
 * Scales in v2.0 of Chart.js are significantly more powerful, but also
 * different than those of v1.0.
 * </p>
 * <ul>
 * <li>Multiple X and Y axes are supported.
 * <li>A built-in label auto-skip feature detects would-be overlapping ticks and
 * labels and removes every nth label to keep things displaying normally.
 * <li>Scale titles are supported
 * <li>New scale types can be extended without writing an entirely new chart
 * type
 * </ul>
 */
package be.ceau.chart.options.scales;
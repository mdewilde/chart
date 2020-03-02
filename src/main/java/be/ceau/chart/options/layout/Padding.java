/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.options.layout;

public class Padding {

	private int left;
	private int right;
	private int top;
	private int bottom;

	public int getLeft() {
		return left;
	}

	public Padding setLeft(int left) {
		this.left = left;
		return this;
	}

	public int getRight() {
		return right;
	}

	public Padding setRight(int right) {
		this.right = right;
		return this;
	}

	public int getTop() {
		return top;
	}

	public Padding setTop(int top) {
		this.top = top;
		return this;
	}

	public int getBottom() {
		return bottom;
	}

	public Padding setBottom(int bottom) {
		this.bottom = bottom;
		return this;
	}

}

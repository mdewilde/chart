/*
	Copyright 2018 Tomáš Jochec

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
package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.javascript.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Callbacks {

	/**
	 * @see #setBeforeTitle(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeTitle;

	/**
	 * @see #setTitle(JavaScriptFunction)
	 */
	private JavaScriptFunction title;

	/**
	 * @see #setAfterTitle(JavaScriptFunction)
	 */
	private JavaScriptFunction afterTitle;

	/**
	 * @see #setBeforeBody(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeBody;

	/**
	 * @see #setBeforeLabel(JavaScriptFunction)
	 */
	private JavaScriptFunction beforeLabel;

	/**
	 * @see #setLabel(JavaScriptFunction)
	 */
	private JavaScriptFunction label;

	/**
	 * @see #setLabelColor(JavaScriptFunction)
	 */
	private JavaScriptFunction labelColor;

	/**
	 * @see #setLabelTextColor(JavaScriptFunction)
	 */
	private JavaScriptFunction labelTextColor;

	/**
	 * @see #setAfterLabel(JavaScriptFunction)
	 */
	private JavaScriptFunction afterLabel;

	/**
	 * @see #setAfterBody(JavaScriptFunction)
	 */
	private JavaScriptFunction afterBody;

	/**
	 * @see #beforeFooter
	 */
	private JavaScriptFunction beforeFooter;

	/**
	 * @see #setFooter(JavaScriptFunction)
	 */
	private JavaScriptFunction footer;

	/**
	 * @see #setAfterFooter(JavaScriptFunction)
	 */
	private JavaScriptFunction afterFooter;

	/**
	 * @see #setBeforeTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeTitle() {
		return beforeTitle;
	}

	/**
	 * <p>
	 * Returns the text to render before the title.
	 * </p>
	 */
	public Callbacks setBeforeTitle(JavaScriptFunction beforeTitle) {
		this.beforeTitle = beforeTitle;
		return this;
	}

	/**
	 * @see #setTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getTitle() {
		return title;
	}

	/**
	 * <p>
	 * Returns text to render as the title of the tooltip.
	 * </p>
	 */
	public Callbacks setTitle(JavaScriptFunction title) {
		this.title = title;
		return this;
	}

	/**
	 * @see #setAfterTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterTitle() {
		return afterTitle;
	}

	/**
	 * <p>
	 * Returns text to render after the title.
	 * </p>
	 */
	public Callbacks setAfterTitle(JavaScriptFunction afterTitle) {
		this.afterTitle = afterTitle;
		return this;
	}

	/**
	 * @see #setBeforeBody(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeBody() {
		return beforeBody;
	}

	/**
	 * <p>
	 * Returns text to render before the body section.
	 * </p>
	 */
	public Callbacks setBeforeBody(JavaScriptFunction beforeBody) {
		this.beforeBody = beforeBody;
		return this;
	}

	/**
	 * @see #setBeforeLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeLabel() {
		return beforeLabel;
	}

	/**
	 * <p>
	 * Returns text to render before an individual label.
	 * This will be called for each item in the tooltip.
	 * </p>
	 */
	public Callbacks setBeforeLabel(JavaScriptFunction beforeLabel) {
		this.beforeLabel = beforeLabel;
		return this;
	}

	/**
	 * @see #setLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabel() {
		return label;
	}

	/**
	 * <p>
	 * Returns text to render for an individual item in the tooltip.
	 * </p>
	 */
	public Callbacks setLabel(JavaScriptFunction label) {
		this.label = label;
		return this;
	}

	/**
	 * @see #setLabelColor(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabelColor() {
		return labelColor;
	}

	/**
	 * <p>
	 * Returns the colors to render for the tooltip item.
	 * </p>
	 */
	public Callbacks setLabelColor(JavaScriptFunction labelColor) {
		this.labelColor = labelColor;
		return this;
	}

	/**
	 * @see #setLabelTextColor(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabelTextColor() {
		return labelTextColor;
	}

	/**
	 * <p>
	 * Returns the colors for the text of the label for the tooltip item.
	 * </p>
	 */
	public Callbacks setLabelTextColor(JavaScriptFunction labelTextColor) {
		this.labelTextColor = labelTextColor;
		return this;
	}

	/**
	 * @see #setAfterLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterLabel() {
		return afterLabel;
	}

	/**
	 * <p>
	 * Returns text to render after an individual label.
	 * </p>
	 */
	public Callbacks setAfterLabel(JavaScriptFunction afterLabel) {
		this.afterLabel = afterLabel;
		return this;
	}

	/**
	 * @see #setAfterBody(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterBody() {
		return afterBody;
	}

	/**
	 * <p>
	 * Returns text to render after the body section.
	 * </p>
	 */
	public Callbacks setAfterBody(JavaScriptFunction afterBody) {
		this.afterBody = afterBody;
		return this;
	}

	/**
	 * @see #setBeforeFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeFooter() {
		return beforeFooter;
	}

	/**
	 * <p>
	 * Returns text to render before the footer section.
	 * </p>
	 */
	public Callbacks setBeforeFooter(JavaScriptFunction beforeFooter) {
		this.beforeFooter = beforeFooter;
		return this;
	}

	/**
	 * @see #setFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getFooter() {
		return footer;
	}

	/**
	 * <p>
	 * Returns text to render as the footer of the tooltip.
	 * </p>
	 */
	public Callbacks setFooter(JavaScriptFunction footer) {
		this.footer = footer;
		return this;
	}

	/**
	 * @see #setAfterFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterFooter() {
		return afterFooter;
	}

	/**
	 * <p>
	 * Text to render after the footer section.
	 * </p>
	 */
	public Callbacks setAfterFooter(JavaScriptFunction afterFooter) {
		this.afterFooter = afterFooter;
		return this;
	}
}

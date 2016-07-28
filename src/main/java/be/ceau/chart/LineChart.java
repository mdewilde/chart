package be.ceau.chart;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import be.ceau.chart.data.LineData;
import be.ceau.chart.options.LineOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineChart implements Chart {

	private LineData data;

	private LineOptions options;

	public LineChart() {}

	public LineChart(LineData data, LineOptions options) {
		this.data = data;
		this.options = options;
	}

	@Override
	@JsonProperty
	public String getType() {
		return "line";
	}

	public LineData getData() {
		return data;
	}

	public void setData(LineData data) {
		this.data = data;
	}

	public LineOptions getOptions() {
		return options;
	}

	public void setOptions(LineOptions options) {
		this.options = options;
	}

}

package be.ceau.chart;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.LineData;
import be.ceau.chart.options.LineOptions;

/*
	var myLineChart = new Chart(ctx, {
	    type: 'line',
	    data: { labels: ["January", "February", "March", "April", "May", "June", "July"],
			    datasets: [
			        {
			            label: "My First dataset",
			            fill: false,
			            lineTension: 0.1,
			            backgroundColor: "rgba(75,192,192,0.4)",
			            borderColor: "rgba(75,192,192,1)",
			            borderCapStyle: 'butt',
			            borderDash: [],
			            borderDashOffset: 0.0,
			            borderJoinStyle: 'miter',
			            pointBorderColor: "rgba(75,192,192,1)",
			            pointBackgroundColor: "#fff",
			            pointBorderWidth: 1,
			            pointHoverRadius: 5,
			            pointHoverBackgroundColor: "rgba(75,192,192,1)",
			            pointHoverBorderColor: "rgba(220,220,220,1)",
			            pointHoverBorderWidth: 2,
			            pointRadius: 1,
			            pointHitRadius: 10,
			            data: [65, 59, 80, 81, 56, 55, 40],
			            spanGaps: false,
			        }
			    ]
		},
	    options: { scales: {
	            xAxes: [{
	                display: false
	            }]
        	}
    	}
	});
 */

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineChart implements Chart {

	private final String type = "line";
	
	private LineData data;

	private LineOptions options;

	public LineChart() {}

	public LineChart(LineData data, LineOptions options) {
		this.data = data;
		this.options = options;
	}

	@Override
	public String getType() {
		return type;
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

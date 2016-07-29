package be.ceau.chart;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.BarData;
import be.ceau.chart.options.BarOptions;

/*
	var myBarChart = new Chart(ctx, {
	    type: 'bar',
	    data: {	labels: ["January", "February", "March", "April", "May", "June", "July"],
			    datasets: [
			        {
			            label: "My First dataset",
			            backgroundColor: [
			                'rgba(255, 99, 132, 0.2)',
			                'rgba(54, 162, 235, 0.2)',
			                'rgba(255, 206, 86, 0.2)',
			                'rgba(75, 192, 192, 0.2)',
			                'rgba(153, 102, 255, 0.2)',
			                'rgba(255, 159, 64, 0.2)'
			            ],
			            borderColor: [
			                'rgba(255,99,132,1)',
			                'rgba(54, 162, 235, 1)',
			                'rgba(255, 206, 86, 1)',
			                'rgba(75, 192, 192, 1)',
			                'rgba(153, 102, 255, 1)',
			                'rgba(255, 159, 64, 1)'
			            ],
			            borderWidth: 1,
			            data: [65, 59, 80, 81, 56, 55, 40],
			        }
			    ]
			},
		options: {
	        scales: {
	                xAxes: [{
	                        stacked: true
	                }],
	                yAxes: [{
	                        stacked: true
	                }]
	            }
	        }
    }
 */
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarChart implements Chart {

	private final String type = "bar";

	private BarData data;

	private BarOptions options;

	@Override
	public String getType() {
		return type;
	}

	public BarData getData() {
		return data;
	}

	public void setData(BarData data) {
		this.data = data;
	}

	public BarOptions getOptions() {
		return options;
	}

	public void setOptions(BarOptions options) {
		this.options = options;
	}

}

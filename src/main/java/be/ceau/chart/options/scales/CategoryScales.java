package be.ceau.chart.options.scales;

/**
 * The category scale will be familiar to those who have used v1.0. Labels are
 * drawn from one of the label arrays included in the chart data. If only
 * data.labels is defined, this will be used. If data.xLabels is defined and the
 * axis is horizontal, this will be used. Similarly, if data.yLabels is defined
 * and the axis is vertical, this property will be used. Using both xLabels and
 * yLabels together can create a chart that uses strings for both the X and Y
 * axes.
 */
public class CategoryScales extends Scales {
	
	private CategoryTicks ticks;

	@Override
	public String getType() {
		return "category";
	}

	@Override
	public Ticks getTicks() {
		return ticks;
	}

	public void setTicks(CategoryTicks ticks) {
		this.ticks = ticks;
	}

}

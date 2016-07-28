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
package be.ceau.chart.v1;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import be.ceau.chart.v1.data.Data;
import be.ceau.chart.v1.data.DataPointData;
import be.ceau.chart.v1.data.DataSetData;
import be.ceau.chart.v1.options.BarOptions;
import be.ceau.chart.v1.options.DoughnutOptions;
import be.ceau.chart.v1.options.LineOptions;
import be.ceau.chart.v1.options.Options;
import be.ceau.chart.v1.options.PieOptions;
import be.ceau.chart.v1.options.PolarOptions;
import be.ceau.chart.v1.options.RadarOptions;

@JsonInclude(Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class Chart {

	private static final ObjectWriter CHART_WRITER = new ObjectMapper().writerWithDefaultPrettyPrinter().forType(Chart.class);

	@JsonProperty
	private final Type type;
	
	@JsonProperty
	private final Data data;
	
	@JsonProperty
	private final Options options;

	/**
	 * Create a new ChartBuilder for building a Chart of the given type.
	 */
	public static ChartBuilder builder(Chart.Type chartType) {
		if (chartType == null) {
			throw new IllegalArgumentException("Chart.Type argument can not be null");
		}
		if (Chart.Type.DATA_POINT_CHARTS.contains(chartType)) {
			return new DataPointChartBuilder(chartType);
		} else if (Chart.Type.DATA_SET_CHARTS.contains(chartType)) {
			return new DataSetChartBuilder(chartType);
		} else {
			throw new UnsupportedOperationException("no ChartBuilder implementation registered for Chart.Type " + chartType.toString());
		}
	}

	/**
	 * Create a new ChartBuilder for building a chart with the given Options.
	 */
	public static ChartBuilder builder(Options options) {
		if (options == null) {
			throw new IllegalArgumentException("Options argument can not be null");
		}
		Chart.Type type = Chart.Type.lookup(options);
		if (type == null) {
			throw new UnsupportedOperationException("no corresponding Chart Type found for Options argument of class " + options.getClass());
		}
		if (Chart.Type.DATA_POINT_CHARTS.contains(type)) {
			return new DataPointChartBuilder(type, options);
		} else if (Chart.Type.DATA_SET_CHARTS.contains(type)) {
			return new DataSetChartBuilder(type, options);
		} else {
			throw new UnsupportedOperationException("no ChartBuilder implementation registered for Chart.Type " + type.toString());
		}
	}

	Chart(Chart.Type type, Data data, Options options) {
		if (type == null) {
			throw new IllegalArgumentException("Chart.Type argument can not be null");
		}
		if (data == null) {
			throw new IllegalArgumentException("Data argument can not be null");
		}
		if (options == null) {
			throw new IllegalArgumentException("Options argument can not be null");
		}
		if (!type.isCompatible(data)) {
			throw new IllegalArgumentException("Data object is not of proper class");
		}
		if (!type.isCompatible(options)) {
			throw new IllegalArgumentException("Options object is not of proper class");
		}
		this.type = type;
		this.data = data;
		this.options = options;
	}

	public static enum Type {

		BAR(DataSetData.class, BarOptions.class), DOUGHNUT(DataPointData.class, DoughnutOptions.class), LINE(DataSetData.class, LineOptions.class), PIE(DataPointData.class, PieOptions.class), POLAR(DataPointData.class, PolarOptions.class), RADAR(DataSetData.class, RadarOptions.class);

		private final Class<? extends Data> dataClass;
		private final Class<? extends Options> optionsClass;

		private Type(Class<? extends Data> dataClass, Class<? extends Options> optionsClass) {
			this.dataClass = dataClass;
			this.optionsClass = optionsClass;
		}

		public boolean isCompatible(Data data) {
			if (data == null) {
				return false;
			} else {
				return this.dataClass.isAssignableFrom(data.getClass());
			}
		}

		public boolean isCompatible(Options options) {
			if (options == null) {
				return false;
			} else {
				return this.optionsClass.isAssignableFrom(options.getClass());
			}
		}

		private static final Set<Chart.Type> DATA_SET_CHARTS;
		private static final Set<Chart.Type> DATA_POINT_CHARTS;

		private static final Map<Class<? extends Options>, Chart.Type> OPTIONS_CLASSES;

		static {
			Map<Class<? extends Options>, Chart.Type> optionsClasses = new HashMap<Class<? extends Options>, Chart.Type>();
			for (Type type : Type.values()) {
				optionsClasses.put(type.optionsClass, type);
			}
			OPTIONS_CLASSES = Collections.unmodifiableMap(optionsClasses);
			DATA_SET_CHARTS = Collections.unmodifiableSet(EnumSet.of(LINE, BAR, RADAR));
			DATA_POINT_CHARTS = Collections.unmodifiableSet(EnumSet.of(DOUGHNUT, PIE, POLAR));
		}

		private static Type lookup(Options options) {
			if (options == null) {
				return null;
			}
			return OPTIONS_CLASSES.get(options.getClass());
		}

	}

	/**
	 * @return Type the enumType for this Chart
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @return String serialized type of this Chart
	 */
	@JsonGetter("type")
	public String getSerializedType() {
		return type.name().toLowerCase();
	}

	/**
	 * @return Data the Data object for this Chart
	 */
	public Data getData() {
		return data;
	}

	/**
	 * @return Options the Options object for this Chart
	 */
	public Options getOptions() {
		return options;
	}

	@Override
	public String toString() {
		return toJSON();
	}

	public String toJSON() {
		try {
			return CHART_WRITER.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

}
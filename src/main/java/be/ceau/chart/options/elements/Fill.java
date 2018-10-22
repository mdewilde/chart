package be.ceau.chart.options.elements;

import be.ceau.chart.enums.FillMode;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <p>
 * Option on the dataset object which can be used to create area between two datasets or a dataset and a boundary.
 * </p>
 */
public class Fill<T> {
    @JsonValue
    private T fill;

    /**
     * @param fill - If true, fill the area under the line
     */
    public Fill(Boolean fill) {
        this.fill = (T) fill;
    }

    /**
     * @param index - Absolute dataset index
     */
    public Fill(String index) {
        this.fill = (T) index;
    }

    /**
     *
     * @param index - Relative dataset index
     */
    public Fill(Integer index) {
        this.fill = (T) index;
    }

    /**
     * @param boundary
     */
    public Fill(FillMode boundary) {
        this.fill = (T) boundary;
    }
}

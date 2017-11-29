package de.neemann.digital.core;

import static de.neemann.digital.core.ObservableValue.getHexString;

/**
 * Represents a copy of a value.
 * Call {@link ObservableValue#getCopy()} to obtain a value.
 */
public class Value {
    private final long value;
    private final boolean highZ;
    private final int bits;

    Value(ObservableValue observableValue) {
        value = observableValue.getValue();
        highZ = observableValue.isHighZ();
        bits = observableValue.getBits();
    }

    /**
     * @return true if value is in high z state
     */
    public boolean isHighZ() {
        return highZ;
    }

    /**
     * @return the signals value
     */
    public long getValue() {
        return value;
    }

    /**
     * @return a bool value
     */
    public boolean getBool() {
        return value != 0;
    }

    /**
     * @return the number of bits
     */
    public int getBits() {
        return bits;
    }

    /**
     * returns the actual value as a string
     *
     * @return the value as string
     */
    public String getValueString() {
        if (highZ)
            return "?";
        else {
            return getHexString(value);
        }
    }

}
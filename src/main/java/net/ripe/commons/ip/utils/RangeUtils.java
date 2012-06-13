package net.ripe.commons.ip.utils;

public final class RangeUtils {

    private RangeUtils() {
    }

    public static <T extends Comparable<T>> T rangeCheck(T value, T begin, T end) {
        if (value.compareTo(begin) >= 0 && value.compareTo(end) <= 0) {
            return value;
        }
        throw new IllegalArgumentException("Value out of range: [" + value + "]");
    }
}

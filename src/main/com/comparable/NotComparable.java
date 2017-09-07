package com.comparable;

public class NotComparable implements Comparable{

    private int i;

    public NotComparable(final int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Object o) {
        return this.i < ((NotComparable) o).i? -1 : 1;
    }
}

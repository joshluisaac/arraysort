package com.sorting.components;

public interface IMergeSort extends InstrumentationSort {

    public int calculateMidPoint(int[] arr);
    abstract int[] constructRightArray(int midPoint, int[] arr);
    public int[] loadRightArray(int[] right, int[] arr);
    public int[] loadLeftArray(int midPoint, int[] left, int[] arr);
    public int[] merge(int[] leftArr, int[] rightArr);

}

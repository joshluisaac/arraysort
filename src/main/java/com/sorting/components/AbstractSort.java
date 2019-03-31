package com.sorting.components;

import com.sorting.model.SortResponse;

import java.util.Arrays;

public abstract class AbstractSort implements InstrumentationSort {

    public int count;

    public AbstractSort() {
        System.out.println("running this");
    }

    public SortResponse execute(int[] arr){
        final long startTime = System.currentTimeMillis();
        final int[] result = sort(arr);
        final long endTime = System.currentTimeMillis();
        final long runningTime = endTime - startTime;
        return new SortResponse(count, Arrays.toString(result),runningTime+" ms",arr.length);
    }

}

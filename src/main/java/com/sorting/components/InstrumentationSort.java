package com.sorting.components;

import com.sorting.model.SortResponse;

public interface InstrumentationSort {

    int[]  sort(int[] arr);
    public SortResponse execute(int[] arr);
}

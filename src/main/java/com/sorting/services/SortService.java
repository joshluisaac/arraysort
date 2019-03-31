package com.sorting.services;

import com.sorting.components.InstrumentationSort;
import com.sorting.model.SortResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SortService {

    @Autowired
    @Qualifier("MergeSort")
    InstrumentationSort sort;


    public SortResponse execute(int[] arr){
        return sort.execute(arr);
    }
}

package com.sorting.services;

import com.sorting.components.InstrumentationSort;
import com.sorting.model.SortResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * A service layer for handling sort operations.
 *
 * @author Joshua Nwankwo
 * @version 1.0
 * @since March 2019
 */

@Service
public class SortService {

    InstrumentationSort sort;

    @Autowired
    public SortService(@Qualifier("MergeSort") InstrumentationSort sort){
        this.sort = sort;
    }


    public SortResponse execute(int[] arr){
        return sort.execute(arr);
    }
}

package com.sorting;

import com.sorting.components.InsertionSort;
import com.sorting.components.MergeSort;
import com.sorting.model.SortResponse;
import com.sorting.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SortingApplicationCli {

    private static final Logger LOG = LoggerFactory.getLogger(SortingApplicationCli.class);


    public static void main(String[] args) {
        //MergeSort sort = new MergeSort();
        InsertionSort sort = new InsertionSort();
        SortResponse response = sort.execute(new int[]{7, 3, 1, 2, 4, 5, 6,9,6,6,7,3,8,9,0,0,5,7,82,-1});
        System.out.println(new JsonUtils().toJson(response));


        LOG.info("Array size: {}",response.getArraySize());
        LOG.info("Minimum iterations: {}",response.getCount());
        LOG.info("Sorted result: {}",response.getSortResult());
        LOG.info("Running time: {}", response.getRunningTime());
    }

}

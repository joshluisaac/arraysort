package com.sorting.components;


import com.sorting.model.SortResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InsertionSort extends AbstractSort implements InstrumentationSort {

    private static Logger LOG = LoggerFactory.getLogger(InsertionSort.class);
    private int count = -1;

    /**
     * Implemented using recursion for elegance and readability.
     * A case for recursion is made in the following stackoverflow links
     *
     * @see <a href="https://softwareengineering.stackexchange.com/questions/242889/">Question 242889</a>
     *
     * It swaps the position of items in an array until a sorted state is attained.
     * It does this by holding the value of the current index in a cache (currVal) and then replaces that
     * with the previous and vice-versa provided the swap rule is satisfied.
     *
     * @param arr the array to be sorted
     * @param index the current index
     */
    void swapUntilSortedState(int[] arr, int index) {
        if (index == 0) return;
        if (arr[index] < arr[index - 1]) {
            int currVal = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = currVal;
            swapUntilSortedState(arr, index - 1);
        }
    }

    /**
     * Sorts an array in-place starting from the second item in the array.
     * The {@link InsertionSort#swapUntilSortedState(int[], int)}
     * is called when current value is less than the previous.
     *
     * @param arr the array to be sorted
     */
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currVal = arr[i];
            int prevVal = arr[i - 1];
            count++;
            //if the current item is greater than the previous then call swap method.
            if ((currVal < prevVal)) swapUntilSortedState(arr, i);
        }
        return arr;
    }

    /**
     * A forwarding method which overrides the behaviour of the
     * parent abstract method in an attempt to set the number of iterations.
     *
     * @param arr raw input array
     * @return returns {@link SortResponse} which contains a bunch of properties
     */
    @Override
    public SortResponse execute(int[] arr){
        SortResponse response = super.execute(arr);
        response.setCount(count);
        return response;
    }
}

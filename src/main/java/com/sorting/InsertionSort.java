package com.sorting;

import java.util.Arrays;

public class InsertionSort implements InstrumentationSort {

    static void swapUntilSortedState(int[] arr, int index) {
        if (index == 0) return;
        if (arr[index] < arr[index - 1]) {
            //hold currVal in a temp cache
            int currVal = arr[index];

            //swap current for previous
            arr[index] = arr[index - 1];

            //swap previous for current
            arr[index - 1] = currVal;

            System.out.println(Arrays.toString(arr));

            swapUntilSortedState(arr, index - 1);
        }
    }


    @Override
    public void sort(int[] arr) {
        //start iterating from the second element in the list
        for (int i = 1; i < arr.length; i++) {
            int currVal = arr[i];
            int prevVal = arr[i - 1];
            System.out.println("Iteration [" + i + "] ");
            //if the current item is greater than the previous then call swap method.
            if ((currVal < prevVal)) swapUntilSortedState(arr, i);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
        new InsertionSort().sort(arr);
    }
}

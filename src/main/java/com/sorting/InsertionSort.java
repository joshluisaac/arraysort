package com.sorting;

import java.util.Arrays;

public class InsertionSort implements InstrumentationSort {

    /**
     * Using recursion, it swaps the position of items in an array until a sorted state is attained.
     * It does this by holding the value of the current index in a cache (currVal) and then replaces that
     * with the previous and vice-versa provided the swap rule is satisfied.
     *
     * @param arr   the array to be sorted
     * @param index the current index
     */
    void swapUntilSortedState(int[] arr, int index) {
        if (index == 0) return;
        if (arr[index] < arr[index - 1]) {
            int currVal = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = currVal;
            System.out.println(Arrays.toString(arr));
            swapUntilSortedState(arr, index - 1);
        }
    }


    /**
     * Sorts an arry in-place starting from the second item in the array.
     * The {@link InsertionSort#swapUntilSortedState(int[], int)}
     * is called when current value is less than the previous.
     *
     * @param arr the array to be sorted
     */
    @Override
    public void sort(int[] arr) {
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

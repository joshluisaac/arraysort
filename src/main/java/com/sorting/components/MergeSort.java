package com.sorting.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MergeSort implements InstrumentationSort {

    private static Logger LOG = LoggerFactory.getLogger(MergeSort.class);

    int count = 0;

    /**
     * Populates the left fragment of the array with left elements from the parent array.
     *
     * @param midPoint the midpoint
     * @param left left array fragment
     * @param arr the parent array
     * @return resultant left array
     */
    int[] loadLeftArray(int midPoint, int[] left, int[] arr) {
        for (int i = 0; i < midPoint; i++) {
            left[i] = arr[i];
        }
        return left;
    }

    /**
     * Populates the right fragment of the array with right elements from the parent array.
     *
     * @param right right array fragment
     * @param arr the parent array
     * @return resultant right array
     */
    int[] loadRightArray(int[] right, int[] arr) {
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[((arr.length - right.length) + i)];
        }
        return right;
    }

    /**
     * Will construct the right array based on the midpoint and the parent array.
     * If the length of the parent array is divisible by 2 without a remainder
     * This means the length is an even number and the initial array can be divided into equal parts.
     * However, if it is not divisible by 2 then it is an odd number and an else construction rule is applied.
     *
     * @param midPoint the midpoint
     * @param arr the parent array
     * @return the right array
     */
    int[] constructRightArray(int midPoint, int[] arr) {
        if (arr.length % 2 == 0) {
            return new int[midPoint];
        } else {
            return new int[midPoint + 1];
        }
    }


    /**
     * This is a recursive split operation which will split the left side of the array until it gets to the base case
     * and can no longer be splitted any further.
     * It then propagates to the right array fragment and does the same splitting operation.
     * <p>
     *
     *
     * @param arr the array to be sorted
     * @return the sorted array
     */

    @Override
    public int[] sort(int[] arr) {

        /* base case condition */
        if (arr.length <= 1) return arr;

        int midPoint = arr.length / 2;
        int[] left = new int[midPoint];
        int[] right = constructRightArray(midPoint, arr);

        /* populate left & right arrays */
        left = loadLeftArray(midPoint, left, arr);
        right = loadRightArray(right, arr);

        return merge(sort(left), sort(right));
    }

    /**
     * Will merge the left and right sides of the array.
     *
     * @param leftArr the left array fragment
     * @param rightArr the right array fragment
     * @return the result of merging both arrays
     */
    int[] merge(int[] leftArr, int[] rightArr) {
        System.out.println("Processing left/right: " + Arrays.toString(leftArr) + "|" + Arrays.toString(rightArr));

        int[] result = new int[leftArr.length + rightArr.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < leftArr.length || rightIndex < rightArr.length) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    result[resultIndex] = leftArr[leftIndex];
                    resultIndex++;
                    leftIndex++;
                } else {
                    result[resultIndex] = rightArr[rightIndex];
                    resultIndex++;
                    rightIndex++;
                }
            } else if (leftIndex < leftArr.length) {
                result[resultIndex] = leftArr[leftIndex];
                resultIndex++;
                leftIndex++;
            } else if (rightIndex < rightArr.length) {
                result[resultIndex] = rightArr[rightIndex];
                resultIndex++;
                rightIndex++;
            }
            count++;
        }
        return result;
    }


    public static void main(String[] args) {
        //new MergeSort().sort(new int[]{9,7, 3, 1, 2, 4, 5, 6});
        int[] result = new MergeSort().sort(new int[]{7, 3, 1, 2, 4, 5, 6});
        System.out.println(Arrays.toString(result));


    }


}

package com.sorting;

import java.util.Arrays;

public class MergeSort {

    int[] sort(int[] arr){

        if (arr.length <= 1) return arr;

        int midPoint = arr.length/2;

        int[] left = new int[midPoint];
        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }

        //populate left and right arrays
        for (int i = 0; i < midPoint; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[((arr.length - right.length) + i)];
        }
        int[] result = new int[arr.length];

        //System.out.println("Processing left " + Arrays.toString(left));
        //System.out.println("Processing right " + Arrays.toString(right));

        left = sort(left);
        right = sort(right);

        result = merge(left,right);
        System.out.println("Result " + Arrays.toString(result));

        return result;
    }

    int[] merge(int[] leftArr, int[] rightArr){

        System.out.println("Processing left " + Arrays.toString(leftArr));
        System.out.println("Processing right " + Arrays.toString(rightArr));

        int[] result = new int[leftArr.length + rightArr.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        int rightPtr = 0;

        while(leftIndex < leftArr.length || rightIndex < rightArr.length){
            if(leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    result[resultIndex] = leftArr[leftIndex];
                    resultIndex++;
                    leftIndex++;
                    //System.out.println("Condition 1");
                } else {
                    result[resultIndex] = rightArr[rightIndex];
                    resultIndex++;
                    rightIndex++;
                    //System.out.println("Condition 2");
                }
            } else if (leftIndex < leftArr.length) {
                result[resultIndex] = leftArr[leftIndex];
                resultIndex++;
                leftIndex++;
                //System.out.println("Condition 3");
            } else if (rightPtr < rightArr.length) {
                result[resultIndex] = rightArr[rightIndex];
                resultIndex++;
                rightIndex++;
                //System.out.println("Condition 4");
            }

            //System.out.println(Arrays.toString(result));
        }
        return result;
    }


    public static void main(String[] args) {
        //int[] result = new MergeSort().merge(new int[]{6,4,7},new int[]{1,3,2});
        //System.out.println("Final " + Arrays.toString(result));
        new MergeSort().sort(new int[]{9,7, 3, 1, 2, 4, 5, 6});

    }


}

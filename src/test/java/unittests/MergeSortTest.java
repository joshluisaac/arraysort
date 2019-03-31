package unittests;

import com.sorting.components.IMergeSort;
import com.sorting.components.MergeSort;
import com.sorting.model.SortResponse;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for MergeSort
 */
public class MergeSortTest {

    /* dependencies */
    IMergeSort mergeSort;

    @Before
    public void run_once_per_test() {
        mergeSort = new MergeSort();
    }


    @Test
    public void i_expect_4_elements_in_the_right_fragment_of_an_odd_number_array_of_size_7() {

        /* given an array who's length is an odd number (in this case 7 items)  */
        int[] arr = new int[]{7, 3, 1, 2, 4, 5, 6};

        /* when i construct the right array fragment */
        int midPoint = mergeSort.calculateMidPoint(arr);
        int[] result = mergeSort.constructRightArray(midPoint, arr);

        /* i expect a size of 4 after construction */
        Assert.assertThat(result.length, CoreMatchers.is(4));
    }

    @Test
    public void splitting_the_given_array_should_return_the_first_3_elements_of_parent_array() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 1, 2, 4, 5, 6};

        /* when i load the left array fragment */
        int midPoint = mergeSort.calculateMidPoint(arr);
        int[] left = new int[midPoint];
        int[] result = mergeSort.loadLeftArray(midPoint, left, arr);

        /* i expect the 1st 3 elements [7, 3, 1] after loading */
        Assert.assertThat(Arrays.toString(result), CoreMatchers.is("[7, 3, 1]"));
    }


    @Test
    public void splitting_the_given_array_should_return_the_last_4_elements_of_parent_array() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 1, 2, 4, 5, 6};

        /* when i load the left array fragment */
        int midPoint = mergeSort.calculateMidPoint(arr);
        int[] right = mergeSort.constructRightArray(midPoint, arr);
        int[] result = mergeSort.loadRightArray(right, arr);

        /* i expect the 1st 3 elements [7, 3, 1] after loading */
        Assert.assertThat(Arrays.toString(result), CoreMatchers.is("[2, 4, 5, 6]"));
    }

    @Test
    public void merging_the_given_arrays_should_return_1_3_7() {

        /* given two array fragments */
        int[] left = {7};
        int[] right = {1, 3};

        /* when i merge the left and right fragments */
        int[] result = mergeSort.merge(left, right);

        /* i expect [1,3,7] after merging */
        Assert.assertThat(result, CoreMatchers.is(new int[]{1, 3, 7}));
    }

    @Test
    public void sorting_an_integer_array_should_return_ordered_collection() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 9, 1, 2, 4, 5, 6, 82, 0, -1};

        /* when i sort it */
        int[] result = mergeSort.sort(arr);

        /* i expect [-1, 0, 1, 2, 3, 4, 5, 6, 7, 9, 82] after sorting */
        Assert.assertThat(result, CoreMatchers.is(new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 9, 82}));

    }

    @Test
    public void executing_sort_returns_json_response() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 9, 1, 2, 4, 5, 6};

        /* when i execute sort */
        SortResponse response = mergeSort.execute(arr);

        /* i expect [1, 2, 4, 5, 6, 7, 9] after sorting */
        Assert.assertThat(response.getSortResult(), CoreMatchers.is("[1, 2, 3, 4, 5, 6, 7, 9]"));

    }

}

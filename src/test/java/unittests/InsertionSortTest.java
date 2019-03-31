package unittests;


import com.sorting.components.InsertionSort;
import com.sorting.components.InstrumentationSort;
import com.sorting.model.SortResponse;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for InsertionSort
 */
public class InsertionSortTest {


    /* dependencies */
    InstrumentationSort instrumentationSort;

    @Before
    public void run_once_per_test() {
        instrumentationSort = new InsertionSort();
    }


    @Test
    public void sorting_an_integer_array_should_return_ordered_collection() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 9, 1, 2, 4, 5, 6, 82, 0, -1};

        /* when i sort it */
        int[] result = instrumentationSort.sort(arr);

        /* i expect [-1, 0, 1, 2, 3, 4, 5, 6, 7, 9, 82] after sorting */
        Assert.assertThat(result, CoreMatchers.is(new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 9, 82}));

    }


    @Test
    public void executing_insertion_sort_returns_json_response() {

        /* given the following array */
        int[] arr = new int[]{7, 3, 9, 1, 2, 4, 5, 6};

        /* when i execute sort */
        SortResponse response = instrumentationSort.execute(arr);

        /* i expect [1, 2, 4, 5, 6, 7, 9] after sorting */
        Assert.assertThat(response.getSortResult(), CoreMatchers.is("[1, 2, 3, 4, 5, 6, 7, 9]"));

    }




}

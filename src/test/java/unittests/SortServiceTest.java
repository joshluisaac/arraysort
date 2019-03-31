package unittests;

import com.sorting.components.MergeSort;
import com.sorting.model.SortResponse;
import com.sorting.services.SortService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortServiceTest {

    /* dependencies */
    SortService service;

    @Before
    public void run_once_per_test() {
        service = new SortService(new MergeSort());
    }

    @Test
    public void executing_sort_service_returns_sort_response(){
        /* given the following array */
        int[] arr = new int[]{7, 3, 9, 1, 2, 4, 5, 6};

        /* when i execute sort */
        SortResponse response = service.execute(arr);

        /* i expect [1, 2, 4, 5, 6, 7, 9] after sorting */
        Assert.assertThat(response.getSortResult(), CoreMatchers.is("[1, 2, 3, 4, 5, 6, 7, 9]"));
    }

}

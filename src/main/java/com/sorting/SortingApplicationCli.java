package com.sorting;

import com.sorting.model.SortResponse;
import com.sorting.services.SortService;
import com.sorting.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * This is the main class for using SortingApplicationCli and serves as the
 * application entry point.
 *
 * @author Joshua Nwankwo
 * @version 1.0
 * @since March 2019
 */
@Configuration
@ComponentScan("com.sorting")
public class SortingApplicationCli {

    private static final Logger LOG = LoggerFactory.getLogger(SortingApplicationCli.class);

    public static void main(String[] args) {
        int[] input = new int[]{7, 1, 3, 2, 4, 5, 6};
        ApplicationContext context =  new AnnotationConfigApplicationContext(SortingApplicationCli.class);
        SortResponse response = context.getBean(SortService.class).execute(input);
        System.out.println(new JsonUtils().toJson(response));
        LOG.info("Array size: {}",response.getArraySize());
        LOG.info("Minimum iterations: {}",response.getCount());
        LOG.info("Sorted result: {}",response.getSortResult());
        LOG.info("Running time: {}", response.getRunningTime());
    }

}

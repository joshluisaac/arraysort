package com.sorting;

import com.sorting.model.SortResponse;
import com.sorting.services.SortService;
import com.sorting.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SortingApplicationCli {

    private static final Logger LOG = LoggerFactory.getLogger(SortingApplicationCli.class);

    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(SortingApplicationCli.class);
        SortService service = context.getBean(SortService.class);
        SortResponse response = service.execute(new int[]{7, 3, 1, 2, 4, 5, 6,9,6,6,7,3,8,9,0,0,5,7,82,-1});

        System.out.println(new JsonUtils().toJson(response));

        LOG.info("Array size: {}",response.getArraySize());
        LOG.info("Minimum iterations: {}",response.getCount());
        LOG.info("Sorted result: {}",response.getSortResult());
        LOG.info("Running time: {}", response.getRunningTime());
    }

}

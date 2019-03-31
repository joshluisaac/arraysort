package com.sorting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * This is the main class for using SortingApplicationServer and serves as the
 * application entry point for the server.
 *
 * @author Joshua Nwankwo
 * @version 1.0
 * @since March 2019
 */

@SpringBootApplication
public class SortingApplicationServer {

    public static void main(String[] args) {
        SpringApplication.run(SortingApplicationServer.class, args);
    }

}

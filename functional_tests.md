Functionality test cases document.
============================================

This is the __Functionality test cases document__ which is part of the project deliverables. This document
 details the test package structure and the purpose of each test, the test coverage and tests logs.

 Please note that other deliverables are also provided. This includes the following deliverables:

1. Bill of materials (BOM) document.
1. API documentation.
1. Class hierarchy, scope and purpose document.


## Tests package layout and structure

![Alt text][functional_tests]

## Test classes and purpose

| Test classes        | Purpose           |
| ------------- |:-------------:|
|`SortingApplicationCliTest`|Integration test using reflection for main class `SortingApplicationCli`
|`InsertionSortTest`|Unit test for `InsertionSort`
|`MergeSortTest`| Unit test for `MergeSort`
|`SortService`|Unit test for `SortService`


## Test coverage




## Test logs
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running unittests.MergeSortTest
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.286 sec
Running unittests.SortServiceTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Running unittests.InsertionSortTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
```



[functional_tests]: functional_tests.png "Logo Title Text 2"
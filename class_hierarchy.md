Class hierarchy, scope and purpose document.
============================================

This is the __class hierarchy, scope and purpose document__ which is part of the project deliverables.

Please note that other deliverables are also provided. This includes the following deliverables:

1. Bill of materials (BOM) document.
1. API documentation.
1. Functionality test cases.

## APIs and classes

![Alt text][api_image]

## Package layout and structure

![Alt text][packagelayout]


## Classes and purpose

| Classes        | Purpose           |
| ------------- |:-------------:|
|`SortingApplicationCli.java`|This is the main class for using SortingApplicationCli and serves as the application entry point.
| `components/AbstractSort.java`      | Sorting abstract class. | $1600 |
| `components/MergeSort.java`      | An implementation of `IMergeSort` that contains methods for performing merge sort.      |   $12 |
| `components/InsertionSort.java` | An implementation of `InstrumentationSort` that contains methods for performing insertion sort.      |    $1 |
|`model/SortResponse.java`|A POJO object representing sort response details.
|`services/SortService.java`|A service layer for handling sort operations.
|`utils/JsonUtils.java`|A `Gson` wrapper class providing forwarding and helper methods for JSON utilities.




[packagelayout]: package_layout.png "Logo Title Text 2"

[api_image]: api_documentation.png "Logo Title Text 2"
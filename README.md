

Figures out the best sorting technique based on the size of the input.
Generally insertion sort has a quadratic complexity of O(N^2)


What is included?
------------------------
The project includes the source code, behaviour driven tests based on the specifications provided and build scripts for Maven.
It also ships with a compiled version of the project making it makes it easy execute the application from terminal.
The compiled version of the project resided in the `target` directory and can be executed from command-line/terminal

Bill of materials
1. Tests written with Junit.
2. Source code.
1. Code test coverage report: This can be found here `/target/site/cobertura`
2. API documentation: This can be found here `/target/site/apidocs`

Maven will automatically download all required dependencies, compile the project, and finally run the tests specs.

Prerequisites
-------------
- JDK 7 or higher
- Maven use `mvnw` wrapper

Executing the application
-------------------------

To sort an array of integer numbers run the following command

`mvn clean install && java -jar target/arraysort-0.0.1-SNAPSHOT.jar`


Executing the above command will produce the following output

```
{
  "count": 5,
  "sortResult": "[1, 2, 3, 4, 5, 6, 7]",
  "runningTime": "0 ms",
  "arraySize": 7
}
2019-03-30 09:47:29,839 INFO  Array size: 7
2019-03-30 09:47:29,839 INFO  Minimum iterations: 5
2019-03-30 09:47:29,839 INFO  Sorted result: [1, 2, 3, 4, 5, 6, 7]
2019-03-30 09:47:29,839 INFO  Running time: 0 ms
```



Building the API docs
---------------------

Execute the command below to build API javadoc from the source code.

```shell
mvn javadoc:javadoc
```

The result is put in `/target/site/apidocs`

Building the source code without tests
--------------------------------------

```shell
mvn clean install -Dmaven.test.skip=true
```

This will compile, package and install the project. A JAR file called `arraysort-0.0.1-SNAPSHOT.jar` is generated
at the end of this phase and the result is copied to `target` directory.


Building and copying the dependencies
----------------------------------------
Run this command below to build and copy the dependencies to project `lib` directory.

```shell
mvn clean install -Dmaven.test.skip dependency:copy-dependencies
```


Running the tests.
------------------

The tests are written in groovy using Junit framework.
The source code for the tests are located in `src/test/java`.
I wrote the tests to be simple and readable. Anyone looking at the tests would find it easy to figure out what's going on.

```shell
mvn clean install
```
This will run all the tests in `src/test/java` directory and you will see an output like this below.

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






## Continuous integration
Used Travis for continuous integration

## Dependency injection
Used Dagger dependency injection framework



## A case for recursion

[Are there advantages for using recursion over iteration - other than sometimes readability and elegance? [duplicate]](https://softwareengineering.stackexchange.com/questions/242889/are-there-advantages-for-using-recursion-over-iteration-other-than-sometimes-r)

[What are the advantages of recursion compared to iteration? [duplicate]](https://softwareengineering.stackexchange.com/questions/234962/what-are-the-advantages-of-recursion-compared-to-iteration)

[Recursion or while loops](https://softwareengineering.stackexchange.com/questions/182314/recursion-or-while-loops)


[Are recursive methods always better than iterative methods in Java? [closed]](https://stackoverflow.com/questions/15346774/are-recursive-methods-always-better-than-iterative-methods-in-java)
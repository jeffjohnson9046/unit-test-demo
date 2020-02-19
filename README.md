# Overview
This repo is a quick and dirty Maven project to understand the basic configuration of some code-quality plugins, namely:

* [Surefire](https://maven.apache.org/surefire/maven-surefire-plugin/index.html)
* [Failsafe](https://maven.apache.org/surefire/maven-failsafe-plugin/)
* [Jacoco](https://www.eclemma.org/jacoco/trunk/doc/maven.html)

As such, this is a _very_ simple project that includes a couple of basic classes that have some unit tests and an example integration test.  The goal is to create some reports around the tests and the code coverage.  The unit tests in this project do not cover 100% of the code, but that's the point.  Specifically, we want to see Jacoco's output and have it tell us where we need to add test coverage.

# Requirements
This Maven project requires the following:

* Java 8
* Maven 3

# Conventions for Creating Tests
Surefire and Failsafe rely on easy-to-remember conventions:

* When creating a **unit test**, the class name should end in `Test`
  * e.g. `MyServiceTest.java` or `MyControllerTest.java`
* When creating an **integration test**, the class name should end in `IT`
  * e.g. `MyDatabaseIT.java` or `MyControllerIT.java`

The conventions cited above are from the Surefire and Failsafe documentation.  These conventions can be overridden by configuring the plugin in the `pom.xml`.  Instructions for configuring Surefire can be found [here](https://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html) and instructions for Failsafe can be found [here](https://maven.apache.org/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html).

# Usage
This project is really geared to exercise the unit and integration tests associated with the `MathApplication` and `CalculatorService` classess/implementations.  There's no entry point per se, so building and running the `.jar` won't do very much.

## Running the Tests
To have Maven run the unit and/or integration tests, use one of the following commands:

* To run _only_ the unit tests:  `mvn clean test`:

```java
$ mvn clean test
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------< org.example:unit-test-demo >---------------------
[INFO] Building unit-test-demo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ unit-test-demo ---
[INFO] Deleting /Users/jeff.johnson/dev/java/unit-test-demo/target
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.5:prepare-agent (jacoco-initialize) @ unit-test-demo ---
[INFO] argLine set to -javaagent:/Users/jeff.johnson/.m2/repository/org/jacoco/org.jacoco.agent/0.8.5/org.jacoco.agent-0.8.5-runtime.jar=destfile=/Users/jeff.johnson/dev/java/unit-test-demo/target/jacoco.exec
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ unit-test-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/jeff.johnson/dev/java/unit-test-demo/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ unit-test-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/jeff.johnson/dev/java/unit-test-demo/target/classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ unit-test-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/jeff.johnson/dev/java/unit-test-demo/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ unit-test-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /Users/jeff.johnson/dev/java/unit-test-demo/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ unit-test-demo ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.MathApplicationBddTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.614 s - in org.example.MathApplicationBddTest
[INFO] Running org.example.MathApplicationSpyTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.047 s - in org.example.MathApplicationSpyTest
[INFO] Running org.example.MathApplicationTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s - in org.example.MathApplicationTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.5:report (jacoco-site) @ unit-test-demo ---
[INFO] Loading execution data file /Users/jeff.johnson/dev/java/unit-test-demo/target/jacoco.exec
[INFO] Analyzed bundle 'unit-test-demo' with 2 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.719 s
[INFO] Finished at: 2020-02-19T08:59:02-08:00
[INFO] ------------------------------------------------------------------------
```

* To run the unit and integration tests together:  `mvn clean verify` or `mvn clean integration-test`:

```java
$ mvn clean verify
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------< org.example:unit-test-demo >---------------------
[INFO] Building unit-test-demo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ unit-test-demo ---
[INFO] Deleting /Users/jeff.johnson/dev/java/unit-test-demo/target
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.5:prepare-agent (jacoco-initialize) @ unit-test-demo ---
[INFO] argLine set to -javaagent:/Users/jeff.johnson/.m2/repository/org/jacoco/org.jacoco.agent/0.8.5/org.jacoco.agent-0.8.5-runtime.jar=destfile=/Users/jeff.johnson/dev/java/unit-test-demo/target/jacoco.exec
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ unit-test-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/jeff.johnson/dev/java/unit-test-demo/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ unit-test-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/jeff.johnson/dev/java/unit-test-demo/target/classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ unit-test-demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/jeff.johnson/dev/java/unit-test-demo/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ unit-test-demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /Users/jeff.johnson/dev/java/unit-test-demo/target/test-classes
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ unit-test-demo ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.MathApplicationBddTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.607 s - in org.example.MathApplicationBddTest
[INFO] Running org.example.MathApplicationSpyTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.047 s - in org.example.MathApplicationSpyTest
[INFO] Running org.example.MathApplicationTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.02 s - in org.example.MathApplicationTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.5:report (jacoco-site) @ unit-test-demo ---
[INFO] Loading execution data file /Users/jeff.johnson/dev/java/unit-test-demo/target/jacoco.exec
[INFO] Analyzed bundle 'unit-test-demo' with 2 classes
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ unit-test-demo ---
[INFO] Building jar: /Users/jeff.johnson/dev/java/unit-test-demo/target/unit-test-demo-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-failsafe-plugin:3.0.0-M4:integration-test (integration-tests) @ unit-test-demo ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.MathApplicationIT
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.302 s - in org.example.MathApplicationIT
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-failsafe-plugin:3.0.0-M4:verify (integration-tests) @ unit-test-demo ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.944 s
[INFO] Finished at: 2020-02-19T09:35:29-08:00
[INFO] ------------------------------------------------------------------------
```

## Viewing the Output
Each of the plugins listed in the **Overview** section produce reports that can be The following reports land in the `%REPOSITORY_DIR%/target/site`:

* `surefire-reports`
* `failsafe-reports`

The Jacoco reports are created/stored in the `target/site/jacoco`.

# Other Resources
Here are some other resources that might be helpful for gettings started with Mockito and unit/integration testing:

* A good introduction to using Mockito for tests: [A Unit Testing Practitioner's Guide to Everyday Mockito](https://www.toptal.com/java/a-guide-to-everyday-mockito)
* The `builder` pattern can be useful for creating complex objects with default values that can be easily overridden: [Builder Pattern: Good for code, great for tests](https://www.javacodegeeks.com/2013/06/builder-pattern-good-for-code-great-for-tests.html)
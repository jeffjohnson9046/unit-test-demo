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

# Usage
This project is really geared to exercise the tests associated with the `MathApplication` and `CalculatorService` classess/implementations.  There's no entry point per se, so building and running the `.jar` won't do very  much.

* To run _only_ the unit tests:  `mvn clean test`
* To run _only_ the integration tests: `mvn clean integration-test`
* To run the unit and integration tests together:  `mvn clean verify` or `mvn clean install`

The following reports land in the `%REPOSITORY_DIR%/target/site`:

* `surefire-reports`
* `failsafe-reports`

The Jacoco reports land in the `target/site/jacoco`.
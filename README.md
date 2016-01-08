# Android Espresso Cucumber workshop

## How

Complete `StepDefinitions.java` as expected to be create IT

## Workshop

1. login success
2. login error
3. scroll to item
4. open item

## Useful concerns

1. dependencies see app/build.gradle
2. configure Cucumber in CucumberConfig.java
3. configure Espresso with Cucumber in CucumberTestRunner.java (be careful to use @Before and @After from Cucumber)
4. write acceptance tests in Gherkin in assets/features/
5. code glue between Gherkin and Espresso routine in StepDefinitions.java
6. get cucumber report from device see app/build.gradle
7. take screenshots with Spoon and Falcon
8. enhance Cucumber report by replacing CSS
9. add espresso-contrib to be able to test RecyclerView
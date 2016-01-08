package fr.blacroix.android.espresso_cucumber.test;

import junit.framework.TestCase;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        glue = "fr.blacroix.android.espresso_cucumber.test.steps",
        features = "features",
        plugin = {
                "pretty",
                // To create directory app needs permission once
                "html:/mnt/sdcard/fr.blacroix.android.espresso_cucumber.test/cucumber-reports/report-html"
        }
)
public class CucumberTests extends TestCase {
}

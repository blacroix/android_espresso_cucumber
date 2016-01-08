package fr.blacroix.android.espresso_cucumber.test.steps;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import fr.blacroix.android.espresso_cucumber.LoginActivity;

public class StepDefinitions extends ActivityInstrumentationTestCase2<LoginActivity> {

    public StepDefinitions() {
        super(LoginActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();

        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        getActivity();
    }

    @Given("^I am on login screen$")
    public void i_am_on_login_screen() {

    }

    @Then("^I should see message$")
    public void i_should_see_message() {

    }

    @Then("^I login$")
    public void i_login() {

    }

    @Then("^I click on book 42$")
    public void i_click_on_book_42() {

    }

    @Then("^I see book details$")
    public void i_see_book_details() {

    }
}

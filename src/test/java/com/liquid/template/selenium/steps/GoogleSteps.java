package com.liquid.template.selenium.steps;

import com.liquid.template.selenium.pages.GooglePage;
import cucumber.api.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GoogleSteps implements En {

    public GoogleSteps(GooglePage googlePage) {

        When("^I navigate to google$", () -> {
            googlePage.navigate();
        });

        When("^I search for \"([^\"]*)\"$", (String search) -> {
            googlePage.searchFor(search);
        });

        When("^I click on search button$", () -> {
            googlePage.runSearch();
        });

        Then("^The first result should be a page named \"([^\"]*)\"$", (String name) -> {
            assertThat(googlePage.getFirstResultName(), is(name));
        });

    }

}

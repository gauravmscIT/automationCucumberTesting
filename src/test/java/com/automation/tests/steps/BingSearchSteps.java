package com.automation.tests.steps;


import com.automation.tests.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.springframework.beans.factory.annotation.Autowired;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;


import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BingSearchSteps {
    @Autowired
    HomePage homePage;

    String keyword;


    @Given("^I am on bing homepage$")
    public void I_am_on_bing_homepage() throws Throwable {

    }


    @When("^I search for the keyword \"([^\"]*)\"$")
    public void I_search_for_the_keyword(String keyword) throws Throwable {
        this.keyword = keyword;
        homePage.searchField().clear();
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        homePage.searchField().clear();
        homePage.searchField().sendKeys(keyword);
        homePage.goButton().click();
    }

    @Then("^I should see relevant results$")
    public void I_should_see_relevant_results() throws Throwable {
        assertThat(homePage.isKeywordPresentInSearchResults(keyword)).isTrue();


    }


    @Then("^there are no JavaScript Errors$")
    public void there_are_no_JavaScript_Errors() throws Throwable {
        ArrayList errors = new ArrayList();

        LogEntries logEntries = getCurrentDriver().manage().logs().get(LogType.BROWSER);

        for (LogEntry entry : logEntries) {
            if (entry.getLevel().toString().equals("ERROR")) {
                errors.add(entry.toString());

                log.error("Errors:" + entry);


            }
        }

        assertThat(errors.size() == 0).isTrue();

    }


    @Given("^I am on the yahoo page$")
    public void I_am_on_the_yahoo_page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}

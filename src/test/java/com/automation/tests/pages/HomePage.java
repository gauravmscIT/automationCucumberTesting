package com.automation.tests.pages;


import com.automation.tests.helpers.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;


@Component
public class HomePage extends PageObject {


    public WebElement searchField() {
        return waitForElement(By.cssSelector("#sb_form_qanuary"));


    }

    public WebElement goButton() {
        return waitForElement(By.cssSelector("#sb_form_go"));

    }

    public boolean isKeywordPresentInSearchResults(String expectedText) {
        int i = 0;
        waitForElement(By.cssSelector(".b_algo>h2>a"));
        List<WebElement> results = getCurrentDriver().findElements(By.cssSelector(".b_algo>h2>a"));
        for (WebElement result : results) {
            if (!result.getText().toLowerCase().contains(expectedText.toLowerCase())) {
                i += 1;
            }
        }
        if (i == 0) {
            return true;
        } else {
            return false;
        }
    }


}



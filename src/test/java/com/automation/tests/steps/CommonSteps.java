package com.automation.tests.steps;


import com.automation.tests.helpers.UrlHelper;
import cucumber.api.java.Before;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommonSteps {



@Autowired
UrlHelper urlHelper;



    @Before("@acceptance_test")
    public void beforeScenario() throws URISyntaxException {
        getCurrentDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        getCurrentDriver().manage().window().maximize();
        getCurrentDriver().manage().deleteAllCookies();
        getCurrentDriver().get(urlHelper.getUrl());

    }


}

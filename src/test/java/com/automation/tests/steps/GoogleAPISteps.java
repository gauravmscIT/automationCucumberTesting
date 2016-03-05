package com.automation.tests.steps;



import com.jayway.restassured.response.Response;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class GoogleAPISteps {
    private Response response;
    private static final String GOOGLE_API_EXAMPLE = "https://www.googleapis.com/customsearch/v1";
    private static final String API_KEY = "ABCD";


    @When("^I hit google API with q value \"([^\"]*)\"$")
    public void I_hit_google_API_with_q_value(String qValue) throws Throwable {
        response = given().relaxedHTTPSValidation().parameters("key", API_KEY, "q", qValue).when().get(GOOGLE_API_EXAMPLE);

    }

    @Then("^the response code should be (\\d+)$")
    public void the_response_code_should_be(int responseCode) throws Throwable {
        assertThat(responseCode).isEqualTo(responseCode);
    }


    @And("^the message should be \"([^\"]*)\"$")
    public void the_message_should_be(String message) throws Throwable {
        assertThat(response.then().extract().path("error.message")).isEqualTo(message);
    }
}

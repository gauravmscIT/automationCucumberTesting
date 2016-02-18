@acceptance_test
Feature: Checking response of a Google API

  Scenario: Example scenario to hit google API
    When I hit google API with q value "cucumber"
    Then the response code should be 400
    And the message should be "Bad Request"


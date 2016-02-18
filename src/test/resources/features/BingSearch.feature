@acceptance_test
Feature: Search on Bing

  Scenario: User can search for keywords on Bing
    Given I am on bing homepage
    When I search for the keyword "cucumber"
    Then I should see relevant results
    And there are no JavaScript Errors


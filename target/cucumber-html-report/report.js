$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BingSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Search on Bing",
  "description": "",
  "id": "search-on-bing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@acceptance_test"
    }
  ]
});
formatter.before({
  "duration": 939748613,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User can search for keywords on Bing",
  "description": "",
  "id": "search-on-bing;user-can-search-for-keywords-on-bing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on bing homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for the keyword \"cucumber\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see relevant results",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "there are no JavaScript Errors",
  "keyword": "And "
});
formatter.match({
  "location": "BingSearchSteps.I_am_on_bing_homepage()"
});
formatter.result({
  "duration": 129106868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 26
    }
  ],
  "location": "BingSearchSteps.I_search_for_the_keyword(String)"
});
formatter.result({
  "duration": 1836291977,
  "status": "passed"
});
formatter.match({
  "location": "BingSearchSteps.I_should_see_relevant_results()"
});
formatter.result({
  "duration": 326782116,
  "status": "passed"
});
formatter.match({
  "location": "BingSearchSteps.there_are_no_JavaScript_Errors()"
});
formatter.result({
  "duration": 59204614,
  "status": "passed"
});
formatter.after({
  "duration": 13698308,
  "status": "passed"
});
formatter.uri("GoogleAPI.feature");
formatter.feature({
  "line": 2,
  "name": "Checking response of a Google API",
  "description": "",
  "id": "checking-response-of-a-google-api",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@acceptance_test"
    }
  ]
});
formatter.before({
  "duration": 237354606,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Example scenario to hit google API",
  "description": "",
  "id": "checking-response-of-a-google-api;example-scenario-to-hit-google-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I hit google API with q value \"cucumber\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the response code should be 400",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the message should be \"Bad Request\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 31
    }
  ],
  "location": "GoogleAPISteps.I_hit_google_API_with_q_value(String)"
});
formatter.result({
  "duration": 1736895762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 28
    }
  ],
  "location": "GoogleAPISteps.the_response_code_should_be(int)"
});
formatter.result({
  "duration": 4679211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bad Request",
      "offset": 23
    }
  ],
  "location": "GoogleAPISteps.the_message_should_be(String)"
});
formatter.result({
  "duration": 677204581,
  "status": "passed"
});
formatter.after({
  "duration": 8563593,
  "status": "passed"
});
});
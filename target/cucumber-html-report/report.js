$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BingSearch.feature");
formatter.feature({
  "id": "search-on-bing",
  "tags": [
    {
      "name": "@acceptance_test",
      "line": 1
    }
  ],
  "description": "",
  "name": "Search on Bing",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 1236436000,
  "status": "passed"
});
formatter.scenario({
  "id": "search-on-bing;user-can-search-for-keywords-on-bing",
  "description": "",
  "name": "User can search for keywords on Bing",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on bing homepage",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I search for the keyword \"cucumber\"",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I should see relevant results",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "there are no JavaScript Errors",
  "keyword": "And ",
  "line": 8
});
formatter.match({
  "location": "BingSearchSteps.I_am_on_bing_homepage()"
});
formatter.result({
  "duration": 133712000,
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
  "duration": 1997641000,
  "status": "passed"
});
formatter.match({
  "location": "BingSearchSteps.I_should_see_relevant_results()"
});
formatter.result({
  "duration": 311910000,
  "status": "passed"
});
formatter.match({
  "location": "BingSearchSteps.there_are_no_JavaScript_Errors()"
});
formatter.result({
  "duration": 99956000,
  "status": "passed"
});
formatter.after({
  "duration": 40865000,
  "status": "passed"
});
formatter.uri("GoogleAPI.feature");
formatter.feature({
  "id": "checking-response-of-a-google-api",
  "tags": [
    {
      "name": "@acceptance_test",
      "line": 1
    }
  ],
  "description": "",
  "name": "Checking response of a Google API",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 210044000,
  "status": "passed"
});
formatter.scenario({
  "id": "checking-response-of-a-google-api;example-scenario-to-hit-google-api",
  "description": "",
  "name": "Example scenario to hit google API",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I hit google API with q value \"cucumber\"",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "the response code should be 400",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "the message should be \"Bad Request\"",
  "keyword": "And ",
  "line": 7
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
  "duration": 2668802000,
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
  "duration": 4198000,
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
  "duration": 411583000,
  "status": "passed"
});
formatter.after({
  "duration": 12793000,
  "status": "passed"
});
});
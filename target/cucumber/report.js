$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LogingOther3.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Functionality validation",
  "description": "",
  "id": "techfios-billing-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LogingOtherFeature"
    }
  ]
});
formatter.before({
  "duration": 5928843700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "1 User should be abel to loing valid account",
  "description": "",
  "id": "techfios-billing-functionality-validation;1-user-should-be-abel-to-loing-valid-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@logScenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on  the TechFios loign page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on the dashbord page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogingStepsDefinition.user_is_on_the_techfios_loign_page()"
});
formatter.result({
  "duration": 154717900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LogingStepsDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 175344100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LogingStepsDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 145984000,
  "status": "passed"
});
formatter.match({
  "location": "LogingStepsDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 2388913400,
  "status": "passed"
});
formatter.match({
  "location": "LogingStepsDefinition.user_should_land_on_the_dashbord_page()"
});
formatter.result({
  "duration": 688526800,
  "status": "passed"
});
formatter.after({
  "duration": 4764914400,
  "status": "passed"
});
});
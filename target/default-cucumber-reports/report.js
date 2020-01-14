$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Brokerage account redirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Brokerage\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "AccountActivityStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on \"Account Activity\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "first selected option should be \"Brokerage\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDefs.first_selected_option_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
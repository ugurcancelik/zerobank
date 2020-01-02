$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary Menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account summary page account types",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_types"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as username \"username\" and as password \"password\" as valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_username_and_as_password_as_valid_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see following menu options",
  "rows": [
    {
      "cells": [
        "Cash Accounts",
        "Investment Accounts",
        "Credit Accounts",
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefs.the_user_should_see_following_menu_options(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
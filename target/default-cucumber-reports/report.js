$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Payee.feature");
formatter.feature({
  "name": "Add new payee under pay bills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new payee",
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
  "name": "user click \"Pay Bills\" page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_click_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add New Payee\" tab",
  "keyword": "Given "
});
formatter.match({
  "location": "PayBillsStepDefs.tab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates new payee using following information",
  "rows": [
    {
      "cells": [
        "Payee Name",
        "The Law Offices of Hyde, Price \u0026 Scharks"
      ]
    },
    {
      "cells": [
        "Payee Address",
        "100 Same st, Anytown, USA, 10001"
      ]
    },
    {
      "cells": [
        "Account",
        "Checking"
      ]
    },
    {
      "cells": [
        "Payee details",
        "XYZ account"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsStepDefs.creates_new_payee_using_following_information(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message \"The new payee The Law Offices of Hyde, Price \u0026 Scharks was successfully created.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefs.message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user enter wrong username or password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login2"
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
  "name": "user logs in as username \"ugur\" and as password \"celik\" as invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_username_and_as_password_as_invalid_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users get error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.users_get_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
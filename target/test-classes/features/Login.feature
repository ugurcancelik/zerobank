Feature: Login
@login1
  Scenario: Authorized users should be able to login
    Given user in the login page
    When user logs in as username "username" and as password "password" as valid credentials
    Then user should be on account summary page
  @login2
  Scenario: user enter wrong username or password
    Given  user in the login page
    When user logs in as username "ugur" and as password "celik" as invalid credentials
    Then user should not be able to login
    And users get error message


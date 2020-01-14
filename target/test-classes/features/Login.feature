Feature: Login
@login1
  Scenario: Authorized users should be able to login
#    Given user in the login page
#    When user logs in as username "username" and as password "password" as valid credentials
    Then user should be on "Account Summary" page

  #when you want to run this feature, you have to comment out Hooks before method
  @login2
  Scenario: user enter wrong username or password
    Given  user in the login page
    When user logs in as username "ugur" and as password "celik" as invalid credentials
    Then user should not be able to login
    And users get error message


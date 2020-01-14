Feature: Navigating to specific accounts in Accounts Activity

  Scenario: Savings account redirect
    When the user clicks on "Savings" link on the Account Summary page
    Then user should be on "Account Activity" page
    And first selected option should be "Savings"

  Scenario: Brokerage account redirect

    When the user clicks on "Brokerage" link on the Account Summary page
    Then user should be on "Account Activity" page
    And first selected option should be "Brokerage"
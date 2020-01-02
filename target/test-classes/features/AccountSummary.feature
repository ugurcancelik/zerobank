Feature: Account Summary Menu

  @account_summary_title
  Scenario: Account Summary Page should have Cash Account
    Given user in the login page
    When user logs in as username "username" and as password "password" as valid credentials
    Then user should be on account summary page

@account_types
    Scenario: Account summary page account types
      Given user in the login page
      When user logs in as username "username" and as password "password" as valid credentials
      Then the user should see following menu options
      |Cash Accounts|Investment Accounts|Credit Accounts|Loan Accounts|

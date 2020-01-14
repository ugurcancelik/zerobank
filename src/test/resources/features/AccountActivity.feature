Feature: Account Activity

  Background:
    When user click "Account Activity" page

  Scenario: Account Activity title

    Then user should be on "Account Activity" page


  Scenario: Account Activity first DropDown Option

    Then first selected option should be "Savings"


  Scenario: Account Activity all Dropdown Option

    Then all selected option should be following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Show Transactions table should have columns
    Then show transactions table shoul have following options
    |Date|Description|Deposit|Withdrawal|


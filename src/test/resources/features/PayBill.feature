Feature: Pay Bills Page
  Background:
    When user click "Pay Bills" page


  Scenario: Pay Bills page title
    Then user should be on "Pay Bills" page


  Scenario: Succesful message should be seen
    When user should be write 100 on amount
    And user should be select date
    Then user should see succesful message



  Scenario: Warning message on Pay Bills Page
    When user click pay button
    Then user take warning message


  Scenario: amount field doesnot accept alphanumeric character on Pay Bills
    When user enters alphabetical character on amount field
    Then system should give error message
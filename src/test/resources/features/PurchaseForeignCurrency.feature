Feature: Purchase Foreign Currency
Background:
  When user click "Pay Bills" page

  Scenario: Available currencies

    Given "Purchase Foreign Currency" tab
    Then following currencies should be available
      | Select One            |
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      |Hong Kong (dollar)     |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Sweden (krona)        |
      | Singapore (dollar)    |
      | Thailand (baht)       |
  Scenario: Error message for not selecting currency
    Given "Purchase Foreign Currency" tab
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed
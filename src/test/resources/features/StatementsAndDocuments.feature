Feature: Statements and Documents details


  Scenario Outline: Recent statements per year

    Given user click "Online Statements" page
    When the user selects the Recent Statements Year <year>
    Then <count> statements should be displayed for that <year>
    Examples:
      | year | count |
      | 2009 | 2 |
      | 2010 | 2 |
      | 2011 | 2 |
      | 2012 | 1 |
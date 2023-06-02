Feature: feature to test login functionality
@Testing
  Scenario Outline: Check login is successful with valid creditionals
    Then report will be generated in file
    #Then Generate extents report
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the login page
   

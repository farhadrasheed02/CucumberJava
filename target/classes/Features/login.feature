Feature: feature to test login functionality
@Testing
  Scenario Outline: Check login is successful with valid creditionals
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the login page

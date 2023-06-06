Feature: Google search for a particular site
@GoogleSearch
Scenario Outline: Searching autoamtion page
Given whe user search goole
When user is on search button
And click on the enter
Then user goes to the result
And click on the online courses
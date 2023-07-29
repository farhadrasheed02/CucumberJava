Feature: Checking the Usage of Hook in Our Program

@HookFeature
Scenario Outline: Hook Feature Implementation 
	
	Given when user enters login 
	And enters credentials 
	When authenticate the cred
	Then lands on Home page
#	Then report will be generated in file in hook
	

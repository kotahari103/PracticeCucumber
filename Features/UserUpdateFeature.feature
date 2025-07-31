Feature: User update

Background:
	Given User is on the login page
	And User validate the login page header
	
@Smoke	
Scenario: Update user profile in data table
	When User updates profile with following details
		|firstname|lastname|email|phone|
		|hk1      |hk2     |hk3  |hk4  |
		|pk1      |pk2     |pk3  |pk4  |
	And Clicks on submit button
	Then Navigated to the user page
	
	@Smoke
	Scenario: User validates header
	When Clicks on submit button
	Then User validates the header	
	
	@Smoke
	Scenario Outline: User tests with multiple testdata in different pages
	When User logins and enter "<mobilename>"
	And Clicks on submit button
	Then User enters "<phone number>"
	
	Examples:
	|mobilename|phone number|
	|123       |456         |
	|234       |567         |
	
	
	@Sanity
	Scenario: User validates main header
	When Clicks on submit button
	Then User validates main header
	
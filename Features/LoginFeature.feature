Feature: User Login

#This background step will execute before each scenario
Background:
	Given User is on the login page
	And User validate the login page header
	
	@Smoke @Login
	Scenario: Successful login with valid credentials
		When User enters username "hk" and password "hk123"
		And User Clicks on login button
		Then User should be redirected to the dashboard
	
	@Smoke @Login @Negative	
	Scenario Outline: Login with multiple set of test data
		When User enters the username "<username>" and password "<password>"
		And User Clicks on login button
		Then User should not redirected to the dashboard
		
		Examples:
		|username  |password|
		|hi        |hi      |
		|hello     |hello   |
	
		
	
		
	


@Demo
Feature: User authentication

@Login
Scenario Outline: Login
	Given user views BusinessView Portal
	When user with username <user_name> and password <password> logs in
	Then user is able to view Dashboard
	
	Examples:
	|user_name|password|
	|gp_tech_support_admin@globalpay.com|P@ssword!|
	|user_2@globalpay.com|P@ssword!|
	
	
@Logout
Scenario Outline: Logout
	Given user views BusinessView Portal
	When user with username <user_name> and password <password> logs in
	Then user is able to logout
	
	Examples:
	|user_name|password|
	|gp_tech_support_admin@globalpay.com|P@ssword!|
	|user_2@globalpay.com|P@ssword!|
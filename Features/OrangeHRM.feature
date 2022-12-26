@ORG-101 
Feature: Verify login feature in Orange HRM website 


Scenario: User able to successfully login to Orange HRM site 
	Given user go to Orange Hrm home page 
	When user enter valid username and password 
	And user click on the login button 
	Then user navigate to the welcome page 
	And user verify the page title as "OrangeHRM" 
	And user verify username is displays at top right 
	Then user click on the admin tab 
	And user select "Admin" under user role 
	Then user click on search button 
	And user verify "Dominic.Chase" is displayed in result set 
	Then user logout 
	And user close browser
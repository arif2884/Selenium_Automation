@smokeTest 
Feature: Verify checkout feature on Automation Practice website

Scenario: User successfully checkout on automation practice website
	Given user go the the automation practic homepage 
	When user click on the sign in button 
	And user enter valid email and password
	And user click on sign in button
	Then user navigate to the welcomepage 
	And user verify the page title "My account - My Store"
	Then user go to the upper left corner and click on Dresses 
	And user print all the price values in descending order
	And user select the second dress from that list
	Then user click on proceed to check out button
	And user verify the total price and the shipping fee on checkout page
	Then user sign out
	And user close the window
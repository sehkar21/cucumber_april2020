@tag6
Feature: Adding employee using Excel

@tag6
Scenario Outline: Adding employee using Excel

Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
When the user is on the HomePage and clicks the PIM option
Then user clicks the Add Employee button
And user enters the details "<userdetails>"

Examples: 
		  |userdetails|
		  |1          |
		  |2          |
		  |3          |
		  |4          |
		  |5          |
		  |6          |
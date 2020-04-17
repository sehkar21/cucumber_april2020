@tag5
Feature: checking webtable of Employee list

@tag5
Scenario: checking webtable of Employee list

Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
When the user is on the HomePage and clicks the PIM option
Then user prints the Employee list from the Webtable
@tag4
Feature: Adding photo to Employee profile

@tag4
Scenario: Adding photo to Employee profile

Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
When the user is on the HomePage and clicks the PIM option
Then user clicks the Employee list option
When Employee clicks the employee name from the list
Then employee clciks the photo option and choose photo option
And User clicks the upload photo option
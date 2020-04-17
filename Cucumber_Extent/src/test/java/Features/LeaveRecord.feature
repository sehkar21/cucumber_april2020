@tag3
Feature: Check the Leave record of orangehrm Website
 
  @tag3
  Scenario: Checking then Leave Record of orangehrm website
    
    Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
    When user moves to the Leave option
    And user clicks the LeaveList options
    Then user enter the Leave Record
@tag
Feature: Login into the orangehrm Website
 
  @tag1
  Scenario: Login into orangehrm website
    
    Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
    Then user verifies the Homepage title
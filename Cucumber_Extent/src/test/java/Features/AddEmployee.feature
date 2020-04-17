Feature: Adding new Employee to orangeHrm

Scenario: Adding new Employee

Given the user enter the url of OrangeHrm 
    When user enters the username and password
     |Admin|admin123|
    Then user clicks the Login button
When the user is on the HomePage and clicks the PIM option
Then user clicks the Add Employee button
And user starts adding the employee details
		|firstname|Lastname|Employee_id|Emp_username|Emp_password|Emp_repasssword|
		|sekar    |ms      |001        |sehkar      |csksehkar   |csksehkar      |
		|kumar    |raj     |002        |Rajkumar    |qwerty123   |qwerty123      |
		|mahesh   |manoj   |003        |mahi        |asdfg123    |asdfg123       |

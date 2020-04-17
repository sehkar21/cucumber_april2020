package com.stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;


import com.objectRepo.AddEmployeePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends BaseClass {

	
	@When("^the user is on the HomePage and clicks the PIM option$")
	public void the_user_is_on_the_HomePage_and_clicks_the_PIM_option() throws Throwable {
		AddEmployeePage emp =  new AddEmployeePage(driver);
		Thread.sleep(3000);
		emp.Pim().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		log.info("************clicking PIM****************");
			
	}

	@Then("^user clicks the Add Employee button$")
	public void user_clicks_the_Add_Employee_button() throws Throwable {
		AddEmployeePage emp =  new AddEmployeePage(driver);
			emp.AddEmployee().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		log.info("************clicking Add employee****************");
	}

	@Then("^user starts adding the employee details$")
	public void user_starts_adding_the_employee_details(DataTable details) throws Throwable {
		
		AddEmployeePage emp =  new AddEmployeePage(driver);
		for (Map<String, String> data : details.asMaps(String.class, String.class)) {
			
			emp.Txt_firstname().clear();
			emp.Txt_firstname().sendKeys(data.get("firstname"));
			
			emp.Txt_lastname().clear();
			emp.Txt_lastname().sendKeys(data.get("Lastname"));
			
			emp.Employee_id().clear();
			emp.Employee_id().sendKeys(data.get("Employee_id"));
			
			emp.check_btn().click();
			
			emp.Emp_username().clear();
			emp.Emp_username().sendKeys(data.get("Emp_username"));
			
			emp.Emp_pwd().clear();
			emp.Emp_pwd().sendKeys(data.get("Emp_password"));
			
			emp.Emp_repwd().clear();
			emp.Emp_repwd().sendKeys(data.get("Emp_repasssword"));
			
			emp.Save_btn().click();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			emp.check_btn().click();
		}
		
	}

}

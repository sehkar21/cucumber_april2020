package com.stepdefinition;


import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.objectRepo.AddEmployeePage;
import com.resources.ReadData;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class AddEmployeeExcelSteps extends BaseClass{

	@Then("^user enters the details \"([^\"]*)\"$")
	public void user_enters_the_details(String userdetails) throws Throwable {
		int row = Integer.parseInt(userdetails);
		
		AddEmployeePage emp =  new AddEmployeePage(driver);
		
		
			
			emp.Txt_firstname().clear();
			emp.Txt_firstname().sendKeys(ReadData.getData().get(row).get("firstname"));
			
			emp.Txt_lastname().clear();
			emp.Txt_lastname().sendKeys(ReadData.getData().get(row).get("lastname"));
			
			emp.Employee_id().clear();
			emp.Employee_id().sendKeys(ReadData.getData().get(row).get("employeeid"));
			
			emp.check_btn().click();
			Thread.sleep(3000);
			emp.Emp_username().click();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			emp.Emp_username().sendKeys(ReadData.getData().get(row).get("usernames"));
			
		
			emp.Emp_pwd().sendKeys(ReadData.getData().get(row).get("password"));
			

			emp.Emp_repwd().sendKeys(ReadData.getData().get(row).get("repassword"));
			
			emp.Save_btn().click();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			emp.check_btn().click();
		}
		}
			

		

	
	

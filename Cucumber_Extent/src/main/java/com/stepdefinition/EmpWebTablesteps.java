package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.objectRepo.EmployeelistPage;

import cucumber.api.java.en.Then;

public class EmpWebTablesteps extends BaseClass{

	
	@Then("^user prints the Employee list from the Webtable$")
	public void user_prints_the_Employee_list_from_the_Webtable() throws Throwable {
		EmployeelistPage wb = new EmployeelistPage(driver);
		
			List<WebElement> trows = wb.trow();
	
			for(int i=0;i<trows.size();i++) {
			List<WebElement> tdata = wb.tdata();
			
			
			for(int j=0;j<tdata.size();j++) {
				System.out.println(tdata.get(j).getText()); 
				
		}

		
	}

	}
}
package com.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import com.objectRepo.LeaveRecordPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveRecordSteps extends BaseClass{
	
	
	@When("^user moves to the Leave option$")
	public void user_moves_to_the_Leave_option() throws Throwable {
		LeaveRecordPage leave = new LeaveRecordPage(driver);
		leave.Leave().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		log.info("************clicking Leave option****************");
	}

	@When("^user clicks the LeaveList options$")
	public void user_clicks_the_LeaveList_options() throws Throwable {
		LeaveRecordPage leave = new LeaveRecordPage(driver);
		leave.Leavelist().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		log.info("************clicking Leave Record****************");
	}

	@Then("^user enter the Leave Record$")
	public void user_enter_the_Leave_Record() throws Throwable {
		LeaveRecordPage leave = new LeaveRecordPage(driver);
		
			leave.Leavefrom().click();
			leave.Leavefrom().clear();
			leave.Leavefrom().sendKeys("2018-10-11");
			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			leave.Leaveto().click();
			leave.Leaveto().clear();
			leave.Leaveto().sendKeys("2018-11-10");

		
	}


}

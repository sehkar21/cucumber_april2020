package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.objectRepo.AddPhotoPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddphotoSteps extends BaseClass {

	@Then("^user clicks the Employee list option$")
	public void user_clicks_the_Employee_list_option() throws Throwable {
		AddPhotoPage photo = new AddPhotoPage(driver);
		photo.EmpList().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		
	}

	@When("^Employee clicks the employee name from the list$")
	public void employee_clicks_the_employee_name_from_the_list() throws Throwable {
		AddPhotoPage photo = new AddPhotoPage(driver);
		photo.SelectEmp().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		
	}

	@Then("^employee clciks the photo option and choose photo option$")
	public void employee_clciks_the_photo_option_and_choose_photo_option() throws Throwable {
		AddPhotoPage photo = new AddPhotoPage(driver);
		photo.clickPhoto().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		photo.ChoosePhoto().click();
		
		Screen s = new Screen();
		Pattern fileinputtext = new Pattern("S:\\sikuli\\pictures\\fileinputtext.PNG");
		Pattern openbutton = new Pattern("S:\\sikuli\\pictures\\openbutton.PNG");
		
		
		
		s.wait(fileinputtext,20);
		s.type(fileinputtext, "S:\\sikuli\\fresh-apple-500x500.jpg");
		s.click(openbutton);
		
		
	}
	@Then("^User clicks the upload photo option$")
	public void user_clicks_the_upload_photo_option() throws Throwable {
		AddPhotoPage photo = new AddPhotoPage(driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		log.info("**********clicking the upload button**********");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement uploadbtn = photo.upload();
    	js.executeScript("arguments[0].scrollIntoView(true);", uploadbtn);
    	uploadbtn.click();
    	log.info("**********clicked the upload button**********");
	}


	
	
}

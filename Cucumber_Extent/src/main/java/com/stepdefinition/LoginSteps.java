package com.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.resources.Readconfig;
import com.stepdefinition.BaseClass;
import com.objectRepo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;

public class LoginSteps extends BaseClass {
	
	
	
	public WebDriver driver;
	Readconfig config =new Readconfig();
	public String Baseurl = config.Applicationurl();
	

	@Given("the user enter the url of OrangeHrm")
	public void the_user_enter_the_url_of_OrangeHrm() {
		
		
		
		BaseClass base = new BaseClass();
		driver = base.initialize_driver();
		driver.get(Baseurl);
		log.info("*********Entering the URL***********");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password(DataTable credentials) {
	   
		
		List<List<String>> data = credentials.raw();
		LoginPage login = new LoginPage(driver);
				
				login.setusername().sendKeys(data.get(0).get(0));
				log.info("*********Entering the username***********");
				login.setpassword().sendKeys(data.get(0).get(1));
				log.info("*********Entering the password***********");
		
		
	}

	@Then("user clicks the Login button")
	public void user_clicks_the_Login_button() {
		LoginPage login = new LoginPage(driver);
		login.LoginBtn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("user verifies the Homepage title")
	public void user_verifies_the_Homepage_title() {

			String title = driver.getTitle();
			System.out.println(title);
			
		Assert.assertEquals(title, "OrangeHRM1");
		log.info("*********verifying the Title***********");
	}
	
}

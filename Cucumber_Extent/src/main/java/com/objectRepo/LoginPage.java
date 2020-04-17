package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	 WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement Txt_username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	@CacheLookup
	WebElement Txt_password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	@CacheLookup
	WebElement Login_btn;
	
	public WebElement setusername() {
		return  Txt_username;
	}
	
	public WebElement setpassword() {
		return  Txt_password;
	}
	
	public WebElement LoginBtn() {
		return  Login_btn;
	}
	
	
	
	
}

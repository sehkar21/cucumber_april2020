package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	 WebDriver ldriver;
	
	public AddEmployeePage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	@CacheLookup
	WebElement pim;
	
	@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
	@CacheLookup
	WebElement AddEmployee;
	
	@FindBy(xpath="//input[@id='firstName']")
	@CacheLookup
	WebElement Txt_firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	@CacheLookup
	WebElement Txt_lastname;
	
	@FindBy(xpath="//input[@id='employeeId']")
	@CacheLookup
	WebElement Employee_id;
	
	@FindBy(xpath="//input[@id='chkLogin']")
	@CacheLookup
	WebElement check_btn;
	
	@FindBy(xpath="//input[@id='user_name']")
	@CacheLookup
	WebElement Emp_username;
	
	@FindBy(xpath="//input[@id='user_password']")
	@CacheLookup
	WebElement Emp_pwd;
	
	@FindBy(xpath="//input[@id='re_password']")
	@CacheLookup
	WebElement Emp_repwd;
	
	@FindBy(xpath="//input[@id='btnSave']")
	@CacheLookup
	WebElement Save_btn;
	
	
	public WebElement Pim() {
		return pim;
	}
	
	public WebElement AddEmployee() {
		return AddEmployee;
	}
	public WebElement Txt_firstname() {
		return Txt_firstname;
	}
	public WebElement Txt_lastname() {
		return Txt_lastname;
	}
	public WebElement Employee_id() {
		return Employee_id;
	}
	public WebElement check_btn() {
		return check_btn;
	}
	public WebElement Emp_username() {
		return Emp_username;
	}
	public WebElement Emp_pwd() {
		return Emp_pwd;
	}
	public WebElement Emp_repwd() {
		return Emp_repwd;
	}
	
	public WebElement Save_btn() {
		return Save_btn;
	}
	
}

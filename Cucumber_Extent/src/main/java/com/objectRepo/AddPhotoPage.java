package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPhotoPage {

		WebDriver ldriver;
	
	public AddPhotoPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	@CacheLookup
	WebElement EmpList;
	
	
	@FindBy(xpath="//a[contains(text(),'Linda')]")
	@CacheLookup
	WebElement SelectEmp;
	
	@FindBy(xpath="//img[@id='empPic']")
	@CacheLookup
	WebElement clickPhoto;
	
	@FindBy(xpath="//input[@id='photofile']")
	@CacheLookup
	WebElement ChoosePhoto;
	
	@FindBy(xpath="//input[@id='btnSave']")
	@CacheLookup
	WebElement upload;
	
	
	
	public WebElement EmpList() {
		return EmpList;
	}
	
	public WebElement SelectEmp() {
		return SelectEmp;
	}
	
	public WebElement clickPhoto() {
		return clickPhoto;
	}
	
	public WebElement ChoosePhoto() {
		return ChoosePhoto;
	}
	
	public WebElement upload() {
		return upload;
	}
	
	
	
}

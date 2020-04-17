package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveRecordPage {

	WebDriver ldriver;
	
	public LeaveRecordPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	@CacheLookup
	WebElement Leave;
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveList']")
	@CacheLookup
	WebElement Leavelist;
	
	@FindBy(xpath="//input[@id='calFromDate']")
	@CacheLookup
	WebElement Leavefrom;
	
	@FindBy(xpath="//input[@id='calToDate']")
	@CacheLookup
	WebElement Leaveto;
	
	public WebElement Leave() {
		return Leave;
	}
	public WebElement Leavelist() {
		return Leavelist;
	}
	public WebElement Leavefrom() {
		return Leavefrom;
	}
	public WebElement Leaveto() {
		return Leaveto;
	}
	
	
	
	
}

package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeelistPage {

	WebDriver ldriver;

public  EmployeelistPage(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(tagName="tr")
@CacheLookup
List<WebElement>  trow;

@FindBy(tagName="tr")
@CacheLookup
List<WebElement> tdata;


public List<WebElement> trow() {
	return trow;
}

public List<WebElement> tdata() {
	return tdata;
}

}


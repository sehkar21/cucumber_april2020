package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass   {

	public static WebDriver driver;
	public static Logger log;
	
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static synchronized WebDriver getdriver() {
		return tldriver.get();
	}
	
	@BeforeClass
	public WebDriver initialize_driver() {
		log = Logger.getLogger("OrangeHrm");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver",
				"S:\\New folder\\projectworkplace\\TestNG-Hubspot\\driver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			log.info("*********Opening Chrome***********");
			tldriver.set(driver);
			return getdriver();
	}
	
	
	@AfterClass(alwaysRun= true)
	public void teardown() {
		driver.close();
	}
	
	public  String getScreenshot() {
		String timestamp =new SimpleDateFormat("yyyy.mm.dd.hh.ss").format(new Date());
		File src = ((TakesScreenshot)getdriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getenv("user.dir")+"/screenshots/"+System.currentTimeMillis()+timestamp+".png";
		
		File dest = new File(path);
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return path;
		
	}
	
	public String Randomstring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	
	public String Randomnumber() {
		String generatednumber = RandomStringUtils.randomNumeric(9);
		return (generatednumber);
	}
	
	
}


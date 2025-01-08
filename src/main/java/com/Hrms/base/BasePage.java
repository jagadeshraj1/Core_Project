package com.Hrms.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Hrms.utils.CommanUtils;

public class BasePage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
	CommanUtils.readPropertiesFile();
	CommanUtils.launchBrowserAndNavigateToApp();		
	}
	
	@AfterTest
	public void close() throws Exception {
		
		//driver.quit();	
	}
}

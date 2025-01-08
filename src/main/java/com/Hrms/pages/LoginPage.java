package com.Hrms.pages;

import java.util.Properties;
import org.openqa.selenium.By;
import com.Hrms.utils.CommanUtils;
import com.Hrms.utils.TestNGUtils;

public class LoginPage {
	
	public static Properties properties;
	
	// Web locators
	private final By by_username = By.xpath("//input[@name='txtUserName']");
	private final By by_password = By.xpath("//input[@name='txtPassword']");
	private final By by_signIn = By.xpath("//input[@name='Submit']");
	private final By by_welcomepage = By.xpath("//li[text()='Welcome Selenium']");
	
	
	// Helping functions
	public void login() {
		
		try {
			
			CommanUtils.enterValue(getUsername(), "Selenium",true);
			CommanUtils.enterValue(getPassword(), "Selenium", true);
			CommanUtils.clickElement(getSignIn());
		}catch(Exception e) {
			
			TestNGUtils.assertFail(e.getMessage());
		}
	}
		
	// Getter/Setter functions
	public By getUsername() {
		return by_username;
	}
	
	public By getPassword() {
		return by_password;
	}
	
	public By getSignIn() {
		return by_signIn;
	}

	public By getWelcomePage() {
		return by_welcomepage;
	}
}

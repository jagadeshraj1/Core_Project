package com.Hrms.tests;

import org.testng.annotations.Test;
import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.utils.CommanUtils;
import com.Hrms.utils.TestNGUtils;

public class TestLoginPage extends BasePage{
	
//----------------Page class objects Implementations---------
	LoginPage loginPage = new LoginPage();
	
	
	@Test(description="verify LoginPage",priority=0)
	public void verifyLoginPage() throws Exception {

	loginPage.login();
	CommanUtils.hardWait(5);
	TestNGUtils.assertTrue(CommanUtils.getElementText(loginPage.getWelcomePage()),"Welcome Selenium");
	System.out.println("verified");
	}
	
}
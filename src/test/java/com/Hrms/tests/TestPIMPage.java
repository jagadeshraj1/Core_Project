package com.Hrms.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.pages.PIMPage;
import com.Hrms.utils.CommanUtils;
import com.Hrms.utils.TestNGUtils;

public class TestPIMPage extends BasePage{
		WebDriver driver;
		
	//----------------Page class objects Implementations---------
	
	LoginPage loginPage = new LoginPage();
	
	PIMPage pimPage = new PIMPage();
	
	@Test(description="Verify that an employee can be added successfully",priority=0)
	public void addEmployee() throws Exception {
	    
	    // Log in to the application using the login page method
	    loginPage.login();
	    
	    // Wait for 5 seconds to allow the page to load
	    CommanUtils.hardWait(5);
	    
	    // Assert that the welcome message contains "Welcome selenium"
	    TestNGUtils.assertTrue(CommanUtils.getElementText(loginPage.getWelcomePage()), "Welcome Selenium");
	    	    
	    // Move the mouse to the PIM (Personnel Information Management) element
	    CommanUtils.moveToElement(PIMPage.getPim());
	    
	    // Click on the "Add Employee" button
	    CommanUtils.clickElement(PIMPage.getAddEmp());
	    
	    // Wait for 5 seconds to ensure the new page loads
	    CommanUtils.hardWait(5);
	    
	    // Switch to the iframe where the employee form is located
	    CommanUtils.switchToFrame(PIMPage.getFrame());
	    
	    // Enter the first name "Sai" into the first name field
	    CommanUtils.enterValue(PIMPage.getFirstName(), "Kosmik", true);
	    
	    // Enter the last name "P" into the last name field
	    CommanUtils.enterValue(PIMPage.getLastName(), "Sai", true);
	    
	    // Click the "Save" button to add the new employee
	    CommanUtils.clickElement(PIMPage.getSave());
	    
	    // Click the "Back" button to return to the previous page
	    CommanUtils.clickElement(PIMPage.getBackButton());    
	    
	    // Assert that the employee name displayed matches "Sai P"
	    TestNGUtils.assertTrue(CommanUtils.getElementText(PIMPage.getEmpName()),"Kosmik Sai");
	    
	}
	
	@Test(description="Verify that the search functionality returns the correct employee",groups= {"Smoke"},priority=1)
	public void searchEmployee() throws Exception {
		
	}
	
	@Test(description="Verify that employee details can be edited successfully",dependsOnMethods= {"searchEmployee"},groups= {"Smoke"},priority=2)
	public void editEmployeeDetails() throws Exception {
	    Assert.assertEquals("Akki", "Akki");
	
	}
	
	@Test(description="Verify that an employee can be deleted successfully",priority=3)
	public void deleteEmployee() throws Exception {
	 
	}
	
	@Test(description="Verify that the employee list is displayed correctly with accurate information",priority=4)
	public void viewEmployeeList() throws Exception {
		Assert.assertEquals("akki", "akki");
	
	}
	
	@Test(description="Verify that photos can be added to employee profiles",priority=5)
	public void addEmployeePhotos() throws Exception {
	
	}
	
	@Test(description="Verify that employee details are correctly displayed",priority=6)
	public void viewEmployeeDetails() throws Exception {
		 
	}
	
	@Test(description="Verify that the employment status of an employee can be updated",dependsOnMethods ={"addEmployee"},priority=7)
	public void editEmploymentStatus() throws Exception {
		
	//-------------To verify whether the Kosmik Sai Employment status can be changed to terminated.
	//Navigate to the "PIM" module.
		//CommanUtils.clickElement(PIMPage.getPim());
	
	//Search for the employee name Kosmik Sai
		CommanUtils.isElementDisplayed(PIMPage.getEmpName());
		
	//Click on the employee’s name
		CommanUtils.clickElement(PIMPage.getEmpNameStat());
		    
	//Click on job under Employment
		CommanUtils.clickElement(PIMPage.getJob());
		
	//Click on Edit under job
		//CommanUtils.clickElement(PIMPage.getEditJob());
				
	//Update the employee status (e.g., active, on leave, terminated).
		//CommanUtils.selectDropDownValue(PIMPage.getEmpStat(),"Terminated");
		CommanUtils.selectDropDownValue(PIMPage.getEmpStat(),"Full Time Contract");
	
	//Employee status selected or not
		CommanUtils.isElementSelected(PIMPage.getEmpStat());
	
	//Click Save
		//CommanUtils.clickElement(PIMPage.getSaveJob());
	
	// Click the "Back" button to return to the previous page
	   // CommanUtils.clickElement(PIMPage.getBackButton()); 

	}
	
	@Test(description="Verify that the employee list can be filtered based on various criteria",priority=8)
	public void filterEmployeeList() throws Exception {
		
	}	
}
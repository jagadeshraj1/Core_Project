package com.Hrms.pages;

import org.openqa.selenium.By;
import com.Hrms.utils.CommanUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");  
	private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
	private final static By by_empNameStat = By.xpath("//a[contains(text(),'John')]");
	
	
	private final static By by_job = By.xpath("//*[@id=\"jobLink\"]/span");
	private final static By by_editJob = By.xpath("//input[@id='btnEditJob']");	
	private final static By by_saveJob = By.xpath("//input[@id='btnEditJob']");
	private final static By by_empStat = By.xpath("//select[@name='cmbType']");
	private final static By by_searchName = By.xpath("//input[@name='loc_name']");
	
	// Getter/Setter Helping functions
	public static void clickOnElement() throws Exception {
		CommanUtils.clickElement(getPim());
	}
	
	public static By getPim() throws Exception {
		return by_pim;
	}
		
	public static By getJob() throws Exception {
		return by_job;
	}
	
	public static By getAddEmp() throws Exception {
		return by_addEmp;
	}
	
	public static By getFirstName() throws Exception {
		return by_firstName;
	}
	
	public static By getLastName() throws Exception {
		return by_lastName;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	
	public static By getEmpNameStat() throws Exception {
		return by_empNameStat;
	}
	
	public static By getEditJob() throws Exception {
		return by_editJob;
	}
	
	public static By getEmpStat() throws Exception {
		return by_empStat;
	}
	public static By getSaveJob() throws Exception {
		return by_saveJob;
	}

	//Search Emp name
	public static By getSearchName() throws Exception {
		return by_searchName;
	}

	

}
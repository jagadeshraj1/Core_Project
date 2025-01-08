package com.Hrms.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadPropertyfile {

	Properties config;
	Properties OR;
	WebDriver driver;

	@BeforeClass
	public void intilize() throws IOException{
		
//---------------------------config,properties---------------------------
		//Create the properties object for that config.property files
		config = new Properties();
		
		//Read the config.property file into working environment
		FileInputStream fis = new FileInputStream("D:\\workspace\\coreHRMSProject\\src\\test\\resources\\com\\PropertyFiles\\config.properties");
		
		//Store config.property file into memory space
		config.load(fis);
		
//---------------------------OR.properties--------------------------------
		//Create the properties object for that OR.properties file
		OR = new Properties();
		
		//Read the OR.properties file into working environment
		FileInputStream fiss = new FileInputStream("D:\\workspace\\coreHRMSProject\\src\\test\\resources\\com\\PropertyFiles\\OR.properties");
		
		//Store OR.properties file into memory space
		OR.load(fiss);
		
//-------------------------BrowserSetUp-------------------------------------
		if(config.getProperty("browser").equals("Firefox")) {
		
			driver=new FirefoxDriver();
		}else {
			
			System.out.println("Unable to launch the Firefox browser");
			}
	}
	
	@Test
	public void login() throws Exception{
		
		//nagivate the URL
		driver.get(config.getProperty("TestSiteName"));
		
		//Enter UserName, Password & click login
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys("Selenium");
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("Selenium");
		driver.findElement(By.name(OR.getProperty("login"))).click();
		
		//wait for 3secs & click logout
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
		}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}		
}
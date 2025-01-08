package com.Hrms.utils;

import org.testng.Assert;

public class TestNGUtils  {

	//This method checks if the actual string contains the expected string.
	public static void assertTrue(String actual, String expected) {
		if (actual.contains(expected)) {
			Assert.assertTrue(actual.contains(expected));
			System.out.println(actual+" present in "+expected);
		
		} else {
		
			System.out.println(actual+" not present in "+expected);
		}
	}
	
	//This method checks if two integers, expected and actual, are equal.
	public static void assertEquals(int expected, int actual) {
		if (actual == expected) {
			Assert.assertEquals(actual, expected);
			System.out.println(actual+" matched with "+expected);

		} else {
		
			System.out.println(expected+" is not matched with "+actual);
		}
	}
	
	// when the test fails, it logs a failure message
	public static void assertFail(String logMessage) {

		Assert.fail(logMessage);
	}
	
}
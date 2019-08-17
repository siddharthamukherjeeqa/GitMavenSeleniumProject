package com.sidmukhe.testngtest;



import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SetFour {

	@Test
	public void pass() {
		System.out.println("One");
	}
	@Test
	public void failed() throws AssertionError{
		System.out.println("Two");
		Assert.assertEquals("1", "2");
		
	}
	@Test
	public void Three() {
		System.out.println("Three");
	}
	@AfterMethod
	public void onTestFailure(ITestResult result) {
		//if test is failed
		Reporter.log("onTestFailure : "+ result.getName());
	}
}

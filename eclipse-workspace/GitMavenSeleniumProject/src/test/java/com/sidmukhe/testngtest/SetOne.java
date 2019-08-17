package com.sidmukhe.testngtest;

import org.testng.annotations.Test;

public class SetOne {

	@Test (groups = {"Sanity","Regression"})
	public void sanitylogin() {
		System.out.println("Login is successful");
	}
	@Test (groups = {"Sanity", "Regression"})
	public void sanitylogout() {
		System.out.println("Logout is successful");
	}
	@Test (groups = {"Sanity", "Regression"})
	public void createProfile() {
		System.out.println("Profile Creation is successful");
	}
	@Test (groups = {"Regression"})
	public void deleteProfile() {
		System.out.println("Profile deletion is successful");
	}
	@Test (groups = {"Regression"})
	public void editProfile() {
		System.out.println("Profile modification is successful");
	}
	
}

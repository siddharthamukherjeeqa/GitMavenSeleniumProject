package com.sidmukhe.testngtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SetTwo {

	WebDriver driver;
  @Test(dataProvider = "getData")
  public void fTest(String one, String two, String three, String four, String five) {
	  driver.get("https://accounts.google.com/signup");
	  driver.findElement(By.id("firstName")).sendKeys(one);
	  driver.findElement(By.id("lastName")).sendKeys(two);
	  driver.findElement(By.id("username")).sendKeys(three);
	  driver.findElement(By.name("Passwd")).sendKeys(four);
	  driver.findElement(By.name("ConfirmPasswd")).sendKeys(five);
	  driver.findElement(By.xpath("//*[text()='Next']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.close();
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before Class annotations");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After Class annotations");
  }

  @BeforeTest()
  public void beforeTest() {
	  driver.get("https://accounts.google.com/signup");
	  driver.findElement(By.id("firstName")).sendKeys("Siddhartha");
	  driver.findElement(By.id("lastName")).sendKeys("Mukherjee");
	  driver.findElement(By.id("username")).sendKeys("siddharthamukherjeeqa");
	  driver.findElement(By.name("Passwd")).sendKeys("siddharthamukherjeeqa");
	  driver.findElement(By.name("ConfirmPasswd")).sendKeys("siddharthamukherjeeqa");
	  driver.findElement(By.xpath("//*[text()='Next']")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  WebElement val = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='That username is taken. Try another.']")));
	  System.out.println(val.getText());
	  System.out.println("This is Before Test annotations");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After test annotations");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\geckodriver-v0.20.1-win64\\\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  System.out.println("Webdriver is initialized in before Suite method");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
	  System.out.println("webdriver session is ended");
  }

  @DataProvider
  public Object[][] getData(){
	  Object[][] data = new Object[2][5];
	  data[0][0] = "Siddhartha";
	  data[0][1] = "Mukherjee";
	  data[0][2] = "siddharthamukherjeeqa";
	  data[0][3] = "siddharthamukherjeeqa";
	  data[0][4] = "siddharthamukherjeeqa";
	  data[1][0] = "Siddhartha";
	  data[1][1] = "Mukherjee";
	  data[1][2] = "siddhartha.automationqa";
	  data[1][3] = "siddharthamukherjeeqa";
	  data[1][4] = "siddharthamukherjeeqa";
	  return data;
  }
}

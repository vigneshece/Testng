package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Url_Launch {
	WebDriver driver;

	@BeforeSuite
	private void set() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vigneshwaran\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();

	}
   
	@Test
   private void google() {
	   
	   driver.get("https://www.google.com/");  
   }

	@AfterSuite
  private void cl() {
	
    driver.close();
}
}




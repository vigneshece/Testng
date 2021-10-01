package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	@Test
	private void gog() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vigneshwaran\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
         
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	
	@Test
	private void yaho() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vigneshwaran\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
         
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.close();
       
		
	}
	
	

}

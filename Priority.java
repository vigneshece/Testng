package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(invocationCount = 2)
	private void arun() {
		
		System.out.println("i m arun");

	}
	
//	@Test( dependsOnMethods = "arun")
//	private void balu() {
//		
//		System.out.println("i m balu");
//
//	}
//	
	@Test(enabled = true) // ignore
	private void chandru() {
		System.out.println("i m chandru");

	}
	
	@Test(priority = -1)
	private void saran() {
	    System.out.println("i m saran");
     
	}
	

}

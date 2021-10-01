package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {
	
	@Test
	@Parameters("test1")
	private void ab(String name) {
		System.out.println(name);

	}
	
	@Test
	@Parameters("test")
	private void bc(int age) {
		System.out.println(age);
	}
	
//	@Test(groups = "s")
//	private void cd() {
//		System.out.println("cd");
//	}
//	
//	@Test(groups = "t")
//	private void ef() {
//		System.out.println("ef");
//	}

}

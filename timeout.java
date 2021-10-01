package com.TestNG;

import org.testng.annotations.Test;

public class timeout {
	
      @Test	
	  private void aa() {
    	  
    	  System.out.println("i m in condition of non  time out");

	}
     
      @Test(timeOut = 3000)
     private void bb() throws InterruptedException {
          
    	//  Thread.sleep(2000);
    	  System.out.println("i m in condition of time out ");
	}

      
      @Test(expectedExceptions = ArithmeticException.class)
      private void cc() {
      
    	  int a=5;
    	  System.out.println(a/0);
    	  
	}
      
      @Test(expectedExceptions = NullPointerException.class)
      private void dd() {
       
    	  String name = null;
    	  System.out.println(name.length());
	}
      
      
}




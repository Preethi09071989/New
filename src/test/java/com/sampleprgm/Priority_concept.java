package com.sampleprgm;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_concept {
  @Test(priority = -1)
	  
	  private static void orderplacediphone() {
		  System.out.println("Iphone");
	  }
	  
	  @Test(priority = 0)
	 
	  private static void orderplacedmotog9() {
		  System.out.println("Moto g9");
	  }
	  
	  @Test(priority = 1)
	  
	  private static void orderplacedvivo() {
		  System.out.println("Vivo");
	}
@Test(invocationCount = 5)
	  
	  private static void orderplacedapple() {
		  System.out.println("Apple");
	}
	}
  


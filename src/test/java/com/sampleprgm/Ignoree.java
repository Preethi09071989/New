package com.sampleprgm;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoree {
  @Test(enabled = true)
  private static void orderplacediphone() {
	  System.out.println("Iphone");
  }
  
  @Ignore
  @Test
 
  private static void orderplacedmotog9() {
	  System.out.println("Moto g9");
  }
  
  @Test
  
  private static void orderplacedvivo() {
	  System.out.println("Vivo");
}
}
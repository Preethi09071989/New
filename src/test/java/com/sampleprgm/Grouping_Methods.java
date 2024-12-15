package com.sampleprgm;

import org.testng.annotations.Test;

public class Grouping_Methods {
  @Test(groups = "mobile")
  public void motorola() {
	  System.out.println("Moto g9");
  }
  
  @Test(groups = "mobile")
  public void Vivo() {
	  System.out.println("Y27");
  }
  
  @Test(groups = "mobile")
  public void Nokia() {
	  System.out.println("Button Phone");
  }
  
  @Test(groups = "Laptop")
  public void Hplap() {
	  System.out.println("Price : 35,999");
  }
  
  @Test(groups = "Laptop")
  public void DellLap() {
	  System.out.println("Price : 54,000");
  }
  
  @Test(groups = "Laptop")
  public void Lenova() {
	  System.out.println("Price : 37,999");
  }	
}

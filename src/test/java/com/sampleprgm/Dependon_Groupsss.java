package com.sampleprgm;

import org.testng.annotations.Test;

public class Dependon_Groupsss {

  
  @Test(groups = "mobile", dependsOnGroups = "Laptop")
  public void motorola() {
	  System.out.println("Moto g9");
  }
  
  @Test(groups = "mobile", dependsOnGroups = "Laptop")
  public void Vivo() {
	  System.out.println("Y27");
  }
  
  @Test(groups = "mobile", dependsOnGroups = "Laptop")
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



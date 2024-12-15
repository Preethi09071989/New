package com.sampleprgm;

import org.testng.annotations.Test;
//Timeout Test Concept
public class Waitt_Concept {
	
  @Test(timeOut = 3000)
  public void name() {
	  System.out.println("This method has to be executed after 3 sec");
  }
}

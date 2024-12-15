package com.sampleprgm;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DependonMethodsss {
  @Test
  public void browserlaunch(){
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");
  }
  @Test(dependsOnMethods = "browserlaunch")
  
  private void randomvdoselected() {
	  System.out.println("Random Vdo Selected");
  
	  
  }
}

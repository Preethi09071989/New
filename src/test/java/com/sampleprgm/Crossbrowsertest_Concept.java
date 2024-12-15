package com.sampleprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowsertest_Concept {
	 @Test
	  public void browserlaunch() {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		  
	  }
	  @Test
	  public void secondbrowserlaunch() {
		  
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.facebook.com/");
  }
}

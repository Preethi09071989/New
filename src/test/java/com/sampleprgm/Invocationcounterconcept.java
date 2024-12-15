package com.sampleprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocationcounterconcept {
	WebDriver driver;
  @Test (invocationCount = 3)
  public void browserlaunch() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.Instagram.com/");
	  driver.close();
  }
}

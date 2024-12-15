package com.sampleprgm;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltest_Concept {
  @Test
  public void browserlaunch() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  
  }
  @Test
  public void secondbrowserlaunch() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  
}}

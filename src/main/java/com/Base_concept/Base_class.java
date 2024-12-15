package com.Base_concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
  //Browserlaunch
	//url launch
	//Screenshot
	//wait
	//actions
	//Closebrowser
	
	static WebDriver driver;
	
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void url(String s) {
		driver.get(s);
		
	}
	
	public static void screenshot(String save) throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Hp\\eclipse-workspace\\TestNG_sample\\Screenshot\\" + save);
		FileHandler.copy(screenshotAs, destFile);
	}
	public static void close() {
		driver.close();
		
	}
	
	public static void sleep(int a) throws InterruptedException{
	
	Thread.sleep(a);
}}

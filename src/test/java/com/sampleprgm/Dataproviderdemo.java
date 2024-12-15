package com.sampleprgm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderdemo {
	@Test(dataProvider = "testdata")
	public void test(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("user-name"));
		element.sendKeys(username);
		WebElement element1 = driver.findElement(By.name("password"));
		element1.sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.visibilityOf(element));
		//System.out.println("Completed");
	}
	@DataProvider(name = "testdata")
	public Object[][] multipledatas(){
		return new Object[][] {
			//{"username","password"}
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			
			
		
		};

		}}

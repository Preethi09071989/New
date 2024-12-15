package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base_concept.Pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom_runner {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement element = driver.findElement(By.id("email"));
		//element.sendKeys("Preethi");
		
		Pom_class aClass = new Pom_class(driver);
		WebElement user = aClass.getUser();
		user.sendKeys("Preethi");
		
		
		
	}

}

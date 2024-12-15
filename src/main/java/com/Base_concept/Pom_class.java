package com.Base_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Pom_class {
	
	WebDriver driver;
	@FindBy(id="email")
	private WebElement user;
	
	public Pom_class(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getUser() {
		return user;
	}
 
}


//POM= project object model
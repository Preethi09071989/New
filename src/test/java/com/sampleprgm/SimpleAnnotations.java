package com.sampleprgm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleAnnotations {
  @Test
  public void orderplace() {
	  System.out.println("Moto G9");  
  }
  @Test
  public void Orderplace() {
	  System.out.println("Vivo");  
  }
  @BeforeMethod
  public void searchproduct() {
	  System.out.println("Search Product");  
  }

  @AfterMethod
  public void orderId() {
	  System.out.println("Order ID Genearted");  
  }

  @BeforeClass
  public void login() {
	  System.out.println("Login in an Application");  
  }

  @AfterClass
  public void logout() {
	  System.out.println("Logout");  
  }

  @BeforeTest
  public void geturl() {
	  System.out.println("Get URL");  
  }

  @AfterTest
  public void deletecookies() {
	  System.out.println("User details not save");  
  }

  @BeforeSuite
  public void browserlaunch() {
	  System.out.println("Browser Launched");  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("BrowserClose");  
  }

}

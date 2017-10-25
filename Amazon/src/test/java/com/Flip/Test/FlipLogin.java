package com.Flip.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FlipLogin {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("in flip");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

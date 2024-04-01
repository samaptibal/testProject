package com.crm.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;


public class HomePagesTest extends BaseClass {
  @Test(priority=1)
  public void verifyAppUrl() {
	  Assert.assertTrue(HP1.getAppUrl().contains("crm"), "URL is wrong");
	  System.out.println("Url is valid: " + HP1.getAppUrl());
  }
  @Test(priority=2)
  public void verifyTitle() {
	  Assert.assertTrue(HP1.getAppTitle().contains("Service"), "Title does not match");
	  System.out.println("Title mismatched! : " + HP1.getAppTitle());
  }
  @Test(priority=3)
  public void verifySignIn() {
	  HP1.getSignIn();
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Login Failed");
	  System.out.println("Login failed : " + driver.getCurrentUrl());
  }
}

package com.crm.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test
  public void verifyLogin() {
	  LP1.doLogin("test@gmail.com", "test123");
  }
}

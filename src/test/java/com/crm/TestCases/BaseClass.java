package com.crm.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.crm.pages.HomePages;
import com.crm.pages.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public HomePages HP1;
	public LoginPage LP1;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		HP1 = new HomePages(driver);
		LP1 = new LoginPage(driver);

	    }
}

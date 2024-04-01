package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By email=By.id("email-id");
	By pas=By.id("password");
	By btn=By.id("submit-id");
	public void doLogin (String em,String pw) {
		driver.findElement(email).sendKeys(em);
		driver.findElement(pas).sendKeys(pw);
		driver.findElement(btn).click();
		
	}
	

}

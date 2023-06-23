package com.advanto.scripts;

import org.testng.annotations.Test;

import com.advanto.pom.LoginPOM;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyValidLogin()
	{
		LoginPOM loginPom = new LoginPOM(driver);
		
		loginPom.enterUsername("Admin");
		loginPom.enterPassword("admin123");
		loginPom.clickLoginBtn();
	}
	@Test
	public void verifyInvalidLogin()
	{
		LoginPOM loginPom = new LoginPOM(driver);
		loginPom.enterUsername("admin");
		loginPom.enterPassword("Admin123");
		loginPom.clickLoginBtn();
	}
	

}

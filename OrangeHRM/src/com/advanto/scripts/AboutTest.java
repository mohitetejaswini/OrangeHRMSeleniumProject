package com.advanto.scripts;

import org.testng.annotations.Test;

import com.advanto.pom.AboutPOM;
import com.advanto.pom.HomePOM;
import com.advanto.pom.LoginPOM;

public class AboutTest extends BaseTest{
	@Test
	public void verifyVersionNumber()
	{
		LoginPOM loginPom = new LoginPOM(driver);
		loginPom.enterUsername("Admin");
		loginPom.enterPassword("admin123");
		loginPom.clickLoginBtn();
		
		
		HomePOM home = new HomePOM(driver);
		home.clickUserProfile();
		home.clickAboutOption();
		
		AboutPOM about = new AboutPOM(driver);
		about.verifyVersion("OrangeHRM OS 5.4");
	}

}

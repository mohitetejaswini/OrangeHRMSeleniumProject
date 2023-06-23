package com.advanto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AboutPOM {
	@FindBy(xpath="//p[text()='Version: ']/ancestor::div[contains(@class,'orangehrm-about')]")
	private WebElement actualVer;
	
	public AboutPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyVersion(String expectedVer)
	{
		Assert.assertEquals(actualVer.getText(), expectedVer);
	}
	
	

}

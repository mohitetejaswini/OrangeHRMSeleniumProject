package com.advanto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	@FindBy(className ="oxd-userdropdown-name")
	private WebElement userProfileOP;
	
	@FindBy(linkText = "About")
	private WebElement aboutOP;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutOP;
	
	public HomePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickUserProfile()
	{
		userProfileOP.click();
	}
	public void clickAboutOption()
	{
		aboutOP.click();
		
	}
	public void logoutOption()
	{
		logoutOP.click();
	}
	
}

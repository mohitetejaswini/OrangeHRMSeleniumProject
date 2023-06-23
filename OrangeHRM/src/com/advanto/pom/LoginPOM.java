package com.advanto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM {
		
		@FindBy(name= "username")
		private WebElement username;
		
		@FindBy(name = "password")
		private WebElement password;
		
		@FindBy(css = "button[type='submit']")
		private WebElement loginBtn;
		
		@FindBy(css = "p[class$='oxd-text oxd-text--p oxd-alert-content-text']")
		private WebElement errMsg;
		
		public LoginPOM(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void enterUsername(String user)
		{
			username.sendKeys(user);
		}
		public void enterPassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void clickLoginBtn()
		{
			loginBtn.click();
		}
		
		public void verifyErrorMsg(String expErrMsg)
		{
			Assert.assertEquals(errMsg.getText(), expErrMsg);
		}

	

}

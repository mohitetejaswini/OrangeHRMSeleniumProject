package com.advanto.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
		public WebDriver driver;
		
		@BeforeMethod
		public void launchBrowser()
		{
			System.setProperty("WebDriver.Chrome.driver","‪E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
	        option.addArguments("--remote-allow-origins=*");
	        option.setCapability("ignore-certificate-errors", true);
	        
	        driver = new ChromeDriver(option);
	        
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
//		@AfterMethod
//		public void closeBrowser()
//		{
//			driver.close();
//		}

	}



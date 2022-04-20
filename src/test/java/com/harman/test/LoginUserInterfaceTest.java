package com.harman.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.harman.base.WebDriverWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUserInterfaceTest extends WebDriverWrapper {
	
	@Test()
	
	public void ValidatetitleTest() {
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, "OrangeHRM");

		
		
		
	}	
		
}

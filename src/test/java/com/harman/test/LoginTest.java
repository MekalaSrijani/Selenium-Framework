package com.harman.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.harman.base.WebDriverWrapper;
import com.harman.utilities.DataUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends WebDriverWrapper {
	@Test
	
	public void ValidCredentialTest() 
	{

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}

	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "invalidCredentials")
	public void invalidCredentialTest(String username,String password,String Expectederror) {

		driver.findElement(By.id("txtUsername")).sendKeys("Jhon");
		driver.findElement(By.id("txtPassword")).sendKeys("jhon123");
		driver.findElement(By.id("btnLogin")).click();
		String actualError = driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualError,"Invalid credentials");
		
		
	}

}

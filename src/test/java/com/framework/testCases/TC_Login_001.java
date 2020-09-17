package com.framework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobject.LoginPage;

public class TC_Login_001 extends BaseClass
{
	@Test 
	public void loginTest() throws Exception
	{
		
		logger.info("URL opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("user name entered");
		lp.setUserPassword(password);
		logger.info("user password entered");
		Thread.sleep(3000);
		lp.clickSubmit();
		Thread.sleep(3000);
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage1234"))
		{
			logger.info("Login successful");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver, "loginTest");
			logger.info("Login not successful");
			Assert.assertTrue(false);
		}
		
	}
}

package com.framework.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pageobject.LoginPage;
import com.framework.utilities.XLUtils;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class TC_Login_DDT_002 extends BaseClass{
	
	@Test (dataProvider="LoginData")
	public void loginDDT(String username, String password) throws Exception {
		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		logger.info("username : "+username);
		logger.info("password : "+password);
		lp.setUserName(username);
		logger.info("user name entered");
		lp.setUserPassword(password);
		logger.info("user password entered");
		
		lp.clickSubmit();
	
		Thread.sleep(3000);
		if (isAlertPresent() == true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			captureScreen(driver, username + " loginTest");
			logger.warning("Login failed");
			Assert.assertTrue(false);
		} else {
			logger.info("Login successful");
			Assert.assertTrue(true);
			lp.clickLogout();
			Thread.sleep(3000);
			logger.info("Logout successful");
			driver.switchTo().alert().accept(); // close logout alert
			driver.switchTo().defaultContent();
			
		}
	
		
	}
	
	public boolean isAlertPresent() //user define method to check whether Alert metho
	{
		try
		{
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e){
			return false;
			
		}
	}
	
	@DataProvider(name="LoginData")
	String[] []getData() throws IOException{
		String path = System.getProperty("user.dir")+"/src/test/java/com/framework/testData/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount= XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for (int i=1; i<=rownum; i++) {
			for (int j =0; j < colcount; j++ )
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;	
	}
}

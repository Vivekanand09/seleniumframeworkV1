package com.framework.testCases;

import org.testng.annotations.Test;

import com.framework.pageobject.LoginPage;
import com.framework.pageobject.AddCustomerPage;

public class TC_Add_Customer_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setUserPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clicklnkNewCustomer();
		addcust.setCustomerName("Vivek");
		addcust.setCustomerGender("Male");
		addcust.setCustomerDOB("04", "18", "1978");
		
		addcust.setCustomerAddress("Test Address");
		addcust.setCustomerCity("Pune");
		addcust.setCustomerState("Maharastra");
		addcust.setCustomerMobile("8888868350");
		addcust.setCustomerEmail("test@gmail.com");
		addcust.setCustomerPassword("hello");
		
		addcust.clickSubmit();
		
		
	}
	

}

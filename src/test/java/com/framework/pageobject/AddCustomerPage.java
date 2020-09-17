package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkNewCustomer;
	
	@FindBy(name="name")
	WebElement txtCustomername;
	
	@FindBy(name="rad1")
	WebElement rGender;
	
	@FindBy(name="dob")
	WebElement calDob;
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtCity;
	
	@FindBy(name="state")
	WebElement txtState;
	
	@FindBy(name="pinno")
	WebElement txtPinno;
	
	@FindBy(name="telephoneno")
	WebElement txtTelephoneno;
	
	@FindBy(name="emailid")
	WebElement txtEmailid;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="sub")
	WebElement btnSubmit;
	
	@FindBy(name="res")
	WebElement btnReset;
	
	public void clicklnkNewCustomer()
	{
		lnkNewCustomer.click();
	}
	
	public void setCustomerName(String name)
	{
		txtCustomername.sendKeys(name);
	}
	
	public void setCustomerGender(String gender)
	{
		rGender.click();
	}
	
	public void setCustomerDOB(String mm, String dd, String yy)
	{
		calDob.sendKeys(mm);
		calDob.sendKeys(dd);
		calDob.sendKeys(yy);
	}
	
	
	public void setCustomerAddress(String Addr)
	{
		txtAddress.sendKeys(Addr);
	}
	
	public void setCustomerCity(String city)
	{
		txtCity.sendKeys(city);
	}
	public void setCustomerState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void setCustomerPin(String pinno)
	{
		txtPinno.sendKeys(pinno);
	}
	
	public void setCustomerMobile(String mobileno)
	{
		txtTelephoneno.sendKeys(mobileno);
	}
	
	public void setCustomerEmail(String emailid)
	{
		txtEmailid.sendKeys(emailid);
	}
	
	public void setCustomerPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	public void clickReset()
	{
		btnReset.click();
	}
}

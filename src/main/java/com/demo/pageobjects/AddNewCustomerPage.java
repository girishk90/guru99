package com.demo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BaseUI;

public class AddNewCustomerPage extends BaseUI {

	public AddNewCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="name")
	WebElement customerNameTxt;
	
	@FindBy(id="dob")
	WebElement calenderTxt;

	@FindBy(name="addr")
	WebElement addressTxt;
	
	@FindBy(name="city")
	WebElement cityTxt;
	
	@FindBy(name="state")
	WebElement stateTxt;
	
	@FindBy(name="pinno")
	WebElement pinNumTxt;
	
	@FindBy(name="telephoneno")
	WebElement mobileNumTxt;
	
	@FindBy(name="emailid")
	WebElement emailIDTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(name="sub")
	WebElement submitBtn;
	
	
	
	public void addCustName(String newName)
	{
		
	}
	
	public void addCustDOB(String dob)
	{
		calenderTxt.sendKeys(dob);
	}
	
	
	public void addCustAddress(String address)
	{
		addressTxt.sendKeys(address);
	}
	
	
	public void addCustCity(String city)
	{
		cityTxt.sendKeys(city);
	}
	
	
	public void addCustState(String state)
	{
		stateTxt.sendKeys(state);
	}
	
	public void addCustPin(String pinCode)
	{
		pinNumTxt.sendKeys(pinCode);
	}
	public void addCustPhoneNumber(String phoneNumber)
	{
		mobileNumTxt.sendKeys(phoneNumber);
	}
	
	public void addCustEmail(String email)
	{
		emailIDTxt.sendKeys(email);
	}
	
	public void addCustPassword(String newPassword)
	{
		passwordTxt.sendKeys(newPassword);
	}
	
	public void submitNewCustomer()
	{
		submitBtn.click();	
	}
	
}

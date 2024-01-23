package com.demo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BaseUI;

public class LoginPage extends BaseUI{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	WebElement userNameTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(name="btnLogin")
	WebElement submitBtn;
	
	@FindBy(name="btnReset")
	WebElement resetPwdBtn;
	
	
	public HomePage loginApplication(String uName,String Psd)
	{
		userNameTxt.sendKeys(uName);
		passwordTxt.sendKeys(Psd);
		submitBtn.click();
		return new HomePage();
	}
	
	
	
}

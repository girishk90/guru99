/**
 * 
 */
package com.demo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.BaseUI;

/**
 * @author Girish
 *
 */
public class HomePage extends BaseUI {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(linkText="New Customer")
	WebElement newCustomenrMenu;
	
	public AddNewCustomerPage navigateToNewCustomerCreation()
	{
		newCustomenrMenu.click();
		return new AddNewCustomerPage();
	}
	
	
	
	
	
	
	
	
	
	
}

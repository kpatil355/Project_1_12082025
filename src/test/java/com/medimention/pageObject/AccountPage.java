package com.medimention.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLSelectElement;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver dd) {
		super(dd);
		
	}
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	WebElement dashboard;
	
//	@FindBy(xpath="//label[text()='Private']")
//	WebElement optionprivate;	
//	@FindBy(id="Category")
//	WebElement category;		
//	@FindBy(xpath="//option[text()='General']")
//	WebElement generaloption;
	
	@FindBy(xpath="//b[@class='caret']")
	WebElement services;
	
	List <WebElement> dropdownoptions = dd.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label[@class='checkbox']"));
		
	
	public String dashboard()
	{
		return dashboard.getText();
	}
	
	public void service()
	{
		services.click();
	}
	public void dropdownoptions()
	{
		dropdownoptions.getFirst().click();
		//dropdownoptions.get(2).click();
	}
//	public void optionbtn()
//	{
//		optionprivate.click();
//	}
//	public void category()
//	{
//		category.click();
//	}//	
//	public void generalopt()
//	{
//		generaloption.click();	
//	}
	
}

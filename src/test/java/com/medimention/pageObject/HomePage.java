package com.medimention.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	public HomePage(WebDriver dd) {
		super(dd);
		}	
	@FindBy(xpath="//a[text()='Join Us']")
	WebElement joinus;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//button/span[text()='Login']")
	WebElement userloginbtn;	
	
	@FindBy(xpath="//i[@class='ace-icon fa fa-caret-down']")
	WebElement selectcity;
	
	@FindBy(xpath="//a[@href='https://medimention.com/home/delCity']")
	WebElement changecity;

	@FindBy(id="cityids")
	WebElement cityDropdown;
	
	@FindBy(xpath="//button[text()='Save changes']")
	WebElement savechanges;
	
	public void joinusclick()
	{
		joinus.click();
	}
	
	public void login()
	{
		login.click();
	}	
	public void selectcity()
	{
		selectcity.click();
	}		
	public void userloginbtn()
	{
		userloginbtn.click();
	}
	public void changecity()
	{		
		changecity.click();
	}
	public void citylogic()
	{		
		 Select select = new Select(cityDropdown);
		  String desiredValue = "42";
		  boolean valueFound = false;
		  List<WebElement> allOptions = select.getOptions();

         
          for (WebElement option : allOptions) {
              if (option.getDomAttribute("value").equals(desiredValue)) {
                  valueFound = true;
                  select.selectByValue(desiredValue);
                  System.out.println("Selected value: " + desiredValue);
                  //break;
              }
          }
	}
	
	public void savebutton()
	{
		savechanges.click();
	}

}

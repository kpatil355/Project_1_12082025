package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends BasePage{

	public CreateAccount(WebDriver dd) {
		super(dd);
		
	}

	@FindBy(xpath="//button[@data-id='UserRole']")
	WebElement userrole;

	@FindBy(xpath="//span[text()='Diagnostic Center']")
	WebElement optionselect;
	
	@FindBy(xpath="//input[@id='DetailName']")
	WebElement detailname;		
			
	
	@FindBy(xpath="//input[@id='UserUsername']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='UserEmail']")
	WebElement email;	
	
	@FindBy(xpath="//input[@id='UserPassword']")
	WebElement password;		
	
	
	@FindBy(xpath="//input[@id='UserPassword1']")
	WebElement confirmpass;
	
	
	@FindBy(xpath="//input[@name='terms']")
	WebElement checkbox;
	
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//input[@id='UserUsername']")
	WebElement userusername;
	
	@FindBy(xpath ="//input[@id='UserPassword']")
	WebElement useruserpass;
	
	@FindBy(xpath="//button//span[text()='Login']")
	WebElement useruserloginbtn;

	public void userrole()
	{
		userrole.click();
	}		

	public void optionselect()
	{
		optionselect.click();
	}		

	public void detailname(String name)
	{
		detailname.sendKeys(name);
	}		

	public void username(String enterusername)
	{
		username.sendKeys(enterusername);
	}		
	
	public void email(String mail)
	{
		email.sendKeys(mail);
	}				

	public void password(String pass)
	{
		password.sendKeys(pass);
	}		

	public void confirmpass(String pass2)
	{
		confirmpass.sendKeys(pass2);
	}
	

	public void checkbox()
	{
		checkbox.click();
	}
	
	public void register()
	{
		register.click();
	}
	
	public void goback()
	{
		dd.navigate().back();
	}

	public void userusername(String uuname)
	{
	userusername.sendKeys(uuname);
	}
	
	public void useruserpass(String upass)
	{
		useruserpass.sendKeys(upass);
	}
	
	public void userloginbtn() {
		
		useruserloginbtn.click();
	}
}

package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
		
	@FindBy(xpath ="//a[text()='About']")	
	WebElement aboutbtn;
		
	@FindBy(xpath ="//a[text()='Features']")	
	WebElement featurebtn;
	
	@FindBy(xpath ="//a[text()='Bottom']")	
	WebElement Bottombtn;
	
	@FindBy(xpath ="//a[text()='Home']")	
	WebElement Homebtn;
	
	
	public void aboutbtn()
	{
		aboutbtn.click();
	}
	
	public void featurebtn()
	{
		featurebtn.click();
	}
	
	public void Bottombtn()
	{
		Bottombtn.click();
	}
	
	public void Homebtn()
	{
		Homebtn.click();
	}
	
	@FindBy(id = "banner-name")
	WebElement bannername;
	
	
	@FindBy(id="banner-email")
	WebElement banneremail;
	
	@FindBy(id="banner-phone")
	WebElement bannerphone;
	
	@FindBy(id="touchget")
	WebElement bannerbutton;
	
	public void entername(String name)
	{
		bannername.sendKeys(name);
	}
	
	public void enteremail(String email)
	{
		banneremail.sendKeys(email);
	}
	public void enterphone(String number) {
		bannerphone.sendKeys(number);
	}
	public void clickbutton()
	{
		bannerbutton.click();
	}
	
}

package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver dd;
	public BasePage(WebDriver dd)
	{
		this.dd=dd;
		PageFactory.initElements(dd, this);
		dd.get("https://medimention.com");
		dd.manage().window().maximize();
		
	}
}


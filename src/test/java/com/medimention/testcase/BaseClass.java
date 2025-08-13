package com.medimention.testcase;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	
	public WebDriver driver;
	public Properties p;
	
@BeforeClass
@Parameters({"os","br","url"})
public void setUp(String os, String br, String url) throws IOException 	
{
	//loading config properties
//	FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
//	p = new Properties();
//	p.load(file);

	switch(br)
	{
	case "chrome":driver = new ChromeDriver();break;
	case "firefox":driver = new FirefoxDriver();break;
	default:System.out.println("Invalid browser");return;
	}
	//dd= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();
	//dd.get(p.getProperty("Url"));
//	dd.get("https://medimention.com");
	driver.manage().window().maximize();
}
@AfterClass
 public void teardown()
 {
	driver.quit();
 }
 
 public String randomstring()
 {
	 String generatString = RandomStringUtils.randomAlphabetic(6);
	 return generatString;
			 
 }
 
 public String randomNumber()
 {
	 String generateNumber = RandomStringUtils.randomNumeric(10);
	 return generateNumber;
 }
 
 public String randomalphanum()
 {
	 String generatalphanum = RandomStringUtils.randomAlphanumeric(14);
	 return generatalphanum;
 }
}

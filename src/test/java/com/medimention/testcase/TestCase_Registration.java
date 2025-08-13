package com.medimention.testcase;


import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLSelectElement;

import com.github.javafaker.Faker;
import com.medimention.pageObject.AccountPage;
import com.medimention.pageObject.CreateAccount;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MainPage;

public class TestCase_Registration extends BaseClass{

	
	//@Test
	public void account_register() throws InterruptedException, IOException
	{
		//WebDriver dd = new ChromeDriver();
		MainPage mp = new MainPage(driver);
		HomePage hp = new HomePage(driver);
		CreateAccount ca = new CreateAccount(driver);
		AccountPage ap = new AccountPage(driver);
		Faker fake = new Faker();
		//this.dd.manage().timeouts().implicitlyWait(Duration.oSeconds(15));
		String pass = fake.internet().password();
		String fullname =fake.name().fullName();
		String username=fake.name().username().replace(".", "");
		String mail =fake.internet().emailAddress();
				
//		mp.usename();
//		mp.password();
//		mp.loginbtn();
//		mp.aboutbtn();
//		Thread.sleep(2000);
//		mp.featurebtn();
//		Thread.sleep(2000);
//		mp.Bottombtn();
//		Thread.sleep(2000);
		mp.Homebtn();
		
		Thread.sleep(1000);
	
		hp.joinusclick();
	ca.userrole();
	ca.optionselect();
	ca.detailname(fullname);
	ca.username(username);
	Thread.sleep(4000);
	ca.email(mail);
	ca.password(pass);
	ca.confirmpass(pass);
	
	FileOutputStream File = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\Writitng.xlsx");		
	
	XSSFWorkbook wb = new XSSFWorkbook();
	
	XSSFSheet sheet = wb.createSheet("Data");
		
		XSSFRow row1= sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Mail");
		row1.createCell(1).setCellValue("Password");
		row1.createCell(2).setCellValue("Fullname");
		row1.createCell(3).setCellValue("Username");
		
		XSSFRow row2= sheet.createRow(1);
		
		row2.createCell(0).setCellValue(mail);
		row2.createCell(1).setCellValue(pass);
		row2.createCell(2).setCellValue(fullname);
		row2.createCell(3).setCellValue(username);
		
		
		wb.write(File);
		wb.close();
	File.close();
		
	ca.checkbox();	
//ca.register();
	WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", register);
Thread.sleep(4000);
//assertion

boolean dash_name=ap.dashboard().contains(fullname);
Assert.assertTrue(dash_name);
System.out.println("Assertion passed");
//	WebDriverWait wait = new WebDriverWait(dd, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(register)).click();
//	JavascriptExecutor js = (JavascriptExecutor) dd;
//	js.executeScript("arguments[0].click();", register);
//	Thread.sleep(4000);	
ap.service();
ap.dropdownoptions();
// ap.optionbtn();
// ap.category();
//ap.generalopt();

	//dd.navigate().back();
		//ca.goback();
		//Thread.sleep(4000);
		//hp.login();
		//ca.userusername("Komal123");		
		//ca.useruserpass("12345678");
		
		//Thread.sleep(2000);
		
		//hp.userloginbtn();

	}

}

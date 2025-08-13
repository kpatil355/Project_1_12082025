package com.medimention.testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.medimention.pageObject.CreateAccount;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MainPage;



public class TestCase_Login extends BaseClass{
	
	@Test
	public void testvolidlogin() throws InterruptedException, IOException
	{
		HomePage hp = new HomePage(driver);
		MainPage mp= new MainPage(driver); 
		CreateAccount ca = new CreateAccount(driver);
	
		
		mp.entername(randomstring());
		
		//mp.enteremail(randomstring());
		Thread.sleep(1000);
		mp.enteremail("kpatil355@gmail.com");
		Thread.sleep(1000);
		mp.enterphone(randomNumber());
		Thread.sleep(1000);
		mp.clickbutton();
		Thread.sleep(5000);
		
		mp.aboutbtn();
		Thread.sleep(2000);
		mp.featurebtn();
		Thread.sleep(2000);
		mp.featurebtn();
		mp.Homebtn();
		hp.login();

		//Validating valid credential of username
				//ca.userusername();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Writitng.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook(fs);
				XSSFSheet sheet = wb.getSheet("Data");
			    int lastRowNum = sheet.getLastRowNum();
				  XSSFRow lastRow = sheet.getRow(lastRowNum);
			        String username = lastRow.getCell(3).getStringCellValue();
			        String password = lastRow.getCell(1).getStringCellValue();

			        ca.userusername(username);
			        ca.useruserpass(password);
			      //ac.password2(password);
			        ca.userloginbtn();
			        
			        wb.close();
			        fs.close();
				
	}

	
}

package com.medimention.testcase;
import org.testng.annotations.Test;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MainPage;

public class TestCase_Selectcity extends BaseClass{
	
	@Test
	public void selectcity() throws InterruptedException
	{
		MainPage mp = new MainPage(driver);
		HomePage hp = new HomePage(driver);	
		mp.Homebtn();
		hp.selectcity();
		Thread.sleep(1000);
		hp.changecity();
		Thread.sleep(5000);
		hp.citylogic();	
		Thread.sleep(3000);
		hp.savebutton();
	
		
	}
}


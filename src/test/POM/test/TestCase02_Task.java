package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ActiTimeHomePage;
import pages.ActiTimeLoginPage;

public class TestCase02_Task extends BaseTest {
	//static WebDriver driver;
	@Test
	public void testCase02_OpenTask() throws Exception
	{
		BaseTest btBasetest=new BaseTest();
		btBasetest.launchBrowser();
		
		ActiTimeLoginPage actiTimeLoginPage=new ActiTimeLoginPage(driver);
		ActiTimeHomePage actiTimeHomePage=new ActiTimeHomePage(driver);
		
		actiTimeLoginPage.loginTest("admin","manager");
		Thread.sleep(2000);
		
		
		
		actiTimeHomePage.openTaskes();
		
		Thread.sleep(2000);
		
		actiTimeHomePage.logOut();
		
		Thread.sleep(3000);
		btBasetest.closeBrowser();
		
	}
	
}

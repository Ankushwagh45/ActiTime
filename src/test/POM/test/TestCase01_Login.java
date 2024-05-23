package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ActiTimeLoginPage;

public class TestCase01_Login extends BaseTest{

	@Test
	public void login() throws Exception
	{
		BaseTest bt=new BaseTest();
		bt.launchBrowser();
		
		ActiTimeLoginPage actiTimeLoginPage=new ActiTimeLoginPage(driver);
		
		actiTimeLoginPage.loginTest("admin","manager");
		Thread.sleep(3000);
		
		bt.closeBrowser();
		
	}
}

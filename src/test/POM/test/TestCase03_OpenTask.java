package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ActiTimeHomePage;
import pages.ActiTimeLoginPage;
import pages.Task;

public class TestCase03_OpenTask extends BaseTest{
	
	@Test
	public void task() throws Exception
	{
		BaseTest btBasetest=new BaseTest();
		btBasetest.launchBrowser();
		Thread.sleep(1000);
		
		ActiTimeLoginPage actiTimeLoginPage=new ActiTimeLoginPage(driver);
		ActiTimeHomePage actiTimeHomePage=new ActiTimeHomePage(driver);
		Task task=new Task(driver);
		
		actiTimeLoginPage.loginTest("admin","manager");
		Thread.sleep(1000);
		
		actiTimeHomePage.openTaskes();
		Thread.sleep(1000);
		
		task.createTask();
		Thread.sleep(3000);
		
		btBasetest.closeBrowser();
		
		
		
	}

}

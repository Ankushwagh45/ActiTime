package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ActiTimeHomePage;
import pages.ActiTimeLoginPage;
import pages.CreateNewUsers;

public class TestCase04_CreateNewUsers extends BaseTest {
	
	@Test
	public void createUsers() throws Exception
	{
		BaseTest basetest=new BaseTest();
		basetest.launchBrowser();
		
		ActiTimeLoginPage actiTimeLoginPage=new ActiTimeLoginPage(driver);
		ActiTimeHomePage actiTimeHomePage=new ActiTimeHomePage(driver);
		CreateNewUsers users=new CreateNewUsers(driver);
		
		actiTimeLoginPage.loginTest("admin","manager");
		Thread.sleep(1000);
		actiTimeHomePage.users();
		Thread.sleep(1000);
		users.newUsers();
		Thread.sleep(1000);
		users.createNewUsers("A1b2","1234","vhgd","Ansus");
		Thread.sleep(2000);
		actiTimeHomePage.logOut();
		
		Thread.sleep(3000);
		
		actiTimeLoginPage.loginTest("A1b2","1234");
		basetest.closeBrowser();
		
	}

}

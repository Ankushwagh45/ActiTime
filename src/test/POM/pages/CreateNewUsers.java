package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUsers {
	
	@FindBy(xpath = "//a[@class='item active']")private WebElement userListElement;
	@FindBy(xpath = "//input[@value='Create New User']")private WebElement createNewUsersElement;
	@FindBy(xpath = "//select[@name='customerId']")private WebElement custmorElement;
	@FindBy(xpath = "//select[@name='projectId']")private WebElement projectElement;
	@FindBy(xpath = "//input[@name='username']")private WebElement userNameElement;
	@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement passwordElement;
	@FindBy(xpath = "(//input[@type='password'])[2]")private WebElement retypePasswordElement;
	@FindBy(xpath = "//input[@name='firstName']")private WebElement firstNamElement;
	@FindBy(xpath = "//input[@name='lastName']")private WebElement lastNamElement;
	@FindBy(xpath = "//input[@name='rightGranted[1]']")private WebElement generateReportElement;
	@FindBy(xpath = "//label[.='Manage Users']")private WebElement manageUsersElement;
	@FindBy(xpath = "//input[@value='   Create User   ']")private WebElement submitButtonElement;
	
	public WebElement getCustmorElement() {
		return custmorElement;
	}

	public WebElement getProjectElement() {
		return projectElement;
	}

	public WebElement getUserNamElement() {
		return userNameElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getRetypePasswordElement() {
		return retypePasswordElement;
	}

	public WebElement getFirstNamElement() {
		return firstNamElement;
	}

	public WebElement getLastNamElement() {
		return lastNamElement;
	}

	public WebElement getGenerateReportElement() {
		return generateReportElement;
	}

	public WebElement getManageUsersElement() {
		return manageUsersElement;
	}

	public WebElement getSubmitButtonElement() {
		return submitButtonElement;
	}

	public CreateNewUsers(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getUserListElement() {
		return userListElement;
	}

	public WebElement getCreateNewUsersElement() {
		return createNewUsersElement;
	}
	public void newUsers() 
	{
		createNewUsersElement.click();
		
	}
	public void createNewUsers(String usn,String pwd,String firstName,String lastName) throws Exception
	{
		userNameElement.sendKeys(usn);
		Thread.sleep(1000);
		passwordElement.sendKeys(pwd);
		Thread.sleep(1000);
		retypePasswordElement.sendKeys(pwd);
		Thread.sleep(1000);
		firstNamElement.sendKeys(firstName);
		Thread.sleep(1000);
		lastNamElement.sendKeys(lastName);
		Thread.sleep(1000);
		generateReportElement.click();
		Thread.sleep(1000);
		manageUsersElement.click();
		Thread.sleep(1000);
		submitButtonElement.click();
		
		
	}
	

}

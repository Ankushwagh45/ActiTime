package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {
	
	@FindBy(xpath = "//a[.='Open Tasks']")private WebElement openTaskElement;
	@FindBy(xpath = "//a[.='Completed Tasks']")private WebElement completedTskElement;
	@FindBy(partialLinkText = "Projects & Customers")private WebElement projectAndCustomerseElement;
	@FindBy(partialLinkText = "Archives")private WebElement archiveseElement;
	@FindBy(xpath = "//input[@value='Create New Tasks']")private WebElement createNewTaskElement;
	
	public Task(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOpenTaskElement() {
		return openTaskElement;
	}

	public WebElement getCompletedTskElement() {
		return completedTskElement;
	}

	public WebElement getProjectAndCustomerseElement() {
		return projectAndCustomerseElement;
	}

	public WebElement getArchiveseElement() {
		return archiveseElement;
	}

	public WebElement getCreateNewTaskElement() {
		return createNewTaskElement;
	}
	
	public void createTask() 
	{
		createNewTaskElement.click();
		
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {
	
WebDriver driver;
	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement timeTrackElement;
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskElement;
	@FindBy(xpath = "//a[@class='content reports']")
	private WebElement reportsElement;
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement usersElement;
	@FindBy(xpath = "//a[@class='content calendar']")
	private WebElement workSchedulElement;
	@FindBy(xpath = "//a[@class='content administration']")
	private WebElement settingsElement;
	@FindBy(partialLinkText = "Logout")
	private WebElement logOutButtonElement;
	@FindBy(xpath = "//a[@id='profile-link']")
	private WebElement AdministratorSystem;

	public ActiTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getTimeTrackElement() {
		return timeTrackElement;
	}

	public WebElement getTaskElement() {
		return taskElement;
	}


	public WebElement getReportsElement() {
		return reportsElement;
	}

	public WebElement getUsersElement() {
		return usersElement;
	}

	public WebElement getWorkSchedulElement() {
		return workSchedulElement;
	}

	public WebElement getSettingsElement() {
		return settingsElement;
	}

	public WebElement getLogOutButtonElement() {
		return logOutButtonElement;
	}

	public WebElement getAdministratorSystem() {
		return AdministratorSystem;
	}

	public void openTaskes() throws Exception {
		taskElement.click();
		Thread.sleep(2000);

	}

	public void logOut() {
		logOutButtonElement.click();

	}
	public void users() {
		usersElement.click();
		
	}

}

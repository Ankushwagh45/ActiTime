package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class ActiTimeLoginPage {
WebDriver driver;
	@FindBy(name = "username")
	private WebElement usnElement;
	@FindBy(name = "pwd")
	private WebElement pwdElement;
	@FindBy(id = "loginButton")
	private WebElement loginbuttonElement;
	@FindBy(partialLinkText = "Actimind Inc.")
	private WebElement actimindLinkElement;

	public ActiTimeLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsnElement() {
		return usnElement;
	}

	public WebElement getPwdElement() {
		return pwdElement;
	}

	public WebElement getLoginbuttonElement() {
		return loginbuttonElement;
	}

	public WebElement getActimindLinkElement() {
		return actimindLinkElement;
	}

	public void loginTest(String usn, String pwd) throws Exception {
		usnElement.sendKeys(usn);
		Thread.sleep(1000);
		pwdElement.sendKeys(pwd);
		Thread.sleep(1000);
		loginbuttonElement.click();

	}

}

package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	public void launchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);
	}
	public void closeBrowser() 
	{
		driver.quit();
		
	}
	

}

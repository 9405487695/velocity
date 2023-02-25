package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import w3schoolAutomation.W3HomePage;

public class VerifyTheVisitwebsiteLinkOnHomePage {
	private WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void launchApplication()
	{
		driver.get("https://www.w3schools.com/");
	}
	
	@Test
	public void VerifyTheVisitwebsiteLinkOnHomePage()
	{
		W3HomePage W3HomePage = new W3HomePage(driver);
		W3HomePage.ClickOnsearchIconlButton();
		W3HomePage.sendDataOnSearchBox();
		W3HomePage.clickOnsearchIcon2();
		W3HomePage.clickOnloseHiddenPoPUpWindow();
		W3HomePage.getText();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://www.w3schools.com/#gsc.tab=0";
		String ExpectedTitle = "W3Schools Online Web Tutorials";
		
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
		//System.out.println(actualURL);
		//System.out.println(actualTitle);
	}	
	
	
	
}

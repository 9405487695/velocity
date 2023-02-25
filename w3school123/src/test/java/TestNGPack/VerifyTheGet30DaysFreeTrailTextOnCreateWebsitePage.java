package TestNGPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import w3schoolAutomation.CreateAWebSite;
import w3schoolAutomation.JavaScriptPopupBoxes;
import w3schoolAutomation.LogInOrSignUpPage;
import w3schoolAutomation.TryItEditor;
import w3schoolAutomation.W3HomePage;

public class VerifyTheGet30DaysFreeTrailTextOnCreateWebsitePage {
	private WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();			
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.w3schools.com/js/js_popup.asp");
	}
	
	@Test
	public void test() {
		JavaScriptPopupBoxes JavaScriptPopupBoxes = new JavaScriptPopupBoxes(driver);
		JavaScriptPopupBoxes.clickOnAlertTryItYourSelf();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		TryItEditor TryItEditor = new TryItEditor(driver);
		TryItEditor.clickOnGetYourOwnWebSitetButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(2));
		
		CreateAWebSite CreateAWebSite = new CreateAWebSite(driver);
		CreateAWebSite.getTextMessage();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://www.w3schools.com/spaces/";
		String ExpectedTitle = "Create a Website | Website Builder | W3Schools.com";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}

	}
	
	
}

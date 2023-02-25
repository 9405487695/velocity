package TestNGPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import w3schoolAutomation.CreateAWebSite;
import w3schoolAutomation.JavaScriptPopupBoxes;
import w3schoolAutomation.TryItEditor;

public class W3schoolAlertAndIframeHandeling {

	private WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowse()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void launchTheApplication()
	{
		driver.get("https://www.w3schools.com/js/js_popup.asp");		
		
		JavaScriptPopupBoxes javaScriptPopUpBoxex = new JavaScriptPopupBoxes(driver);
		javaScriptPopUpBoxex.clickOnAlertTryItYourSelf();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
	
		
	}
	
	@Test
	public void HandelAlertPopUpWindow()
	{
		TryItEditor tryItEditor = new TryItEditor(driver);
		tryItEditor.enterIntoIframe();
		
		tryItEditor.clickOnTryItButton();
		driver.switchTo().alert().accept();
		tryItEditor.outFromIframe();
		tryItEditor.clickOnGetYourOwnWebSitetButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(2));
		
		CreateAWebSite createAWebSite = new CreateAWebSite(driver);
		createAWebSite.getTextMessage();

		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedUrl = "https://www.w3schools.com/spaces/";
		String ExpectedTitle = "Create a Free Website | Website Builder | W3Schools.com | W3Schools Spaces";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}
		
		
	}
	
	@Test
	public void VerifyYouPressedCancelText()
	{
		TryItEditor tryItEditor = new TryItEditor(driver);
		tryItEditor.enterIntoIframe();
		
		tryItEditor.clickOnTryItButton();
		driver.switchTo().alert().dismiss();
		tryItEditor.getTextMsg();
		tryItEditor.outFromIframe();
		tryItEditor.clickOnGetYourOwnWebSitetButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(2));
		
		CreateAWebSite createAWebSite = new CreateAWebSite(driver);
		createAWebSite.getTextMessage();

		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedUrl = "https://www.w3schools.com/spaces/";
		String ExpectedTitle = "Create a Free Website | Website Builder | W3Schools.com | W3Schools Spaces";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}
		
	}
}

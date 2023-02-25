package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.CreateAWebSite;
import w3schoolAutomation.JavaScriptPopupBoxes;
import w3schoolAutomation.TryItEditor;

public class VerifyTheGet30DaysFreeTrailTextOnCreateWebsitePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/js/js_popup.asp");
		
		JavaScriptPopupBoxes JavaScriptPopupBoxes = new JavaScriptPopupBoxes(driverTest);
		JavaScriptPopupBoxes.clickOnAlertTryItYourSelf();
		
		ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(1));
		
		TryItEditor TryItEditor = new TryItEditor(driverTest);
		TryItEditor.clickOnGetYourOwnWebSitetButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr1.get(2));
		
		CreateAWebSite createAWebSite = new CreateAWebSite(driverTest);
		createAWebSite.getTextMessage();
		
		String actualURL = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
		String ExpectedURL ="https://www.w3schools.com/spaces/";
		String ExpectedTitle = "Create a Website | Website Builder | W3Schools.com";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
		//System.out.println(ActualURL);
		//System.out.println(ActualTitle);
 
}

}


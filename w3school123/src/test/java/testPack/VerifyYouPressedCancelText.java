package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.CreateAWebSite;
import w3schoolAutomation.JavaScriptPopupBoxes;
import w3schoolAutomation.TryItEditor;

public class VerifyYouPressedCancelText {
	public static void main(String[] args) {
		//step: 1
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/js/js_popup.asp");	
		
		JavaScriptPopupBoxes javaScriptPopupBoxes = new JavaScriptPopupBoxes(driverTest);
		javaScriptPopupBoxes.clickOnConfirmTryItYourSelf();
		
		ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(1));
		
	
		TryItEditor tryItEditor = new TryItEditor(driverTest);
		tryItEditor.enterIntoIframe();
		
		tryItEditor.clickOnTryItButton();
		driverTest.switchTo().alert().dismiss();
		tryItEditor.getTextMsg();
		tryItEditor.outFromIframe();
		tryItEditor.clickOnGetYourOwnWebSitetButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr1.get(2));
		
		CreateAWebSite createAWebSite = new CreateAWebSite(driverTest);
		createAWebSite.getTextMessage();

		String actualUrl = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
		String ExpectedUrl = "https://www.w3schools.com/spaces/";
		String ExpectedTitle = "Create a Free Website | Website Builder | W3Schools.com | W3Schools Spaces";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}
		
			

			
		
	//	System.out.println(actualUrl);
		//System.out.println(actualTitle);
	
	}
	
}


package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.CreateAWebSite;
import w3schoolAutomation.JavaScriptPopUpBoxex;
import w3schoolAutomation.JavaScriptPopupBoxes;
import w3schoolAutomation.TryItEditor;

public class HandelAlertPopUpWindow {
	public static void main(String[] args) throws InterruptedException 
	{							
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().window().maximize();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.get("https://www.w3schools.com/js/js_popup.asp");		
		
		JavaScriptPopupBoxes javaScriptPopUpBoxex = new JavaScriptPopupBoxes(driverTest);
		javaScriptPopUpBoxex.clickOnAlertTryItYourSelf();
		
		ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(1));
	
		TryItEditor tryItEditor = new TryItEditor(driverTest);
		tryItEditor.enterIntoIframe();
		
		tryItEditor.clickOnTryItButton();
		driverTest.switchTo().alert().accept();
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
}
}
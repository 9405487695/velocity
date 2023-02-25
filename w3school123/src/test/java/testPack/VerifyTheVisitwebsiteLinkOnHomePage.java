package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.W3HomePage;

public class VerifyTheVisitwebsiteLinkOnHomePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/");	
		
		W3HomePage W3HomePage = new W3HomePage(driverTest);
		W3HomePage.ClickOnsearchIconlButton();
		W3HomePage.sendDataOnSearchBox();
		W3HomePage.clickOnsearchIcon2();
		W3HomePage.clickOnloseHiddenPoPUpWindow();
		W3HomePage.getText();
		
		String actualURL = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
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

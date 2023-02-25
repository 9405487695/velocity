package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.LogInOrSignUpPage;
import w3schoolAutomation.W3HomePage;

public class VerifyTheTermsAndConditionsLinksOnLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		//step: 1
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/");	
		
		W3HomePage w3HomePage = new W3HomePage(driverTest);
		w3HomePage.ClickOnLogInlButton();
		
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driverTest);
		logInOrSignUpPage.clickOnTermsLink();
		
		String actualURL = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
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

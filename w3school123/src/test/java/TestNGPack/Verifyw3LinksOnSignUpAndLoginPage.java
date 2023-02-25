package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import w3schoolAutomation.LogInOrSignUpPage;
import w3schoolAutomation.W3HomePage;

public class Verifyw3LinksOnSignUpAndLoginPage {
	
	private WebDriver driver;
	private LogInOrSignUpPage logInOrSignUpPage;
	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void launchTheApplication()
	{
		driver.get("https://www.w3schools.com/");
		
		W3HomePage w3HomePage = new W3HomePage(driver);
		w3HomePage.ClickOnLogInlButton();
		
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driver);
	}
	
	@Test
	public void VerifyTheW3schoolLinksOnLoginPage()
	{
		logInOrSignUpPage.clickOnw3schoolLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
	}
	

	@Test
	public void VerifyTheTermsAndConditionsLinksOnLoginPage()
	{
		
		logInOrSignUpPage.clickOnTermsLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
		
	}

	@Test
	public void VerifyThePrivacyPolicyLinksOnLoginPage()
	{
		logInOrSignUpPage.clickOnPrivacyLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
	}

	@Test
	public void VerifyTheCookiesPolicylLinksOnLoginPage()
	{
		logInOrSignUpPage.clickOnCookiePolicyLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		if(actualURL.equals(ExpectedURL) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
			}
		
	}
	
	

}

package CrossBrowserTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BrowserClass;
import Utils.Utility;
import w3schoolAutomation.LogInOrSignUpPage;
import w3schoolAutomation.W3HomePage;

public class Verifyw3LinksOnSignUpAndLoginPage extends BrowserClass {
	
	private WebDriver driver;
	private W3HomePage w3HomePage;
	private LogInOrSignUpPage logInOrSignUpPage;
	
	String testid;
	
	@Parameters("browser123")
	
	@BeforeTest
	public void launchTheBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browser.equals("firefox"))
		{
			driver = openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void CreatePOMObjects()
	{
		w3HomePage = new W3HomePage(driver);
		logInOrSignUpPage = new LogInOrSignUpPage(driver);
	}
	
	@BeforeMethod
	public void launchTheApplication()
	{
		driver.get("https://www.w3schools.com/");	
	}

	@Test
	public void VerifyTheW3schoolLinksOnLoginPage()
	{
		testid ="tc-01";
		
		logInOrSignUpPage.clickOnw3schoolLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "Title pass");
		Assert.assertEquals(actualURL, ExpectedURL, "Title URL");
	}
	
	@Test
	public void VerifyTheTermsAndConditionsLinksOnLoginPage()
	{
		testid ="tc-02";
		
		logInOrSignUpPage.clickOnTermsLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "Title pass");
		Assert.assertEquals(actualURL, ExpectedURL, "Title URL");
	}
	
	@Test
	public void VerifyThePrivacyPolicyLinksOnLoginPage()
	{
		testid ="tc-03";
		
		logInOrSignUpPage.clickOnPrivacyLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "Title pass");
		Assert.assertEquals(actualURL, ExpectedURL, "Title URL");
	}
	
	@Test
	public void VerifyTheCookiesPolicylLinksOnLoginPage()
	{
		testid ="tc-04";
		
		logInOrSignUpPage.clickOnCookiePolicyLink();
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedURL ="https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String ExpectedTitle = "Log in - W3Schools";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "Title pass");
		Assert.assertEquals(actualURL, ExpectedURL, "Title URL");
	}
	
	@AfterMethod
	public void screenshotOfFailCases(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==  result.getStatus())
		{
			Utility.Capturescreenshot(driver, testid);
		}
		
	}
	
	@AfterClass
	public void afterClass()
	{
	 w3HomePage = null;
	 logInOrSignUpPage = null;
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver= null;
		System.gc();
	}
	
	


}

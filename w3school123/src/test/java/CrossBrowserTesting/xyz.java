package CrossBrowserTesting;

import java.io.IOException;
import java.util.ArrayList;
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
import w3schoolAutomation.ExerciseV3_0;
import w3schoolAutomation.JavaTutorial;
import w3schoolAutomation.W3HomePage;

public class xyz extends BrowserClass{
	
	private WebDriver driver;
	private W3HomePage W3HomePage;
	private JavaTutorial javaTutorial;
	private ExerciseV3_0 exerciseV3_0;
	
	String testid;
	
	@Parameters("browser123")
	@BeforeTest
	public void beforeTest(String browser)
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
	public void beforeClass()
	{
		W3HomePage = new W3HomePage(driver);	
		javaTutorial = new JavaTutorial(driver);
		exerciseV3_0 = new ExerciseV3_0(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.w3schools.com/");	
	}
	
	@Test
	public void test()
	{
		testid ="t-01";
				
		W3HomePage.ClickOnTutorialButton();
		W3HomePage.ClickOnLearnJavaButton();
		
		javaTutorial.sendDataIntoText1();
		javaTutorial.sendDtaIntoText2();
		javaTutorial.sendDtaIntoText3();
		javaTutorial.clickOnSubmitAnswerButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		exerciseV3_0.clickOnSubmitAnswerButton();
		exerciseV3_0.getTextMessage();
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
	
		String ExpectedUrl = "https://www.w3schools.com/java/exercise.asp?filename=exercise_syntax1";
		String ExpectedTitle ="Exercise v3.0";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "Title pass");
		Assert.assertEquals(actualUrl, actualTitle, "Title URL");
		
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
		W3HomePage= null;
		javaTutorial = null;
		exerciseV3_0 = null;
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	


}

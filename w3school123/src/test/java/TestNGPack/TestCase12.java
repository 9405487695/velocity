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
import w3schoolAutomation.MyLearningW3school;
import w3schoolAutomation.ResetPassword;
import w3schoolAutomation.W3HomePage;

public class TestCase12 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowse()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.w3schools.com/");	
		
		W3HomePage w3HomePage = new W3HomePage(driver);
		w3HomePage.ClickOnLogInlButton();	
		
	}
	
	@Test
	public void VerifyLoginFunctionality() throws InterruptedException
	{
		
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driver);
		logInOrSignUpPage.sendemail("snehalb245@gmail.com");
		logInOrSignUpPage.sendpassword("Shree@123");
		logInOrSignUpPage.clickOnLogInButton();
		
		MyLearningW3school myLearningW3school = new MyLearningW3school(driver);
		//myLearningW3school.getTextMessage();
		//myLearningW3school.clickOnLogOutButton();
		
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
		
		//System.out.println(actualURL);
		//System.out.println(actualTitle);
	}

	
	@Test
	public void VerifyForgotPasswordFunctionality()
	{
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driver);
		logInOrSignUpPage.clickOnForgotPasswordButton();
		
		//step: 3
		ResetPassword resetPassword = new ResetPassword(driver);
		resetPassword.getTextMsg();
		
		//step: 4
		resetPassword.enterEmail("snkjhkj@345");
		resetPassword.clickOnResetPassword();
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedUrl = "https://profile.w3schools.com/reset";
		String ExpectedTitle = "Reset password - W3Schools";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}
		
	//	System.out.println(actualUrl);
	//	System.out.println(actualTititle);
	}
	
	@Test
	public void VerifySignUpPageFunctionality()
	{
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driver);
		
		logInOrSignUpPage.clickOnSignUpButton();
		logInOrSignUpPage.sendemail("snehalb245@gmail.com");
		logInOrSignUpPage.sendpassword("Snehal@123");
		logInOrSignUpPage.clickOnSignUpFree();
		logInOrSignUpPage.passDataOnFirstName("snehal");
		logInOrSignUpPage.passDataOnLastName("pujari");
		logInOrSignUpPage.clickOnContinue1Button();
		logInOrSignUpPage.getTextMessage();
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);	}
	
	
	@AfterClass
	public void afterClass()
	{
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
}

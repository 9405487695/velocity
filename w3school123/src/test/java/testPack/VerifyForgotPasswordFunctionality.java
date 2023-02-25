package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.LogInOrSignUpPage;
import w3schoolAutomation.ResetPassword;
import w3schoolAutomation.W3HomePage;

public class VerifyForgotPasswordFunctionality {
		public static void main(String[] args) {
		//step: 1
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/");	
		
		W3HomePage w3HomePage = new W3HomePage(driverTest);
		w3HomePage.ClickOnLogInlButton();
		
		//step: 2
		
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driverTest);
		logInOrSignUpPage.clickOnForgotPasswordButton();
		
		//step: 3
		ResetPassword resetPassword = new ResetPassword(driverTest);
		resetPassword.getTextMsg();
		
		//step: 4
		resetPassword.enterEmail("snkjhkj@345");
		resetPassword.clickOnResetPassword();
		
		String actualUrl = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
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
}

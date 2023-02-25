package TestNGPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import w3schoolAutomation.ExerciseV3_0;
import w3schoolAutomation.JavaTutorial;
import w3schoolAutomation.W3HomePage;

public class VerifyCorrectText {
	
	private WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void launchApplication()
	{
		driver.get("https://www.w3schools.com/");
	}
	
	@Test
	public void VerifyCorrectText()
	{
		W3HomePage W3HomePage = new W3HomePage(driver);
		W3HomePage.ClickOnTutorialButton();
		W3HomePage.ClickOnLearnJavaButton();
		
		JavaTutorial javaTutorial = new JavaTutorial(driver);
		javaTutorial.sendDataIntoText1();
		javaTutorial.sendDtaIntoText2();
		javaTutorial.sendDtaIntoText3();
		javaTutorial.clickOnSubmitAnswerButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		ExerciseV3_0 exerciseV3_0 = new ExerciseV3_0(driver);
		exerciseV3_0.clickOnSubmitAnswerButton();
		exerciseV3_0.getTextMessage();
		
		String actualText ="Correct!";
		String ExpectedText ="Correct!";
		
		Assert.assertEquals(ExpectedText, ExpectedText, "text is correct");
		
		String actualTitle = driver.getTitle();
		String ExpectedTitle ="Exercise v3.0";
		
		Assert.assertEquals(actualTitle, ExpectedTitle, "ExerciseV3_0 Page Title is correct");
		
	
		String actualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.w3schools.com/java/exercise.asp?filename=exercise_syntax1";
		
		Assert.assertEquals(actualUrl, ExpectedUrl, "ExerciseV3_0 Page URL is correct");
	}
		@AfterMethod
		public void closeApplication()
		{
			driver.close();
		}

	

}

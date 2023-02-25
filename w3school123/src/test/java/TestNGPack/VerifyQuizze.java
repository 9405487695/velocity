package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import w3schoolAutomation.JavaQuize;
import w3schoolAutomation.JavaTutorial;
import w3schoolAutomation.W3HomePage;
import w3schoolAutomation.WschoolJavaQuize;

public class VerifyQuizze {
	
	private WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
	}
	

	@BeforeMethod
	public void launchApplication()
	{
		driver.get("https://www.w3schools.com/");
	}
	

	@Test
	public void test()
	{
		W3HomePage w3HomePage = new W3HomePage(driver);
		w3HomePage.ClickOnTutorialButton();
		w3HomePage.ClickOnLearnJavaButton();
		
		JavaTutorial javaTutorial = new JavaTutorial(driver);
		javaTutorial.clickOnStartJavaQuiz();
		
		JavaQuize javaQuize = new JavaQuize(driver);
		javaQuize.clickOnStartTheJavaQuizeButton();
		
		WschoolJavaQuize wschoolJavaQuize = new WschoolJavaQuize(driver);
		wschoolJavaQuize.getTextMsg();
		

		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String ExpectedUrl = "https://www.w3schools.com/quiztest/quiztest.asp?qtest=JAVA";
		String ExpectedTitle = "W3Schools Java Quiz";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}

	}

}

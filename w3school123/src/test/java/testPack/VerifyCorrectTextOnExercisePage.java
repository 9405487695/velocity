package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.ExerciseV3_0;
import w3schoolAutomation.JavaTutorial;
import w3schoolAutomation.W3HomePage;


public class VerifyCorrectTextOnExercisePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver TestDriver = new 	ChromeDriver();
		TestDriver.manage().window().maximize();
		TestDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TestDriver.get("https://www.w3schools.com/");
		
		W3HomePage W3HomePage = new W3HomePage(TestDriver);
		W3HomePage.ClickOnTutorialButton();
		W3HomePage.ClickOnLearnJavaButton();
		
		JavaTutorial javaTutorial = new JavaTutorial(TestDriver);
		javaTutorial.sendDataIntoText1();
		javaTutorial.sendDtaIntoText2();
		javaTutorial.sendDtaIntoText3();
		javaTutorial.clickOnSubmitAnswerButton();
		
		ArrayList<String> addr1 = new ArrayList<String>(TestDriver.getWindowHandles());
		TestDriver.switchTo().window(addr1.get(1));
		
		ExerciseV3_0 exerciseV3_0 = new ExerciseV3_0(TestDriver);
		exerciseV3_0.clickOnSubmitAnswerButton();
		exerciseV3_0.getTextMessage();
		
		
		String actualUrl = TestDriver.getCurrentUrl();
		String actualTitle = TestDriver.getTitle();
		
	//	System.out.println(actualUrl);
//		System.out.println(actualTitle);
		String ExpectedUrl = "https://www.w3schools.com/java/exercise.asp?filename=exercise_syntax1";
		String ExpectedTitle ="Exercise v3.0";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("Test pass");
		}
		
		else {
			System.out.println("Test fail");
			}
		
		
	}

}

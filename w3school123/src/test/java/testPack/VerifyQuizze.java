package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import w3schoolAutomation.JavaQuize;
import w3schoolAutomation.JavaTutorial;
import w3schoolAutomation.W3HomePage;
import w3schoolAutomation.WschoolJavaQuize;

public class VerifyQuizze {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();			
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.w3schools.com/");	
		
		W3HomePage w3HomePage = new W3HomePage(driverTest);
		w3HomePage.ClickOnTutorialButton();
		w3HomePage.ClickOnLearnJavaButton();
		
		JavaTutorial javaTutorial = new JavaTutorial(driverTest);
		javaTutorial.clickOnStartJavaQuiz();
		
		JavaQuize javaQuize = new JavaQuize(driverTest);
		javaQuize.clickOnStartTheJavaQuizeButton();
		
		WschoolJavaQuize wschoolJavaQuize = new WschoolJavaQuize(driverTest);
		wschoolJavaQuize.getTextMsg();
		

		String actualUrl = driverTest.getCurrentUrl();
		String actualTitle = driverTest.getTitle();
		
		String ExpectedUrl = "https://www.w3schools.com/quiztest/quiztest.asp?qtest=JAVA";
		String ExpectedTitle = "W3Schools Java Quiz";
		
		if(actualUrl.equals(ExpectedUrl) && (actualTitle.equals(ExpectedTitle)))
		{
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
			}
		
		//System.out.println(actualUrl);
		//System.out.println(actualTitle);

}
}
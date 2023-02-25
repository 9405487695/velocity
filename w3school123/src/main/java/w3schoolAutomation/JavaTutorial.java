package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaTutorial {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Start learning Java now »']")
	private WebElement startLearningJavaNow;
	
	@FindBy (xpath = "//input[@name='ex1']")
	private WebElement text1;
	
	@FindBy (xpath = "//input[@name='ex2']")
	private WebElement text2;
	
	@FindBy (xpath = "//input[@name='ex3']")
	private WebElement text3;
	
	@FindBy (xpath = "//button[text()='Submit Answer »']")
	private WebElement submitAnswer;
	
	@FindBy (xpath = "//a[text()='Start Java Quiz']")
	private WebElement startJavaQuiz;
	
	@FindBy (xpath = "//a[text()='See All Java Examples']")
	private WebElement seeAllJavaExamples;
	
	
	//constructor
	
	public JavaTutorial(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//methods
	
	public void clickOnStartLearningJavaNow() {
		startLearningJavaNow.click();
	}
	
	public void sendDataIntoText1() {
		text1.sendKeys("System");
	}
	
	public void sendDtaIntoText2() {
	text2.sendKeys("out");
	}
	
	public void sendDtaIntoText3() {
		text3.sendKeys("println");
		}
	
	public void clickOnSubmitAnswerButton() {
		submitAnswer.click();
		}
	
	public void clickOnStartJavaQuiz() {
		startJavaQuiz.click();
	}
	
	public void clickOnSeeAllJavaExamples() {
		seeAllJavaExamples.click();
	}
}





package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseV3_0 {
	private WebDriver driveG;
	
	//@FindBy (xpath = "(//button[text()='Show Answer'])[2]")
//	private WebElement showAnswer;
	
	@FindBy (xpath = "(//button[text()='Show Answer'])[2]")
	private WebElement showAnswer;
	
	
	@FindBy (xpath ="(//button[text()='Hide Answer'])[2]")
	private WebElement hideAnswer;
	
	@FindBy (xpath ="//button[text()='Submit Answer ❯']")
	private WebElement submitAnswer;
	

	@FindBy (xpath = "//h2[text()='Correct!']")
	private WebElement textMessage;
	
	//constructo
	
	public ExerciseV3_0(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driveG =driver;
	}
	
	//methods
	
	public void clickOnShowAnswerButton()
	{
		showAnswer.click();
	}
	
	public void clickOnHideAnswerButton()
	{
		hideAnswer.click();
	}
	
	public void clickOnSubmitAnswerButton()
	{
		submitAnswer.click();
	}
	
	public void getTextMessage()
	{
		String text = textMessage.getText();
		System.out.println(text);
	}

}

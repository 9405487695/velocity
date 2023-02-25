package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAWebSite {
	
	//@FindBy (xpath ="//span[text()='Log in']")
	@FindBy (xpath ="//span[text()='Log in123']")
	private WebElement logIn;
	
	@FindBy (xpath ="//a[text()='Get Started for Free']")
	private WebElement targetTextMessage;
	
	public CreateAWebSite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginButton()
	{
		logIn.click();
	}
	

	public void getTextMessage()
	{
		String text12 = targetTextMessage.getText();
		System.out.println(text12);
	}
}

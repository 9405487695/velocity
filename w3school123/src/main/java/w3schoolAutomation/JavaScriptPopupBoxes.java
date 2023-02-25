package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptPopupBoxes {
	private WebDriver driver;
	
	@FindBy (xpath = "(//a[text()='Try it Yourself »'])[1]")
	private WebElement alertTryItYourSelf;
	
	@FindBy (xpath = "(//a[text()='Try it Yourself »'])[2]")
	private WebElement confirmTryItYourSelf;
	
	@FindBy (xpath = "(//a[text()='Try it Yourself »'])[3]")
	private WebElement promptTryItYourSelf;
	
	
	public JavaScriptPopupBoxes(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnAlertTryItYourSelf(){
		alertTryItYourSelf.click();
	}
	
	public void clickOnConfirmTryItYourSelf(){
		confirmTryItYourSelf.click();
	}

	
	public void clickOnPromptTryItYourSelf(){
		promptTryItYourSelf.click();
	}
}

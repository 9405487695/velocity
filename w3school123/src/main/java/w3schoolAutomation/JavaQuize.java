package w3schoolAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaQuize {
	
	private WebDriver driver;
	
	@FindBy (xpath ="//a[text()='Start the Java Quiz ❯']")
	private WebElement startTheJavaQuize;
	
	//constructr
	
	public JavaQuize(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	//methods
			
	public void clickOnStartTheJavaQuizeButton(){
		startTheJavaQuize.click();
	
	}

}

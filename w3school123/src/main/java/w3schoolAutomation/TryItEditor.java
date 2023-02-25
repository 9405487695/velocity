package w3schoolAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryItEditor {
	
	private WebDriver driver;

	@FindBy (xpath = "//button[text()='Try it']")
	private WebElement TryIt;	
	
	@FindBy (xpath = "//iframe[@id='iframeResult']")
	private WebElement iframe;	
	
	@FindBy (xpath = "//p[text()='You pressed Cancel!']")
	private WebElement getTextMsg;	
	
	@FindBy (xpath = "//a[@id='getwebsitebtn']")
	private WebElement getYourOwnWebSite;
	
	//constructr
	
	public TryItEditor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
		
	public void enterIntoIframe(){

			driver.switchTo().frame(iframe);
		
	}
	
	public void outFromIframe(){
		driver.switchTo().defaultContent();
		}
	
	public void getTextMsg(){
		String text = getTextMsg.getText();
		System.out.println(text);
		}
		
	public void clickOnTryItButton(){
		TryIt.click();
	}
	
	
	
	public void clickOnGetYourOwnWebSitetButton(){
		getYourOwnWebSite.click();
	}
		

}

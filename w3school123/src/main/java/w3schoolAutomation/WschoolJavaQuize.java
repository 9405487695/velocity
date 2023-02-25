package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WschoolJavaQuize {
	
private WebDriver driver;
	
	@FindBy (xpath ="(//span[@class='checkmark'])[1]")
	private WebElement FirstOption;
	
	@FindBy (xpath ="//button[text()='Next ❯']")
	private WebElement next;
	
	@FindBy (xpath ="(//h1['Java Quiz'])[1]")
	private WebElement javaQuizze;
	
	//constructr
	
	public WschoolJavaQuize(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	//methods
			
	public void clickOnFirstOption(){
		FirstOption.click();
	}
	
	public void clickOnNextButton(){
		next.click();
	}
	
	public void getTextMsg(){
		String text = javaQuizze.getText();
		System.out.println(text);
	}


}

		
		
		
		
				
				
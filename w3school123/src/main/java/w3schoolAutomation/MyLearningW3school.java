package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLearningW3school {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[text()='My learning']")
	private WebElement myLearning;
	
	@FindBy (xpath = "//div[text()='My learning']")
	private WebElement myLearningText;
	
	@FindBy (xpath = "//button[text()='Log out']")
	private WebElement logOut;
	
	//constructor
	
	public MyLearningW3school(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//methods
	
	public void clickOnmyLearning() {
		myLearning.click();
	}
	
	public void getTextMessage() {
		String text = myLearningText.getText();
		System.out.println(text);
	}
	public void clickOnLogOutButton(){
		logOut.click();
	}
}

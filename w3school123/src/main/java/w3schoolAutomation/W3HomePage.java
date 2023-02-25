package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3HomePage {
	
	private WebDriver driverG;
	
	private Actions act;
	
	@FindBy (xpath ="//a[@id='navbtn_tutorials']")
	private WebElement tutorial;
	
	@FindBy (xpath ="(//a[text()='References '])[1]")
	private WebElement references;
	
	@FindBy (xpath ="/(//a[text()='Exercises '])[1]")
	private WebElement exercise;
	
	@FindBy (xpath ="(//a[text()='Java Quiz'])[1]")
	private WebElement javaQuize;
			
	@FindBy (xpath ="(//i[@class='fa'])[1]")
	private WebElement searchIcon;
	
	@FindBy (xpath ="//input[@id='gsc-i-id1']")
	private WebElement searchBox;
	
	@FindBy (xpath ="//button[@class='gsc-search-button gsc-search-button-v2']")
	private WebElement searchIcon2;
	
	@FindBy (xpath ="(//a[text()='Learn HTML'])[2]")
	private WebElement learnHTML;
	
	@FindBy (xpath ="(//div[@tabindex='0'])[1]")
	private WebElement closeHiddenPoPUpWindow;
	
	@FindBy (xpath ="//a[@id='w3loginbtn']")
	private WebElement logIn;
	
	@FindBy (xpath ="(//a[text()='Learn Java'])[1]")
	private WebElement learnJava;
	
	//constructor
	
	public W3HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
	}
	
	//methods
	
	public void ClickOnTutorialButton(){
	//	tutorial.click();
		//Actions act = new Actions(driverG);
		act.moveToElement(tutorial).click().build().perform();
	}
	
	public void ClickOnLearnJavaButton(){
		//learnJava.click();
		//Actions act = new Actions(driverG);
		act.moveToElement(learnJava).click().build().perform();
	}

	public void ClickOnReferencesButton(){
		references.click();
	}
	
	public void ClickOnExerciseButton(){
		exercise.click();
	}
	
	public void ClickOnJavaQuizeButton(){
		javaQuize.click();
		act.moveToElement(javaQuize).click().build().perform();
	}
	
	public void ClickOnsearchIconlButton(){
		searchIcon.click();
	}
	
	public void sendDataOnSearchBox(){
		searchBox.sendKeys("HTML");
	}
	
	public void clickOnsearchIcon2(){
		searchIcon2.click();
	}
	
	public void getText(){
		String text = learnHTML.getText();
		System.out.println(text);
	}
	
	public void clickOnloseHiddenPoPUpWindow(){
		closeHiddenPoPUpWindow.click();
	}
	
	public void ClickOnLogInlButton(){
		logIn.click();
	}
	
}

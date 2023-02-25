package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HTMLTable {
	
	private WebDriver driveG;
	
	@FindBy (xpath = "//table[@id='customers']")
	private WebElement allTable;

	@FindBy (xpath = "//input[@name='ex1']<tr>")
	private WebElement text1;

	@FindBy (xpath = "//input[@name='ex2']")
	private WebElement text2;

	@FindBy (xpath = "//input[@name='ex3']")
	private WebElement text3;

	@FindBy (xpath = "//input[@name='ex4']")
	private WebElement text4;

	@FindBy (xpath = "//button[text()-'Submit Answer »']")
	private WebElement submitAnswer;
	
	//constructor
	
	public HTMLTable(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driveG =driver;
	}

	//methods
	
	public void selectAllTable()
	{
		
		////
	}
	
	public void sendDataInText1()
	{
		text1.sendKeys("<tr>");
	}
	
	public void sendDataInText2()
	{
		text2.sendKeys("<th>Name 1</th>");
	}
	
	public void sendDataInText3()
	{
		text3.sendKeys("<th>Name 2</th>");
	}
	
	public void sendDataInText4()
	{
		text4.sendKeys("</tr>");
	}											//incomplete ...after click on submit button new tab will be opended that is "version v3.0"
	
	public void clickOnSubmitAnswer()
	{
		submitAnswer.click();
	}

}
//input[@name='ex1']<tr>
//input[@name='ex2']<th>Name 1</th>
//input[@name='ex3']<th>Age 2</th>
//input[@name='ex4']</tr>
//button[text()-'Submit Answer »']

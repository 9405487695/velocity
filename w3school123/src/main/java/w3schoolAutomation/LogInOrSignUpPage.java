package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOrSignUpPage {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//input[@id='modalusername']")
	private WebElement Email;
	
	@FindBy (xpath = "//input[@id='current-password']")
	private WebElement password;
	
	@FindBy (xpath = "//span[text()='Sign up for free']")
	private WebElement signUpForFree;
	
	
	@FindBy (xpath = "//span[text()='Log in']")
	private WebElement login;
	
	@FindBy (xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement signUpPassword;
	
	@FindBy (xpath = "//span[text()=' Sign up']")
	private WebElement signUp;
	
	@FindBy (xpath = "//input[@id='modal_first_name']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='modal_last_name']")
	private WebElement lastName;
	
	@FindBy (xpath = "//span[text()='Continue']")
	private WebElement continue1;
	
	@FindBy (xpath = "(//span['Looks like you already have a user. Did you try logging in?'])[3]")
	private WebElement getTextMessage;
	
	@FindBy (xpath = "//a[text()='Cookie policy']")
	private WebElement cookiePolicy;
	
	@FindBy (xpath = "(//a[text() ='Privacy'])[1]")
	private WebElement privacy;
	
	@FindBy (xpath = "(//a[text() ='Terms'])[1]")
	private WebElement terms;
	
	@FindBy (xpath = "//a[text()='W3schools']")
	private WebElement w3school;
	//constructor
	
	public LogInOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	//methods
	
	public void sendemail(String emailId)
	{
		Email.sendKeys(emailId);
	}
	
	public void sendpassword(String pass)
	{
		signUpPassword.sendKeys(pass);
	}
	
	public void clickOnSignUpFree()
	{
		signUpForFree.click();
	}
	
	public void clickOnLogInButton()
	{
		login.click();
	}
	
	public void clickOnForgotPasswordButton()
	{
		forgotPassword.click();
	}
	
	public void sendSignUpPassword(String pass1)
	{
		signUpPassword.sendKeys(pass1);
	}
	
	public void clickOnSignUpButton()
	{
		signUp.click();
	}
	
	public void passDataOnFirstName(String Fname)
	{
		firstName.sendKeys(Fname);
	}
	
	public void passDataOnLastName(String Lname)
	{
		lastName.sendKeys(Lname);
	}
	
	public void clickOnContinue1Button()
	{
		continue1.click();
	}
	
	public void getTextMessage()
	{
		String text = getTextMessage.getText();
		System.out.println(text);	
	}
	
	public void clickOnCookiePolicyLink()
	{
		cookiePolicy.click();
	}
	
	public void clickOnPrivacyLink()
	{
		privacy.click();
	}
	
	public void clickOnTermsLink()
	{
		terms.click();
	}
	
	public void clickOnw3schoolLink()
	{
		w3school.click();
	}

	
	
}

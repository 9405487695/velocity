package w3schoolAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword {
	
	@FindBy (xpath = "//p[@class='ResetPasswordRequest_instructions__8GJHe']")
	private WebElement textMsg;
	
	@FindBy (xpath = "(//input[@id='modalusername'])[2]")
	private WebElement email;
	
	@FindBy (xpath = "//span[text()='Reset password']")
	private WebElement resetPassword;
	
	@FindBy (xpath = "Return to login")
	private WebElement returnToLogin;
	
	
	
	public ResetPassword(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void getTextMsg (){
		String text = textMsg.getText();
		System.out.println(text);
	}
	
	public void enterEmail(String emailId){
		email.sendKeys(emailId);
	}
	
	public void clickOnResetPassword(){
		resetPassword.click();
	}

	public void clickOnReturnToLogin(){
		returnToLogin.click();
	}
	
	

}

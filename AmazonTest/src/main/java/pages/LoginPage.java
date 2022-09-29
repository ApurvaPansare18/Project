package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//span[contains(@id, 'nav-link')]")
	private WebElement signIn;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement registeredMobileNumber;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement keepMeSignedIn;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void goToSignInPage()
	{
		signIn.click();
	}
	
	public void sendRegisteredMobileNumber()
	{
		registeredMobileNumber.sendKeys("7507485422");
		
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	public void clickOnKeepMeSignedIn()
	{
		keepMeSignedIn.click();
	}
	
	public void sendPassword()
	{
		password.sendKeys("7507485422");
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}

}

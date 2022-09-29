package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {
private WebDriver driver;
	
	@FindBy (xpath="//a[@id='nav-cart']")
	private WebElement viewCart;
	
	
	
	

	public  ViewCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void viewCart()
	{
		viewCart.click();
	
	}
	

}

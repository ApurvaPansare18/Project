package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	

private WebDriver driver;




@FindBy(xpath="//a[@id='a-autoid-8-announce']")
  private WebElement select;
  

@FindBy (xpath="//input[@id='add-to-cart-button']")

private WebElement addToCart;
@FindBy(xpath="//img[@class='sc-product-image']")
private WebElement show;
	
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	 
	 public void selectOnProduct()
	 {
		 select.click();
	 }
	
	public void addToCart()
	{
		addToCart.click();
	
	}
	
	public boolean verify()
	{
		return show.isDisplayed();
		
	
	}

}

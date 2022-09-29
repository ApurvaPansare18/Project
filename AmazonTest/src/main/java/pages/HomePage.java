package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

private WebDriver driver;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBar;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement clickOnSearch;
	
	@FindBy (xpath="//span[text()='The Secret']")
	private WebElement product;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchProduct(String product)
	{
		searchBar.sendKeys(product);
	}
	
	public void clickOnSearch()
	{
		clickOnSearch.click();
	}
	
	public void clickOnProduct()
	{
		product.click();

	}
	  
	public boolean validate()
	{
		 return product.isDisplayed();
		
	}
	
    }

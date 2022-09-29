package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewCartPage;
import setup.BaseClass;
import utilis.Utility;

 public class VerifyAddToCartPage extends BaseClass{
	
	private WebDriver driver;
	private LoginPage login;
	private HomePage home;
	private AddToCartPage addCart;
	private ViewCartPage view;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName)
	{

	if(browserName.equals("Chrome"))
	{
		driver=openChromeBrowser();
	}
	
	if(browserName.equals("Firefox"))
	{
		driver=openFirefoxBrowser();
	}
	
	}
	
	@BeforeMethod
	public void openHomePage() throws InterruptedException, EncryptedDocumentException, IOException
	{


		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	    home=new HomePage(driver);
	    
	    String product=Utility.fetchData();
		home.searchProduct(product);
        home.clickOnSearch();
        JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(3000);
		home.clickOnProduct();
		 ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(add.get(1));
		 
		 
		 addCart=new AddToCartPage(driver);
		// addCart.selectOnProduct();
		 addCart.addToCart();
		
		
}
	@Test
	public void test()
	{
		 
		 view =new ViewCartPage(driver);
		 
		 view.viewCart();
		 
		 Assert.assertTrue(addCart.verify());
		 
			 
	}
	
	
	

}

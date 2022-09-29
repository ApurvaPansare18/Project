package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages1.HomePage;
import setup.BaseClass;



public class VerifyInstagramPage extends BaseClass {

	private WebDriver driver;

	private HomePage home;
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
	public void openHomePage() throws InterruptedException

	{

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	    home=new HomePage(driver);
	    home.selectOnInstagramLink();
	}
 @Test
 public void verifyLink() throws InterruptedException

 {
	 Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	
	System.out.println(url);
	System.out.println(title);
	
	
	Assert.assertEquals(url,"https://www.instagram.com/amazondotin/");
 }
 
}

package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddToCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewCartPage;
import utilis.Utility;

public class Amazon {
	

	public static void main(String[] args) throws InterruptedException, IOException
    {	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
     //   LoginPage login =new LoginPage(driver);
      //  login.goToSignInPage();
       // login.sendRegisteredMobileNumber();
      //  login.clickOnContinueButton();
      //  login.clickOnKeepMeSignedIn();
     //   login.sendPassword();
     //   login.clickOnSignInButton();
        
		HomePage home=new HomePage(driver);
		String product=Utility.fetchData();
		home.searchProduct(product);
		home.clickOnSearch();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		home.clickOnProduct();
		
		 ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(add.get(1));
		 
		 AddToCartPage addCart=new AddToCartPage(driver);
		 addCart.selectOnProduct();
		 addCart.addToCart();
		 
		 ViewCartPage view =new ViewCartPage(driver);
		 view.viewCart();
		 
		
		 
		 if(addCart.verify()== true)
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
			 
			 
			 
		

}
}
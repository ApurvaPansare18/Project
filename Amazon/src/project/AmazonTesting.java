package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {
public static void main(String[] args) throws InterruptedException, IOException
{	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement signIn =driver.findElement(By.xpath("//span[contains(@id, 'nav-link')]"));
		signIn.click();
	
		WebElement registeredMobileNumber =driver.findElement(By.xpath("//input[@id='ap_email']"));
		registeredMobileNumber.sendKeys("7507485422");
	    
		WebElement continueButton =driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();
		
		WebElement keepMeSignedIn =driver.findElement(By.xpath("//input[@type='checkbox']"));
	    keepMeSignedIn.click();
		 
		WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("7507485422");
	     
	    WebElement signInButton =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signInButton.click();
        
	    WebElement searchBar =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("the secret book");
		
		WebElement clickOnSearch =driver.findElement(By.xpath("//input[@type='submit']"));
		clickOnSearch.click();
			
	    WebElement product =driver.findElement(By.xpath("//span[text()='The Secret']"));
		product.click();
				
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
				
		WebElement addToCart =driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();
		
	    WebElement viewCart =driver.findElement(By.xpath("//a[@id='nav-cart']"));
	    viewCart.click();
	    
}
}

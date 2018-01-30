package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Shftt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	System.setProperty("webDriver.chrome.driver", "C:\\Users\\bnbin777\\Desktop\\64 bit\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\bnbin777\\Desktop\\64 bit\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 WebElement gaurav = driver.findElement(By.cssSelector("#lst-ib"));
		 Actions object1 = new Actions(driver);
				 Actions object2 = object1
				 .moveToElement(gaurav)
				 .click()
				 .keyDown(Keys.SHIFT)
				 .sendKeys("selenium");
		 Action object3 = object2.build();
				object3.perform();
			System.out.println("Text is enterd in capital letters");
			
			
			
		 /*use chrome browser for running this method*/
		 
		  /*Actions oaction = new Actions(driver);
		 Actions moreactions = oaction
				 .moveToElement(element)
				 .click()
				 .keyDown(Keys.SHIFT)
				 .sendKeys(element,"selenium");
		 
		 Action enterincaps = moreactions.build();
		 enterincaps.perform();
		 System.out.println("Text is entered in captial letters");*/
		
		
		
	}

}

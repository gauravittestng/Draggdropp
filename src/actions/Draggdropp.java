package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggdropp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\bnbin777\\Desktop\\64 bit\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragbox = driver.findElement(By.cssSelector("#draggable"));
		WebElement dropbox = driver.findElement(By.cssSelector("#droppable"));
		
		Actions object1 = new Actions (driver);
		object1.dragAndDrop(dragbox, dropbox).perform();
		System.out.println("performend");
		
		
		
		
		
		
		
		
		/*WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		Actions oaction = new Actions(driver);
		oaction.dragAndDrop(drag, drop).perform();
		System.out.println("Performed");
		*/
		
	
		
		
	}

}

package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S {
   public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver badshah = new ChromeDriver();
		badshah.get("https://www.google.com/");
		WebElement target = badshah.findElement(By.xpath("//a[@class='gb_j']"));
		Actions act= new Actions(badshah);
		act.moveToElement(target).perform();
		//Right click on target element
		//act.contextClick(target).perform();
		//Left click on target or click on target
		//act.click(target).perform();
		//Doubble click on element
		//act.doubleClick(target).perform();
		
		//All methods in single step using build method and perform method
		act.moveToElement(target).contextClick().doubleClick().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
   

}

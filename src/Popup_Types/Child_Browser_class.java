package Popup_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_class {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver sagar= new ChromeDriver();
		sagar.get("https://www.flipkart.com/");
		sagar.manage().window().maximize();
		sagar.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		sagar.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles under 20000",Keys.ENTER);
		Thread.sleep(4000);
		sagar.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
		
		
	}

}

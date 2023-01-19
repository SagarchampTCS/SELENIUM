package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains_using_Attribute {
	
	 public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://demo.actitime.com/login.do");
  driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
 driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
 driver.findElement(By.xpath("//div[contains(text(), 'Login ')]")).click();
}
}

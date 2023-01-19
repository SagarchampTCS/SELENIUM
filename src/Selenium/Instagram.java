package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.instagram.com/");
      driver.findElement(By.name("username")).sendKeys("__mr__sk_champ__");
      driver.findElement(By.name("password")).sendKeys("Tester$1527");
      driver.findElement(By.name("Login")).click();
      
	}

}

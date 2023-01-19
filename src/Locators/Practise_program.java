package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_program {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://practicetestautomation.com/practice-test-login/");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
       driver.findElement(By.xpath("//button[@id='submit']")).click();
       
       String expT="Logged In Successfully | Practice Test Automation";
       String actT=driver.getTitle();
       System.out.println(actT);
       
       if(expT.equals(actT)) {
         	System.out.println("TC is pass");
           }
           else {
         	  System.out.println("TC is fail");
           }
		
		
	}

}

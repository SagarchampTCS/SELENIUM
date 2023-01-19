package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
                      WebDriver driver = new ChromeDriver();
                         driver.get("https://www.facebook.com/");
                         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9373562557");
                         driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("SagarChamp");
                         driver.findElement(By.xpath("//button[@name='login']")).click();
                      String expT="Facebook - log in or sign up";
                      String actT = driver.getTitle();
                      System.out.println(actT);
                      if(expT.equals(actT)) {
                      	System.out.println("TC is pass");
                        }
                        else {
                      	  System.out.println("TC is fail");
                        }

}
} 
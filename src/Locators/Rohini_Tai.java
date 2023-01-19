package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rohini_Tai {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver sagar= new ChromeDriver();
		sagar.get("https://www.facebook.com/");
		sagar.findElement(By.xpath("//input[@id='email']")).sendKeys("9922332008",Keys.TAB,"235689");
		
		
		
		
		
		
		
		
		
		
	}

}

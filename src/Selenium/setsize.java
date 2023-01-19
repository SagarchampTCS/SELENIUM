package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		//create object of Dimenssion class
		Dimension d=new Dimension(200,100);
		//use the setsize method
		driver.manage().window().setSize(d);

}
}
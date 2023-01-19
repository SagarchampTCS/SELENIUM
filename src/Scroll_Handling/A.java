package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//use javascript executor interface
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//scroll Down
	jse.executeScript("window.scrollBy(0,1000);");
	
	Thread.sleep(5000);
	//scroll up
	jse.executeScript("window.scrollBy(0,-2000);");
	
}
}

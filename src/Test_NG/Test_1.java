package Test_NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_1 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	//open the application
	driver.get("https://www.google.com/");
	Reporter.log("Hii testing how r u?",true);
}
@Test
 public void TC2() {
	 
		Reporter.log("Majja ma",true);
	}
 
 }


package findBy_annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.get("https://demo.actitime.com/login.do");
		//driver.navigate().refresh();
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		//we need refresh the page 
		driver.navigate().refresh();
		//write propper username
		UN.sendKeys("admin");
		 
	 }

	
}

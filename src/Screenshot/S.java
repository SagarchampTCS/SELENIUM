package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class S {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement abc = driver.findElement( By.xpath("//a[@id='nav-logo-sprites']"));
        
        File in = abc.getScreenshotAs(OutputType.FILE);
        File com = new File("C:\\Users\\kadus\\OneDrive\\Desktop\\Google.jpg");
        Files.copy(in,com);
    
        
	}
	

}

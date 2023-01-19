package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class A {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //typecast takesscreenshot interface
        TakesScreenshot ts = (TakesScreenshot) driver;
        //take the screenshot using getscreenshotas method
      File src = ts.getScreenshotAs(OutputType.FILE);
      //create the object of file class
      File dest = new File("C:\\Users\\kadus\\OneDrive\\Desktop\\Facebook.jpg");
      // we need convert screenshot from src to destination
      Files.copy(src, dest);
		System.out.println("Comments from Github By Team Leader");
    

}
}

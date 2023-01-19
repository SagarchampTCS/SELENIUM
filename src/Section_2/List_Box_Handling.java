package Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//chromedriver_win32 (11)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//opent the app
	driver.get("https://www.facebook.com/");
	//click on create new acccount btn
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//select Day listbox
	Thread.sleep(4000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Select s=new Select(day);
	Thread.sleep(4000);
	//use select class methods
	//s.selectByValue("15");
	//select by visible text
	s.selectByVisibleText("15");
}
}

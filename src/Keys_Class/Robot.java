package Keys_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Robot s = new Robot();
		
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(4000);
	
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	
		
		
		
		
	}

}

package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//implicit wait(global wait)
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//maximize the browser
	driver.manage().window().maximize();
	//bydefault sel focus is on main webpage so we need to switch it
	// switch to 1st iframe
	driver.switchTo().frame("packageListFrame");
	//for our confirmation take any element on 1st frame and print it
		 String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		 System.out.println(t1);//packages
		 //switch from 1st frame tom main webpage
		 driver.switchTo().defaultContent();
		 //now jump from main webpage to 2nd frame
		 driver.switchTo().frame("packageFrame");
		 //take any element and print it
		 String t2 = driver.findElement(By.xpath("//a[text()='FindAll']")).getText();
		System.out.println(t2);//findall
		//again control goes to main webpage 
		driver.switchTo().defaultContent();
		//now we need to switch control towards 3rd frame
		driver.switchTo().frame("classFrame");
		//take one element and print it
		 String t3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		 System.out.println(t3);
	
	
}	
	
}

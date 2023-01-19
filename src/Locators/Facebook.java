package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           
           driver.findElement(By.xpath("//a[text()='Create New Account']")).click();  
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ravi",Keys.TAB,"Kamble",Keys.TAB,"7887341452",Keys.TAB,"Scrummaster");
        	Thread.sleep(4000);
        	
        	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        	Select s=new Select(day);
        	Thread.sleep(4000);
        	s.selectByVisibleText("15");
        	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        	Select r= new Select(month);
        	Thread.sleep(4000);
                  r.selectByVisibleText("May");
                  
                  WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
                  Select p = new Select(year);
              	Thread.sleep(4000);
              	p.selectByVisibleText("1998");
              	
              	driver.findElement(By.xpath("//input[@name='sex']")).click();
              	driver.findElement(By.xpath("//button[@name='websubmit']")).click();          
           
	}

}

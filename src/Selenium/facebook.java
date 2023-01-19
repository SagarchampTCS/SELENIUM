package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.name("email")).sendKeys("9373562557");
       driver.findElement(By.name("pass")).sendKeys("SagarChamp");
       driver.findElement(By.name("login")).click();
       
       String expT= "(2) Facebook";
       Thread.sleep(4000);
    	String actT = driver.getTitle();
    	System.out.println(actT);
    	
    	if(expT.equals(actT)) {
    		System.out.println("TC is pass");
    	}
    	else {
    		System.out.println("TC is fail");
    	}
    		
    	}
      	
	}


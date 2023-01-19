package List_Of_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver badshah = new ChromeDriver();
		int count = 0;
		badshah.get("https://www.flipkart.com/");
		badshah.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		List<WebElement> ele = badshah.findElements(By.xpath("//div"));
		for(WebElement i:ele) {
			String str = i.getText();
			System.out.println(str);
			count++;
		}
		System.out.println(count);
			
		}
		
		
	}



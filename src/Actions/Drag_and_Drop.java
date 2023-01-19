package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver badshah = new ChromeDriver();
		badshah.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement ele1= badshah.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(5000);
		WebElement ele2 = badshah.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(badshah);
		act.dragAndDrop(ele1, ele2).perform();
		
	}

}

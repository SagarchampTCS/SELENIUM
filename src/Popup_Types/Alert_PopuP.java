package Popup_Types;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopuP {
	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver badshah = new ChromeDriver();
	Thread.sleep(4000);
	badshah.get("https://nxtgenaiacademy.com/alertandpopup");
	badshah.manage().window().maximize();
    /* badshah.findElement(By.xpath("//button[@name='alertbox']")).click();
     Alert alt=badshah.switchTo().alert();
     alt.accept();
     String s=alt.getText();
     System.out.println(s);*/
     
     badshah.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
     Alert alt=badshah.switchTo().alert();
     //alt.accept();
    // alt.dismiss();
     String s = alt.getText();
     System.out.println(s);

	
}

}


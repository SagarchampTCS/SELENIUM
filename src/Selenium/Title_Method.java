package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Method {

	public static void main(String[] args) throws Throwable {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=aazo&adgrpid=57696023943&ext_vrnc=hi&gclid=Cj0KCQiAg_KbBhDLARIsANx7wAw7aXIe5kBfFa4XkAvKZ9XBjCY7QtyDp1_cuftGotUpGz6bmQAVHIUaAsr9EALw_wcB&hvadid=617724336202&hvdev=c&hvlocphy=1007786&hvnetw=g&hvqmt=b&hvrand=163588758140203700&hvtargid=kwd-300311771511&hydadcr=15416_2322994&tag=googinhydr1-21&ref=pd_sl_9ff0d1q2jb_b");
		//test data 
		String expT="Amazon.in : aazo";
		String actT =driver.getTitle();
		System.out.println(actT);
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
			
		
	}

}



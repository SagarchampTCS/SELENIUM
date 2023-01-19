package Page_factory_testng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test {
   
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	HomePage h;
	
 @BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\kadus\\OneDrive\\Desktop\\ankush.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.actitime.com/login.do");
       // all objects we need to create
       
       l = new LoginPage(driver);
       h = new HomePage(driver);
       
	}

  @BeforeMethod
	public void openApp(){
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUn(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterpwd(password);
		l.clickLoginBtn();
	}
	
 @org.testng.annotations.Test
	public void verifyText() {
		Reporter.log("Running verifyText", true);
	String expText = sh.getRow(0).getCell(2).getStringCellValue();
	  String actText = h.verifyText();
	  Assert.assertEquals(expText, actText);
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout from app", true);
		
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the Browser", true);
	}
		
}

	


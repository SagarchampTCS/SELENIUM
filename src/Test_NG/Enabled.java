package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void TC1() {
		Reporter.log("Its my first program in Test ng",true);
	}
	@Test(enabled = false)
	public void TC2() {
		Reporter.log("Its my second program in Test ng",true);
		
	}

}

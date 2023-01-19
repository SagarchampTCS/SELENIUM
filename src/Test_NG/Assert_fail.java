package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	
	@Test
	public void S1() {
		Reporter.log("S1()", true);  //verification 1
		
		Assert.fail(); // intentionally S1 failed
		System.out.println("I am after the failing TC"); // verification 2

}
	@Test
	 public void S2() {
		Reporter.log("S2", true);
	}
}


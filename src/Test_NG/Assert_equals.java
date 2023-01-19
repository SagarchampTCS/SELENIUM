package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test
	public void S1() {
		Reporter.log("running S1()", true);
		String expT = "Hello";
		String actT = "Hello";
		// using asset class method
		
	Assert.assertEquals(expT, actT);
	}

}

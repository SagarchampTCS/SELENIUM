package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true {
	
	@Test
	public void S1() {
		Reporter.log("running S1()", true);
		boolean actResult = true;
		// using asset class method
		
	Assert.assertTrue(actResult);;
	}

}



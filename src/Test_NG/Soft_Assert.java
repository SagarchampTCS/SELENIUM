package Test_NG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void TC() {
		
		String S1 = "Hello";
		String S2 = "Hi";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(S1, S2);
		System.out.println("I am after failing the TC");
		sa.assertAll();
		
		
	}

}

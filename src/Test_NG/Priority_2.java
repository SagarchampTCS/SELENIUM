package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_2 {
	
		@Test(priority =2 )
		public void eshwar() {
			Reporter.log("running eshwar",true);
		}
		@Test(priority = 3)
		public void dhanush() {
			Reporter.log("running dhanush",true);
		}
		@Test(priority =1 )
		public void prabhas() {
			Reporter.log("running prabhas",true);
		}
		@Test(priority = 4)
		public void alluarjun() {
			Reporter.log("running alluarjun",true);
		}

}

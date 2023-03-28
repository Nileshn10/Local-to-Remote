package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends ObjectClass {
	
	@Test(priority=1)
	public void urlchekc() {
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.naukri.com/");
		
	}
	@Test(priority=2,timeOut=100)
	public void verifylogin() {
		
		log.clicklogin();
	
	}
	@Test(priority=3)
	public void verifyusrlogin() {
		log.inputusername("nileshnkokate55@gmail.com");
	}
	@Test(priority=4,timeOut=500)
		public void verifypass() {
			log.enterpassword("Elin@1010");
		}
		@Test(priority=5)
		public void verifyloginbutton() {
			log.clickonloginbutton();
			
		}
		@Test(priority=7)
		public void verifylogout() {
			logout.clickonlogout();
		}
	}
	
	



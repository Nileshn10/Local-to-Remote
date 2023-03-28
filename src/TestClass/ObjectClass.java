package TestClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaCode.BaseClass;
import javaCode.LoginPage;
import javaCode.Logout;

public class ObjectClass extends BaseClass {
	
	@BeforeClass
	public void initbrowser() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
	}
	
	@BeforeClass
	public void loginbutton() {
		log=   new LoginPage(driver);
		logout= new Logout(driver);
		
		//input= new LoginPage(driver);
		
	}
	
	/*
	 * @AfterClass public void teardown() { driver.qui();
	 * 
	 * }
	 */
	 

}

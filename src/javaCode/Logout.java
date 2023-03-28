	package javaCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass {
	
	//all the locators
	@FindBy(xpath="//a[text()='View']")
	
	WebElement logout1;
	
	
	
	//Constructor
	public Logout(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	public void clickonlogout() {
		logout1.click();
	}

}

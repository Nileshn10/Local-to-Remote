package javaCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	
	//All the Locators
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	@FindBy(xpath="//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement username;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbutton;
	
	
	
	
	//constructor
	
	public LoginPage(WebDriver driver) {
		this. driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//All the methods
	
	
	public void clicklogin() {
		login.click();
		}
	public void inputusername(String us) {
		username.sendKeys(us);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickonloginbutton() {
		loginbutton.click();
	}
	

}

package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement email;

	@FindBy(xpath = "//input[@id=\"Password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement login;
	
	@FindBy(xpath = "//a[@class=\"ico-account\"]")
	WebElement myaccount;
	
	@FindBy(xpath = "//h2[text()=\"Welcome to our store\"]")
	WebElement message;
	
	@FindBy(xpath = "//h1[text()=\"Welcome, Please Sign In!\"]")
	WebElement wel_msg;
	
	@FindBy(xpath = "//li[text()=\"No customer account found\"]")
	WebElement err_msg;
	
	
	


	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickOnLogin() {
		login.click();
	}
	
	public void myAccountLink() {
		
		boolean mac_lnk = myaccount.isDisplayed();
		Assert.assertEquals(mac_lnk, true);
		
	}
	public void clickOnMyAccount() {
		
	  myaccount.click();
		
	}
	
	public void getsuccessMsg() {
		
		boolean success_msg = message.isDisplayed();
		Assert.assertEquals(success_msg, true);
		
		
		System.out.println("Login successfull");

	}
	
public void welcomeMessgae() {
		
		boolean welcome = wel_msg.isDisplayed();
		Assert.assertEquals(welcome, true);
		
		
		

	}
	
	public void getErrorMsg() {
		
		boolean error_msg = err_msg.isDisplayed();
		Assert.assertEquals(error_msg, true);
		
		
		System.out.println("Login Unsuccessfull");

	}

	

}

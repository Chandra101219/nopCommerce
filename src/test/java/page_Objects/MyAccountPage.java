package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePageObject{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
//Addresses Module
	@FindBy(linkText="Addresses")
	WebElement addresses;
	
	@FindBy(xpath="//button[@class=\"button-1 add-address-button\"]")
	WebElement add_address;
	
	@FindBy(xpath="//p[text()=\"The new address has been added successfully.\"]")
	WebElement succ_msg;
	
	
//Orders
	@FindBy(linkText="Orders")
	WebElement orders;
	
	
	
	
	public void clickOnAddresses() {
		addresses.click();
	}
	
	public void clickOnAddNew() {
		add_address.click();
	}
	
	public void clickOnOrders() {
		orders.click();
	}
	
	public void getSuccessMessage() {
		boolean message = succ_msg.isDisplayed();
		Assert.assertEquals(message, true);
	}
	


}

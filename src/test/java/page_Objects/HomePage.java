package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[@class=\"ico-register\"]")
	WebElement register;

	@FindBy(xpath = "//a[@class=\"ico-login\"]")   
	WebElement login;
	
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")  
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class=\"button-1 search-box-button\"]")
	WebElement btnSearch;
	
	@FindBy(xpath="//a[@class=\"ico-cart\"]")
	WebElement shoppingcart;
	
	
	
	
		
	// Action Methods
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnLogin()    // added in step6
	{
		login.click();
	}
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		searchbox.sendKeys(pName);
	}
	
	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
	
	public void clickOnShoppingCart() {
		shoppingcart.click();
	}
	
	
	
}

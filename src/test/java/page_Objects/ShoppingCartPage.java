package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePageObject
	{
	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@name=\"termsofservice\"]")
	WebElement checkbox;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	WebElement title;
	
	
	
	public void clickOnCheckBox()
	{
		checkbox.click();
	}
		
	
	public void clickOnCheckout()
	{
		checkout.click();
	}
	
	public void validatingTitle()
	{
		String pagetitle = title.getText();
		System.out.println(pagetitle);
		
		
		if(title.equals("Checkout")) {
			
			Assert.assertTrue(true);
			System.out.println("Test passed");
            
		}
		else {
			System.out.println("Test failed");
		}
	}
	
}

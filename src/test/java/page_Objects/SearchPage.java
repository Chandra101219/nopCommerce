package page_Objects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePageObject{   
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}	
	
		@FindBy(xpath="//div[@class=\"details\"]//h2[@class=\"product-title\"]//a")
		List<WebElement> searchProducts;
				
		@FindBy(xpath="//div[@class=\"add-to-cart-panel\"]//input")
		WebElement product_quantity;
		
		@FindBy(xpath="//button[@id=\"add-to-wishlist-button-18\"]")
		WebElement addtowishlist;
		
		@FindBy(xpath="//p[text()=\"The product has been added to your\"]")
		WebElement wishlist_msg;
		
		@FindBy(xpath="//div[@class=\"add-to-cart-panel\"]//button")
		WebElement addtocart;
		
		@FindBy(xpath="//p[text()=\"The product has been added to your \"]")
		WebElement addcart_msg;
		
		
		public void selectProduct()
		{
			
			
			for(int i=0;i<searchProducts.size();i++)
			{		
				
				String prod_avl = searchProducts.get(i).getText();
				if(prod_avl.equals("HTC One Mini Blue"))
				{
					searchProducts.get(i).click();
				}
				
			}
		
		}
		
		public void addQuantity(String qty) throws InterruptedException
		{
			Thread.sleep(2000);
			product_quantity.clear();
			Thread.sleep(2000);
			product_quantity.sendKeys(qty);
		}
		
		public void clickAddToWishlist()
		{
			addtowishlist.click();
		}
		
		public boolean checkConfMsg()
		{
			try
			{
			return wishlist_msg.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		public void clickAddToCart()
		{
			addtocart.click();
		}
		
		public boolean checkAddedCartMsg()
		{
			try
			{
			return addcart_msg.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
}


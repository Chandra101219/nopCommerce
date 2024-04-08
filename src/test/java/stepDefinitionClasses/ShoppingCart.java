package stepDefinitionClasses;

import org.openqa.selenium.WebDriver;

import factory.Base_class;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.HomePage;
import page_Objects.LoginPage;
import page_Objects.SearchPage;
import page_Objects.ShoppingCartPage;

public class ShoppingCart {
	
WebDriver driver;
	
	HomePage hp;
	LoginPage lp;
	SearchPage sp;
	ShoppingCartPage scp;

	@When("the user navigates to shopping cart by clicking on hyperlink")
	public void the_user_navigates_to_shopping_cart_by_clicking_on_hyperlink() {
		hp = new HomePage(Base_class.getDriver());
		hp.clickOnShoppingCart();
	}

	@When("the user clicks on terms&conditions checkbox and Checkout")
	public void the_user_clicks_on_terms_conditions_checkbox_and_checkout() {
		scp = new ShoppingCartPage(Base_class.getDriver());
	    scp.clickOnCheckBox();
	    scp.clickOnCheckout();
	}

	@Then("user navigated to Checkout page")
	public void user_navigated_to_checkout_page() {
	    scp.validatingTitle();
	}
}

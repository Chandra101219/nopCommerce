package stepDefinitionClasses;

import org.openqa.selenium.WebDriver;

import factory.Base_class;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.CheckoutPage;
import page_Objects.HomePage;
import page_Objects.LoginPage;
import page_Objects.SearchPage;
import page_Objects.ShoppingCartPage;

public class Checkout {
WebDriver driver;
	
	HomePage hp;
	LoginPage lp;
	SearchPage sp;
	ShoppingCartPage scp;
	CheckoutPage cop;
	
	@When("the user navigated to Checkout page and Address loads from Addresses")
	public void the_user_navigated_to_checkout_page_and_address_loads_from_addresses() {
	    
		scp = new ShoppingCartPage(Base_class.getDriver());
		scp.validatingTitle();
		
		cop = new CheckoutPage(Base_class.getDriver());
		cop.clickOnContinueOnstep1();
		
	}

	@When("the user selects deliverymethod and clicks on continue")
	public void the_user_selects_deliverymethod_and_clicks_on_continue() {
	   cop.clickOnDeliveryMethod();
	   cop.clickOnContinueOnstep2();
	}

	@When("the user selects payment method, verifies payment info and clicks on continue")
	public void the_user_selects_payment_method_verifies_payment_info_and_clicks_on_continue() {
	    cop.clickOnPaymentMethod();
	    cop.clickOnContinueOnstep3();
	    
	    cop.clickOnContinueOnstep4();
	}

	@When("the user clicks on confirm order")
	public void the_user_clicks_on_confirm_order() {
	    cop.clickOnContinueOnstep5();
	}

	@Then("the user get Order placed successfully with order id")
	public void the_user_get_order_placed_successfully_with_order_id() {
	    cop.validationSuccessMsg();
	}



}

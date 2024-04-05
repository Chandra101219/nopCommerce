package stepDefinitionClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.Base_class;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AddAddressPage;
import page_Objects.HomePage;
import page_Objects.LoginPage;
import page_Objects.MyAccountPage;

public class AddnewAddress {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage mapg;
	AddAddressPage aapg;
	
	
	@When("the user navigates to the nopCommerce MyAccount page")
	public void the_user_navigates_to_the_nop_commerce_my_account_page() {
		
		lp = new LoginPage(Base_class.getDriver());
		
		lp.clickOnMyAccount();
	
	}

	@When("user clicks on the Addresses module and AddNew button")
	public void user_clicks_on_the_addresses_module_and_add_new_button() {
		mapg = new MyAccountPage(Base_class.getDriver());	
		mapg.clickOnAddresses();
		mapg.clickOnAddNew();
	}
	@When("the user Adds Address details from below")
	public void the_user_adds_address_details_from_below(io.cucumber.datatable.DataTable dataTable) {
		aapg = new AddAddressPage(Base_class.getDriver());
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		
		aapg.enterFirstName(dataMap.get("Firstname"));
		aapg.enterLastName(dataMap.get("Lastname"));
		aapg.enterEmail(dataMap.get("Email"));
		aapg.selectCountry(dataMap.get("Country"));
		aapg.enterCity(dataMap.get("City"));
		aapg.enterAdress1(dataMap.get("Address1"));
		aapg.enterPostalCode(dataMap.get("Postalcode"));
		aapg.enterPhoneNumber(dataMap.get("Phone"));
	}

	@When("the user clicks on the Save button")
	public void the_user_clicks_on_the_save_button() {
	    aapg.clickOnSave();
	}

	@Then("the user should see a message saying address added")
	public void the_user_should_see_a_message_saying_address_added() {
	    
	    mapg.getSuccessMessage();
	}
	

}

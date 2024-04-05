package stepDefinitionClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import factory.Base_class;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.HomePage;
import page_Objects.RegistrationPage;


public class Register_step_defination {
	
	WebDriver driver;
	HomePage hp;
	RegistrationPage reg_pg;
	
	
//Scenario:1
	
	@Given("the user is on the nopCommerce Register page")
	public void the_user_is_on_the_nop_commerce_register_page() {
		hp = new HomePage(Base_class.getDriver());
		hp.clickOnRegister();
	    
	}

	@When("the user enters valid required details \\(Firstname: {string}, Lastname: {string}, Email:{string}, Password: {string}, ConfirmPassword: {string} )")
	public void the_user_enters_valid_required_details_firstname_lastname_email_password_confirm_password(String first_name, String last_name, String email, String passwd, String conf_passwd) {
		reg_pg = new RegistrationPage(Base_class.getDriver());
		
		reg_pg.enterFirstName(first_name);
		reg_pg.enterLastName(last_name);
		reg_pg.eneterEmail(email);
		reg_pg.enterPassword(passwd);
		reg_pg.enterConfirmPassword(conf_passwd);
	    
	}

	@When("the user clicks on the Register button")
	public void the_user_clicks_on_the_register_button() {
		reg_pg.clickOnRegister();
	}


	@Then("the user should see a Registration completed message")
	public void the_user_should_see_a_registration_completed_message() {
		
		reg_pg.getConfirmationMsg();
	}
	
//Scenario:2
	
	@When("the user enters existing details from below")
	public void the_user_enters_existing_details_from_below(DataTable dataTable) {
		
		reg_pg = new RegistrationPage(Base_class.getDriver());
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		
		
		reg_pg.enterFirstName(dataMap.get("Firstname"));		reg_pg.enterLastName(dataMap.get("Lastname"));
		reg_pg.eneterEmail(dataMap.get("Email"));
		reg_pg.enterPassword(dataMap.get("Password"));
		reg_pg.enterConfirmPassword(dataMap.get("ConfirmPassword"));
		
	}

	@Then("the user should see an Error message")
	public void the_user_should_see_an_error_message() {
		reg_pg.getErrorMsg();
		
	}

}

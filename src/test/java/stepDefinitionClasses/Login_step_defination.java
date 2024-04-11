package stepDefinitionClasses;


import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import factory.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.HomePage;
import page_Objects.LoginPage;
import page_Objects.MyAccountPage;
import utilities.DataReader;


public class Login_step_defination {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage mapg;
	
	List<HashMap<String, String>> datamap;

//Scenario: 1 (Login with valid credentials)
	
	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() {
		hp = new HomePage(Base_class.getDriver());
		hp.clickOnLogin();
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String email, String passwd) {
		lp = new LoginPage(Base_class.getDriver());
		lp.enterEmail(email);
		lp.enterPassword(passwd);
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		lp.clickOnLogin();
	}

	@Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
		lp.myAccountLink();
		
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
		lp.getsuccessMsg();
	}
	
//Scenario: 2(Login with invalid credentials)
	
	@When("the user enters invalid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_invalid_credentials_username_password(String email, String passwd) {
		lp = new LoginPage(Base_class.getDriver());
		
		lp.enterEmail(email);
		lp.enterPassword(passwd);
	}
	
	@Then("the user should be stays in the Login page")
	public void the_user_should_be_stays_in_the_login_page() {
		lp.welcomeMessgae();
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
	    
	    lp.getErrorMsg();
	    
	}
	
//Data Driven Test Scenario
	
	@Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {string}")
	public void the_user_should_be_redirected_to_the_my_account_page_by_passing_email_and_password_with_excel_row(String rows) {
		 datamap=DataReader.data(System.getProperty("user.dir")+"\\testdata\\Opencart_LoginData.xlsx", "Sheet1");

	        int index=Integer.parseInt(rows)-1;
	        String email= datamap.get(index).get("username");
	        String pwd= datamap.get(index).get("password");
	        String exp_res= datamap.get(index).get("res");

	        lp=new LoginPage(Base_class.getDriver());
	        lp.enterEmail(email);
	        lp.enterPassword(pwd);

	        lp.clickOnLogin();
	        mapg=new MyAccountPage(Base_class.getDriver());
	        try
	        {
	            boolean targetpage=mapg.isMyAccountPageExists();
	            System.out.println("target page: "+ targetpage);
	            if(exp_res.equals("Valid"))
	            {
	                if(targetpage==true)
	                {
	                    MyAccountPage myaccpage=new MyAccountPage(Base_class.getDriver());
	                    myaccpage.clickOnLogout();
	                    Assert.assertTrue(true);
	                }
	                else
	                {
	                    Assert.assertTrue(false);
	                }
	            }

	            if(exp_res.equals("Invalid"))
	            {
	                if(targetpage==true)
	                {
	                    mapg.clickOnLogout();
	                    Assert.assertTrue(false);
	                }
	                else
	                {
	                    Assert.assertTrue(true);
	                }
	            }


	        }
	        catch(Exception e)
	        {

	            Assert.assertTrue(false);
	        }

	}

}

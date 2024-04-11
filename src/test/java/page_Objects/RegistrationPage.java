package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePageObject {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(xpath="//input[@id=\"gender-male\"]")
		WebElement gender_male;
		
		@FindBy(xpath="//input[@id='gender-female']")
		WebElement gender_female;
		
		
		@FindBy(name = "FirstName")
		WebElement first_name;

		@FindBy(name = "LastName")
		WebElement last_name;

		@FindBy(name = "Email")
		WebElement email;

		@FindBy(id = "Password")
		WebElement password;

		@FindBy(name = "ConfirmPassword")
		WebElement conf_password;

		@FindBy(xpath = "//button[@id=\"register-button\"]")
		WebElement btn_register;

		@FindBy(xpath = "class=\"result\"")
		WebElement reg_msg;
		
		@FindBy(xpath = "//li[normalize-space()='The specified email already exists']")
		WebElement error_msg;
		
			

		
		public void selectGenderMale() {
			
			gender_male.click();

		}
		public void selectGenderFeMale() {
			
			gender_female.click();

		}
		
		public void enterFirstName(String fname) {
			first_name.sendKeys(fname);

		}

		public void enterLastName(String lname) {
			last_name.sendKeys(lname);

		}

		public void eneterEmail(String Email) {
			email.sendKeys(Email);

		}


		public void enterPassword(String pwd) {
			password.sendKeys(pwd);

		}

		public void enterConfirmPassword(String pwd) {
			conf_password.sendKeys(pwd);

		}


		public void clickOnRegister() {
			btn_register.click();

		}

		public void getConfirmationMsg() {
			
			boolean conf_msg = reg_msg.isDisplayed();
			Assert.assertEquals(conf_msg, true);
			
			System.out.println("Registration successfull");
			
			/*try {
				return (reg_msg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}*/

		}
		
		public void getErrorMsg() {
			
			boolean ce_msg = error_msg.isDisplayed();
			Assert.assertEquals(ce_msg, true);
			

			
			/*try {
				return (reg_msg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}*/

		}
		
		
		public boolean validationMessage() {
			try {
				return (reg_msg.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
			
		}

		
}
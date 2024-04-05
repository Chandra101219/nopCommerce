package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage extends BasePageObject {

	public AddAddressPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id=\"Address_FirstName\"]")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='Address_LastName']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@id='Address_Email']")
	WebElement email;
	
	@FindBy(xpath="//select[@id='Address_CountryId']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='Address_City']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='Address_Address1']")
	WebElement address1;
	
	@FindBy(xpath="//input[@id='Address_ZipPostalCode']")
	WebElement postcode;
	
	@FindBy(xpath="//input[@id='Address_PhoneNumber']")
	WebElement phnnum;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	
	public void enterFirstName(String f_name) {
		first_name.sendKeys(f_name);
	}
	
	public void enterLastName(String l_name) {
		last_name.sendKeys(l_name);
	}
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void selectCountry(String value) {
		Select drp_country = new Select(country);
		
		//drp_country.selectByValue(value);
		drp_country.selectByVisibleText(value);
	}
	public void enterCity(String ct) {
		city.sendKeys(ct);
	}
	
	public void enterAdress1(String add1) {
		address1.sendKeys(add1);
	}
	public void enterPostalCode(String pcode) {
		postcode.sendKeys(pcode);
	}
	public void enterPhoneNumber(String pno) {
		phnnum.sendKeys(pno);
	}
	public void clickOnSave() {
		save.click();
	}
	

}

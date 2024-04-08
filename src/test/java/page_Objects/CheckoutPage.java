package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePageObject{

	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}	
	
	@FindBy(xpath="id=\"ShipToSameAddress\"")
	WebElement stsacheckbox;
	
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
	
	

	@FindBy(xpath="//button[@class=\"button-1 new-address-next-step-button\" and @name=\"save\" ]")
	WebElement bacontinue;
	
	
	
	@FindBy(xpath="//input[@name=\"shippingoption\"]")
	WebElement deliverymethod;
	
	@FindBy(xpath="//div[@id=\"shipping-method-buttons-container\"]//a")
	WebElement deliverymethodback;
	
	@FindBy(xpath="//button[@class=\"button-1 shipping-method-next-step-button\"]")
	WebElement deliverymethodcontinue;
	
	@FindBy(xpath="//input[@name=\"paymentmethod\"]")
	WebElement paymentmethod;
	
	@FindBy(xpath="//div[@id=\"payment-method-buttons-container\"]//a")
	WebElement paymentmethodback;
	
	@FindBy(xpath="//button[@class=\"button-1 payment-method-next-step-button\"]")
	WebElement paymentmethodcontinue;
	
	@FindBy(xpath="//div[@id=\"payment-info-buttons-container\"]//a")
	WebElement paymentinfoback;
	
	@FindBy(xpath="//button[@class=\"button-1 payment-info-next-step-button\"]")
	WebElement paymentinfocontinue;
	
	
	@FindBy(xpath="//tr[@class=\"order-total\"]//span//strong")
	WebElement ordertotal;
	
	
	@FindBy(xpath="//div[@id=\"confirm-order-buttons-container\"]//a")
	WebElement confirmbackbtn;
	
	
	@FindBy(xpath="//button[text()=\"Confirm\"]")
	WebElement confirm;
	
	
	@FindBy(xpath="//div[@class=\"title\"]//strong")
	WebElement ordersuccess;
	
	
	
	
	public void shippingAddressSameCheckBox() {
		
		
		if(stsacheckbox.isSelected()) {
			System.out.println("already selected");
		}
		else {
			stsacheckbox.click();
		}
	}

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
	
	public void clickOnContinueOnstep1()
	{
		bacontinue.click();
	}
	
	public void clickOnDeliveryMethod()
	{
		String dlvrymethod = deliverymethod.getText();
		System.out.println(dlvrymethod);
		
		
		if(deliverymethod.equals("Ground ($0.00)")) {
			
			deliverymethod.click();
			
			//Next Day Air ($0.00)
			//The two day air shipping
            
		}
	}
	
	public void clickOnBackdeliverymethod()
	{
		deliverymethodback.click();
	}
	
	public void clickOnContinueOnstep2()
	{
		deliverymethodcontinue.click();
	}
	
	
	
	
	public void clickOnPaymentMethod()
	{
		String paymethod = paymentmethod.getText();
		System.out.println(paymethod);
		
		
		if(paymentmethod.equals("Check / Money Order")) {
			
			paymentmethod.click();
			
			//Pay by cheque or money order
            
		}
	}
	
	public void clickOnBackPaymentmethod()
	{
		paymentmethodback.click();
	}
	public void clickOnContinueOnstep3()
	{
		paymentmethodcontinue.click();
	}
	
	
	public void clickOnContinueOnstep4()
	{
		paymentinfocontinue.click();
		
	}
	
	public void clickOnBackconfirm()
	{
		paymentmethodback.click();
	}
	
	public void clickOnContinueOnstep5()
	{
		confirm.click();
	}
	
	public void validationSuccessMsg()
	{
		String ordered = ordersuccess.getText();
		System.out.println(ordered);
		
		
		if(ordersuccess.equals("Your order has been successfully processed!")) {
			
			System.out.println("Test Passed");
			
			//Pay by cheque or money order
            
		}
		else {
			System.out.println("Test failed");
		}
	}
	
	
	
	
}

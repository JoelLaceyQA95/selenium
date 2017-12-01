package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserElements {
	
	@FindBy(css="#email_create")
	private WebElement createAccEmail;
	
	@FindBy(css="#SubmitCreate")
	private WebElement submitEmailBtn;
	
	@FindBy(css="#id_gender1")
	private WebElement genderRadioBtn;
	
	@FindBy(css="#customer_firstname")
	private WebElement firstname;
	
	@FindBy(css="#customer_lastname")
	private WebElement lastname;
	
	@FindBy(css="#passwd")
	private WebElement password;
	
	@FindBy(css="#address1")
	private WebElement address;
	
	@FindBy(css="#city")
	private WebElement city;
	
	@FindBy(css="#id_state")
	private WebElement stateSelector;
	
	@FindBy(css="#postcode")
	private WebElement postcode;
	
	@FindBy(css="#phone_mobile")
	private WebElement mobileNo;
	
	@FindBy(css="#submitAccount")
	private WebElement submitDetails;
	
	@FindBy(className="page-heading")
	private WebElement pageHeading;
	
	public void enterEmail(String email) {
		createAccEmail.sendKeys(email);
	}
	
	public void clickEnterEmailBtn() {
		submitEmailBtn.click();
	}
	
	public void clickGenderRadio() {
		genderRadioBtn.click();
	}
	
	public void enterFirstname(String userFirstname) {
		firstname.sendKeys(userFirstname);
	}
	
	public void enterLastname(String userLastname) {
		lastname.sendKeys(userLastname);
	}
	
	public void enterPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	
	public void enterAddress(String userAddress) {
		address.sendKeys(userAddress);
	}
	
	public void enterCity(String userCity) {
		city.sendKeys(userCity);
	}
	
	public void clickStateSelector() {
		Select selectState = new Select(stateSelector);
		selectState.selectByIndex(3);
	}
	
	public void enterPostcode(String userPostcode) {
		postcode.sendKeys(userPostcode);
	}
	
	public void enterMobileNo(String userMobileNo) {
		mobileNo.sendKeys(userMobileNo);
	}
	
	public void submitDetails() {
		submitDetails.click();
	}
	
	public String getPageHeading() {
		String text = pageHeading.getText();
		return text;
	}

}

package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInElements {
	@FindBy(css="#js-header-nav > ul > li.header__nav-listing.header__nav-my-at > div > a")
	private WebElement homeSignUpBtn;
	
	@FindBy(css="#js-social__signup-tab")
	private WebElement signUpBtn;
	
	@FindBy(css="#email")
	private WebElement email;
	
	@FindBy(css="#password")
	private WebElement password;
	
	@FindBy(css="#social--signup--submit")
	private WebElement submit;
	
	public void clickSignUpHome() {
		homeSignUpBtn.click();
	}
	
	public void clickSignUp() {
		signUpBtn.click();
	}
	
	public void userEmail(String userEmail) {
		email.sendKeys(userEmail);
	}
	
	public void userPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	
	public void submit() {
		submit.click();
	}

}

package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement signInBtn;
	
	@FindBy(css="#email_create")
	private WebElement createAccEmail;
	
	@FindBy(css="#SubmitCreate")
	private WebElement submitEmailBtn;
	
	
	@FindBy(className="page-heading")
	private WebElement subHeading;
	
	public void clickSignUpBtn() {
		signInBtn.click();
	}
	
	public void enterEmail(String email) {
		createAccEmail.sendKeys(email);
	}
	
	public void clickEnterEmailBtn() {
		submitEmailBtn.click();
	}
	
	
	public String getSubHeading() {
		String text = subHeading.getText();
		return text;

	}

}

package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(css="body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")
	private WebElement addUser;
	
	@FindBy(css="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement username;
	
	@FindBy(css="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	private WebElement password;
	
	@FindBy(css="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	private WebElement submit;
	
	@FindBy(css="body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")
	private WebElement login;
	
	@FindBy(name="username")
	private WebElement loginUser;
	
	@FindBy(name="password")
	private WebElement loginPassword;
	
	@FindBy(name="FormsButton2")
	private WebElement login2;
	
	@FindBy(css="body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")
	private WebElement loginMessage;
	
	public void addUserBtn() {
		addUser.click();
	}
	
	public void typeUsername(String user) {
		username.sendKeys(user);
	}
	
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void submitUser() {
		submit.click();
	}
	
	public void loginTab() {
		login.click();
	}
	
	public void typeUsername2(String user) {
		loginUser.sendKeys(user);
	}
	
	public void typePassword2(String pass) {
		loginPassword.sendKeys(pass);
	}
	
	public void loginBtn() {
		login2.click();
	}
	
	public String getLoginMessage() {
		String text = loginMessage.getText();
		return text;
	}

}

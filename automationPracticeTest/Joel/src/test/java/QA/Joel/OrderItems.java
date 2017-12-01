package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderItems {
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
	private WebElement itemImage;
	
	@FindBy(css="#add_to_cart > button")
	private WebElement addToCartBtn;
	
	@FindBy(css="#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
	private WebElement shoppingCartBtn;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement proceedToCheckout;
	
	@FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement checkoutBtn;
	
	@FindBy(css="#passwd")
	private WebElement password;
	
	@FindBy(css="#email")
	private WebElement email;
	
	@FindBy(css="#SubmitLogin")
	private WebElement login;
	
	@FindBy(css="#center_column > form > p > button")
	private WebElement proceedToCheckout2;
	
	@FindBy(css="#cgv")
	private WebElement termsAndCon;
	
	@FindBy(css="#form > p > button")
	private WebElement proceedToCheckout3;
	
	@FindBy(css="#HOOK_PAYMENT > div:nth-child(1) > div > p")
	private WebElement paymentMeth;
	
	@FindBy(css="#cart_navigation > button")
	private WebElement confirmOrder;
	
	@FindBy(className="page-heading")
	private WebElement orderMsg;
	
	public void clickImage() {
		itemImage.click();
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	
	public void proceedToCheckout() {
		proceedToCheckout.click();
	}
	
	public void checkout() {
		checkoutBtn.click();
	}
	
	public void userEmail(String userEmail) {
		email.sendKeys(userEmail);
	}
	
	public void userPassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	
	public void login() {
		login.click();
	}
	
	public void proceedToCheckout2() {
		proceedToCheckout2.click();
	}
	
	public void termsAndCon() {
		termsAndCon.click();
	}
	
	public void confirmOrder() {
		confirmOrder.click();
	}
	
	public void proceedToCheckout3() {
		proceedToCheckout3.click();
	}
	
	public void paymentMeth() {
		paymentMeth.click();
	}
	
	public String orderMsg() {
		String text = orderMsg.getText();
		return text;
	}
	
}

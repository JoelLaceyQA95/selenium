package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsToCartElements {
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
	private WebElement itemImage;
	
	@FindBy(css="#add_to_cart > button")
	private WebElement addToCartBtn;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	private WebElement itemAddedMsg;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > span")
	private WebElement closeWindow;
	
	@FindBy(css="#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
	private WebElement shoppingCartBtn;
	
	@FindBy(css="#\\31 _1_0_0")
	private WebElement removeItemBtn;
	
	@FindBy(css="#center_column > p")
	private WebElement cartMsg;
	
	public void clickImage() {
		itemImage.click();
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	
	public String itemAddedMsg() {
		String text = itemAddedMsg.getText();
		return text;
	}
	
	public void closeWindow() {
		closeWindow.click();
	}
	
	public void clickShoppingCart() {
		shoppingCartBtn.click();
	}
	public void removeItem(){
		removeItemBtn.click();
	}
	
	public String cartMsg() {
		String text = cartMsg.getText();
		return text;
	}
}

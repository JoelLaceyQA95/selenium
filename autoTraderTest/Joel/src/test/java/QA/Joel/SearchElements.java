package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchElements {
	@FindBy(css="#postcode")
	private WebElement postcode;
	
	@FindBy(css="#radius")
	private WebElement carDistance;
	
	@FindBy(css="#searchVehiclesMake")
	private WebElement carMake;
	
	@FindBy(css="#searchVehiclesPriceFrom")
	private WebElement minPrice;
	
	@FindBy(css="#searchVehiclesPriceTo")
	private WebElement maxPrice;
	
	@FindBy(css="#js-search-button")
	private WebElement searchBtn;
	
	@FindBy(css="body > nav > ul > li:nth-child(3)")
	private WebElement breadcrumbs;
	
	public void postcode(String userPostcode) {
		postcode.sendKeys(userPostcode);
	}
	
	public void carDistance() {
		Select selectDistance = new Select(carDistance);
		selectDistance.selectByIndex(0);
	}
	
	public void carMake() {
		Select selectMake = new Select(carMake);
		selectMake.selectByIndex(1);
	}
	
	public void minPrice() {
		Select selectMin = new Select(minPrice);
		selectMin.selectByIndex(4);
	}
	
	public void maxPrice() {
		Select selectMax = new Select(maxPrice);
		selectMax.selectByIndex(10);
	}
	
	public void search() {
		searchBtn.click();
	}
	
	public String breadcrumbs() {
		String text = breadcrumbs.getText();
		return text;
	}
}

package QA.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewCarSearch {
	@FindBy(css="body > main > div > section.is-non-critical > section.alt-search__nav.t-row > a:nth-child(1) > figure")
	private WebElement newCarSearch;
	
	@FindBy(css="#postcode")
	private WebElement postcode;
	
	@FindBy(css="#searchVehiclesMake")
	private WebElement make;
	
	@FindBy(css="#searchVehiclesModel")
	private WebElement model;
	
	@FindBy(css="body > nav > ul > li:nth-child(3)")
	private WebElement breadcrumbs;
	
	public void newCarSearch() {
		newCarSearch.click();
	}
	
	public void postcode(String userPostcode) {
		postcode.sendKeys(userPostcode);
	}
	
	public void make() {
		Select makeSelect = new Select(make);
		makeSelect.selectByIndex(3);
	}
	
	public void model() {
		Select modelSelect = new Select(model);
		modelSelect.selectByIndex(1);
	}
	
	public String breadcrumbs() {
		String text = breadcrumbs.getText();
		return text;
	}

}

package Qa.Joel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Draggable {
	@FindBy(css="#draggable")
	private WebElement defaultDraggableBox;
	
	@FindBy(css="#ui-id-1")
	private WebElement defaultFunctionalityTab;
	
	@FindBy(css="#ui-id-2")
	private WebElement constraintMovementTab;
	
	@FindBy(css="#draggabl")
	private WebElement verticalDrag;
	
	@FindBy(css="#ui-id-3")
	private WebElement cursorStyleTab;
	
	public WebElement getDefaultDraggableBox() {
		return defaultDraggableBox;
	}
	
	public int elementXPosition() {
		return defaultDraggableBox.getLocation().getX();
	}
	
	public void defaultTabClick() {
		defaultFunctionalityTab.click();
	}
	
	public void constraintTabClick() {
		constraintMovementTab.click();
	}
	
	public int elementYPosition() {
		return verticalDrag.getLocation().getY();
	}
	
	public WebElement getVerticalDragBox() {
		return verticalDrag;
	}
	
	public void cursorStyleTabClick() {
		cursorStyleTab.click();
	}
}
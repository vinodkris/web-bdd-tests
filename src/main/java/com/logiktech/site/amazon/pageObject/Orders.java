package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orders extends BasePage {
	
	public Orders(WebDriver driver){
		super(driver);
	}
	
	@FindBy(css = "a#your-orders")
	private WebElement btnYourOrders;
	
	public boolean isYourOrdersPresent(){
		return btnYourOrders.isDisplayed();
	}

}

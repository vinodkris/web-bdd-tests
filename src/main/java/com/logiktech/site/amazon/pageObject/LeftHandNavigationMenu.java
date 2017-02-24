package com.logiktech.site.amazon.pageObject;

import java.util.ArrayList;
import java.util.List;

import com.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LeftHandNavigationMenu extends BasePage {
	
	public LeftHandNavigationMenu(WebDriver driver){
		super(driver);
	}
	
	@FindBy(css = "ul.nav_browse_ul li")
	private List<WebElement> leftHandNavigationMenuItems;
	
	
	public List<String> getListOfLinkInLHNavigationMenu(){
		List<String> l = new ArrayList<String>();
		List<WebElement> list = leftHandNavigationMenuItems;
		System.out.println(list.size());
		return l;
	}
	
	
	
	

}

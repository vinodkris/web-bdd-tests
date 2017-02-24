package com.logik.site.blinkbox.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNav extends BasePage {
	
	private WebDriver driver;	
	
	public TopNav(WebDriver driver){
		super(driver);
		this.driver = driver;
		
	}
	
	@FindBy(css = ".search")
	private WebElement searchIcon;
	
	@FindBy(css = ".jsSearchInput")
	private WebElement searchInputBox;
	
	public void searchMovie(String movieName){
		
		searchIcon.click();
		searchInputBox.sendKeys(movieName);
		searchInputBox.submit();
		
	}

}

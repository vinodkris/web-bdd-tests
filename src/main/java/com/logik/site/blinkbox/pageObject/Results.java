package com.logik.site.blinkbox.pageObject;

import java.util.List;

import com.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Results extends BasePage {
	
	private WebDriver driver;
	
	public Results(WebDriver driver){
		super(driver);
		this.driver = driver;
		
	}
	
	@FindBy(css = ".item")
	private WebElement itemElement;
	
	
	public boolean isItemPresent(String itemName){
		
		boolean flag = false;		
		List<WebElement> itemList = driver.findElements(By.cssSelector(".item"));	
		
		for(WebElement item : itemList){
				
			if(item.findElement(By.cssSelector("h1")).getText().equalsIgnoreCase(itemName)){
				flag = true;				
			}
		}
		
		return flag;
		
	}

}

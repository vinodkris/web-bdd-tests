package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationMenu extends BasePage {
	
	public TopNavigationMenu(WebDriver driver){
		super(driver);		
	}
	
	@FindBy(css = "div#nav-bar-right a#nav-your-account")
	private WebElement loginToAccount;
	
	@FindBy(css = "span#nav-signin-text")
	private WebElement signInText;
	
	public void loginToAccount(){
		loginToAccount.click();		
	}
	
	public String getAccountName(){
		return signInText.getText();
	}
	
	public boolean isUserLoggedIn(String userWelcomeName){
		if(getAccountName().equalsIgnoreCase(userWelcomeName)){
			return true;			
		}else
			return false;		
	}
	
	
	

}

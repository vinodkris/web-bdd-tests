package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
	
	public Login(WebDriver driver){
		super(driver);		
	}
	
	@FindBy(css = "input#ap_email")
	private WebElement userName;
	
	@FindBy(css = "input#ap_password")
	private WebElement password;
	
	@FindBy(css = "input#signInSubmit-input")
	private WebElement btn_seure_signin;
	
	public void enterLoginDetails(String username, String pw){
		userName.sendKeys(username);
		password.sendKeys(pw);		
	}
	
	public void login(String username, String pw){
		enterLoginDetails(username,pw);
		btn_seure_signin.click();		
	}
	
	public void clickOnSecureLogin(){
		btn_seure_signin.click();		
	}

}

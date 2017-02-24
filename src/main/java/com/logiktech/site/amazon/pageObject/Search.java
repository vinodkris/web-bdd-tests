package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Page object class for Search. All fields related to search fields are initialized here.
 * Any methods on Search object goes in this class
 */
public class Search extends BasePage<Search> {
	
	public Search(WebDriver driver){
		super(driver);		
	}

	@FindBy(css = "div#nav-search")
	private WebElement search;

	@FindBy(css = "input#twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(css = "input[value=Go]")
	private WebElement go;

	@FindBy(css = "div.nav-search-scope")
	private WebElement searchInDropDown;

	@FindBy(css = "div.nav-search-scope i")
	private WebElement searchInDropDownBtn;


	@Override
	public void isLoaded(){
		(new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(searchInDropDown.findElement(By.cssSelector("span.nav-search-label"))));
	}

	
	public boolean isElementPresent(){
		return searchBox.isDisplayed();
	}
	
	public void searchText(String itemToSearch){
		searchBox.submit();		
	}
	
	public void enterItemToSearch(String item){
		searchBox.sendKeys(item);		
	}
	
	public void clickGo(){
		go.click();
	}
	
	public void clearSearch(){
		searchBox.clear();
	}

	public String getDeptInSearchDropDown() {
	//	waitForTextToBePresent(searchInDropDown.findElement(By.cssSelector("span.nav-search-label")),"Watches");
		return searchInDropDown.findElement(By.cssSelector("span.nav-search-label")).getText();
	}

	public void selectDepartmentToSearch(String dept){
		searchInDropDown.findElement(By.cssSelector("select#searchDropdownBox")).click();
		Select inDepts = new Select(searchInDropDown.findElement(By.cssSelector("select#searchDropdownBox")));
		inDepts.selectByVisibleText("Computers");
	}

}

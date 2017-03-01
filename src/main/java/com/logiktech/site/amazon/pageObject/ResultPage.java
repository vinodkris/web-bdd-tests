package com.logiktech.site.amazon.pageObject;

import java.util.ArrayList;
import java.util.List;

import com.logiktech.test.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Page object class for results page. Any fields related to results page is initialized here.
 * Any methods on result page goes in here.
 */
public class ResultPage extends BasePage<ResultPage> {
	
	public ResultPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(css = "div#atfResults")
	private WebElement resultPageCenterFrame;

	@Override
	public void isLoaded(){
		(new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(resultPageCenterFrame));
	}
	
	public List<Product> getListOfProducts(){

		List<Product> productList = new ArrayList<Product>();
		List<WebElement> items = resultPageCenterFrame.findElements(By.cssSelector("li.celwidget"));

		for (WebElement item : items) {
			productList.add(new Product(driver, item));
		}

		return productList;
	}

	public boolean checkAllResultItemAreRelevantToSearch(String searchItem) {

		 boolean flag = true;

		for(Product product : getListOfProducts()){
			String title = product.getProductTitle();
			if(!title.contains(searchItem.toLowerCase())) {
				System.out.println(title);
				flag = false;
			}
		}
		return flag;
	}

	public void selectItem(int itemNumber){
		getListOfProducts().get(itemNumber).getProductItem().findElement(By.cssSelector("a.s-access-detail-page")).click();
	}

	public boolean checkAllDisplayedProductsArePrimeEligible(){

		boolean flag = true;
		for(Product product : getListOfProducts()){

			if(!product.isProductPrimeEligible()){
				flag = false;
			}
		}

		return flag;

	}
	
}

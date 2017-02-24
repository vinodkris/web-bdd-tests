package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vinod on 31/01/2017.
 */

/**
 * Page object class for result item, anything specific to a result item is put in here
 */
public class Product extends BasePage<Product> {

    private WebElement productItem;

    @FindBy(css = "a.s-access-detail-page")
    private WebElement productTitle;

    @FindBy(css = "i.a-icon-prime")
    private WebElement primeLabel;


    public Product(WebDriver driver){
        super(driver);
    }

    public Product(WebDriver driver, WebElement element) {
        this(driver);
        this.productItem = element;
    }


    @Override
    public void isLoaded(){

        (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.elementToBeClickable(this.productItem));

    }

    public String getProductTitle(){
        return this.productItem.findElement(By.cssSelector("a.s-access-detail-page")).getAttribute("title").toLowerCase();
    }

    public WebElement getProductItem() {
        return this.productItem;
    }

    public boolean isProductPrimeEligible(){
        return findElementSafely(this.productItem, By.cssSelector("i.a-icon-prime"));
    }

}

package com.logiktech.site.amazon.pageObject;

import com.logiktech.test.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vinod on 31/01/2017.
 */
public class ProductPage extends BasePage<ProductPage> {

    @FindBy(css = "span#productTitle")
    private WebElement productTitle;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public String getProductTitle(){
        return productTitle.getText();
    }
}

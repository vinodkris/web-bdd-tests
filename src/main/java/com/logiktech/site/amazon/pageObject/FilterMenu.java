package com.logiktech.site.amazon.pageObject;

import com.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vinod on 06/02/2017.
 */
public class FilterMenu extends BasePage<FilterMenu> {

    @FindBy(css = "#refinements")
    private WebElement filterPane;

    public FilterMenu(WebDriver driver) {
        super(driver);
    }


    public void selectPrime(){

        filterPane.findElement(By.cssSelector("img[alt=\"Prime Eligible\"]")).click();
    }




}

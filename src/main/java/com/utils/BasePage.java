package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vinod on 21/01/2017.
 */
public abstract class BasePage<T extends BasePage<T>> extends LoadableComponent<T> {

    protected static WebDriver driver;
    private static final long wait = 30;

    protected BasePage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    @Override
            public void isLoaded() {}

            @Override
            public void load(){

            }

        public static boolean findElementSafely(WebElement webElement, By by) {

            try {
                return webElement.findElement(by).isEnabled();
            } catch (NoSuchElementException ex) {
                return false;
            }
        }

        public static void waitForElementToBePresent(WebElement element){
            (new WebDriverWait(driver, wait))
                    .until(ExpectedConditions.elementToBeClickable(element));
        }

        public static void waitForTextToBePresent(WebElement element, String text){

            for (int i=0; i < 60; i++){
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(element.getText());
        }



        (new WebDriverWait(driver, wait))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }




}

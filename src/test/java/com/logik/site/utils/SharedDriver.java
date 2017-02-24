package com.logik.site.utils;


import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Set;

/**
 * Created by vinod on 24/07/2016.
 */
public class SharedDriver extends EventFiringWebDriver {

    private static WebDriver driver = WebdriverFactory.getWebdriver();

    public SharedDriver() {
        super(driver);
    }

    @After
    private static void afterStep(){
        driver.manage().deleteAllCookies();
    }
}

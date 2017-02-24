package com.logik.site.utils;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vinod on 25/01/2017.
 */
public class WebdriverFactory {

    private static WebDriver driver;

    public static WebDriver getWebdriver() {

        if(driver == null) {
            try{

                System.out.println("CREATING NEW INSTANCE OF WEBDRIVER");
                driver = initialiseWebDriver();
                driver.manage().window().maximize();
            } finally {
                try {
                    Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
                } catch (Exception e) { }
            }
        }
        return driver;
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            driver.quit();
        }
    }

    private static WebDriver initialiseWebDriver() {
        String browserType = getBrowserType();
        WebDriver driver;
        switch (browserType) {
            case "chrome" :
                driver = new ChromeDriver();
                break;
            case "firefox" :
            default:
                driver = new FirefoxDriver();
        }

        return driver;
    }

    private static String getBrowserType() {

        try{
            return System.getProperty("browser").toLowerCase();
        }catch (NullPointerException ex) {
            return "firefox";
        }
    }
}

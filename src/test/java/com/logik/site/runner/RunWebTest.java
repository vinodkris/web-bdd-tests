package com.logik.site.runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunWebTest {

    public WebDriver driver;

    public RunWebTest(){
        driver = new FirefoxDriver();
    }

    @Test
    public void demoTest(){

        driver.navigate().to("http://www.amazon.co.uk");




    }

}




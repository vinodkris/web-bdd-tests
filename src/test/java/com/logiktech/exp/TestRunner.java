package com.logiktech.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vinod on 28/02/2017.
 */
public class TestRunner {

    private static WebDriver driver = new FirefoxDriver();

    public static void main(String[] args){

        testCaseForRadioButton();


    }

    public static void testCaseForRadioButton(){
        driver.get("https://www.amazon.co.uk/Apple-MacBook-12-inch-Laptop-Graphics/dp/B01ELG6EEE/ref=sr_1_5?s=computers&ie=UTF8&qid=1488323096&sr=1-5&keywords=macbook");
        WebElement rbGroup = driver.findElement(By.cssSelector("div#rbbContainer"));

        System.out.println(rbGroup.findElement(By.cssSelector("div.unselected")).findElement(By.cssSelector("i.a-icon-radio-inactive")).isSelected());

        rbGroup.findElement(By.cssSelector("div.unselected")).findElement(By.cssSelector("i.a-icon-radio-inactive")).click();

        rbGroup.findElement(By.cssSelector("div.unselected")).findElement(By.cssSelector("i.a-icon-radio-inactive")).click();
    }
}

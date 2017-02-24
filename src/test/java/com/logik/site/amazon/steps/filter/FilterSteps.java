package com.logik.site.amazon.steps.filter;

import com.logik.site.utils.SharedDriver;
import com.logiktech.site.amazon.pageObject.FilterMenu;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by vinod on 06/02/2017.
 */
public class FilterSteps {

    private final WebDriver driver;

    public FilterSteps(SharedDriver s_driver) {
        this.driver = s_driver;
    }

    @When("^filter result available with prime$")
    public void filter_result_available_with_prime() {
        new FilterMenu(driver).get().selectPrime();
    }
}

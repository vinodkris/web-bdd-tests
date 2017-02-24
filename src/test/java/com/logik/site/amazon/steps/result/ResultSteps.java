package com.logik.site.amazon.steps.result;

import com.logik.site.utils.SharedDriver;
import com.logiktech.site.amazon.pageObject.ProductPage;
import com.logiktech.site.amazon.pageObject.Product;
import com.logiktech.site.amazon.pageObject.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static com.logik.site.amazon.steps.search.SearchSteps.searchItem;

/**
 * Created by vinod on 31/01/2017.
 */
public class ResultSteps {

    private final WebDriver driver;

    public ResultSteps(SharedDriver s_driver) {
        this.driver = s_driver;
    }

    @Then("^the list displaying searched items should display$")
    public void the_list_displaying_searched_items_should_display() {
        Assert.assertTrue(new ResultPage(driver).get().checkAllResultItemAreRelevantToSearch(searchItem));
    }

    @When("^clicked on one of the result item$")
    public void clicked_on_one_of_the_result_item() {

        //new Product(driver).get().selectItem();
        new ResultPage(driver).get().selectItem(0);
    }

    @Then("^the \"([^\"]*)\" about that item must be displayed$")
    public void the_about_that_item_must_be_displayed(String info) {
        String actualTitle = new ProductPage(driver).get().getProductTitle().toLowerCase();
        Assert.assertTrue(actualTitle.contains(info.toLowerCase()));
    }

    @Then("^all displayed products should be available with prime$")
    public void all_displayed_products_should_be_available_with_prime() {


        Assert.assertTrue("Found items that are not available in prime", new ResultPage(driver).get().checkAllDisplayedProductsArePrimeEligible());



    }

}

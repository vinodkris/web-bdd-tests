package com.logik.site.johnlewis.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by vinod on 10/07/2016.
 */
public class SearchProducts {

    public SearchProducts(){
        System.out.println("NOW IN SEARCHPRODUCTS CLASS");
    }

    @Then("^john lewis home page should be displayed$")
    public void john_lewis_home_page_should_be_displayed() throws Throwable {

        //System.out.println("THE BROWSER TITLE IS - " + driver.getTitle());

    }

    @When("^i search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) throws Throwable {

     //   System.out.println("THE BROWSER TITLE IS - " + driver.getTitle());

    }

    @Then("^i should see the relevant results$")
    public void i_should_see_the_relevant_results() throws Throwable {
     //   System.out.println(driver.getTitle());

    }

}

package com.logik.site.blinkbox.steps.search;


import com.logik.site.utils.SharedDriver;
import org.junit.Assert;


import com.logik.site.blinkbox.pageObject.Results;
import com.logik.site.blinkbox.pageObject.TopNav;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

	private final WebDriver driver;
	
	private TopNav topNav;
	private Results results;

	public SearchSteps(SharedDriver s_driver){
		this.driver = s_driver;
	}

	@When("^I search for movie \"(.*?)\"$")
	public void i_search_for_movie(String movieName) throws Throwable {
		
		topNav = new TopNav(driver);
		topNav.searchMovie(movieName);
	    
	}

	@Then("^the search results should display \"(.*?)\" on the search results$")
	public void the_search_results_should_display_on_the_search_results(String itemName) throws Throwable {
		Results results = new Results(driver);
		Assert.assertTrue("Search item "+itemName + "does not return any value", results.isItemPresent(itemName));
	    
	}
	

}

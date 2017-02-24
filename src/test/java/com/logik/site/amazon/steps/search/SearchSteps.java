package com.logik.site.amazon.steps.search;


import com.logik.site.utils.SharedDriver;
import com.logiktech.site.amazon.pageObject.ResultPage;
import com.logiktech.site.amazon.pageObject.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class SearchSteps {

	private final WebDriver driver;
	public static String searchItem;

	
	public SearchSteps(SharedDriver s_driver) {
		this.driver = s_driver;
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String item) {
		searchItem = item;
		Search search = new Search(driver).get();
		search.clearSearch();
		System.out.println("SEARCHING FOR "+item);
		search.enterItemToSearch(item);
		hit_Go();
	}

	@Then("^the search in dropdown should be auto selected to \"([^\"]*)\"$")
	public void the_search_in_dropdown_should_be_auto_selected_to(String dept) {
		Assert.assertEquals("", dept, new Search(driver).get().getDeptInSearchDropDown());
	}

	@When("^hit Go$")
	public void hit_Go() {
		new Search(driver).get().clickGo();
	}

	@When("^I select \"([^\"]*)\" from departments$")
	public void i_select_from_departments(String dept) {
		new Search(driver).get().selectDepartmentToSearch(dept);

	}
}

package com.logik.site.steps.common;

import java.util.Map;


import com.logiktech.test.utils.SharedDriver;
import cucumber.api.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
//import com.logik.selenium.ConfigHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class BrowserControlSteps {

    private final WebDriver driver;

	@Before
	public void startUp(){
		System.out.println("Starting the tests");
	}

	public BrowserControlSteps(SharedDriver s_driver)
    {
		this.driver = s_driver;
	}
	
	private static Logger log = LogManager.getLogger(BrowserControlSteps.class.getName());
	
	
	
	@Given("^I have launched a browser instance$")
	public void i_have_launched_a_browser_instance() throws Throwable {
		log.info("THE BROWSER NAME IS - " + System.getProperty("browserName"));
		//log.debug("LAUNCHING A" + ConfigHelper.getBrowser().toString() + " BROWSER INSTANCE");
	}
	
	@Given("^I navigate to \"(.*?)\"$")
	public void i_navigate_to(String url) throws Throwable {

		driver.get(url);
		System.out.println("THE BROWSER TITLE IS - " + driver.getTitle() );
	}
	
	@Given("^I set the browser dimensions to the specified size$")
	public void i_set_the_browser_dimensions_to_the_specified_size(DataTable table) throws Throwable {
		 Map<String,String> rows = table.asMaps(String.class, String.class).get(0);
	     int width = Integer.parseInt(rows.get("width"));
	     int height = Integer.parseInt(rows.get("height"));
	     driver.manage().window().setSize(new Dimension(width, height));
	}
	
	
	/**
     * Method to be invoked after the scenario has completed execution
     */

	public void clearBrowser(){

        System.out.println("Cleaning session values of browser instance");

	}
	
	
	

}

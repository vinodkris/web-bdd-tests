package com.logik.site.runner.amazon;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by vinod on 22/01/2017.
 */

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/cucumber/amazon"},
        features = {"src/test/resources/features/amazon/login"},
        glue = {"com.logik.site.amazon.steps.login", "com.logik.site.steps.common"}
        //  tags = {"@searchProducts"}
)
public class LoginTest {
}

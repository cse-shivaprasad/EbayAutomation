package ebay.qa.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/features",
		glue= {"ebay.qa.stepdefinitions"},
		tags = {"@001"},
		plugin = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"}
		)
public class TestRunner  {
	
	
}

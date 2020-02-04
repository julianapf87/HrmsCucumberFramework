package com.hrms.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features"
		, glue = "com/hrms/steps"
		, dryRun = true
		, plugin = { "pretty","html:target/html/cucumber-default-report" }
		, monochrome = false
		, tags = { "@regression" }
)

public class SmokeRunner {

}

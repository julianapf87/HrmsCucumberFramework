package com.hrms.steps;

import javax.xml.stream.events.StartDocument;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitilizer;
import com.hrms.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.Module.SetupContext;

public class Hooks extends CommonMethods {

	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario " + scenario.getName());
		setUp();
		initializeAllPage();
		
	}

	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenario" + scenario.getName());
		tearDown();
	}
}

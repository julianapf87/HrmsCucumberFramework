package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.ReportPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ReportSteps extends CommonMethods{

	ReportPageElements addReport, noReportFound;
	
	@Given("I navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() {
		DashboardPageElements dashboard = new DashboardPageElements();
		dashboard.navigateToReport();
	}
//
//	@When("I entered invalid {String} report")
//	public void i_entered_invalid_report(String reportName) {
//		addReport = new ReportPageElements();
//		sendText(addReport.searchBox, reportName);
//	}
//
//	@When("I click search button")
//	public void i_click_search_button() {
//		click(addReport.searchBtn);
//	}
//
//	@Then("I see no records found message")
//	public void i_see_no_records_found_message() {
//		boolean invalidMessage = addReport.noRecordFoundMessage.isDisplayed();
//		System.out.println(invalidMessage);
//	}
//
//	@When("I entered valid {String} report")
//	public void i_entered_valid_report(String report) {
//		addReport = new ReportPageElements();
//		sendText(addReport.searchBtn, report);
//	}
//
//	@Then("I see search report is displayed")
//	public void i_see_search_report_is_displayed() {
//		addReport.validSearchResult.isDisplayed();
//	}
}

package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	LoginPageElements login;

	@Given("I open the browser and navigated to the HRMS")
	public void i_open_the_browser_and_navigated_to_the_HRMS() {
		setUp();
	}

	@When("I entered valid username and valid password")
	public void i_entered_valid_username_and_valid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("I succesfully logged in")
	public void i_succesfully_logged_in() {
		System.out.println("I am logged in");
	}

	@When("I entered valid username and invalid password")
	public void i_entered_valid_username_and_invalid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Hello");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		boolean error = login.errorMsg.isDisplayed();
		Assert.assertTrue("Error message is NOT displayerd ", error);
	}

	@When("I entered valid {string} and {string}")
	public void i_entered_valid_and(String username, String password) {
	sendText(login.username, username);
	sendText(login.password, password);
	}

	@Then("I see {string}")
	public void i_see(String errormessage) {
		System.out.println(errormessage);
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		tearDown();
	}

}

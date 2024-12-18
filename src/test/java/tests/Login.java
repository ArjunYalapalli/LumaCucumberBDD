package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("I visit the Magento website")
	public void i_visit_the_magento_website() {
		System.out.println("one");
	}

	@When("I click on the {string} linktext")
	public void i_click_on_the_linktext(String string) {
		System.out.println("one");

	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {
		System.out.println("one");

	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String string) {
		System.out.println("one");

	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		System.out.println("one");

	}

	@Then("I should see the {string} message")
	public void i_should_see_the_message(String string) {
		System.out.println("one----"+string);

	}

	@When("I dont enter the username")
	public void i_dont_enter_the_username() {
		System.out.println("one");

	}

	@When("I dont enter the password")
	public void i_dont_enter_the_password() {
		System.out.println("one");

	}

}

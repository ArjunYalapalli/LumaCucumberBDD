package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetPassword {

	@Given("I am on the Sign In page")
	public void i_am_on_the_sign_in_page() {
		System.out.println("one");

	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
		System.out.println("one");

	}

	@Then("I should be redirected to the Forgot Your Password page")
	public void i_should_be_redirected_to_the_forgot_your_password_page() {
		System.out.println("one");

	}

	@Given("I am on the Forgot Your Password page")
	public void i_am_on_the_forgot_your_password_page() {
		System.out.println("one");

	}

	@When("I enter a valid email address in the email field")
	public void i_enter_a_valid_email_address_in_the_email_field() {
		System.out.println("one");

	}

	@Then("I should see a confirmation message {string}")
	public void i_should_see_a_confirmation_message(String string) {
		System.out.println("one");

	}

	@When("I leave the email field blank")
	public void i_leave_the_email_field_blank() {
		System.out.println("one");

	}

	@Then("I should see an error message {string}")
	public void i_should_see_an_error_message(String string) {
		System.out.println("one");

	}

	@When("I enter a invalid email address in the email field")
	public void i_enter_a_invalid_email_address_in_the_email_field() {
		System.out.println("one");

	}

}

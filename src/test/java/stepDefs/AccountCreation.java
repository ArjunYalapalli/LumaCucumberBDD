package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation {
	@Given("I click on the Create an Account linktext")
	public void i_click_on_the_create_an_account_linktext() {
		
	}

	@When("I enter the first name {string}")
	public void i_enter_the_first_name(String string) {
		System.out.println(string);
	}

	@When("I enter the last name {string}")
	public void i_enter_the_last_name(String string) {
		System.out.println(string);

	}

	@When("I enter the email {string}")
	public void i_enter_the_email(String string) {
		System.out.println(string);

	}

	@When("I enter the Password {string}")
	public void I_enter_the_Password(String string) {
		System.out.println(string);
	}

	@When("I enter the confirm password {string}")
	public void i_enter_the_confirm_password(String string) {
		System.out.println(string);

	}

	@Then("I click on Create an account button")
	public void i_click_on_create_an_account_button() {
		
	}
}

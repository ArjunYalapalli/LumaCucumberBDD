package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation {

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

	@Then("I click on {string} button")
	public void i_click_on_button(String string) {
		System.out.println(string);

	}
}

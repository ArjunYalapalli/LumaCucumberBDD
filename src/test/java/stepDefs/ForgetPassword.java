package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgetPassword {

	WebDriver driver = DriverFactory.getDriver();

	@Given("I am on the Sign In page")
	public void i_am_on_the_sign_in_page() {

		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();

	}

	@When("I click on the Forgot Your Password? link")
	public void i_click_on_the_forgot_your_password_link() {

	}

	@Then("I should be redirected to the Forgot Your Password page")
	public void i_should_be_redirected_to_the_forgot_your_password_page() {
		String actTitle = driver.getTitle();
		if (actTitle.equals("Forgot Your Password?")) {
			System.out.println("User is on forget password page ");
		}

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

	@When("I click on the Reset Password button")
	public void i_click_on_the_reset_password_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
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

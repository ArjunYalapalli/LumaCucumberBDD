package stepDefs;

import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ForgetPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.CommonUtils;
import utilities.ConfigReader;

public class ForgetPassword {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	ForgetPasswordPage fp = new ForgetPasswordPage(driver);
	CommonUtils cu = new CommonUtils();

	@Given("I am on the Sign In page")
	public void i_am_on_the_sign_in_page() {

		hp.click_On_SignIN();

	}

	@When("I click on the Forgot Your Password? link")
	public void i_click_on_the_forgot_your_password_link() {

		lp.click_foregtPassword_Link();

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

		hp.click_On_SignIN();
		lp.click_foregtPassword_Link();

	}

	@When("I enter a valid email address in the email field")
	public void i_enter_a_valid_email_address_in_the_email_field() {

		String email = ConfigReader.getUsername();
		fp.enterEmailID(email);

	}

	@Then("I should see a confirmation message {string}")
	public void i_should_see_a_confirmation_message(String string) {

		fp.verifyTextIsDisplayed(string);

	}

	@When("I leave the email field blank")
	public void i_leave_the_email_field_blank() {

		System.out.println("Left email field blank");

	}

	@When("I click on the Reset Password button")
	public void i_click_on_the_reset_password_button() {

		fp.clickOnResetMyPasswordBtn();

	}

	@Then("I should see an error message {string}")
	public void i_should_see_an_error_message(String string) {

		fp.verifyTextIsDisplayed(string);

	}

	@When("I enter a invalid email address in the email field")
	public void i_enter_a_invalid_email_address_in_the_email_field() {

		String dummy_Email = cu.randomeString(6);
		fp.enterEmailID(dummy_Email);

	}

}

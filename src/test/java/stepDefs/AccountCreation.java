package stepDefs;

import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import utilities.CommonUtils;

public class AccountCreation {

	WebDriver driver = DriverFactory.getDriver();
	HomePage hp = new HomePage(driver);
	CreateAccountPage cap = new CreateAccountPage(driver);
	CommonUtils cu = new CommonUtils();

	@Given("I click on the Create an Account linktext")
	public void i_click_on_the_create_an_account_linktext() {

		hp.click_On_CreateAnAccount();

	}

	@When("I enter the first name {string}")
	public void i_enter_the_first_name(String string) {

		cap.enterFirstName(cu.randomeString(5));

	}

	@When("I enter the last name {string}")
	public void i_enter_the_last_name(String string) {

		cap.enterLastName(cu.randomeString(5));

	}

	@When("I enter the email {string}")
	public void i_enter_the_email(String string) {

		String eMail = cu.emailGenarator(4,3);
		cap.enterEmail(eMail);
		System.out.println(eMail);

	}

	@When("I enter the Password {string}")
	public void I_enter_the_Password(String string) {

		cap.enterPassword(string);
	}

	@When("I enter the confirm password {string}")
	public void i_enter_the_confirm_password(String string) {

		cap.enterConfirmPassword(string);

	}

	@Then("I click on Create an account button")
	public void i_click_on_create_an_account_button() {

		cap.clickOnCreateAnAccountBtn();

	}
}
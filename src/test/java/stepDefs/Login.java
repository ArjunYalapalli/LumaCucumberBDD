package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;

	@Given("I visit the Magento website")
	public void i_visit_the_magento_website() {
		driver = DriverFactory.getDriver();

		System.out.println(driver.getTitle());
	}

	@When("I click on the {string} linktext")
	public void i_click_on_the_linktext(String string) {

		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String string) {

		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys(string);

	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {

		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();

	}

	@Then("I should see the {string} message")
	public void i_should_see_the_message(String string) {

		driver.findElement(By.xpath("//*[contains(text(),'" + string + "')]")).isDisplayed();

	}

	@When("I dont enter the username")
	public void i_dont_enter_the_username() {

		System.out.println("username is blank");
	}

	@When("I dont enter the password")
	public void i_dont_enter_the_password() {

		System.out.println("password is blank");

	}

}

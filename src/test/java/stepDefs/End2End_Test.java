package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import utilities.CommonUtils;

public class End2End_Test {

	WebDriver driver = DriverFactory.getDriver();
	HomePage hp = new HomePage(driver);
	CreateAccountPage cap = new CreateAccountPage(driver);
	CommonUtils cu = new CommonUtils();


	@When("I fill in the registration details with the following:")
	public void i_fill_in_the_registration_details_with_the_following(DataTable dataTable) {
		// Convert the DataTable into a Map where column names are the keys
		Map<String, String> registrationDetails = dataTable.asMap(String.class, String.class);

		// Extract the individual fields
		String firstName = registrationDetails.get("First Name");
		String lastName = registrationDetails.get("Last Name");
		String email = registrationDetails.get("Email");
		String password = registrationDetails.get("Password");
		String confirmPassword = registrationDetails.get("Confirm Password");

	}

	@Then("I click on logout from the application")
	public void i_click_on_logout_from_the_application() {

	}

	@When("I enter valid credentials with the following:")
	public void i_enter_valid_credentials_with_the_following(io.cucumber.datatable.DataTable dataTable) {
		// Convert DataTable into a Map where column names are keys and cell values are
		// values
		Map<String, String> credentials = dataTable.asMap(String.class, String.class);

		// Extract values from the Map
		String email = credentials.get("Email");
		String password = credentials.get("Password");
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {

	}

	@Then("I should be logged in successfully and redirected to the homepage")
	public void i_should_be_logged_in_successfully_and_redirected_to_the_homepage() {

	}

	@When("I search for a product {string}")
	public void i_search_for_a_product(String string) {

	}

	@Then("I should see a list of products related to {string}")
	public void i_should_see_a_list_of_products_related_to(String string) {

	}

	@When("I select a product {string}")
	public void i_select_a_product(String string) {

	}

	@Then("I should be taken to the product details page")
	public void i_should_be_taken_to_the_product_details_page() {

	}

	@Then("I choose my {string},{string} and {string} of the product")
	public void i_choose_my_and_of_the_product(String string, String string2, String string3) {

	}

	@When("I click on {string}")
	public void i_click_on(String string) {

	}

	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() {

	}

	@When("I Navigate to Cart page")
	public void i_navigate_to_cart_page() {

	}

	@Then("I should be taken to the checkout page")
	public void i_should_be_taken_to_the_checkout_page() {

	}

	@When("I enter the shipping address with the following:")
	public void i_enter_the_shipping_address_with_the_following(io.cucumber.datatable.DataTable dataTable) {
		// Convert DataTable to a Map where the column headers become the keys
		Map<String, String> addressDetails = dataTable.asMap(String.class, String.class);

		// Access the values from the Map
		String firstName = addressDetails.get("First Name");
		String lastName = addressDetails.get("Last Name");
		String streetAddress = addressDetails.get("Street Address");
		String city = addressDetails.get("City");
		String state = addressDetails.get("State");
		String zipCode = addressDetails.get("Zip Code");
		String country = addressDetails.get("Country");
		String phoneNumber = addressDetails.get("Phone Number");
	}

	@When("I click on the Ship here button")
	public void i_click_on_the_ship_here_button() {

	}

	@Then("the shipping address should be updated")
	public void the_shipping_address_should_be_updated() {

	}

	@When("I select a shipping method Fixed")
	public void i_select_a_shipping_method_fixed() {

	}

	@When("I click on the Next button")
	public void i_click_on_the_next_button() {

	}

	@Then("the shipping method should be updated")
	public void the_shipping_method_should_be_updated() {

	}

	@When("I check the checkbox of -My billing and shipping address are the same")
	public void i_check_the_checkbox_of_my_billing_and_shipping_address_are_the_same() {

	}

	@When("I review my order and see the following:")
	public void i_review_my_order_and_see_the_following(DataTable dataTable) {
		// Convert DataTable into a List of Maps (each map corresponds to a row)
		List<Map<String, String>> orderDetails = dataTable.asMaps(String.class, String.class);
		// Loop through each order entry
		for (Map<String, String> product : orderDetails) {
			String productName = product.get("Product Name");
			String quantity = product.get("Quantity");
			String price = product.get("Price");
			// Find the product name, quantity, and price elements on the page
			String actualProductName = driver.findElement(By.xpath("//td[contains(text(), '" + productName + "')]"))
					.getText();
			String actualQuantity = driver.findElement(By.xpath("//td[contains(text(), '" + quantity + "')]"))
					.getText();
			String actualPrice = driver.findElement(By.xpath("//td[contains(text(), '" + price + "')]")).getText();

			// Assertion to check if the product details are correct
			assert actualProductName.equals(productName) : "Product Name does not match!";
			assert actualQuantity.equals(quantity) : "Quantity does not match!";
			assert actualPrice.equals(price) : "Price does not match!";
		}
	}

	@When("the total price should be displayed correctly")
	public void the_total_price_should_be_displayed_correctly() {

	}

	@When("I click on the -Place Order- button")
	public void i_click_on_the_place_order_button() {

	}

	@Then("I should be redirected to the order confirmation page")
	public void i_should_be_redirected_to_the_order_confirmation_page() {

	}

	@Then("the order number should be displayed")
	public void the_order_number_should_be_displayed() {

	}

	@Then("I should have option to Print Receipt and Continue Shopping")
	public void i_should_have_option_to_print_receipt_and_continue_shopping() {

	}

	@When("I click on Order Number")
	public void i_click_on_order_number() {

	}

	@Then("I navigate to Order details page")
	public void i_navigate_to_order_details_page() {

	}

	@Then("the order status should be Pending")
	public void the_order_status_should_be_pending() {

	}

	@Then("I should be have option to Print my Order")
	public void i_should_be_have_option_to_print_my_order() {

	}

	@Then("I should have option to Reorder")
	public void i_should_have_option_to_reorder() {

	}

}

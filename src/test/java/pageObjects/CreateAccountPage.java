package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {

		super(driver);

	}

	By firstName = By.id("firstname");

	public void enterFirstName(String string) {

		enterText(firstName, string);

	}

	By lasyName = By.id("lastname");

	public void enterLastName(String string) {

		enterText(lasyName, string);

	}

	By email = By.id("email_address");

	public void enterEmail(String string) {

		enterText(email, string);

	}

	By passowrd = By.id("password");

	public void enterPassword(String string) {

		enterText(passowrd, string);

	}

	By confirmPassword = By.id("password-confirmation");

	public void enterConfirmPassword(String string) {

		enterText(confirmPassword, string);

	}

	By createAccountBtn = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");

	public void clickOnCreateAnAccountBtn() {
		
		clickElement(createAccountBtn);
		
	}
}
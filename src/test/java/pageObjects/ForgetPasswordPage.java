package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage extends BasePage {

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}

	By email = By.id("email_address");

	public void enterEmailID(String emailID) {

		enterText(email, emailID);

	}

	By resetMyPassword_btn = By.xpath("//span[normalize-space()='Reset My Password']");

	public void clickOnResetMyPasswordBtn() {

		clickElement(resetMyPassword_btn);

	}

}

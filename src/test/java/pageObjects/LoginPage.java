package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {

		super(driver);

	}

	By email = By.xpath("//input[@id='email']");

	public void enter_Email(String emailAddress) {

		enterText(email,emailAddress);
		
	}

	By password = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");

	public void enter_Password(String Password) {

		enterText(password,Password);
		
	}

	By signIn_btn = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");

	public void click_SignIn_btn() {

		driver.findElement(signIn_btn).click();
	}

	By forgetPasword_link = By.xpath("//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]");

	public void click_foregtPassword_Link() {

		driver.findElement(forgetPasword_link).click();

	}

}

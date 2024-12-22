package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);

	}

	By signIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

	public void click_On_SignIN() {

		clickElement(signIn);

	}

	By create_Account = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");

	public void click_On_CreateAnAccount() {

		clickElement(create_Account);

	}

}

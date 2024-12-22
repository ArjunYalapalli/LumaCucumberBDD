package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By signIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

	public void click_On_SignIN() {
		
		driver.findElement(signIn).isDisplayed();
		driver.findElement(signIn).click();
	}

	By create_Account = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");

}

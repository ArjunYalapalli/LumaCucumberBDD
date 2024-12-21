package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialize WebDriver
	public BasePage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed

	}

	// Common methods to verify text is displayed?
	public void verifyTextIsDisplayed(String string) {

		driver.findElement(By.xpath("//*[contains(text(),'" + string + "')]")).isDisplayed();

	}

	// Common method to wait for an element to be visible
	public void waitForElementToBeVisible(By locator) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	// Common method to click an element
	public void clickElement(By locator) {

		waitForElementToBeVisible(locator);
		WebElement element = driver.findElement(locator);
		element.click();

	}

	// Common method to enter text in a text field
	public void enterText(By locator, String text) {

		waitForElementToBeVisible(locator);
		WebElement element = driver.findElement(locator);
		element.clear(); // Clear the field before entering text
		element.sendKeys(text);

	}

	// Method to get text from an element
	public String getElementText(By locator) {

		waitForElementToBeVisible(locator);
		return driver.findElement(locator).getText();

	}

	// Method to get page title
	public String getPageTitle() {

		return driver.getTitle();

	}

}

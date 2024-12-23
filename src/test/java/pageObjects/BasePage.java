package pageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	JavascriptExecutor js = (JavascriptExecutor) driver;

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

	// Accept an alert
	public void acceptAlert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	// Dismiss an alert
	public void dismissAlert() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	// Get alert message text
	public String getAlertText() {

		Alert alert = driver.switchTo().alert();
		return alert.getText();

	}

	// Send text to an alert (for prompt alerts)
	public void sendTextToAlert(String text) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);

	}

	// Scroll to an element using JavaScript
	public void scrollToElement(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	// Click an element using JavaScript
	public void clickUsingJavaScript(WebElement element) {

		js.executeScript("arguments[0].click();", element);

	}

	// Scroll to the bottom of the page
	public void scrollToBottom() {

		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	}

	// Scroll to the Top of the page
	public void scrollToTop() {

		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	}

	// Switch to Frame
	public void switchToFrame(String nameOrID) {

		driver.switchTo().frame(nameOrID);

	}

	// Switch to window
	public void switchToWindowByTitle(String windowTitle) {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().equals(windowTitle)) {
				break;
			}
		}

	}

}

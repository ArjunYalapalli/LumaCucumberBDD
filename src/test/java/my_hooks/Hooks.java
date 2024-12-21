package my_hooks;

import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {
	WebDriver driver;

	@Before
	public void setup() {

		DriverFactory.BrowserInitilization(ConfigReader.getProperties().getProperty("browser"));
		driver = DriverFactory.getDriver();

	}

	@After
	public void tearDown() {
		driver.quit();

	}

}

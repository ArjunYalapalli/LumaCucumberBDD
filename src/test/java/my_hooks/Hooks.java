package my_hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver;

	@Before
	public void setup() {
		DriverFactory.BrowserInitilization("chrome");
		driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@After
	public void tearDown() {
		driver.quit();

	}

}

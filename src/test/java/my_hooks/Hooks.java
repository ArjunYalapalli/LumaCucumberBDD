package my_hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {
	WebDriver driver;

	@Before
	public void setup() {
		Properties prop = ConfigReader.getProperties();
		DriverFactory.BrowserInitilization(prop.getProperty("browser"));
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

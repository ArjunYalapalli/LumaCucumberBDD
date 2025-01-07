package my_hooks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CommonUtils;
import utilities.ConfigReader;

public class Hooks {

	WebDriver driver;
	CommonUtils cu=new CommonUtils();

	@Before
	public void setup() {

		DriverFactory.BrowserInitilization(ConfigReader.getBrowser());
		driver = DriverFactory.getDriver();

	}

	@After
	public void tearDown(Scenario scenario) {

		//if (scenario.isFailed()) {
			// Take a screenshot if the scenario failed
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// Define the destination file path
				Path destinationPath = Path.of("target/screenshots/" + scenario.getName() +cu.alphaNumaric(3,2)+ ".png");
				// Create the parent directories if they don't exist
				Files.createDirectories(destinationPath.getParent());
				// Copy the screenshot to the destination
				Files.copy(screenshot.toPath(), destinationPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		//}

		// Closing the driver
		driver.quit();

	}
}

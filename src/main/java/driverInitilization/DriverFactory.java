package driverInitilization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ConfigReader;

public class DriverFactory {

	static WebDriver driver;

	public static void BrowserInitilization(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		} 
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		} 
		else 
		{
			System.out.println("Browser not configured");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigReader.getURL());
		
	}

	public static WebDriver getDriver() {
		
		return driver;
	}

}

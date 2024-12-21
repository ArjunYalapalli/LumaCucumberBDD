package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resource/featureFile", glue = { "stepDefs", "my_hooks" }, tags = "@forgetPassword",
		
		publish=true,

		plugin = { "pretty", "html:target/HTML_Reports/cucumber_htmlReports.html", "json:target/arjun.json" }

)

public class MyRunner {

}

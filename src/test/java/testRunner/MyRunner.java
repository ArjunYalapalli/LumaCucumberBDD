package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resource/featureFile", glue = { "stepDefs", "my_hooks" }, tags = "@login",

		plugin = { "pretty", "html:target/cucumber_htmlReports.html", "json:target/arjun.json" }

)

public class MyRunner {

}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resource/featureFile", glue =  "stepDefs" ,

		plugin = { "pretty", "html:target/navya.html" }

)

public class MyRunner {

}

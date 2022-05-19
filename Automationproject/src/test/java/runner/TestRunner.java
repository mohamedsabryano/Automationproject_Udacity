package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = {"StepDefinitions"},
                plugin = {"pretty", "html:target/cucumber"},
                tags = "@smoker"




        )
public class TestRunner extends AbstractTestNGCucumberTests {
}

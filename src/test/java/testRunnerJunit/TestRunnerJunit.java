package testRunnerJunit;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "feature" }, glue = { "stepdef" }, plugin = { "pretty", "html:Report1" }, tags = "@smoke"

)
public class TestRunnerJunit {

}

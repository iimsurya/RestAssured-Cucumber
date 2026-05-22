package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions")
public class TestRunner {
}

/*
 * TestRunner
 * ----------
 * Simple JUnit runner that launches Cucumber feature execution. Run this
 * class as a JUnit test in your IDE to execute all features under
 * `src/test/java/features`. Alternatively run `mvn test` from the project
 * root to execute the suite via Maven.
 */


package cucumberTestRunner;

import org.junit.runner.RunWith;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions"
		)
public class TestRunnerTestNg extends AbstractTestNGCucumberTests{

	
}

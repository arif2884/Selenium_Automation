package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue= "steps",
		tags = "@ORG-101",
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true
		)
public class RunLogin {
	
}
//@CucumberOptions(
//		features = {"Features"},
//		glue = {"steps"},
//		plugin= {"pretty","json:target/cucumber.json"},
//		tags= "@Sanity",
//		monochrome = true,
//		dryRun = false	
//		)
//public class RunLogin extends AbstractTestNGCucumberTests{
//
//}

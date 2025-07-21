package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "features" }, // features/login.feature and comment the tags
		glue = { "stepDefination" },
		plugin = { "pretty", "html:target/cucumber-reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		tags = "@Smoke or @regression",
		monochrome = true)
public class RunnerClass extends AbstractTestNGCucumberTests{

}

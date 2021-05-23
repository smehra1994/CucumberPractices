package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/AppFeature/Uber.feature"},
		glue={"stepdefinitions"},
		tags= "@Smoke or @Regression",
		//tags= "@Smoke and @Prod"     //run 3 scenario having both tags
		//tags= " not @Smoke"          //run 2 and 3 scenario
		//tags="@All"                  //run all scenarios in feature level
		plugin= {"pretty","json:target/MyReports/Report1.json","junit:target/MyReports/Report1.xml"},
		publish=true,                  //report publish in cucumber cloud
		monochrome=true,               //console in proper alignment
		dryRun=true                    //checks if any step definition is missing for a feature
)
public class UberTest {

}

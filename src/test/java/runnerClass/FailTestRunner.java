package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"E://Eclipse Backup//eclpise_data//eclipse-workspace//SeleniumTraning//src"
				+ "//test//resources//com//make//feature"},
		
		glue= {"com.makemytrip.stepDefinitions"},
		dryRun=false,
		monochrome= true,
		tags= {"@tag1"},
		plugin = {"pretty", "html:target/cucumber","rerun:target/failed rerun.text"}
		
		
		
		)





public class FailTestRunner {

}

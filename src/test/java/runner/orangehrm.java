package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/login/oranghrm.feature"})
//glue = {"Setep_defination"},
//dryRun = false
//)
public class orangehrm {
	

}

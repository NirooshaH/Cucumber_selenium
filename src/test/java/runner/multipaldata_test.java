package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // This annotation is used to specify the Cucumber runner class that will run the Cucumber tests

@CucumberOptions(features= {"src/test/resources/login/multipaldata_test.feature"}, //This annotation is used to provide various options and configurations for running Cucumber tests
glue= {"Setep_defination"},
dryRun=false, // If set to true, it will run the feature files without executing the actual steps
tags = "@positivetest",
plugin = {"html:testoutput/test1.html","json:testoutput/test2.json","junit:testoutput/test3.xml"})

public class multipaldata_test {
	

}

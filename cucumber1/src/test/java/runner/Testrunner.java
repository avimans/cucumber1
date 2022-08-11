package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//login.feature is a cucumber class to run the cucumber class we 
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/login/login.feature"},
glue = {"stepdefination"},dryRun = false)
public class Testrunner {

}

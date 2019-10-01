package testbatchrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber .class)
@CucumberOptions(features="Features",glue="stepdef",tags= {"@Register"},plugin= {"json:target//cucumber-json-report.json"})
public class TRunner {

}
